package projeto.academia.ano2022;

import javax.swing.JOptionPane;

public class Login {
	//criando m�todo para ser chamado no m�todo main para realizar o login
	public static void logar() {
		//fazendo um menu para ou cadastrar, ou fazer login ou sair.
		byte opcao;
		do {
			
			opcao = Byte.parseByte(
					JOptionPane.showInputDialog(null, "Fa�a seu login para continuar, ou registre-se."
					+ "\n0 - Sair"
					+ "\n1 - Login"
					+ "\n2 - Cadastrar")
					);
			//fazendo meu switch para levar o usu�rio para diferentes �reas dependendo da op��o escolhida
			switch(opcao) {
			
			case 0:
				
				JOptionPane.showMessageDialog(null, "Saindo...");
				System.exit(opcao);
				
				break;
				
			case 1:
				
				fazerLogin();
				
				break;
				
			case 2:
				
				fazerCadastro();
				
				break;
				
			default:
				
				JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
				
				break;
				
			}
			
		}while(opcao != 0);
		
		
		
	}
	
	private static void fazerLogin() {
		
		
		
	}
	
	private static void fazerCadastro() {
		
		
		
	}
	
}
