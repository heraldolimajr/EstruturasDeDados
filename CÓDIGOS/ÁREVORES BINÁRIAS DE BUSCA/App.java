
public class App {

	public static void main(String[] args) {
		Arvore arvore = new Arvore();
		
		arvore.inserir(10);
		arvore.inserir(2);
		arvore.inserir(80);
		arvore.inserir(3);
		arvore.inserir(11);
		
		if(arvore.busca(3)!=null) {
			System.out.println("Elemento encontrado:"+arvore.busca(3).getElemento());
			System.out.println("Pai:"+arvore.busca(3).getPai().getElemento());
		}
		System.out.println("Máximo: "+arvore.maximo());
		System.out.println("Mínimo: "+arvore.minimo());
		
		

	}

}
