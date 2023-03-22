/*
---------------------------------------------------------
:: Prof. Heraldo Gonçalves Lima Junior
:: Curso: Sistemas para a Internet
:: Disciplina: Estruturas de Dados
:: Contato: heraldo.junior@ifsertao-pe.edu.br
---------------------------------------------------------
*/
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

			Lista lista = new Lista(5);		
		System.out.println("Lista inicial: "+lista.imprime());
		lista.adiciona("10");
		lista.adiciona("20");
		lista.adiciona("30");
		System.out.println("Lista atual: "+lista.imprime());
		System.out.println("Busca pela posição 2: "+lista.busca(5));
		System.out.println("Verifica se 10 tá na lista: "+lista.verifica("10"));
		System.out.println("Inserindo 100 na pos 10: "+lista.adicionaQualquerPosicao(0, "100"));
		System.out.println("Nova lista: "+lista.imprime());
		System.out.println("Inserindo NULL na pos 1: "+lista.adicionaQualquerPosicao(1, null));
		System.out.println("Nova lista: "+lista.imprime());
		System.out.println("Inserindo 200 na pos 1: "+lista.adicionaQualquerPosicao(1, "200"));
		System.out.println("Nova lista: "+lista.imprime());

		System.out.println("Inserindo 300 na pos 1: "+lista.adicionaQualquerPosicao(1, "300"));
		System.out.println("Nova lista: "+lista.imprime());

		System.out.println("Inserindo 400 na pos 7: "+lista.adicionaQualquerPosicao(7, "700"));
		System.out.println("Nova lista: "+lista.imprime());
		lista.remove(0);
		System.out.println("Nova lista: "+lista.imprime());
		lista.remove(4);
		System.out.println("Nova lista: "+lista.imprime());
		
		int pos = lista.verifica("10");
		if(pos > -1) {
			lista.remove(pos);
		}else {
			System.out.println("Impossível remover. Posição inválida!");
		}
		System.out.println("Lista após a remoção do 10: "+lista.imprime());
		
		//LISTA GENÉRICA
		ListaObject listaGenerica = new ListaObject(5);
		listaGenerica.adiciona(10);
		listaGenerica.adicionaQualquerPosicao(0, "João");
		listaGenerica.adicionaQualquerPosicao(1, true);
		System.out.println("Lista atual: "+listaGenerica.imprime());
		listaGenerica.remove(0);
		System.out.println("Lista atual: "+listaGenerica.imprime());
		System.out.println("Verificando se joão está na lista: "+listaGenerica.verifica(true));
		
		
	}

}
