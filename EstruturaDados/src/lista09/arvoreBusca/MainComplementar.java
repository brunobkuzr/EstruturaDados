package lista09.arvoreBusca;

import java.util.Random;

import javax.swing.JOptionPane;

import lista09.arvoreBusca.arvore.ArvoreBinariaBusca;

//Classe Main complementar que trabalha de forma randômica
public class MainComplementar {

	public static void main(String[] args) {
		
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de nós"));
		int[] arr = new int[qtd];
		Random r = new Random();
		ArvoreBinariaBusca<Integer> arvore = new ArvoreBinariaBusca<>();
		
		for (int i = 0; i < qtd; i++)
		{
			int val = r.nextInt(100);
			arvore.inserir(val);
			arr[i] = val;
		}
		
		//System.out.println(arvore.toString());
		
		while (!arvore.estaVazia())
		{
			int idx = r.nextInt(qtd);
			if (arr[idx] > -100)
			{
				System.out.println(arvore.toString());
				arvore.retirar(arr[idx]);
				arr[idx] = -100;
			}
			
		}

	}

}
