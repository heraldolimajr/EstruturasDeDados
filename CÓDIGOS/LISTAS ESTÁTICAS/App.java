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

		/*Vetor vetor = new Vetor(4);
		
		System.out.println("Tamanho:"+vetor.tamanho());
		
		vetor.adiciona("SALGUEIRO");
		vetor.adiciona("SERRITA");
		vetor.adiciona("CABROBÓ");
		vetor.adiciona("PETROLINA");
		System.out.println("Inserindo novo elemento...");
		vetor.adicionaPos(1,"RECIFE");
		System.out.println(vetor.imprime());
	
		int pos = vetor.verificaPos("PETROLINA");
		if(pos > -1) {
			vetor.remove(pos);
		}else {
			System.out.println("Posição inválida!");
		}
		vetor.removeElemento("RECIFE");
		
		System.out.println(vetor.imprime());
		
		System.out.println("Tamanho:"+vetor.tamanho());
		
		System.out.println(vetor.imprime());
		System.out.println("Buscando valor da pos[10]:"+vetor.busca(10));
		
		if(vetor.verifica("PETROLINA")) {
			System.out.println("Valor encontrado!");
		}else {
			System.out.println("Valor NÃO encontrado!");
		}
		
		System.out.println("Qual a posição do elemento 'SERRITA'?"+vetor.verificaPos("SERRITA"));
		
		vetor.adicionaPos(1,"RECIFE");
		System.out.println(vetor.imprime());*/
		
		
		/*
		VetorObject vetor2 = new VetorObject(5);
		
		vetor2.adiciona("SALVADOR");
		vetor2.adiciona(2.3);
		vetor2.adiciona("BARREIRAS");
		vetor2.adiciona(2);
		vetor2.adiciona(true);
		
		System.out.println(vetor2.imprime());
		
		VetorObject vetorAlunos = new VetorObject(4);
		
		Aluno aluno = new Aluno(123, "João", "Sistemas para internet");
		Aluno aluno2 = new Aluno(456, "Maria", "Física");
		Aluno aluno3 = new Aluno(789, "Adão", "Alimentos");
		Aluno aluno4 = new Aluno(1013, "Enzo", "Agronomia");
		
		vetorAlunos.adiciona(aluno);
		vetorAlunos.adiciona(aluno2);
		vetorAlunos.adiciona(aluno3);
		vetorAlunos.adiciona(aluno4);
		
		System.out.println(vetorAlunos);*/
		
		
		/*ArrayList<String> arrayList = new ArrayList();
		arrayList.add("São Paulo");
		arrayList.add("Aracajú");
		arrayList.add("Rio");
		
		System.out.println(arrayList);
		arrayList.add(1, "Porto Alegre");
		System.out.println(arrayList);
		System.out.println(arrayList.indexOf("Rio"));
		System.out.println(arrayList.contains("Rio"));
		System.out.println(arrayList.get(1));
		arrayList.remove(3);
		System.out.println(arrayList.size());*/
		
		Vetor vetor = new Vetor(6);		
		
		vetor.adiciona("SALGUEIRO");
		vetor.adiciona("SERRITA");
		vetor.adiciona("SALGUEIRO");
		vetor.adiciona("PETROLINA");
		vetor.adiciona("SALGUEIROS");
		vetor.adiciona("SALGUEIRO");
		System.out.println(vetor.imprime());
		//vetor.limpa();
		//System.out.println("Lista vazia:");
		//System.out.println(vetor.imprime());
		System.out.println("Última ocorrência de SALGUEIRO: "+vetor.retornaIndice("SALGUEIRO"));
		vetor.removeOcorrencias("SALGUEIRO");
		System.out.println(vetor.imprime());
	}

}
