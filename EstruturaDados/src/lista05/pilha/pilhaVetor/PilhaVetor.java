package lista05.pilha.pilhaVetor;

import lista05.pilha.Pilha;

public class PilhaVetor <T> implements Pilha<T> 
{
	private T[] info;
	private int limite;
	private int tamanhoAtual;
	
	public int getLimite() 
	{
		return limite;
	}

	public void setLimite(int limite) 
	{
		this.limite = limite;
	}

	public int getTamanhoAtual() 
	{
		return tamanhoAtual;
	}

	public void setTamanhoAtual(int tamanhoAtual) 
	{
		this.tamanhoAtual = tamanhoAtual;
	}

	public PilhaVetor(int limite)
	{
		this.setLimite(limite);
		this.info = (T[]) new Object[limite];
	}
	
	@Override
	public void push(T info) throws Exception 
	{
		if (limite == tamanhoAtual)
			throw new Exception("Pilha já está cheia");
		
		this.info[tamanhoAtual] = info;
		this.tamanhoAtual++;
	}

	@Override
	public T pop() throws Exception 
	{
		if (tamanhoAtual == 0)
			throw new Exception("pilha está vazia.");
		
		
		return this.info[--this.tamanhoAtual];
	}

	@Override
	public T peek() throws Exception
	{
		if (tamanhoAtual == 0)
			throw new Exception("pilha está vazia.");
		
		return this.info[tamanhoAtual - 1];
	}

	@Override
	public boolean estaVazia() 
	{
		return this.getTamanhoAtual() < 1;
	}

	@Override
	public void liberar() throws Exception 
	{
		
		for (int i = this.tamanhoAtual; i > 0 ; i--) {
			T infoRemovido = this.pop();
			infoRemovido = null;
		}
	}

	@Override
	public String toString() 
	{
		String str = "";
		for (int i = tamanhoAtual-1; i >= 0; i--) 
		{
			str += this.info[i].toString() +  (i > 0 ? ", " : "");
		}
		
		return str;
	}
}