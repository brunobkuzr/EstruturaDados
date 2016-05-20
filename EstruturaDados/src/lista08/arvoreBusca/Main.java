package lista08.arvoreBusca;

import lista08.arvoreBusca.arvore.ArvoreBinariaBusca;
import lista08.arvoreBusca.arvore.NoArvoreBinaria;

public class Main {

	public static void main(String[] args) {
		ArvoreBinariaBusca<Integer> arvore = new ArvoreBinariaBusca<>();
		arvore.inserir(23);
		arvore.inserir(10);
		arvore.inserir(52);
		arvore.inserir(29);
		arvore.inserir(42);
		arvore.inserir(60);
		arvore.inserir(18);
		arvore.inserir(5);
		arvore.inserir(2);
		
		NoArvoreBinaria<Integer> busca = arvore.buscar(2);
		
		System.out.println("Busca : " + busca.getInfo());
		System.out.println(arvore.toString());
		System.out.println("Total de folhas: " + arvore.calcularFolhas());
	}

}
