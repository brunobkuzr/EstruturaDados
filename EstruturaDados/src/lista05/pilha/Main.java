package lista05.pilha;

import lista05.pilha.lista.PilhaLista;

public class Main {

	public static void main(String[] args) {
/*PilhaVetor<Integer> pilha = new PilhaVetor<>(3);
		
		Integer num0 = 15;
		Integer num1 = 20;
		Integer num2 = 25;
		
		try {
			pilha.push(num0);
			pilha.push(num1);
			pilha.push(num2);
			
			
			
			pilha.pop();
			Integer i = pilha.peek();
			System.out.println("Valor do peek: " + i);
			System.out.println(pilha.toString());
			
			
			pilha.liberar();
			boolean b = pilha.estaVazia();
			System.out.println( (b ? "A pilha est� vazia" : "A pilha precisa ser esvaziada"));
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	*/	
		
		PilhaLista<Integer> pilha = new PilhaLista<Integer>();
		
		Integer num0 = 15;
		Integer num1 = 20;
		Integer num2 = 25;
		
		try {
			pilha.push(num0);
			pilha.push(num1);
			pilha.push(num2);
			
			pilha.pop();
			Integer i = pilha.peek();
			
			System.out.println("Valor do peek: " + i);
			System.out.println(pilha.toString());
			
			pilha.liberar();
			boolean b = pilha.estaVazia();
			System.out.println( (b ? "A pilha est� vazia" : "A pilha precisa ser esvaziada"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
