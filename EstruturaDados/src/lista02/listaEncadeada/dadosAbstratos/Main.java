package lista02.listaEncadeada.dadosAbstratos;

import lista.common.exception.ListaVaziaException;
import lista02.listaEncadeada.dadosAbstratos.lista.Lista;
import lista02.listaEncadeada.dadosAbstratos.lista.NoLista;

public class Main {

	public static void main(String[] args) {
		Lista<Integer> lista = new Lista<Integer>();
		
		lista.inserir(10);
		lista.inserir(15);
		lista.inserir(20);
		
		try 
		{
			System.out.println("Exibição da lista...");
			lista.exibir();	
			
			System.out.println("Busca da lista...");
			
			NoLista<Integer> busca = lista.buscar(15);
			System.out.println(busca.getInfo());
			
			System.out.println("Retirada da lista...");
			lista.retirar(10);
			lista.exibir();
			
			System.out.println("Comprimento da lista... " + lista.obterComprimento());
			
			System.out.println("O último da lista é... " + lista.obterUltimo());
			
			System.out.println("O primeiro da lista é... " + lista.getPrimeiro().getInfo().toString());
			
			
			Lista<Integer> lista2 = new Lista<Integer>();
			
			//lista2.inserir(10);			
			lista2.inserir(15);
			lista2.inserir(20);
			
			System.out.println("As listas são iguais..." + lista.equals(lista2));
			
			NoLista<Integer> getNo = lista.getNo(0);
			
			System.out.println("O conteúdo do nó na posição 0 é..." + getNo.getInfo().toString());
			
			Lista<Integer> inversa = lista.criarInvertida();
			System.out.println("A lista criada invertida é...");
			inversa.exibir();
			
		} 
		catch (ListaVaziaException lve)
		{
			lve.getMessage();
		}
		

	}

}
