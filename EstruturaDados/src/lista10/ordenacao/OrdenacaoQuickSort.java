package lista10.ordenacao;

import java.util.Comparator;

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

	@Override
	public void ordenar(Comparator<T> comparador) {
		quickSort(0, this.getInfo().length-1,comparador);
		
	}
	
	private void quickSort(int inicio, int fim, Comparator<T> comparador)
	{
		if (inicio < fim)
		{
			int idxPivo = particiona(inicio, fim,comparador);
			quickSort(inicio, idxPivo-1,comparador);
			quickSort(idxPivo+1, fim,comparador);			
		}
	}
	
	
	private int particiona(int inicio, int fim, Comparator<T> comparador)
	{
		int a = inicio;
		int b = fim + 1;
		T pivo = this.getInfo()[inicio];
		
		while (true)
		{
			do {
				a = a + 1;
			} while (a <= fim && comparador.compare(this.getInfo()[a], pivo) < 0);
			
			
			do {
				b = b - 1;
			} while (b >= inicio && comparador.compare(this.getInfo()[b], pivo) > 0);
			
			if (a >= b)
			{
				break;
			}
			
			this.trocar(a,b,comparador);
		}
		
		this.trocar(b, inicio,comparador);
		
		return b;
	}

	private void trocar(int a, int b,Comparator<T> comparador) {
		T temp = this.getInfo()[a];
		this.setInfoAtIndex(a, this.getInfo()[b]);
		this.setInfoAtIndex(b, temp);
	}
	
	
	
	
}
