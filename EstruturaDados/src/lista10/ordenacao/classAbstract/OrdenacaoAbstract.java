package lista10.ordenacao.classAbstract;

import java.util.Comparator;

public abstract class OrdenacaoAbstract <T extends Comparable<T>> 
{
	private T[] info;
	
	public T[] getInfo()
	{
		return this.info;
	}
	
	public void setInfo(T[] info)
	{
		this.info = info;
	}
	
	public abstract void ordenar();
	
	public abstract void ordenar(Comparator<T> comparador);
	
	public void setInfoAtIndex(int idx, T val)
	{
		this.info[idx] = val;
	}
	
	
	@Override
	public String toString() {
		String txt = "";
		
		for (int i = 0; i < info.length; i++) {
			txt += this.getInfo()[i].toString() + "\n";
		}
		
		return txt;
	}
	
	
}
