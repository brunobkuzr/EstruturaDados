package lista12.exercicio02;

public abstract class BuscaAbstract <T>
{
	protected T[] info;
	
	public void setInfo(T[] info)
	{
		this.info = info;
	}
	
	public T[] getInfo()
	{
		return this.info;
	}
	
	public abstract int buscar(T chave);
	
	
	
}
