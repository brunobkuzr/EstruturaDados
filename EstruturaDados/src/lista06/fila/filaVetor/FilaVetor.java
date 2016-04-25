package lista06.fila.filaVetor;

import lista06.fila.Fila;

public class FilaVetor <T> implements Fila<T>
{
	
	private T info[];
	private int limite;
	private int tamanhoAtual;
	private int inicio;
	
	public FilaVetor(int limite) 
	{
		this.setLimite(limite);
		this.setTamanhoAtual(0);
		this.info = (T[]) new Object[limite];
	}
	
	public T[] getInfo() 
	{
		return info;
	}

	public void setInfo(T[] info) 
	{
		this.info = info;
	}

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

	public int getInicio() 
	{
		return inicio;
	}

	public void setInicio(int inicio) 
	{
		this.inicio = inicio;
	}

	@Override
	public void inserir(T valor) 
	{
		if (this.getTamanhoAtual() == this.getLimite()) 
		{
			throw new RuntimeException("Limite excedido");
		}
		
		int fim = (this.getInicio() + this.getTamanhoAtual()) % this.getLimite();
		this.info[fim] = valor;
		tamanhoAtual++;
		
	}

	@Override
	public T retirar() 
	{
		if (this.estaVazia())
			throw new RuntimeException("A fila esta vazia");
		
		T val = info[this.getInicio()];
		
		this.setInicio((this.getInicio() + 1) % this.getLimite());
		
		tamanhoAtual--;
		
		return val;
	}

	@Override
	public T peek() 
	{
		if (this.estaVazia())
			throw new RuntimeException("A fila esta vazia");
		
			int posicao = (this.getInicio() + 1) % this.getLimite();
			T val = info[posicao];
			return val;
	}

	@Override
	public boolean estaVazia() {
		return this.getTamanhoAtual() == 0;
	}

	@Override
	public void liberar() {
		if (this.estaVazia())
			throw new RuntimeException("A fila esta vazia");
		
		for (int i = 0; i < this.getLimite(); i++) {
			info[i] = null;
		}
		
	}
	
	public FilaVetor<T> concatenar(FilaVetor<T> f2)
	{
		FilaVetor<T> f3 = new FilaVetor<>(this.getLimite() + f2.getLimite());
		
		int inicio = this.getInicio();
		
		for (int i = 0; i < this.getTamanhoAtual(); i++) {
			T val = info[inicio];
			inicio = (this.getInicio() + 1) % this.getLimite();
			f3.inserir(val);
		}
		
		int inicio2 = f2.getInicio();
		for (int i = 0; i < f2.getTamanhoAtual(); i++) 
		{
			T val = f2.info[inicio2];
			inicio2 = (this.getInicio() + 1) % this.getLimite();
			f3.inserir(val);
		}
		
		return f3;
		
	}
	
	@Override
	public String toString()
	{
		
		int inicio = this.getInicio();
		int pos = inicio;
		String str = "";
		
		do 
		{
			
			if(info[pos] != null) 
			{
				
				str += info[pos] + ",";
				
				pos++;
				
				if (pos > (this.getTamanhoAtual()-1)) {
					pos = 0;
				}
				
			} else 
			{
				pos++;
				if (pos > (this.getTamanhoAtual()-1)) 
				{
					pos = 0;
				}
				
			}
			
		} while (pos != inicio);
		
		return str;
	}	
}