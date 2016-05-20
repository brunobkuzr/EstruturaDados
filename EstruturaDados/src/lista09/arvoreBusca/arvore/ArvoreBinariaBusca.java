package lista09.arvoreBusca.arvore;

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
	
	public void retirar(T info)
	{
		NoArvoreBinaria<T> p = raiz;
		NoArvoreBinaria<T> pai = null;
		boolean filhoEsquerda = false;
		//Busca
		while (p != null && p.getInfo() != info)
		{
			pai = p;
			if (info.compareTo(p.getInfo()) < 0)
			{
				filhoEsquerda = true;
				p = p.getEsquerda();
			} else {
				filhoEsquerda = false;
				p = p.getDireita();
			}
		}
		
		if (p != null)
		{
			if (p.getEsquerda() == null &&
				p.getDireita() == null)
			{
				if (p == raiz)
				{
					raiz = null;
				} else {
					if (filhoEsquerda)
					{
						pai.setEsquerda(null);
					} else {
						pai.setDireita(null);
					}
				}
				
			} else {
				if (p.getDireita() == null)
				{
					if (p == raiz)
					{
						raiz = p.getEsquerda();
					} else {
						if (filhoEsquerda)
						{
							pai.setEsquerda(p.getEsquerda());
						} else {
							pai.setDireita(p.getEsquerda());
						}
					}
						
				} else {
					if (p.getEsquerda() == null)
					{
						if (p == raiz)
						{
							raiz = p.getDireita();
						} else {
							if (filhoEsquerda)
							{
								pai.setEsquerda(p.getDireita());
							} else {
								pai.setEsquerda(p.getDireita());
							}
						}
					} else {
						//No com dois filhos
						NoArvoreBinaria<T> sucessor = extrairSucessor(p);
						if(p == raiz)
						{
							raiz = sucessor;
						} else {
							if(filhoEsquerda)
							{
								pai.setEsquerda(sucessor);
							} else {
								pai.setDireita(sucessor);
							}
						}
						sucessor.setEsquerda(p.getEsquerda());
					}
				}
			}
		}
		
	}

	private NoArvoreBinaria<T> extrairSucessor(NoArvoreBinaria<T> no)
	{
		NoArvoreBinaria<T> p = no.getDireita();
		NoArvoreBinaria<T> paiSucessor = no;
		NoArvoreBinaria<T> sucessor = no;
		
		while(p != null)
		{
			paiSucessor = sucessor;
			sucessor = p;
			p = p.getEsquerda();
		}
		
		if(sucessor != no.getDireita())
		{
			paiSucessor.setEsquerda(sucessor.getDireita());
			sucessor.setDireita(no.getDireita());
		}
		return sucessor;
	}
}


