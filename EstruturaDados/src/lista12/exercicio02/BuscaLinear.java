package lista12.exercicio02;

public class BuscaLinear <T> extends BuscaAbstract<T> 
{

	@Override
	public int buscar(T chave) {
		int n = this.getInfo().length;
		for (int i=0; i < n-1; i++)
		{
			if (this.getInfo()[i].equals(chave))
			{
				return i;
			}
		}
		return -1;
	}
}
