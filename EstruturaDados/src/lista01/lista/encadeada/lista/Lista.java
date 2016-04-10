
package lista01.lista.encadeada.lista;

/**
 *
 * @author lfiedler
 */
public class Lista <T extends Comparable<T>> {
    
    private NoLista<T> primeiro;
    
    public Lista()
    {
        
    }
    
    public void inserir(T info)
    {
       NoLista<T> novo = new NoLista();
       novo.setInfo(info);
       novo.setProximo(primeiro);
       this.primeiro = novo;
    }
    
    public void exibir()
    {
        NoLista<T> p = primeiro;
        while (p.getProximo() != null) {            
            System.out.println(p.getInfo());
            p = p.getProximo();
        }
    }
    
    public boolean estaVazia()
    {
        return primeiro == null;
    }
   
    //Perguntar ao professor.
    public NoLista<T> buscar(T info)
    {
        NoLista<T> p = primeiro;
        
        while (p != null) {   
        
            if (p.getInfo().equals(info)){
                return p;
            }
            p = p.getProximo();
        }
        return null;
    }
    
    public void retirar(T info)
    {
        NoLista<T> p = primeiro;
        NoLista anterior = null;
        
        while (p != null) {            
            
            if (p.getInfo().equals(info)) {
                
                if (anterior == null){
                   this.primeiro = p.getProximo();
                } else {
                    anterior.setProximo(p.getProximo());
                }
                
                anterior = p;
                p = p.getProximo();
            }
        }
    }
    
    public int obterComprimento()
    {
        NoLista<T> p = primeiro;
        int i = 0;
        while (p != null)
        {
            p = p.getProximo();
            i++;
        }
        return i;
    }
    
    public T obterUltimo() throws ListaVaziaException
    {
        NoLista<T> p = primeiro;
        NoLista<T> anterior = null;
        if (primeiro == null)
           throw new ListaVaziaException("Lista vazia..."); 
        
        while (p != null) { 
           anterior = p;
           p = p.getProximo();
        }
     
        return  anterior.getInfo();
    }
    
    //Added
    public void addPrimeiro(NoLista<T> primeiro)
    {
        this.primeiro = primeiro;
    }
    public NoLista<T> getPrimeiro()
    {
        return primeiro;
    }
    
    @Override
    public boolean equals(Object lista)
    {
        
        Lista<T> listaG = new Lista<>();
        listaG = (Lista<T>) lista;
        
        if (this.obterComprimento() == listaG.obterComprimento()) {
            NoLista<T> no = primeiro;
            NoLista<T> outroNo = listaG.primeiro;
            while (no != null) {                
                if (no.getInfo().equals(outroNo.getInfo())) {
                    no = no.getProximo();
                    outroNo = outroNo.getProximo();
                } else 
                    return false;
            }
            return true;
        }
        return false;
    }
    
    public NoLista<T> getNo(int idx)
    {
        if (idx > this.obterComprimento() || idx < 1) {
            throw new IndexOutOfBoundsException("Valor fora do tamanho permitido");
        }
        
        NoLista<T> no = primeiro;
        int i = 1;
        while (no != null) 
        {            
            if (idx != i) {
                i++;
                no = no.getProximo();
            } else
                break;
        }
        
        return no;        
    }
    
    public Lista<T> criarInvertida()
    {
        Lista<T> novaLista = new Lista<>();
        NoLista<T> no = primeiro;
   
        while (no != null)
        {
            novaLista.inserir(no.getInfo());
            no = no.getProximo();
        }
        return novaLista;
    }
    
    
    public void inserirOrdenado(T info) 
    {
    	
    	NoLista<T> p = this.primeiro;
    	NoLista<T> anterior = null;
    	while (p != null && p.getInfo().compareTo(info) < 0)
    	{
    		anterior = p;
    		p = p.getProximo();
    	}
    	
    	
		NoLista<T> novoNo = new NoLista<>();
    	novoNo.setInfo(info);
    	
    	if (anterior == null) 
    	{
    		novoNo.setProximo(primeiro);
    		this.primeiro = novoNo;
    		
		} else {
			novoNo.setProximo(p);
			anterior.setProximo(novoNo);	
		}        
	
    }
}
