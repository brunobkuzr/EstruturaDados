package lista06.fila.lista;

public class main 
{
	public static void main(String[] args) {
	
		FilaVetor<Integer> fila = new FilaVetor<Integer>(3);
		
		fila.inserir(2);
		fila.inserir(5);
		fila.inserir(7);
		
		System.out.println(fila.toString());
		
		fila.retirar();
		
		System.out.println(fila.toString());
		
		FilaVetor<Integer> fila2 = new FilaVetor<Integer>(5);
		
		fila2.inserir(3);
		fila2.inserir(1);
		fila2.inserir(8);
		
		FilaVetor<Integer> fila3 = fila.concatenar(fila2);
		
		System.out.println(fila3.toString());
	}
}
