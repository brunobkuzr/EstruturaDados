package lista11.ordenacao;

import java.util.Comparator;

import lista10.ordenacao.classAbstract.OrdenacaoAbstract;

public class OrdenacaoSelecao <T extends Comparable<T>> extends OrdenacaoAbstract<T>
{

	@Override
	public void ordenar()
	{
		int i,j,max;
		int n = this.getInfo().length;
		for (i = n-1; i >= 1; i--)
		{
			max = i;
			for (j = 0; j <= i-1;j++)
			{
				if (this.getInfo()[j].compareTo(this.getInfo()[max]) > 0)
					max = j;
			}
			T temp = this.getInfo()[j];
			this.setInfoAtIndex(i, this.getInfo()[max]);
			this.setInfoAtIndex(max, temp);
		}
		
	}

	@Override
	public void ordenar(Comparator<T> comparador) {
		int i,j,max;
		int n = this.getInfo().length;
		for (i = n-1; i >= 1; i--)
		{
			max = i;
			for (j = 0; j <= i-1;j++)
			{
				if (comparador.compare(this.getInfo()[j], this.getInfo()[max]) > 0)
					max = j;
			}
			T temp = this.getInfo()[j];
			this.setInfoAtIndex(i, this.getInfo()[max]);
			this.setInfoAtIndex(max, temp);
		}
	}
}
