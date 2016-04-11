package lista03.listaEncadeada.ordenacao;

import lista.common.aluno.Aluno;
import lista.common.exception.ListaVaziaException;
import lista03.listaEncadeada.ordenacao.lista.Lista;
import lista03.listaEncadeada.ordenacao.lista.NoLista;

public class Main {

	public static void main(String[] args) {
		//Criação da lista
		Lista<Aluno> listaAlu = new Lista<Aluno>();
    	
		System.out.println("Lista Encadeada normal...");
		//Criação dos alunos
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
    	
    	
    	Aluno alu04 = new Aluno("José da Silva", "1256724984", 2);
    	
    	NoLista<Aluno> no4 = new NoLista<>();
    	no4.setInfo(alu04);
    	listaAlu.inserirOrdenado(no4.getInfo());
    	
    	try {
    	
    		//Exibição
    		System.out.println("Exibindo os alunos em ordem");
			listaAlu.exibir();
			
		} catch (ListaVaziaException e) {
			e.printStackTrace();
		}
    	
    	System.out.println("Lista encadeada recursiva... \n");
    	
    	lista03.listaEncadeada.ordenacao.recursiva.Lista<Integer> listaRecursiva = new lista03.listaEncadeada.ordenacao.recursiva.Lista<Integer>();
    	
    	listaRecursiva.inserir(10);
    	listaRecursiva.inserir(15);
    	listaRecursiva.inserir(20);
    	
    	System.out.println("Exibição da lista recursiva...");
    	listaRecursiva.exibirRecursivo();
    	
    	System.out.println("Retirada da lista recursiva...");
    	listaRecursiva.retirarRecursivo(10);
    	listaRecursiva.exibirRecursivo();
    	
	}
}
