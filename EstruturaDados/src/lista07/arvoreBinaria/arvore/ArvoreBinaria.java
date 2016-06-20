package lista07.arvoreBinaria.arvore;

public class ArvoreBinaria <T>
{
	private NoArvoreBinaria<T> raiz;
	
	public ArvoreBinaria()
	{
		this.raiz = null;
	}
	
	public void setRaiz(NoArvoreBinaria<T> raiz)
	{
		this.raiz = raiz;
	}
	
	public boolean estaVazia()
	{
		return raiz == null;
	}
	
	public boolean pertence(T info)
	{
		return pertence(info, this.raiz);
	}
	
	private boolean pertence(T info, NoArvoreBinaria<T> no)
	{
		if(no == null)
			return false;
		else
			return (no.getInfo() == info) || 
					pertence(info, no.getEsquerda()) || 
					pertence(info, no.getDireita());
	}
	
	@Override
	public String toString() {
		return arvorePre(raiz);
	}
	
	
	private String arvorePre(NoArvoreBinaria<T> no)
	{
		return "<" +  no.getInfo().toString() +  (no.getEsquerda() != null ? " " + arvorePre(no.getEsquerda()) : "<>" ) + 
				(no.getDireita() != null ?  " " + arvorePre(no.getDireita()) : "<>") + ">";
	}
}
