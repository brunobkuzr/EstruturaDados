package lista05.pilha.pilhaLista;

import lista.common.exception.ListaVaziaException;
import lista03.listaEncadeada.ordenacao.lista.Lista;
import lista03.listaEncadeada.ordenacao.lista.NoLista;
import lista05.pilha.Pilha;

public class PilhaLista <T extends Comparable<T>> implements Pilha<T>
{
	private Lista<T> lista;
	
	
	public PilhaLista() 
	{
		lista = new Lista<T>();
	}

	@Override
	public void push(T info) throws Exception 
	{
		lista.inserir(info);	
	}

	@Override
	public T pop() throws Exception 
	{
		if (estaVazia()) 
			throw new Exception("Pilha está vazia");
			
		T valor = (T) lista.getPrimeiro().getInfo();
		
		lista.retirar(valor);
		return valor;
	}

	@Override
	public T peek() throws Exception 
	{
		if (estaVazia()) 
			throw new Exception("Pilha está vazia");
			
		T valor = (T) lista.getPrimeiro().getInfo();
		
		return valor;
	}

	@Override
	public boolean estaVazia() 
	{
		return lista.getPrimeiro() == null;
	}

	@Override
	public void liberar() throws Exception 
	{
		if (lista.estaVazia())
			throw new Exception("Lista vazia");
		
		NoLista<T> info = lista.getPrimeiro();

		while (info != null) 
		{
			lista.retirar(info.getInfo());
			info = info.getProximo();
		}
		
	}
	
	
	public String toString()
	{	
		String str = "";
		try 
		{
			for (int i = (lista.obterComprimento()-1); i >= 0; i--) 
			{
				NoLista<T> info = lista.getNo(i);
				str += info.getInfo().toString() +  (i > 0 ? ", " : "");
			}
			 	
		} catch (ListaVaziaException lve)
		{
			lve.getMessage();
		}
		return str;
	}	
}