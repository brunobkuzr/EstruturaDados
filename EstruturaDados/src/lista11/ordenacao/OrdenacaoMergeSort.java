package lista11.ordenacao;

import java.util.Comparator;

import lista10.ordenacao.classAbstract.OrdenacaoAbstract;

public class OrdenacaoMergeSort <T extends Comparable<T>> extends OrdenacaoAbstract<T>
{
	@Override
	public void ordenar() 
	{
		
		mergeSort(0, this.getInfo().length - 1);
		
	}
	
	private void mergeSort(int inicio, int fim)
	{
		if (inicio < fim)
		{
			int meio = (inicio + fim)/2;
			mergeSort(inicio, meio);
			mergeSort(meio+1, fim);
			merge(inicio,fim,meio);
		}
	}

	private void merge(int inicio, int fim, int meio) {
		
		int tamEsquerda = meio - inicio + 1;
		T[] esquerda = (T[]) new Comparable[tamEsquerda];
		for (int i = 0; i < tamEsquerda;i++)
		{
			esquerda[i] = this.getInfo()[inicio+i];
		}
		
		int tamDireita = fim - meio;
		T[] direita = (T[]) new Comparable[tamDireita];
		for (int j = 0; j < tamDireita;j++)
		{
			direita[j] = this.getInfo()[meio+1+j];
		}
		
		int cEsq = 0;
		int cDir = 0;
		int i = 0;
		for (i = inicio; i < fim;)
		{
			if ( (cEsq < tamEsquerda) && (cDir < tamDireita))
			{
				if (esquerda[cEsq].compareTo(direita[cDir]) < 0)
				{
					this.setInfoAtIndex(i, esquerda[cEsq]);
					cEsq++;
					i++;
				} else {
					this.setInfoAtIndex(i, direita[cDir]);
					cDir++;
					i++;
				}
			} else {
				break;
			}	
		}
		
		while (cEsq < tamEsquerda)
		{
			this.setInfoAtIndex(i, esquerda[cEsq]);
			cEsq++;
			i++;
		}
		
		while (cDir < tamDireita)
		{
			this.setInfoAtIndex(i, direita[cDir]);
			cDir++;
			i++;
		}
	}

	@Override
	public void ordenar(Comparator<T> comparador) {
		mergeSort(0, this.getInfo().length - 1, comparador);
		
	}
	
	private void mergeSort(int inicio, int fim, Comparator<T> comparador)
	{
		if (inicio < fim)
		{
			int meio = (inicio + fim)/2;
			mergeSort(inicio, meio, comparador);
			mergeSort(meio+1, fim, comparador);
			merge(inicio,fim,meio,comparador);
		}
	}

	private void merge(int inicio, int fim, int meio, Comparator<T> comparador) {
		
		int tamEsquerda = meio - inicio + 1;
		T[] esquerda = (T[]) new Comparable[tamEsquerda];
		for (int i = 0; i < tamEsquerda;i++)
		{
			esquerda[i] = this.getInfo()[inicio+i];
		}
		
		int tamDireita = fim - meio;
		T[] direita = (T[]) new Comparable[tamDireita];
		for (int j = 0; j < tamDireita;j++)
		{
			direita[j] = this.getInfo()[meio+1+j];
		}
		
		int cEsq = 0;
		int cDir = 0;
		int i = 0;
		for (i = inicio; i < fim;)
		{
			if ( (cEsq < tamEsquerda) && (cDir < tamDireita))
			{
				if (comparador.compare(esquerda[cEsq], direita[cDir]) < 0)
				{
					this.setInfoAtIndex(i, esquerda[cEsq]);
					cEsq++;
					i++;
				} else {
					this.setInfoAtIndex(i, direita[cDir]);
					cDir++;
					i++;
				}
			} else {
				break;
			}	
		}
		
		while (cEsq < tamEsquerda)
		{
			this.setInfoAtIndex(i, esquerda[cEsq]);
			cEsq++;
			i++;
		}
		
		while (cDir < tamDireita)
		{
			this.setInfoAtIndex(i, direita[cDir]);
			cDir++;
			i++;
		}
	}
}
