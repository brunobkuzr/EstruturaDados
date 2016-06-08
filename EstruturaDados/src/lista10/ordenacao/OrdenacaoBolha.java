package lista10.ordenacao;

import java.util.Comparator;

import lista10.ordenacao.classAbstract.OrdenacaoAbstract;

public class OrdenacaoBolha <T extends Comparable<T>> extends OrdenacaoAbstract<T>
{

	@Override
	public void ordenar() 
	{
		int n = this.getInfo().length;
		
		for (int i = n-1; i >= 1; i--) 
		{
			for (int j = 0; j <= i-1; j++) 
			{
				
				if (this.getInfo()[j].compareTo(this.getInfo()[j+1]) > 0) 
				{
					T temp = this.getInfo()[j];
					this.setInfoAtIndex(j, this.getInfo()[j+1]);
					this.setInfoAtIndex(j+1, temp);
				}
			}
		}
	}

	@Override
	public void ordenar(Comparator<T> comparador) 
	{
		int n = this.getInfo().length;
		
		for (int i = n-1; i >= 1; i--) 
		{
			for (int j = 0; j <= i-1; j++) 
			{
				if (comparador.compare(this.getInfo()[j], this.getInfo()[j+1]) > 0) 
				{
					T temp = this.getInfo()[j];
					this.setInfoAtIndex(j, this.getInfo()[j+1]);
					this.setInfoAtIndex(j+1, temp);
				}
			}
		}
		
	}
	

}
