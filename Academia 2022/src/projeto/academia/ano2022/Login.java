package projeto.academia.ano2022;

import javax.swing.JOptionPane;

public class Login {
	
	/*
	 * 
	 * Como não temos conhecimento de banco de dados AINDA, o cadastro tem que ser realizado sempre
	 * Isso é meio chato, mas não tem onde armazenar as informações de cadastro para bater elas depois no login
	 * Por tem variáveis para o cadastro que depois são comparadas com as que foram inseridas no login
	 * Quando aprendermos sobre banco de dados, esse extenso comentário será removido, só para frizar mesmo.
	 * 
	 */
	
	
	private static String userUm, passUm;
	private static String chavAuten = "AcademiaPush1979"; //é simples e besta eu sei, mas qual é, não tenho ideas melhores
	
	//criando método para ser chamado no método main para realizar o login
	public static void logar() {

		byte opcao;
			
		//não fiz um do-while porque caso o login seja feito com sucesso, o programa vai continuar preso nesse menu
		//não sei exatamente como fazer para contornar isso mantendo o do-while, então eu só tirei ele, funciona tão bem quanto
		
			opcao = Byte.parseByte(
					JOptionPane.showInputDialog(null, "Faça seu login para continuar, ou cadastre-se."
					+ "\n0 - Sair"
					+ "\n1 - Login"
					+ "\n2 - Cadastrar")
					);
			//fazendo meu switch para levar o usuário para diferentes áreas dependendo da opção escolhida
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
				
				JOptionPane.showMessageDialog(null, "Opção inválida!");
				logar(); //como não tenho do-while, tenho que chamar o método de novo
				
				break;
				
			}

		
	}
	
	@Funcional
	private static void fazerLogin() {
		
		String user, pass;
		
		user = JOptionPane.showInputDialog(null, "Usuário:");
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
	
	@Funcional //ctrl+clique em cima para saber o que significa e de onde vem, não esqueça
	private static void fazerCadastro() {
		
		String chaveAutenticacao;
	
			userUm = JOptionPane.showInputDialog(null, "Usuário:");
			passUm = JOptionPane.showInputDialog(null, "Senha:");
			chaveAutenticacao = JOptionPane.showInputDialog(null, "Chave de autenticação:");
			//essa chave é importante, sem ela qualquer um pode criar um cadastro e entrar no sistema e pronto
			//com essa chave é necessário que seja colocado uma segunda senha provida pelo gerente da área
			//essa senha, nesse caso, estará provida no README.md e aqui no código também (no topo)
			//mas em um caso real, apenas estará no código. Assim tornando necessário ter conhecimento da senha 
			//provida pelo gerente, coisa que obviamente, só o gerente sabe. Permitindo no final um sistema mais 
			//seguro, onde não será qualquer um que pode criar o cadastro. Esse cadastro terá que ser feito com o 
			//acompanhamento do gerente. 
			


		

		
		if(chaveAutenticacao.equals(chavAuten)) { //se a chave bater com a chave correta, o cadastro será completado
			
			JOptionPane.showMessageDialog(null, "Novo cadastro realizado com sucesso! Siga para o login agora.");
			logar();
			
		}else { //caso contrário, volta ao menu
			
			JOptionPane.showMessageDialog(null, "Senha de autenticação incorreta!");
			logar();
			
		}
		
		
		
		
	}
	
}
