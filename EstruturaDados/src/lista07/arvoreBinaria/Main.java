package lista07.arvoreBinaria;

import lista07.arvoreBinaria.arvore.ArvoreBinaria;
import lista07.arvoreBinaria.arvore.NoArvoreBinaria;


public class Main {

	public static void main(String[] args) {
		ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
		
		NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<Integer>(4);
		NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<Integer>(10, no2, null);
			
		NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<Integer>(15);
		NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<Integer>(23, no4, null);
		
		NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<Integer>(2,no1,no5);
		
		arvore.setRaiz(no3);
		
		System.out.println("O valor 4 pertence? " + arvore.pertence(4));
		System.out.println(arvore.toString());
		
	}
}