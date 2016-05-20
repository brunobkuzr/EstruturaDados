package lista09.arvoreBusca;

import lista09.arvoreBusca.arvore.ArvoreBinariaBusca;
import lista09.arvoreBusca.arvore.NoArvoreBinaria;

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
		arvore.retirar(10);
		System.out.println(arvore.toString());
		/*System.out.println("-------------------------------------- \n");
		System.out.println(arvore.toString());
		
		
		arvore.retirar(10);
		
		System.out.println("-------------------------------------- \n");
		System.out.println(arvore.toString());
		
		arvore.retirar(18);
		
		System.out.println("-------------------------------------- \n");
		System.out.println(arvore.toString());*/
		
		
		System.out.println("Total de folhas: " + arvore.calcularFolhas());
	}

}
