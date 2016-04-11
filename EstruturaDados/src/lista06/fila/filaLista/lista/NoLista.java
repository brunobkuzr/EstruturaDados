package lista06.fila.filaLista.lista;

/**
*
* @author Leonardo Fiedler
*/
public class NoLista <T> 
{
	private T info;
	private NoLista<T> proximo;
	
	
	public void setInfo(T info)
	{
		this.info = info;
	}
	
	public T getInfo()
	{
		return this.info;
	}
	
	public void setProximo(NoLista<T> proximo)
	{
		this.proximo = proximo;
	}
	
	public NoLista<T> getProximo()
	{
		return this.proximo;
	}
}
