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
		
		
		System.out.println("Exibindo em ordem normal");
		lista.exibir();
		
		
		System.out.println("Buscando um valor");
		NoListaDupla<Integer> busca = lista.buscar(100);
		System.out.println("Busca " + busca.getInfo());
		
		System.out.println("Removendo e exebindo");
		lista.retirar(1);
		lista.exibir();
		
		System.out.println("Exibindo em ordem inversa");
		lista.exibirOrdemInversa();
		
		System.out.println("Liberando \n");
		lista.liberar();
		
		System.out.println("Exibindo liberado");
		
		lista.exibir();

	}
}
