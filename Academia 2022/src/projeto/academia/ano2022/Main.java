package projeto.academia.ano2022;

import javax.swing.JOptionPane;

public class Main {
	
	//colocando isso para lembrar de fazer um enum com os equipamentos
	
	private static byte opcao;
	
	@InProgress
	public static void main(String[] args) {
		
		//chamando minha classe login para fazer o �bvio. Essa TEM que ser a primeira classe a ser chamada
		//porque ningu�m pode acessar o sistema assim por querer, tem que ser algu�m com a devida permiss�o
		Login.logar(); //depois dessa classe sim o restante das classes e m�todos ser�o chamados
						//at� porque � meio sem sentido carregar todos os dados antes de se quer fazer o login
		fazerMenu();
		
		switch(opcao) {
		
		case 0: 
			
			JOptionPane.showMessageDialog(null, "Saindo...");
			
			break;
		
		case 1:
			
			cadastrar();
			
			break;
			
		case 2:
			
			
			
			break;
		
		
		
		default:
			
			JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
			
			break;
		}
		JOptionPane.showMessageDialog(null, "Ol�!"); //interessante deixar isso aqui para testar se as classes e
		//m�todos chamados anteriormente dessa parte realmente est�o funcionando como deviam.

		
		/*
		 * 
		 * Algu�m, respons�vel pela cria��o desse menu principal
		 * pode ir criando o menu inteiro e adicionando todas as op��es que voc� v� como poss�vel
		 * em um sistema que gerencie uma academia.
		 * Qualquer coisa incorreta, quando olharmos em grupo e testarmos, podemos remover.
		 * Ent�o n�o custa nada colocar as ideias. S� cuidado se for criar classes/m�todos e acabar bagun�ando o c�digo
		 * 
		*/
		
		
	}

	@InProgress
	private static void fazerMenu() {
		
		opcao = Byte.parseByte(
				JOptionPane.showInputDialog(null, "O que voc� deseja fazer?"
						+ "\n0 - Sair"
						+ "\n1 - Cadastrar Cliente")
				);
	
	}

	@InProgress
	private static void cadastrar() {
		
		Cadastro.cadastrar();
			
		
	}
}
