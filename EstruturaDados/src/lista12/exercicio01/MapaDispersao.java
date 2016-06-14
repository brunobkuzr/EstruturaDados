package lista12.exercicio01;

import lista.common.exception.ListaVaziaException;
import lista02.listaEncadeada.dadosAbstratos.lista.Lista;		

public class MapaDispersao <T>
{
	private Lista<T>[] info;
	
	public MapaDispersao(int tamanho)
	{
		//info = (Lista<T>[]) new Object[tamanho];
		info = new Lista[tamanho];
	}
	
	private int calcularHash(T dado)
	{
		return dado.hashCode() % info.length;
	}
	
	public void inserir(T dado)
	{
		//System.out.println("Posição: " + calcularHash(dado));
		if (this.info[calcularHash(dado)] == null)
		{
			Lista<T> lista = new Lista<>();	
			lista.inserir(dado);
			this.info[calcularHash(dado)] = lista;
		} else {
			this.info[calcularHash(dado)].inserir(dado);	
		}
		
	}
	
	public void remover(T dado) throws ListaVaziaException
	{
		Lista<T> lista = this.info[calcularHash(dado)];
		lista.retirar(dado);
	}
	
	public T buscar(T dado) throws ListaVaziaException
	{
		Lista<T> lista = this.info[calcularHash(dado)];
		return lista.buscar(dado).getInfo();
	}
}
