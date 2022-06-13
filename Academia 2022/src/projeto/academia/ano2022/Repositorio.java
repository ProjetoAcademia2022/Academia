package projeto.academia.ano2022;

import java.util.HashMap;

public class Repositorio {

	public static HashMap <String, Cliente> clientes = new HashMap<>();
	
	public static void inicializarListas() {
		
		Cliente cliente1 = new Cliente();
		cliente1.setCpf("14.513.612-32");
		cliente1.setNome("Josevaldo");
		cliente1.setIdade((byte) 26);
		
		clientes.put(cliente1.getCpf(), cliente1);
		
		Cliente cliente2 = new Cliente();
		cliente2.setCpf("82.513.616-64");
		cliente2.setNome("Josiberto");
		cliente2.setIdade((byte) 37);
		
		clientes.put(cliente2.getCpf(), cliente2);
		
		
	}
	
	
}
