
public class No {
	private int elemento;
	private No esq;
	private No dir;
	private No pai;
	
	public No(int elemento) {
		this.elemento = elemento;
		this.esq = null;
		this.esq = null;
		this.esq = null;
	}

	public int getElemento() {
		return elemento;
	}

	public void setElemento(int elemento) {
		this.elemento = elemento;
	}

	public No getEsq() {
		return esq;
	}

	public void setEsq(No esq) {
		this.esq = esq;
	}

	public No getDir() {
		return dir;
	}

	public void setDir(No dir) {
		this.dir = dir;
	}

	public No getPai() {
		return pai;
	}

	public void setPai(No pai) {
		this.pai = pai;
	}
	
	
	
	
}
