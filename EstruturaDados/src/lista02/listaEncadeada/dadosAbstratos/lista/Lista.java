package lista02.listaEncadeada.dadosAbstratos.lista;

import lista.common.exception.ListaVaziaException;
/**
*
* @author Leonardo Fiedler
*/
public class Lista <T>
{

	private NoLista<T> primeiro;
	
	public Lista()
	{
		this.primeiro = null;
	}
	
	public void inserir(T info)
	{
		NoLista<T> no = new NoLista<T>();
		no.setInfo(info);
		if (estaVazia()) {
			primeiro = no;
		} else {
			NoLista<T> p = primeiro;
			primeiro = no;
			no.setProximo(p);
		}
	}
	
	public void exibir() throws ListaVaziaException
	{
		if (estaVazia())
			throw new ListaVaziaException("A lista está vazia!");
		
		NoLista<T> p = primeiro;
		while (p != null)
		{
			System.out.println(p.getInfo().toString());
			p = p.getProximo();
		}
	}
	
	
	public boolean estaVazia()
	{
		return primeiro == null;
	}
	
	public NoLista<T> buscar(T info) throws ListaVaziaException
	{
		if (estaVazia())
			throw new ListaVaziaException("A lista está vazia!");
		
		NoLista<T> p = primeiro;
		boolean achou = false;
		while (p != null)
		{
			if(p.getInfo().equals(info)) {
				achou = true;
				break;
			}
			p = p.getProximo();
		}
		return (achou ? p : null);
	}
	
	public void retirar(T info) throws ListaVaziaException
	{
		if (estaVazia())
			throw new ListaVaziaException("A lista está vazia!");
		
		NoLista<T> p = primeiro;
		NoLista<T> anterior = null;
		boolean achou = false;
		while (p != null)
		{
			if(p.getInfo().equals(info)) {
				achou = true;
				break;
			}
			anterior = p;
			p = p.getProximo();
		}
		
		if(achou)
		{
			if(anterior == null)
			{
				primeiro = p.getProximo();
				
			} else {
				anterior.setProximo(p.getProximo());
			}
		}
	}
	
	public int obterComprimento() throws ListaVaziaException
	{
		if (estaVazia())
			throw new ListaVaziaException("A lista está vazia!");
		
		NoLista<T> p = primeiro;
		int contador = 0;
		while (p != null)
		{
			p = p.getProximo();
			contador++;
		}
		
		return contador;
	}
	
	public T obterUltimo()
	{
		NoLista<T> p = primeiro;
		NoLista<T> anterior = null;
		while (p != null)
		{
			anterior = p;
			p = p.getProximo();

		}
		
		return anterior.getInfo();

	}
	
	public NoLista<T> getPrimeiro()
	{
		return primeiro;
	}
	
	public boolean equals(Object lista)
	{
		Lista<T> outraLista = (Lista<T>) lista;
		try {
			if(this.obterComprimento() == outraLista.obterComprimento())
			{
				NoLista<T> p = this.primeiro;
				NoLista<T> pOutraLista = outraLista.primeiro;
				while(p != null)
				{
					if(p.getInfo().equals(pOutraLista.getInfo()))
					{
						p = p.getProximo();
						pOutraLista = pOutraLista.getProximo();	
					} else {
						return false;
					}	
				}
			} else {
				return false;
			}
		} catch (ListaVaziaException e) {
			e.getMessage();
		}
		return true;
	}
	
	public NoLista<T> getNo(int idx) throws IndexOutOfBoundsException, ListaVaziaException
	{
		if (idx < 0 || idx > this.obterComprimento())
			throw new IndexOutOfBoundsException("Tamanho incorreto");

		NoLista<T> p = primeiro;
		NoLista<T> anterior = null;
		int i = 0;
		while (p != null)
		{
			if(i <= idx) {
				i++;
				anterior = p;
				p = p.getProximo();	
			} else
				break;
		}
		
		return (anterior == null ? p : anterior);
	}
	
	public Lista<T> criarInvertida() throws ListaVaziaException
	{
		Lista<T> nova = new Lista<T>();
		
		if(estaVazia())
			throw new ListaVaziaException("A lista está vazia");
		
		for (int i = 0; i < this.obterComprimento(); i++)
		{
			nova.inserir(this.getNo(i).getInfo());
		}
		return nova;
	}
}
