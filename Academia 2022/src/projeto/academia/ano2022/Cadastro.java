package projeto.academia.ano2022;

import javax.swing.JOptionPane;

public class Cadastro {

	public static void cadastrar() {
		
		Pessoa novaPessoa = new Pessoa();
		Cliente novoCliente = new Cliente();
		String nome, cpf, endereco, email, numero, plano;
		byte idade;
		
		nome = JOptionPane.showInputDialog(null, "Nome do cliente:");
		novaPessoa.setNome(nome);
		novoCliente.setNome(nome);
		
		try {

		idade = Byte.parseByte(
				JOptionPane.showInputDialog(null, "Qual a idade de " + nome + "?")
				);
		novaPessoa.setIdade(idade);
		novoCliente.setIdade(idade);
		
		}catch(NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Valor para idade inválido!");
			cadastrar();
			
		}
		
		cpf = JOptionPane.showInputDialog(null, "Insira o CPF:");
		novaPessoa.setCpf(cpf);
		novoCliente.setCpf(cpf);
		
		numero = JOptionPane.showInputDialog(null, "Número de contato:");
		novaPessoa.setNumeroContato(numero);
		novoCliente.setNumeroContato(numero);
		
		endereco = JOptionPane.showInputDialog(null, "Endereço?");
		novaPessoa.setEndereco(endereco);
		novoCliente.setEndereco(endereco);
		
		email = JOptionPane.showInputDialog(null, "Email para contato:");
		novaPessoa.setEmail(email);
		novoCliente.setEmail(email);
		
		JOptionPane.showMessageDialog(null, "Agora é necessário escolher o tipo de plano:");
		
		JOptionPane.showInputDialog(null, "Tipo de plano:"
				+ "1 - Tipo");
		
		
	}
	
}
