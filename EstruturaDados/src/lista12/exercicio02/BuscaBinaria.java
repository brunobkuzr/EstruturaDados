package lista12.exercicio02;

public class BuscaBinaria <T extends Comparable<T>> extends BuscaAbstract<T>
{

	@Override
	public int buscar(T chave) {
		int n = this.getInfo().length;
		int inicio = 0, fim = n-1;
		int meio = 0;
		while (inicio <= fim) {
			meio = (inicio + fim)/2;
			if(chave.compareTo(this.getInfo()[meio]) < 0)
			{
				fim = meio - 1;
			} else {
				if(chave.compareTo(this.getInfo()[meio]) > 0)
				{
					inicio = meio + 1;
				} else {
					return meio;
				}
			}
			
		}
		return -1;
	}
}
