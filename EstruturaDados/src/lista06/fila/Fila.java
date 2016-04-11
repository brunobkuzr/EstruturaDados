package lista06.fila;

public interface Fila  <T>
{
	public abstract void inserir(T valor);
	
	
	public abstract T retirar();
	
	public abstract T peek();
	
	public abstract boolean estaVazia();
	
	public abstract void liberar();
	
}
