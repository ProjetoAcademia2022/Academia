package projeto.academia.ano2022;

import javax.swing.JOptionPane;

public class Login {
	
	/*
	 * 
	 * Como n�o temos conhecimento de banco de dados AINDA, o cadastro tem que ser realizado sempre
	 * Isso � meio chato, mas n�o tem onde armazenar as informa��es de cadastro para bater elas depois no login
	 * Por tem vari�veis para o cadastro que depois s�o comparadas com as que foram inseridas no login
	 * Quando aprendermos sobre banco de dados, esse extenso coment�rio ser� removido, s� para frizar mesmo.
	 * 
	 */
	
	
	private static String userUm, passUm;
	private static String chavAuten = "AcademiaPush1979"; //� simples e besta eu sei, mas qual �, n�o tenho ideas melhores
	
	//criando m�todo para ser chamado no m�todo main para realizar o login
	public static void logar() {

		byte opcao;
			
		//n�o fiz um do-while porque caso o login seja feito com sucesso, o programa vai continuar preso nesse menu
		//n�o sei exatamente como fazer para contornar isso mantendo o do-while, ent�o eu s� tirei ele, funciona t�o bem quanto
		
			opcao = Byte.parseByte(
					JOptionPane.showInputDialog(null, "Fa�a seu login para continuar, ou cadastre-se."
					+ "\n0 - Sair"
					+ "\n1 - Login"
					+ "\n2 - Cadastrar")
					);
			//fazendo meu switch para levar o usu�rio para diferentes �reas dependendo da op��o escolhida
			switch(opcao) {
			
			case 0:
				
				JOptionPane.showMessageDialog(null, "Saindo...");
				System.exit(opcao); //encerra o programa
				
				break;
				
			case 1:
				
				fazerLogin();
				
				break;
				
			case 2:
				
				fazerCadastro();
				
				break;
				
			default:
				
				JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
				logar(); //como n�o tenho do-while, tenho que chamar o m�todo de novo
				
				break;
				
			}

		
	}
	
	@Funcional
	private static void fazerLogin() {
		
		String user, pass;
		
		user = JOptionPane.showInputDialog(null, "Usu�rio:");
		pass = JOptionPane.showInputDialog(null, "Senha:");
		
		if(user.equals("admin") && pass.equals("admin")) {
			
			JOptionPane.showMessageDialog(null, "Bem vindo, " + user + "!");
		
		}else if(user.equals(userUm) && pass.equals(passUm)) {
			
			JOptionPane.showMessageDialog(null, "Bem vindo, " + user + "!");
			//como deu certo, volta para o classe Main, login foi realizado com sucesso
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Credencias incorretas!");
			logar(); //se estiver errado, volta ao menu
			
		}
		
	}
	
	@Funcional //ctrl+clique em cima para saber o que significa e de onde vem, n�o esque�a
	private static void fazerCadastro() {
		
		String chaveAutenticacao;
	
			userUm = JOptionPane.showInputDialog(null, "Usu�rio:");
			passUm = JOptionPane.showInputDialog(null, "Senha:");
			chaveAutenticacao = JOptionPane.showInputDialog(null, "Chave de autentica��o:");
			//essa chave � importante, sem ela qualquer um pode criar um cadastro e entrar no sistema e pronto
			//com essa chave � necess�rio que seja colocado uma segunda senha provida pelo gerente da �rea
			//essa senha, nesse caso, estar� provida no README.md e aqui no c�digo tamb�m (no topo)
			//mas em um caso real, apenas estar� no c�digo. Assim tornando necess�rio ter conhecimento da senha 
			//provida pelo gerente, coisa que obviamente, s� o gerente sabe. Permitindo no final um sistema mais 
			//seguro, onde n�o ser� qualquer um que pode criar o cadastro. Esse cadastro ter� que ser feito com o 
			//acompanhamento do gerente. 
			


		

		
		if(chaveAutenticacao.equals(chavAuten)) { //se a chave bater com a chave correta, o cadastro ser� completado
			
			JOptionPane.showMessageDialog(null, "Novo cadastro realizado com sucesso! Siga para o login agora.");
			logar();
			
		}else { //caso contr�rio, volta ao menu
			
			JOptionPane.showMessageDialog(null, "Senha de autentica��o incorreta!");
			logar();
			
		}
		
		
		
		
	}
	
}
