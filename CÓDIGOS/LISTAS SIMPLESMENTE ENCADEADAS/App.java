
public class App {

	public static void main(String[] args) {

		ListaEncadeada lista = new ListaEncadeada();
		lista.adicionaNoInicio("SALGUEIRO");
		System.out.println(lista);
		lista.adicionaNoInicio("CABROB�");
		System.out.println(lista);

		lista.adicionaNoFinal("PETROLINA");
		System.out.println(lista);
		
		lista.adiciona(2, "RECIFE");
		System.out.println(lista);
		
		System.out.println("Verificando a pos 1: "+lista.pega(1));
		lista.removeDoInicio();
		System.out.println(lista);
		lista.removeDoFinal();
		System.out.println(lista);

		lista.removeDoFinal();
		System.out.println(lista);
		

		lista.removeDoFinal();
		System.out.println(lista);

		System.out.println("In�cio:"+lista.getInicio().getElemento()+" - Fim:"+lista.getFim().getElemento());
	}

}
