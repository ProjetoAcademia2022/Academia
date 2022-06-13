package projeto.academia.ano2022;

import java.util.Map.Entry;

import javax.swing.JOptionPane;

public class Main {

	// colocando isso para lembrar de fazer um enum com os equipamentos

	// xxxxPrimeiro - facilitar a entrada do login com o admin - admin xxxxxxxxxx
	//xxxxxxx Segundo - mais navega��o no menu com JOptionPanexxxxxx
	// xxxxxxxDepois do login - menu intermedi�rio com op��es - Cadastros - Relatorios - %Regra de Negocio%xxxxxxx
	// Terceiro - No menu de cadastros gerenciar o CRUD para cada op��o (clientes - funcion�rios)
	// Quarto - Utilizar interface com generics para realizar todas as opera��es de CRUD em cada classe
	
	private static byte opcao;

	@InProgress
	public static void main(String[] args) {

		// chamando minha classe login para fazer o �bvio. Essa TEM que ser a primeira
		// classe a ser chamada
		// porque ningu�m pode acessar o sistema assim por querer, tem que ser algu�m
		// com a devida permiss�o
		Repositorio.inicializarListas();
		Login.logar(); // depois dessa classe sim o restante das classes e m�todos ser�o chamados
						// at� porque � meio sem sentido carregar todos os dados antes de se quer fazer
						// o login
		fazerMenu();

		do {
			
		
		switch (opcao) {

		case 0:

			JOptionPane.showMessageDialog(null, "Saindo...");

			break;

		case 1:

			cadastrar();

			break;

		case 2:

			listarCliente();

			break;

		default:

			JOptionPane.showMessageDialog(null, "Op��o inv�lida!");

			break;
		
		}
		}while(opcao != 0);

		/*
		 * 
		 * Algu�m, respons�vel pela cria��o desse menu principal pode ir criando o menu
		 * inteiro e adicionando todas as op��es que voc� v� como poss�vel em um sistema
		 * que gerencie uma academia. Qualquer coisa incorreta, quando olharmos em grupo
		 * e testarmos, podemos remover. Ent�o n�o custa nada colocar as ideias. S�
		 * cuidado se for criar classes/m�todos e acabar bagun�ando o c�digo
		 * 
		 */

	}

	@InProgress
	private static void fazerMenu() {
		
		byte opcao1;
		
		opcao1 = Byte.parseByte(JOptionPane.showInputDialog(null,
				"Administrar clientes ou funcion�rios?"
				+ "\n1 - Clientes"
				+ "\n2 - Funcionarios")
				);

		switch(opcao1) {
		
		case 1:
			
			opcao = Byte.parseByte(
				JOptionPane.showInputDialog(null, "O que voc� deseja fazer?"
						+ "\n1 - Cadastrar um clientes"
						+ "\n2 - Listar os clientes"
						+ "\n3 - Atualizar um cliente")
				);
				
			break;
			
		case 2:
			
			JOptionPane.showMessageDialog(null, "Trabalhando nisso...espere");
			
			break;
		
		default:
			
			JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
			fazerMenu();
			
			break;
		
		
		
		}
		
		
	}

	@InProgress
	private static void cadastrar() {

		Cadastro.cadastrar();

	}

	@Funcional
	private static void listarCliente() {

		String lista = "";

		for (Entry<String, Cliente> cliente : Repositorio.clientes.entrySet()) {

			lista += "\nChave: " + cliente.getKey() + " - " + cliente.getValue().getNome() + " - "
					+ cliente.getValue().getIdade();

		}

		JOptionPane.showMessageDialog(null, lista);

	}
}
