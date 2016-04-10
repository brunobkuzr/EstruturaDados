package lista01.lista.encadeada;

import lista.common.exception.ListaVaziaException;
import lista01.lista.encadeada.lista.Lista;
import lista01.lista.encadeada.lista.NoLista;

public class Main {

	public static void main(String[] args) {
		
		Lista lista = new Lista();
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		
		try 
		{
			System.out.println("Exibição da lista...");
			lista.exibir();	
			
			System.out.println("Busca da lista...");
			
			NoLista busca = lista.buscar(15);
			System.out.println(busca.getInfo());
			
			System.out.println("Retirada da lista...");
			lista.retirar(10);
			lista.exibir();
			
			System.out.println("Comprimento da lista... " + lista.obterComprimento());
			
			System.out.println("O último da lista é... " + lista.obterUltimo());
		} 
		catch (ListaVaziaException lve)
		{
			lve.getMessage();
		}
	}
}
