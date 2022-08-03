
public class App {

	public static void main(String[] args) {
		//criando a pilha
		Pilha pilha = new Pilha(5);
		
		pilha.push(10);
		pilha.push(20);
		System.out.println("Topo da pilha:"+ pilha.top());
		System.out.println("------------------------------");
		pilha.push(500);
		System.out.println("Topo da pilha:"+ pilha.top());
		System.out.println("\nREMOVENDO....");
		System.out.println(pilha.pop());
		
		System.out.println("Topo da pilha:"+ pilha.top());
		
		
		pilha.push(pilha.top());
		pilha.push(3);
		pilha.push(300);
		pilha.push(3000);
		System.out.println("---------------------------------");
		System.out.println("A pilha está vazia: "+pilha.isEmpty());
		System.out.println("Tamanho da pilha: "+pilha.size());
		System.out.println("Topo da pilha:"+ pilha.top());
	}

}
