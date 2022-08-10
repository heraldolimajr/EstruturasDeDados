
/*
---------------------------------------------------------
:: Prof. Heraldo Gonçalves Lima Junior
:: Curso: Sistemas para a Internet
:: Disciplina: Estruturas de Dados
:: Contato: heraldo.junior@ifsertao-pe.edu.br
---------------------------------------------------------
*/

public class Pilha {
	private Object elementos[];
	private int topo;
	
	public Pilha(int capacidade) {
		this.topo=-1;
		this.elementos = new Object[capacidade];
	}
	
	//INSERE
	public boolean push(Object elemento) {
		if(this.topo < this.elementos.length-1) {
			this.topo++;
			this.elementos[topo] = elemento;
			return true;
		}
		return false;
	}
	
	//VERIFICA SE ESTÁ VAZIA
	public boolean isEmpty() {
		return topo<0;
	}
	
	//TAMANHO
	public int size() {
		if(this.isEmpty()) return 0;
		return this.topo+1;
	}
	
	//REMOVE TOPO
	public Object pop() {
		if (this.isEmpty()) return null;
		return this.elementos[this.topo--];
	}
	
	//RETORNA O ELEMENTO DO TOPO
	public Object top() {
		if (this.isEmpty()) return null;
		return this.elementos[this.topo];
	}
	
}



