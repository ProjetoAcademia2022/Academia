package projeto.academia.ano2022;

import java.util.Map.Entry;

import javax.swing.JOptionPane;

public class Main {

	// colocando isso para lembrar de fazer um enum com os equipamentos

	// xxxxPrimeiro - facilitar a entrada do login com o admin - admin xxxxxxxxxx
	//xxxxxxx Segundo - mais navegação no menu com JOptionPanexxxxxx
	// xxxxxxxDepois do login - menu intermediário com opções - Cadastros - Relatorios - %Regra de Negocio%xxxxxxx
	// Terceiro - No menu de cadastros gerenciar o CRUD para cada opção (clientes - funcionários)
	// Quarto - Utilizar interface com generics para realizar todas as operações de CRUD em cada classe
	
	private static byte opcao;

	@InProgress
	public static void main(String[] args) {

		// chamando minha classe login para fazer o óbvio. Essa TEM que ser a primeira
		// classe a ser chamada
		// porque ninguém pode acessar o sistema assim por querer, tem que ser alguém
		// com a devida permissão
		Repositorio.inicializarListas();
		Login.logar(); // depois dessa classe sim o restante das classes e métodos serão chamados
						// até porque é meio sem sentido carregar todos os dados antes de se quer fazer
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

			JOptionPane.showMessageDialog(null, "Opção inválida!");

			break;
		
		}
		}while(opcao != 0);

		/*
		 * 
		 * Alguém, responsável pela criação desse menu principal pode ir criando o menu
		 * inteiro e adicionando todas as opções que você vê como possível em um sistema
		 * que gerencie uma academia. Qualquer coisa incorreta, quando olharmos em grupo
		 * e testarmos, podemos remover. Então não custa nada colocar as ideias. Só
		 * cuidado se for criar classes/métodos e acabar bagunçando o código
		 * 
		 */

	}

	@InProgress
	private static void fazerMenu() {
		
		byte opcao1;
		
		opcao1 = Byte.parseByte(JOptionPane.showInputDialog(null,
				"Administrar clientes ou funcionários?"
				+ "\n1 - Clientes"
				+ "\n2 - Funcionarios")
				);

		switch(opcao1) {
		
		case 1:
			
			opcao = Byte.parseByte(
				JOptionPane.showInputDialog(null, "O que você deseja fazer?"
						+ "\n1 - Cadastrar um clientes"
						+ "\n2 - Listar os clientes"
						+ "\n3 - Atualizar um cliente")
				);
				
			break;
			
		case 2:
			
			JOptionPane.showMessageDialog(null, "Trabalhando nisso...espere");
			
			break;
		
		default:
			
			JOptionPane.showMessageDialog(null, "Opção inválida!");
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
