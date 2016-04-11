package lista04.listaDuplamenteEncadeada.lista;


public class NoListaDupla <T extends Comparable<T>>
{
	private T info;
	private NoListaDupla<T> proximo;
	private NoListaDupla<T> anterior;

	public T getInfo()
	{
		return info;
	}

	public void setInfo(T info) 
	{
		this.info = info;
	}

	public NoListaDupla<T> getProximo()
	{
		return proximo;
	}

	public void setProximo(NoListaDupla<T> proximo) 
	{
		this.proximo = proximo;
	}

	public void setAnterior(NoListaDupla<T> anterior) 
	{
		this.anterior = anterior;
	}

	public NoListaDupla<T> getAnterior()
	{
		return anterior;
	}
	
	
}
