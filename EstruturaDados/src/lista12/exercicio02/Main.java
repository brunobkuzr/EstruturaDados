package lista12.exercicio02;

public class Main {

	public static void main(String[] args) {
		Integer[] valores = new Integer[5];
		valores[0] = 25;
		valores[1] = 6;
		valores[2] = 18;
		valores[3] = 26;
		valores[4] = 3; 
		
		//BuscaAbstract<Integer> busca = new BuscaLinear<>();
		//BuscaAbstract<Integer> busca = new BuscaLinearVetorOrdenado<>();
		BuscaAbstract<Integer> busca = new BuscaBinaria<>();
		busca.setInfo(valores);
		
		System.out.println(busca.buscar(25));

	}

}
