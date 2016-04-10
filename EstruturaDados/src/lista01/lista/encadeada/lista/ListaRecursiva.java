package lista01.lista.encadeada.lista;

public class ListaRecursiva<T extends Comparable<T>> 
{
	 private NoLista<T> primeiro;
	 
	 public ListaRecursiva(){}
	 
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
			 System.out.println(no.getInfo());
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
			if (!no.getInfo() .equals(v)) {
				no = no.getProximo();
				
			} else {
				retirarRecursivo(no.getProximo(), v);
			}
		} 
		 return no;
	 }
	 
	 public NoLista<T> getPrimeiro()
	 {
		 return primeiro;
	 }
	 
	 
	 
	
}
