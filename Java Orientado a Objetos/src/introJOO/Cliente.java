package introJOO;

public class Cliente {
	
	private String nomeCliente;
	private int cadastroCliente;
	private long telefoneCliente;
	
	public Cliente(String nomeCliente, int cadastroCliente, long telefoneCliente) {
		this.nomeCliente = nomeCliente;
		this.cadastroCliente = cadastroCliente;
		this.telefoneCliente = telefoneCliente;
	}
	
	public void printaCliente() {
		System.out.println("Cliente: "+nomeCliente);
		System.out.println("Número de cadastro: "+cadastroCliente);
		System.out.println("Telefone: "+telefoneCliente);
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getCadastroCliente() {
		return cadastroCliente;
	}

	public void setCadastroCliente(int cadastroCliente) {
		this.cadastroCliente = cadastroCliente;
	}

	public long getTelefoneCliente() {
		return telefoneCliente;
	}

	public void setTelefoneCliente(long telefoneCliente) {
		this.telefoneCliente = telefoneCliente;
	}
	
	
}
