
package lista01.lista.encadeada.lista;

import java.lang.annotation.Documented;

import lista.common.exception.ListaVaziaException;

/**
 *
 * @author lfiedler
 */
public class Lista 
{
	private NoLista primeiro;

	public Lista(){
		primeiro = null;
	}
	
	public void inserir(int info)
	{
		NoLista no = new NoLista(info);
		if (estaVazia()) {
			primeiro = no;
		} else {
			NoLista p = primeiro;
			primeiro = no;
			no.setProximo(p);
		}
	}
	
	public void exibir() throws ListaVaziaException
	{
		if (estaVazia())
			throw new ListaVaziaException("A lista está vazia!");
		
		NoLista p = primeiro;
		while (p != null)
		{
			System.out.println(p.getInfo());
			p = p.getProximo();
		}
	}
	
	public boolean estaVazia()
	{
		return primeiro == null;
	}
	
	
	public NoLista buscar(int info) throws ListaVaziaException
	{
		if (estaVazia())
			throw new ListaVaziaException("A lista está vazia!");
		
		NoLista p = primeiro;
		boolean achou = false;
		while (p != null)
		{
			if(p.getInfo() == info) {
				achou = true;
				break;
			}
			p = p.getProximo();
		}
		return (achou ? p : null);
	}
	
	public void retirar(int info) throws ListaVaziaException
	{
		
		if (estaVazia())
			throw new ListaVaziaException("A lista está vazia!");
		
		NoLista p = primeiro;
		NoLista anterior = null;
		boolean achou = false;
		while (p != null)
		{
			if(p.getInfo() == info) {
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
		
		NoLista p = primeiro;
		int contador = 0;
		while (p != null)
		{
			p = p.getProximo();
			contador++;
		}
		
		return contador;
	}
	
	//Retorna apenas o valor do último.
	public int obterUltimo()
	{
		NoLista p = primeiro;
		NoLista anterior = null;
		while (p != null)
		{
			anterior = p;
			p = p.getProximo();

		}
		
		return anterior.getInfo();
	}
	


}
