package lista04.listaDuplamenteEncadeada.lista;

public class ListaDupla <T extends Comparable<T>>
{
	private NoListaDupla<T> primeiro;
	
	public ListaDupla()
	{ }
	
	public void inserir(T info)
	{
		NoListaDupla<T> novo = new NoListaDupla<T>();
		novo.setInfo(info);
		
		novo.setProximo(primeiro);
		novo.setAnterior(null);
		if (primeiro != null)
			primeiro.setAnterior(novo);
		
		primeiro = novo;
			
	}
	
	public void exibir()
	{
		NoListaDupla<T> p = primeiro;
		while (p != null) 
		{
			System.out.println(p.getInfo());
			p = p.getProximo();
		}
		
		
	}
	
	public NoListaDupla<T> buscar(T info)
	{
		NoListaDupla<T> p = primeiro;
		boolean achei = false;
		while (p != null && !achei)
		{
			if (p.getInfo().equals(info)) 
			{
				achei = true;
			} else
				p = p.getProximo();
		}
		
		return achei ? p : null;
	}
	
	public void retirar(T info)
	{
		NoListaDupla<T> p = primeiro;
		while (p != null)
		{
			if (p.getInfo().equals(info)) 
			{
				if (p == primeiro)
				{
					primeiro = p.getProximo();
					break;	
				}
				
				if (p.getAnterior() != null)
					p.getAnterior().setProximo(p.getProximo());
				
				if (p.getProximo() != null)
					p.getProximo().setAnterior(p.getAnterior());
				
				break;
			}
			
			p = p.getProximo();
		}	
	}
	
	public void liberar()
	{
		NoListaDupla<T> p = primeiro;

		while (p != null)
		{
			
			if (p != primeiro) 
			{
				p.getAnterior().setProximo(null);
				p.setAnterior(null);
			} else
				primeiro = null;
			
			p = p.getProximo();
		}
	}
	
	public void exibirOrdemInversa()
	{
		NoListaDupla<T> p = primeiro;
		NoListaDupla<T> aux = null;
		while (p != null)
		{
			aux = p;
			p = p.getProximo();
			
		}
		
		while (aux != null)
		{
			System.out.println(aux.getInfo());
			aux = aux.getAnterior();
		}
	}
}