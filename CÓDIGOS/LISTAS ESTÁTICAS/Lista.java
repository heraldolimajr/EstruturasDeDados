/*
---------------------------------------------------------
:: Prof. Heraldo Gonçalves Lima Junior
:: Curso: Sistemas para a Internet
:: Disciplina: Estruturas de Dados
:: Contato: heraldo.junior@ifsertao-pe.edu.br
---------------------------------------------------------
*/

import java.util.Arrays;

public class Lista {

	private String[] elementos;
	private int tamanho;
	
	public Lista(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	/*
	public void adiciona(String elemento) {
		for(int i = 0; i<this.elementos.length; i++) {
			if(this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}
	*/
	
	/*
	public boolean adiciona(String elemento) {
		if(this.tamanho<this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}*/
	
	public void adiciona(String elemento) {
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
	
	public String busca(int posicao) {
		try {
			return this.elementos[posicao];
		} catch (Exception e) {
			return "Posição inválida do vetor!"; 
		}	
	}
	
	public boolean verifica(String elemento) {
		for(int i=0; i<this.tamanho; i++) {
			if(this.elementos[i].equalsIgnoreCase(elemento)) {
				return true;
			}
		}
		return false;
	}
	
	public int verificaPos(String elemento) {
		for(int i=0; i<this.tamanho; i++) {
			if(this.elementos[i].equalsIgnoreCase(elemento)) {
				return i;
			}
		}
		return -1;
	}
	/*
	public boolean adicionaPos(int posicao, String elemento) {
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
	
	public boolean adicionaPos(int posicao, String elemento) {		
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
			String[] elementosNovos = new String[this.elementos.length*2];
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
	

	public void removeElemento(String elemento) {		
		int posicao = this.verificaPos(elemento);
		if(posicao > -1) {
			for(int i=posicao; i<tamanho-1;i++) {
				this.elementos[i] = this.elementos[i+1];
			}
			this.tamanho--;	
		}
	}
	
	/*1. Crie uma operação na Lista, para isso, adicione um novo método. 
	 * A nova operação deve limpar a lista, ou seja, remover todos os elementos.
	
	public void removeTudo() {
		for(int i=0; i<this.tamanho;i++) {
			this.elementos[i]=null;
		}
		this.tamanho = 0;
	}
	*/
	
	/*2. Implemente mais uma operação na Lista, adicionando um novo método. 
	 * A nova operação deve procurar o índice da última ocorrência de um elemento 
	 * passado como parâmetro.
	 
	
	public int ultimaOcorrencia(String elemento) {
		int indice = -1;
		for(int i=0; i<this.tamanho;i++) {
			if(this.elementos[i].equalsIgnoreCase(elemento)) {
				indice = i;
			}
		}
		return indice;
	}
	
	*/
	
	/*3. Acrescente uma operação na classe Vetor, implemente um novo método. 
	 * A nova operação deve remover da Lista todas as ocorrências de um elemento 
	 * que é passado com parâmetro. Não esqueça de rearranjar os elementos do vetor 
	 * após a remoção. 	 
	
	public void removeOcorrencias(String elemento) {
		boolean tem = true;
		while(tem) {
			for(int i=0; i<this.tamanho;i++) {
				if(this.elementos[i].equalsIgnoreCase(elemento)) {
					this.remove(i);
					tem = true;
					break;
				}else {
					tem = false;
				}
			}
		}		
	}
	
	public void removeTodasOcorrencias(String elemento) {
		for (int i = tamanho-1; i >= 0; i--) {
			if (elemento.equals(elementos[i])) {
				removeElemento(elemento);
			}
		}
	}
	*/
	
	/* 1. Crie uma operação na Lista, para isso, 
	 * adicione um novo método. A nova operação deve 
	 * limpar a lista, ou seja, remover todos os 
	 * elementos.
	 */
    public void limpa() {
    	this.tamanho = 0;
    	/*for(int i=0;i<this.tamanho;i++) {
    		this.elementos[i] = null;
    	}*/
    }
	/*
	2. Implemente mais uma operação na Lista, adicionando 
	um novo método. A nova operação deve procurar o índice 
	da última ocorrência de um elemento passado como 
	parâmetro.*/
    
    public int retornaIndice(String elemento) {
    	/*for(int i=this.tamanho-1; i>=0; i--) {
    		if(this.elementos[i].equalsIgnoreCase(elemento)) {
    			return i;
    		}
    	}
    	return -1;*/
    	
    	int indice = -1;
    	for(int i=0; i<this.tamanho; i++) {
    		if(this.elementos[i].equalsIgnoreCase(elemento)) {
    			indice = i;
    		}
    	}
    	return indice;
    }

	//3. Acrescente uma operação na classe Vetor, 
    //implemente um novo método. A nova operação deve 
    //remover da Lista todas as ocorrências de um elemento 
    //que é passado com parâmetro. Não esqueça de rearranjar 
    //os elementos do vetor após a remoção.
    
    public void removeOcorrencias(String elemento) {
    	for(int i=0; i<this.tamanho; i++) {
    		if(this.elementos[i].equalsIgnoreCase(elemento)) {
    			this.remove(i);
    		}
    	}
    }
	

}
