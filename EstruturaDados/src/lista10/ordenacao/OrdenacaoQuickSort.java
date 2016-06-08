package lista10.ordenacao;

import lista10.ordenacao.classAbstract.OrdenacaoAbstract;

public class OrdenacaoQuickSort <T extends Comparable<T>> extends OrdenacaoAbstract<T>
{

	@Override
	public void ordenar() {
		quickSort(0, this.getInfo().length-1);
		
	}
	
	private void quickSort(int inicio, int fim)
	{
		if (inicio < fim)
		{
			int idxPivo = particiona(inicio, fim);
			quickSort(inicio, idxPivo-1);
			quickSort(idxPivo+1, fim);			
		}
	}
	
	private int particiona(int inicio, int fim)
	{
		int a = inicio;
		int b = fim + 1;
		T pivo = this.getInfo()[inicio];
		
		while (true)
		{
			do {
				a = a + 1;
			} while (a <= fim && this.getInfo()[a].compareTo(pivo) < 0);
			
			
			do {
				b = b - 1;
			} while (b >= inicio && this.getInfo()[b].compareTo(pivo) > 0);
			
			if (a >= b)
			{
				break;
			}
			
			this.trocar(a,b);
		}
		
		this.trocar(b, inicio);
		
		return b;
	}

	private void trocar(int a, int b) {
		T temp = this.getInfo()[a];
		this.setInfoAtIndex(a, this.getInfo()[b]);
		this.setInfoAtIndex(b, temp);
	}
	
}
