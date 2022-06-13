package projeto.academia.ano2022;

import javax.swing.JOptionPane;

public class Main {
	
	//colocando isso para lembrar de fazer um enum com os equipamentos
	
	private static byte opcao;
	
	@InProgress
	public static void main(String[] args) {
		
		//chamando minha classe login para fazer o óbvio. Essa TEM que ser a primeira classe a ser chamada
		//porque ninguém pode acessar o sistema assim por querer, tem que ser alguém com a devida permissão
		Login.logar(); //depois dessa classe sim o restante das classes e métodos serão chamados
						//até porque é meio sem sentido carregar todos os dados antes de se quer fazer o login
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
			
			JOptionPane.showMessageDialog(null, "Opção inválida!");
			
			break;
		}
		JOptionPane.showMessageDialog(null, "Olá!"); //interessante deixar isso aqui para testar se as classes e
		//métodos chamados anteriormente dessa parte realmente estão funcionando como deviam.

		
		/*
		 * 
		 * Alguém, responsável pela criação desse menu principal
		 * pode ir criando o menu inteiro e adicionando todas as opções que você vê como possível
		 * em um sistema que gerencie uma academia.
		 * Qualquer coisa incorreta, quando olharmos em grupo e testarmos, podemos remover.
		 * Então não custa nada colocar as ideias. Só cuidado se for criar classes/métodos e acabar bagunçando o código
		 * 
		*/
		
		
	}

	@InProgress
	private static void fazerMenu() {
		
		opcao = Byte.parseByte(
				JOptionPane.showInputDialog(null, "O que você deseja fazer?"
						+ "\n0 - Sair"
						+ "\n1 - Cadastrar Cliente")
				);
	
	}

	@InProgress
	private static void cadastrar() {
		
		Cadastro.cadastrar();
			
		
	}
}
