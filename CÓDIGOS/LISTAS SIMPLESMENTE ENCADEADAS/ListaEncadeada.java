/*
---------------------------------------------------------
:: Prof. Heraldo Gonçalves Lima Junior
:: Curso: Sistemas para a Internet
:: Disciplina: Estruturas de Dados
:: Contato: heraldo.junior@ifsertao-pe.edu.br
---------------------------------------------------------
*/
public class ListaEncadeada {
	private No inicio;
	private No fim;
	private int totalDeElementos;
	
	public void adicionaNoInicio(Object elemento) {
		No novo = new No(elemento, this.inicio);
		this.inicio = novo;
		if(this.totalDeElementos==0) {
			this.fim = novo;
		}
		this.totalDeElementos++;
	}
	
	public void adicionaNoFinal(Object elemento) {
		if(this.totalDeElementos==0) {
			this.adicionaNoInicio(elemento);
		}else {
			No novo = new No(elemento);
			this.fim.setProximo(novo);
			this.fim = novo;
			this.totalDeElementos++;
		}
	}

	/*@Override
	public String toString() {
		return "ListaEncadeada [inicio=" + inicio.getElemento() + ", fim=" + fim.getElemento() + ", totalDeElementos=" + totalDeElementos + "]";
	}*/
	
	@Override
	public String toString() {
		if(this.totalDeElementos==0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		No atual = this.inicio;
		for(int i=0; i<this.totalDeElementos-1; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			atual = atual.getProximo();
		}
		builder.append(atual.getElemento());
		builder.append("]");
		return builder.toString();
	}
	
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}
	private No pegaNo (int posicao) {
		if(!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição Inálida!");
		}
		No atual = this.inicio;
		for(int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}
		return atual;
	}
	
	public void adiciona(int posicao, Object elemento) {
		if(posicao==0) {
			this.adicionaNoInicio(elemento);
		}else if(posicao==this.totalDeElementos-1) {
			this.adicionaNoFinal(elemento);
		}else{
			No anterior = this.pegaNo(posicao-1);
			No novo = new No(elemento, anterior.getProximo());
			anterior.setProximo(novo);
			this.totalDeElementos++;
		}
	}
	
	public Object pega(int posicao) {
		return this.pegaNo(posicao).getElemento();
	}
	
	public void removeDoComeco() {
		if(this.totalDeElementos>0) {
			this.inicio = this.inicio.getProximo();
			this.totalDeElementos--;
		}
		if(this.totalDeElementos==0) this.fim = null;	
	}
	
	public void removeDoFinal() {
		if(this.getTotalDeElementos()==0) {
			System.out.println("Lista vazia!");
		}else if(this.totalDeElementos == 1) {
			this.removeDoComeco();
		}else {
			No anterior = this.pegaNo(this.totalDeElementos-2);
			anterior.setProximo(null);
			this.fim = anterior;
			this.totalDeElementos--;
		}
	}
	
	 public boolean remove(int posicao) {
		if(this.posicaoValida(posicao)) {
			if(posicao == 0) {
				this.removeDoComeco();
				return true;
			}else if(posicao == this.totalDeElementos-1) {
				this.removeDoFinal();
				return true;
			}else {
				No anterior  = this.pegaNo(posicao-1);
				No atual = anterior.getProximo();
				No proximo = atual.getProximo();
				anterior.setProximo(proximo);
				this.totalDeElementos--;
				return true;
			}
		}else {
			return false;
		}
	}
	
	public boolean contem(Object elemento) {
		No atual = this.inicio;
		for(int i=0; i<this.totalDeElementos;i++) {
			if(atual.getElemento().equals(elemento)) return true;
			atual = atual.getProximo();
		}
		return false;
	}
	
	public int tamanho() {
		return this.totalDeElementos;
	}

	public No getInicio() {
		return inicio;
	}

	public void setInicio(No inicio) {
		this.inicio = inicio;
	}

	public No getFim() {
		return fim;
	}

	public void setFim(No fim) {
		this.fim = fim;
	}

	public int getTotalDeElementos() {
		return totalDeElementos;
	}

	public void setTotalDeElementos(int totalDeElementos) {
		this.totalDeElementos = totalDeElementos;
	}
	
	
	
	
	
	
}
