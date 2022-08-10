/*
---------------------------------------------------------
:: Prof. Heraldo Gonçalves Lima Junior
:: Curso: Sistemas para a Internet
:: Disciplina: Estruturas de Dados
:: Contato: heraldo.junior@ifsertao-pe.edu.br
---------------------------------------------------------
*/

import java.util.Arrays;

public class VetorObject {
	private Object[] elementos;
	private int tamanho;
	
	public VetorObject(int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}
	/*
	public void adiciona(Object elemento) {
		for(int i = 0; i<this.elementos.length; i++) {
			if(this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}
	*/
	
	/*
	public boolean adiciona(Object elemento) {
		if(this.tamanho<this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}*/
	
	public void adiciona(Object elemento) {
		if(this.tamanho<this.elementos.length) {
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
	
	public int tamanho2() {
		int contador = 0;
		for(int i=0; i<this.elementos.length; i++) {
			if(this.elementos[i] != null ) {
				contador++;
			}else {
				break;
			}
		}
		return contador;
	}
	
	
	public String imprime() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for(int i=0; i<this.tamanho-1;i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if(this.tamanho>0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		s.append("]");
		return s.toString();
		
	}
	
	public Object busca(int posicao) {
		try {
			return this.elementos[posicao];
		} catch (Exception e) {
			return "Posição inválida do vetor!"; 
		}	
	}
	
	public boolean verifica(Object elemento) {
		for(int i=0; i<this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return true;
			}
		}
		return false;
	}
	
	public int verificaPos(Object elemento) {
		for(int i=0; i<this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	/*
	public boolean adicionaPos(int posicao, Object elemento) {
		if(!((posicao >= 0) && (posicao <= this.tamanho))) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		for(int i=this.tamanho-1; i>=posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		return true;
	}*/
	
	public boolean adicionaPos(int posicao, Object elemento) {		
		if(!((posicao >= 0) && (posicao <= this.tamanho))) {
			throw new IllegalArgumentException("Posição inválida!");
		}		
		if(this.tamanho == this.elementos.length) {
			this.aumentaCapacidade();
		}		
		for(int i=this.tamanho-1; i>=posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		return true;
	}	
	
	public void  aumentaCapacidade() {
		if(this.tamanho==this.elementos.length) {
			Object[] elementosNovos = new Object[this.elementos.length*2];
			for(int i=0; i<this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public void remove(int posicao) {
		if(!(posicao >= 0) && (posicao<this.tamanho)) {
			throw new IllegalArgumentException("Posição inválida!");
		}
		for(int i=posicao; i<tamanho-1;i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;	
	}
	

	public void removeElemento(Object elemento) {		
		int posicao = this.verificaPos(elemento);
		if(posicao > -1) {
			for(int i=posicao; i<tamanho-1;i++) {
				this.elementos[i] = this.elementos[i+1];
			}
			this.tamanho--;	
		}
	}

	@Override
	public String toString() {
		return "VetorObject [elementos=" + Arrays.toString(elementos) + "]";
	}
	
	

}
