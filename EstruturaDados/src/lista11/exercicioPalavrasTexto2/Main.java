package lista11.exercicioPalavrasTexto2;

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Scanner;

import lista.common.exception.ListaVaziaException;
import lista03.listaEncadeada.ordenacao.lista.Lista;
import lista03.listaEncadeada.ordenacao.lista.NoLista;
import lista10.exercioPalavrasTexto.Palavra;
import lista10.ordenacao.OrdenacaoBolaOtimizado;
import lista10.ordenacao.OrdenacaoBolha;
import lista10.ordenacao.OrdenacaoQuickSort;
import lista11.ordenacao.OrdenacaoMergeSort;
import lista11.ordenacao.OrdenacaoSelecao;

public class Main {

	private static Scanner teclado;

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
			
			//Prepara um array com os valores e cria o Comparator que sera usado para ordenar
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
				
				teclado = new Scanner(System.in);
				System.out.println("Informe a estratégia: \n"
						+ "1- Ordenacao por bolha \n"
						+ "2- Ordenacao por bolha otimizado \n"
						+ "3- Ordenacao por Quick Sort \n"
						+ "4- Ordenacao por MergeSort \n"
						+ "5- Ordenacao por Selecao");
				int val = Integer.parseInt(teclado.nextLine());
				
				switch (val) {
				case 1:
					OrdenacaoBolha<Palavra> ob = new OrdenacaoBolha<>();
					ob.setInfo(arrPalavras);
					
					ob.ordenar(cpt);
					
					System.out.println(ob.toString());
					break;
					
				case 2:
					OrdenacaoBolaOtimizado<Palavra> obo = new OrdenacaoBolaOtimizado<>();
					obo.setInfo(arrPalavras);
					
					obo.ordenar(cpt);
					
					System.out.println(obo.toString());
					break;
					
				case 3:
					OrdenacaoQuickSort<Palavra> oqs = new OrdenacaoQuickSort<>();
					oqs.setInfo(arrPalavras);
					
					oqs.ordenar(cpt);
					
					System.out.println(oqs.toString());
					break;
					
				case 4:
					OrdenacaoMergeSort<Palavra> oms = new OrdenacaoMergeSort<>();
					oms.setInfo(arrPalavras);
					
					oms.ordenar(cpt);
					
					System.out.println(oms.toString());
					break;
					
				default:
					OrdenacaoSelecao<Palavra> os = new OrdenacaoSelecao<>();
					os.setInfo(arrPalavras);
					
					os.ordenar(cpt);
					
					System.out.println(os.toString());
					break;
				}
			} catch (ListaVaziaException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado");
		}
	}
}
