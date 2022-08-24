
public class Arvore {
	public No raiz;
	
	public Arvore() {
		this.raiz = null;
	}
	
	public boolean isEmpty() {
		return this.raiz == null;
	}
	
	public void inserir(int elemento) {
		if(this.isEmpty()){
			No novo = new No(elemento);
			this.raiz = novo;
		}else {
			No atual = this.raiz;
			while(atual != null) {
				if(elemento < atual.getElemento()) {
					if(atual.getEsq()==null) {
						No novo = new No(elemento);
						atual.setEsq(novo);
						novo.setPai(atual);
						return;
					}
					atual = atual.getEsq();
				}else {
					if(atual.getDir()==null) {
						No novo = new No(elemento);
						atual.setDir(novo);
						novo.setPai(atual);
						return;
					}else {
						atual = atual.getDir();
					}
				}
			}
		}		
	}
	
	public void inserirRec(int elemento) {
		if(this.isEmpty()) {
			No novo = new No(elemento);
			this.raiz = novo;
		}else {
			inserirRec(this.raiz, elemento);
		}
	}
	
	private void inserirRec(No atual, int elemento) {
		if(elemento < atual.getElemento()) {
			if(atual.getEsq() == null) {
				No novo = new No(elemento);
				atual.setEsq(novo);
				novo.setPai(atual);
				return;
			}
			inserirRec(atual.getEsq(), elemento);
		}else {
			if(atual.getDir()==null) {
				No novo = new No(elemento);
				atual.setDir(novo);
				novo.setPai(atual);
				return;
			}
			inserirRec(atual.getDir(), elemento);
		}
	}
	
	public No busca(int elemento) {
		No atual = this.raiz;
		while(atual != null) {
			if(atual.getElemento() == elemento) {
				return atual;
			}else if(elemento < atual.getElemento()) {
				atual = atual.getEsq();
			}else {
				atual = atual.getDir();
			}
		}
		return null;
	}
	
	public No minimo() {
		if(this.isEmpty()) return null;
		
		No atual = this.raiz;
		while(atual.getEsq() != null) {
			atual = atual.getEsq();
		}
		return atual;
	}

	public No maximo() {
		if(this.isEmpty()) return null;
		
		No atual = this.raiz;
		while(atual.getDir() != null) {
			atual = atual.getDir();
		}
		return atual;
		
	}	
	
	
	
}
