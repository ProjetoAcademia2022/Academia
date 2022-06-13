package projeto.academia.ano2022;

public class Cliente extends Pessoa {

	public String tipoPlano;
	public String equipFav;
	public String reclama;
	public String numeroCartao;
	
	public Cliente() {
		
		super();
		
	}

	public Cliente(String tipoPlano, String equipFav, String reclama, String numeroCartao) {
		super();
		this.tipoPlano = tipoPlano;
		this.equipFav = equipFav;
		this.reclama = reclama;
		this.numeroCartao = numeroCartao;
	}

	public Cliente(String nome, String cpf, String endereco, String numeroContato, String email, byte idade) {
		super(nome, cpf, endereco, numeroContato, email, idade);
		
	}

	public String getTipoPlano() {
		return tipoPlano;
	}

	public void setTipoPlano(String tipoPlano) {
		this.tipoPlano = tipoPlano;
	}

	public String getEquipFav() {
		return equipFav;
	}

	public void setEquipFav(String equipFav) {
		this.equipFav = equipFav;
	}

	public String getReclama() {
		return reclama;
	}

	public void setReclama(String reclama) {
		this.reclama = reclama;
	}
	
	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}

	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}
	
	@Override
	public String getEndereco() {
		// TODO Auto-generated method stub
		return super.getEndereco();
	}

	@Override
	public void setEndereco(String endereco) {
		// TODO Auto-generated method stub
		super.setEndereco(endereco);
	}

	@Override
	public String getNumeroContato() {
		// TODO Auto-generated method stub
		return super.getNumeroContato();
	}

	@Override
	public void setNumeroContato(String numeroContato) {
		// TODO Auto-generated method stub
		super.setNumeroContato(numeroContato);
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return super.getEmail();
	}

	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		super.setEmail(email);
	}

	@Override
	public byte getIdade() {
		// TODO Auto-generated method stub
		return super.getIdade();
	}

	@Override
	public void setIdade(byte idade) {
		// TODO Auto-generated method stub
		super.setIdade(idade);
	}
	
	
	
}
