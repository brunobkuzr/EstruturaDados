package lista01.lista.encadeada.lista;

/**
 *
 * @author Leonardo Fiedler
 */
public class NoLista {
    
	private int info;
	private NoLista proximo;
	
	public NoLista(int info)
	{ 
		setInfo(info);
	}
	
	public int getInfo() 
	{
		return info;
	}
	
	public void setInfo(int info) 
	{
		this.info = info;
	}
	
	public void setProximo(NoLista proximo)
	{
		this.proximo = proximo;
	}
	
	public NoLista getProximo()
	{
		return proximo;
	}
	
}
