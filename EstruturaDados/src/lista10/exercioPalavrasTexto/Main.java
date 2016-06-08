package lista10.exercioPalavrasTexto;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Scanner;

import lista.common.exception.ListaVaziaException;
import lista03.listaEncadeada.ordenacao.lista.Lista;
import lista03.listaEncadeada.ordenacao.lista.NoLista;
import lista10.ordenacao.OrdenacaoQuickSort;

public class Main {

	public static void main(String[] args) {
		Path path = Paths.get("C://teste.txt");
		
		Scanner sc;
		try {
			sc = new Scanner(path.toFile());
			Lista<Palavra> lista = new Lista<>();
			//Inserir na Lista
			while(sc.hasNext()){
				String line = sc.nextLine();  
				String[] words = line.split(" ");
				
				for (int i = 0; i < words.length; i++) {
					//System.out.println(words[i]);
					Palavra palavra = new Palavra(words[i].toUpperCase(), 1);
					
					try {
						
						if (!lista.estaVazia())
						{
							NoLista<Palavra> no = lista.buscar(palavra);
							if (no != null)
							{
								no.getInfo().incContagem();
								continue;
							}	
						}
						lista.inserir(palavra);
					} catch (ListaVaziaException e) {
						System.out.println("Lista Vazia");
					}
				}
			}
			
			try {
				Palavra[] arrPalavras = new Palavra[lista.obterComprimento()];
				NoLista<Palavra> no = lista.getPrimeiro();
				int i =0;
				while(no != null)
				{
					arrPalavras[i] = no.getInfo();
					i++;
					no = no.getProximo();
				}

				Comparator<Palavra> cpt = new Comparator<Palavra>() {
					@Override
					public int compare(Palavra o1, Palavra o2) {
						if (o1.getContagem() == o2.getContagem())
						{
							return o1.getPalavra().compareTo(o2.getPalavra());
						} else if(o1.getContagem() < o2.getContagem()) {
							return 1;
						} else {
							return -1;
						}
					}
				};
				
				OrdenacaoQuickSort<Palavra> oqs = new OrdenacaoQuickSort<>();
				oqs.setInfo(arrPalavras);
				
				oqs.ordenar(cpt);
				
				System.out.println(oqs.toString());
			
			} catch (ListaVaziaException e) {
			
				e.printStackTrace();
			}
			
 			
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado");
		}
	}

}
