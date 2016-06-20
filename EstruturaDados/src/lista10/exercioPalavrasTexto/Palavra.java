package lista10.exercioPalavrasTexto;

public class Palavra implements Comparable<Palavra>
{
	private String palavra;
	private int contagem = 1;
	
	
	public Palavra()
	{
		
	}


	public String getPalavra() {
		return palavra;
	}


	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}


	public int getContagem() {
		return contagem;
	}


	public void setContagem(int contagem) {
		this.contagem = contagem;
	}


	public Palavra(String palavra, int contagem) {
		this.palavra = palavra;
		this.contagem = contagem;
	}
	
	@Override
	public String toString() {
		return "Palavra: " + this.getPalavra() + "\n" +
				"Contagem: " + this.getContagem();
	}
	
	public void incContagem()
	{
		this.setContagem(this.getContagem() + 1);
	}


	@Override
	public int compareTo(Palavra o) {
		return this.getPalavra().compareTo(o.getPalavra());
	}
}
