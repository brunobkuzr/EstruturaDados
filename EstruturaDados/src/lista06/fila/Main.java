package lista06.fila;

import lista.common.exception.ListaVaziaException;
import lista06.fila.filaLista.FilaLista;
import lista06.fila.filaVetor.FilaVetor;

public class Main
{
	
	public static void main(String[] args) 
	{
		
 		System.out.println("\n Fila Vetor \n");
		FilaVetor<Integer> fila = new FilaVetor<Integer>(3);
		
		fila.inserir(2);
		fila.inserir(5);
		fila.inserir(7);
		
		System.out.println("toString - Antes de remover");
		System.out.println(fila.toString());
		
		fila.retirar();
		System.out.println("toString - Após remover");
		System.out.println(fila.toString());
		
		System.out.println("Liberando...");
		fila.liberar();
		System.out.println("toString - Após liberar");
		System.out.println(fila.toString());
		
		FilaVetor<Integer> fila2 = new FilaVetor<Integer>(5);
		
		fila2.inserir(3);
		fila2.inserir(1);
		fila2.inserir(8);
		
		FilaVetor<Integer> fila3 = fila.concatenar(fila2);
		
		System.out.println("Concatenação das filas");
		System.out.println(fila3.toString());
		
		System.out.println("\n Fila Lista \n");
		try 
		{		
			FilaLista<Integer> filaLista = new FilaLista<>();
			
			filaLista.inserir(2);
			filaLista.inserir(5);
			filaLista.inserir(7);
			
			System.out.println("Exibir - Antes de remover");
		
			filaLista.exibir();
			filaLista.retirar();
			
			System.out.println("Exibir - Após remover");
			filaLista.exibir();
			
			System.out.println("Peek... " + filaLista.peek());
			
			System.out.println("Está vazia?... " + filaLista.estaVazia());
			
			filaLista.liberar();
			
			System.out.println("E agora?... " + filaLista.estaVazia());
			
		} catch (ListaVaziaException e) 
		{
			e.printStackTrace();
		}
	}
}