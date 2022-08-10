/*
---------------------------------------------------------
:: Prof. Heraldo Gonçalves Lima Junior
:: Curso: Sistemas para a Internet
:: Disciplina: Estruturas de Dados
:: Contato: heraldo.junior@ifsertao-pe.edu.br
---------------------------------------------------------
*/
public class App {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		pilha.push(100);
		pilha.push(300);
		pilha.push(500);
		pilha.pop();
		
		System.out.println("Topo: "+pilha.top());
		System.out.println("Tamanho: "+pilha.size());
				

	}

}
