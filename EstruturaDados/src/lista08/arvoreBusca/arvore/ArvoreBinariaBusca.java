package lista08.arvoreBusca.arvore;

public class ArvoreBinariaBusca <T extends Comparable<T>> extends ArvoreBinariaAbstract<T>
{

	public ArvoreBinariaBusca() {
		super();
	}
	
	public void inserir(T info)
	{
		NoArvoreBinaria<T> novo = new NoArvoreBinaria<T>(info);
		if (this.getRaiz() == null)
		{
			this.setRaiz(novo);
		} else {
			NoArvoreBinaria<T> p = this.getRaiz();
			NoArvoreBinaria<T> pai = null;
			while (true)
			{
				pai = p;
				if(info.compareTo(p.getInfo()) < 0)
				{
					p = pai.getEsquerda();
					if(p == null)
					{
						pai.setEsquerda(novo);
						return;
					}
				} else {
					p = pai.getDireita();
					if (p == null) {
						pai.setDireita(novo);
						return;
					}
				}
			}
		}
	}
	
	public NoArvoreBinaria<T> buscar(T info)
	{
		NoArvoreBinaria<T> p = this.getRaiz();
		while((p != null) && (p.getInfo() != info))
		{
			if (info.compareTo(p.getInfo()) < 0)
			{
				p = p.getEsquerda();
			} else {
				p = p.getDireita();
			}
		}
		return p;
	}

	@Override
	protected void setRaiz(NoArvoreBinaria<T> raiz) {
		this.raiz = raiz;
	}
}
