package lista01.lista.encadeada;

import lista01.lista.encadeada.lista.Aluno;
import lista01.lista.encadeada.lista.ListaRecursiva;
import lista01.lista.encadeada.lista.NoLista;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   /* Lista<Integer> lista = new Lista<Integer>();
        NoLista<Integer> no1 = new NoLista<Integer>();
        no1.setInfo(1);
        lista.addPrimeiro(no1);
        
        NoLista<Integer> no2 = new NoLista<Integer>();
        no2.setInfo(2);
        no1.setProximo(no2);
        no2.setProximo(null);
        
        try {
            //Integer ultimo = lista.obterUltimo();
            //System.out.println(ultimo);
            //NoLista<Integer> busca = lista.buscar(2);
        	//System.out.println(busca.getInfo());
           	int obterComprimento = lista.obterComprimento();
           	System.out.println("Comprimento " + obterComprimento);
        	
           	int par = 1;
        	NoLista<Integer> getNo = lista.getNo(par);
            System.out.println("GetNo " + getNo.getInfo());
            
            NoLista<Integer> primeiro = lista.getPrimeiro();
            System.out.println("Primeiro " + primeiro.getInfo());
            
            Lista<Integer> invertida = lista.criarInvertida();
            NoLista<Integer> primeiroInvertida = invertida.getPrimeiro();
            System.out.println("Primeiro invertido: " + primeiroInvertida.getInfo());
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        }  */
    	
    	
    	/* -------------------------
    	 * Teste Classe Aluno
    	 * ------------------------
    	 */
    	
    	/*Lista<Aluno> listaAlu = new Lista<>();
    	
    	Aluno alu01 = new Aluno("Leonardo", "09096366999", 1);
    	
    	NoLista<Aluno> no1 = new NoLista<>();
    	no1.setInfo(alu01);
    	listaAlu.inserirOrdenado(no1.getInfo());
    	
    	
    	Aluno alu02 = new Aluno("Fulano", "56456448", 5);
    	
    	NoLista<Aluno> no2 = new NoLista<>();
    	no2.setInfo(alu02);
    	listaAlu.inserirOrdenado(no2.getInfo());
    	
    	Aluno alu03 = new Aluno("Josenildo", "5646848894", 3);
    	
    	NoLista<Aluno> no3 = new NoLista<>();
    	no3.setInfo(alu03);
    	listaAlu.inserirOrdenado(no3.getInfo());
    	
    	NoLista<Aluno> p = listaAlu.getPrimeiro();
    	while (p != null)
    	{
    		System.out.println(p.getInfo().toString());
    		System.out.println("----------------------------\n");
    		p = p.getProximo();
    	} */
    	
    	/* -------------------------
    	 * Teste Classe Recursiva
    	 * ------------------------
    	 */
    	
    	ListaRecursiva<Aluno> listaAlu = new ListaRecursiva<>();
    	
    	Aluno alu01 = new Aluno("Leonardo", "09096366999", 1);
    	
    	NoLista<Aluno> no1 = new NoLista<>();
    	no1.setInfo(alu01);
    	listaAlu.inserir(no1.getInfo());
    	
    	Aluno alu02 = new Aluno("Fulano", "56456448", 5);
    	
    	NoLista<Aluno> no2 = new NoLista<>();
    	no2.setInfo(alu02);
    	listaAlu.inserir(no2.getInfo());
    	
    	Aluno alu03 = new Aluno("Josenildo", "5646848894", 3);
    	
    	NoLista<Aluno> no3 = new NoLista<>();
    	no3.setInfo(alu03);
    	listaAlu.inserir(no3.getInfo());
    	
    	NoLista<Aluno> p = listaAlu.getPrimeiro();
    	
    	
    	
    	listaAlu.retirarRecursivo(alu02);
    	listaAlu.exibirRecursivo();
    	/*while (p != null)
    	{
    		System.out.println(p.getInfo().toString());
    		System.out.println("---------------------------\n");
    		p = p.getProximo();
    	}*/
    	
    	
	}

}
