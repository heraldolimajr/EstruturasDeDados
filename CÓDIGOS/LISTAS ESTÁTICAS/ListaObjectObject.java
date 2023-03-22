/*
---------------------------------------------------------
:: Prof. Heraldo Gonçalves Lima Junior
:: Curso: Sistemas para a Internet
:: Disciplina: Estruturas de Dados
:: Contato: heraldo.junior@ifsertao-pe.edu.br
---------------------------------------------------------
*/

import java.util.Arrays;

public class ListaObject {
	private Object[] elementos;
	private int tamanho;
	
	public ListaObject(int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}
	
	/*public void adiciona(String elemento) {
		for(int i = 0; i < this.elementos.length; i++) {
			if(this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}*/
	
	public void adiciona(Object elemento) {
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
		}else {
			this.aumentaCapacidade();
			this.elementos[this.tamanho] = elemento;
		}
		this.tamanho++;
	}
	
	
	public int tamanho() {
		return this.tamanho;
	}
	
	public String imprime() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for(int i = 0; i<this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if(this.tamanho > 0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		s.append("]");
		return s.toString();
	}
	
	public Object busca(int posicao) {
		try {
			return this.elementos[posicao];
		} catch (Exception e) {			
			return e.getMessage();
		}
		
	}
	
	public int verifica(Object elemento) {
		for (int i=0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean adicionaQualquerPosicao(int posicao, Object elemento) {
		try {
			if(!elemento.equals(null) && (posicao <= tamanho)) {
				if(this.tamanho >= this.elementos.length) {
					this.aumentaCapacidade();
				}				
				for (int i = this.tamanho-1; i >= posicao; i--) {
					this.elementos[i+1] = this.elementos[i];
				}
				this.elementos[posicao]=elemento;								
				this.tamanho++;
				return true;			
			}else {
				return false;
			}
		} catch (Exception e) {
			System.out.println("ERRO: Não foi possível inserir no vetor");
			System.out.println("Posição inválida ou tipo de dado não ceito.");			
			return false;
		}
	}
	
	public void aumentaCapacidade() {
		Object[] elementosNovos = new Object[this.elementos.length*2];
		for(int i=0; i<this.elementos.length; i++) {
			elementosNovos[i] = this.elementos[i];
		}
		this.elementos = elementosNovos;
	}
	
	public void remove(int posicao) {		
			if((posicao >= 0) && (posicao < this.tamanho)) {
				for(int i=posicao; i < this.tamanho; i++) {
					this.elementos[i] = this.elementos[i+1];
				}
				this.tamanho--;
			}else {
				System.out.println("ERRO: Não foi possível remover no vetor.");
				System.out.println("Posição inválida!");
			}		
	}
	

}
