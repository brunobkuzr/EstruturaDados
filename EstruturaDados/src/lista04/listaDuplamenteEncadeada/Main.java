package lista04.listaDuplamenteEncadeada;

import lista04.listaDuplamenteEncadeada.lista.ListaDupla;
import lista04.listaDuplamenteEncadeada.lista.NoListaDupla;

public class Main {
	public static void main(String[] args) {
		
		ListaDupla<Integer> lista = new ListaDupla<Integer>();
		Integer num1 = new Integer(1);
		lista.inserir(num1);
		
		Integer num2 = new Integer(10);
		lista.inserir(num2);
		
		
		Integer num3 = new Integer(100);
		lista.inserir(num3);
		
		
		System.out.println("Exibindo em ordem normal \n");
		lista.exibir();
		
		
		System.out.println("Buscando um valor \n");
		NoListaDupla<Integer> busca = lista.buscar(100);
		System.out.println("Busca " + busca.getInfo());
		
		System.out.println("Removendo e exebindo \n");
		//lista.retirar(num3);
		//lista.exibir();
		
		System.out.println("Exibindo em ordem inversa \n");
		lista.exibirOrdemInversa();
		
		System.out.println("Liberando \n");
		lista.liberar();
		
		System.out.println("Exibindo liberado \n");
		
		lista.exibir();

	}
}
