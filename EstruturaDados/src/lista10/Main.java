package lista10;

import lista10.ordenacao.OrdenacaoQuickSort;

public class Main {

	public static void main(String[] args) {
	
		Integer[] valores = new Integer[5];
		valores[0] = 25;
		valores[1] = 6;
		valores[2] = 18;
		valores[3] = 26;
		valores[4] = 3; 
		
		/*OrdenacaoBolha<Integer> ordBubble = new OrdenacaoBolha<>();
		ordBubble.setInfo(valores);
		ordBubble.ordenar(); */
		
		/*OrdenacaoBolaOtimizado<Integer> ordBubble = new OrdenacaoBolaOtimizado<>();
		ordBubble.setInfo(valores);
		ordBubble.ordenar(); */
		
		//System.out.println(ordBubble.toString());
		
		OrdenacaoQuickSort<Integer> oqs = new OrdenacaoQuickSort<>();
		oqs.setInfo(valores);
		oqs.ordenar();
		System.out.println(oqs.toString());
	}
}