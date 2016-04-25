package lista05.pilha;

public interface Pilha  <T>  
{
	
	public abstract void push(T info) throws Exception ;
	
	public abstract T pop() throws Exception;
	
	public abstract T peek() throws Exception;
	
	public abstract boolean estaVazia();
	
	public abstract void liberar() throws Exception;
		
}
