package lista05.pilha.lista;

public interface Pilha  <T extends Comparable<T>>  {
	
	public abstract void push(T info) throws Exception ;
	
	public abstract T pop() throws Exception;
	
	public abstract T peek() throws Exception;
	
	public abstract boolean estaVazia();
	
	public abstract void liberar() throws Exception;
		
}
