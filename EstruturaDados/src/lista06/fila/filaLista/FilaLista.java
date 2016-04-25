package lista06.fila.filaLista;


import lista.common.exception.ListaVaziaException;
import lista06.fila.Fila;
import lista06.fila.filaLista.lista.Lista;
import lista06.fila.filaLista.lista.NoLista;

public class FilaLista<T extends Comparable<T>> implements Fila<T> 
{

	private Lista<T> lista;
	
	public FilaLista() 
	{
		lista = new Lista<T>();
	}
	
	@Override
	public void inserir(T valor) 
	{
		try 
		{
			lista.inserirNoFinal(valor);
		} catch (IndexOutOfBoundsException | ListaVaziaException e) 
		{
			e.getMessage();
		}
	}

	@Override
	public T retirar() 
	{
		T ultimo = lista.obterUltimo();
		try 
		{
			lista.retirar(lista.obterUltimo());
		} catch (ListaVaziaException e) 
		{
			e.getMessage();
		}
		return ultimo;
	}

	@Override
	public T peek() 
	{
		return lista.obterUltimo();
	}

	@Override
	public boolean estaVazia() 
	{
		return lista.estaVazia();
	}

	@Override
	public void liberar() 
	{
		if (this.estaVazia())
			throw new RuntimeException("A fila está vazia");
		
		NoLista<T> no = lista.getPrimeiro();
		NoLista<T> proximo = null;
		while (no != null)
		{
			proximo = no.getProximo();
			no.setInfo(null);
			no.setProximo(null);
			no = proximo;
		}
		
		lista.setPrimeiro(null);
		lista.setUltimo(null);
	}
	
	public void exibir() throws ListaVaziaException
	{
		lista.exibir();
	}
}