package lista06.fila.filaLista;


import lista.common.exception.ListaVaziaException;
import lista06.fila.Fila;
import lista06.fila.filaLista.lista.Lista;

public class FilaLista<T extends Comparable<T>> implements Fila<T> {

	private Lista<T> lista;
	
	@Override
	public void inserir(T valor) {
		try {
			lista.inserirNoFinal(valor);
		} catch (IndexOutOfBoundsException | ListaVaziaException e) {
			e.getMessage();
		}
	}

	@Override
	public T retirar() {
		T ultimo = lista.obterUltimo();
		try {
			lista.retirar(lista.obterUltimo());
		} catch (ListaVaziaException e) {
			e.getMessage();
		}
		return ultimo;
	}

	@Override
	public T peek() {
		return lista.obterUltimo();
	}

	@Override
	public boolean estaVazia() {
		return lista.estaVazia();
	}

	@Override
	public void liberar() {
		
		
	}
	
	

}
