package lista12.exercicio01;

import lista.common.exception.ListaVaziaException;

public class Main {

	public static void main(String[] args) {
		
		MapaDispersao<Integer> mapa = new MapaDispersao<>(10);
		mapa.inserir(25);
		mapa.inserir(6);
		mapa.inserir(5);
		mapa.inserir(48);
		mapa.inserir(33);
		try {
			System.out.println(mapa.buscar(48));
		} catch (ListaVaziaException e) {
			e.printStackTrace();
		}
	}

}
