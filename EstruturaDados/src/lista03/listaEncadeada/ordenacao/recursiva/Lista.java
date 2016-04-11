package lista03.listaEncadeada.ordenacao.recursiva;

/**
*
* @author Leonardo Fiedler
*/
public class Lista <T extends Comparable<T>>
{

	private NoLista<T> primeiro;
	 
	 public Lista(){}
	 
	 public void inserir(T info)
	 {
		NoLista<T> no = new NoLista<>();
		no.setInfo(info);
		no.setProximo(primeiro);
		this.primeiro = no;
	 }
	 
	 public void exibirRecursivo()
	 {
		exibirRecursivo(primeiro); 
	 }
	 
	 private void exibirRecursivo(NoLista<T> no)
	 {
		 if (no != null)
		 {
			 System.out.println(no.getInfo().toString());
			 exibirRecursivo(no.getProximo());
		 }
	 }
	
	 
	 public void retirarRecursivo(T v)
	 {
		retirarRecursivo(primeiro, v);
	 }
	 
	 private NoLista<T> retirarRecursivo(NoLista<T> no, T v)
	 {
		
		if (no != null) {
			if (!no.getInfo().equals(v)) {
				NoLista<T> p = retirarRecursivo(no.getProximo(), v);
				if(no.getProximo() == p)
					no.setProximo(p.getProximo());
			} else {
				if (no == primeiro)
					primeiro = no.getProximo();
			}
		} 
		 return no;
	 }
	 
	 public NoLista<T> getPrimeiro()
	 {
		 return primeiro;
	 }
	
}
