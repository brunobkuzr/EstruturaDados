package lista11;

import lista11.ordenacao.OrdenacaoMergeSort;

public class Main 
{
	public static void main(String[] args) 
	{
		Integer[] valores = new Integer[5];
		valores[0] = 25;
		valores[1] = 6;
		valores[2] = 18;
		valores[3] = 26;
		valores[4] = 3; 
		
		OrdenacaoMergeSort<Integer> omg = new OrdenacaoMergeSort<>();
		omg.setInfo(valores);
		omg.ordenar();
		System.out.println(omg.toString());
	}
}
