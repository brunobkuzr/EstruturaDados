package lista11.ordenacao;

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
		for (int i = 0; i < tamDireita;i++)
		{
			direita[i] = this.getInfo()[meio+1+i];
		}
		
		int cEsq = 0;
		int cDir = 0;
		
		for (int i = inicio; i < fim; i++)
		{
			if ( (cEsq < tamEsquerda) && (cDir < tamDireita))
			{
				if (esquerda[cEsq].compareTo(direita[cDir]) < 0)
				{
					this.setInfoAtIndex(i, esquerda[cEsq]);
					cEsq++;
				} else {
					this.setInfoAtIndex(i, direita[cDir]);
					cDir++;
				}
			} else {
				break;
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
}
