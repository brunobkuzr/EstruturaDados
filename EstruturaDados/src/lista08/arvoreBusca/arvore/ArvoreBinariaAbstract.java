package lista08.arvoreBusca.arvore;

public abstract class ArvoreBinariaAbstract <T>
{
	protected NoArvoreBinaria<T> raiz;
	
	public ArvoreBinariaAbstract()
	{
		this.raiz = null;
	}
	
	public NoArvoreBinaria<T> getRaiz() {
		return raiz;
	}

	protected abstract void setRaiz(NoArvoreBinaria<T> raiz);
	
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
	
	public int calcularFolhas()
	{
		return calcularFolhas(raiz);
	}
	
	private int calcularFolhas(NoArvoreBinaria<T> no)
	{		
		return  no != null ?  no.getDireita() == null && no.getEsquerda() == null ? +1 : 
			calcularFolhas(no.getDireita()) + calcularFolhas(no.getEsquerda()) : 0; 
	}
}
