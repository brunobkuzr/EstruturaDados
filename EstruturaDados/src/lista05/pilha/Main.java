package lista05.pilha;

import lista05.pilha.pilhaLista.PilhaLista;
import lista05.pilha.pilhaVetor.PilhaVetor;

public class Main {

	public static void main(String[] args) {
		PilhaVetor<Integer> pilhaVetor = new PilhaVetor<Integer>(3);
		
		Integer num0 = 15;
		Integer num1 = 20;
		Integer num2 = 25;
		
		try {
			pilhaVetor.push(num0);
			pilhaVetor.push(num1);
			pilhaVetor.push(num2);
			
			
			
			//pilhaVetor.pop();
			Integer i = pilhaVetor.peek();
			System.out.println("Valor do peek: " + i);
			System.out.println("tostring");
			System.out.println(pilhaVetor.toString());
			
			
			pilhaVetor.liberar();
			boolean b = pilhaVetor.estaVazia();
			System.out.println( (b ? "A pilha está vazia" : "A pilha precisa ser esvaziada"));
			
			System.out.println("\n Pilha Lista \n");
		
			PilhaLista<Integer> pilhaLista = new PilhaLista<Integer>();
			
		
			pilhaLista.push(num0);
			pilhaLista.push(num1);
			pilhaLista.push(num2);
			
			pilhaLista.pop();
			Integer j = pilhaLista.peek();
			
			System.out.println("Valor do peek: " + j);
			System.out.println("tostring");
			System.out.println(pilhaLista.toString());
			
			pilhaLista.liberar();
			boolean c = pilhaLista.estaVazia();
			System.out.println( (c ? "A pilha está vazia" : "A pilha precisa ser esvaziada"));
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} 
}
