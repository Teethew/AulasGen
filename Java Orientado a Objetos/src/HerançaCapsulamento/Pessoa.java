package HerançaCapsulamento;

public class Pessoa {
	
	private String nome; 
	private String endereço;
	private String telefone;
	private String celular;
	private boolean celularB;
	
	public Pessoa(String nome, String endereço, String telefone){
		this.nome = nome;
		this.endereço = endereço;
		this.telefone = telefone;
	}
	
	public Pessoa(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public Pessoa() {
	}
	
	public void mostrarTelefones() {
		System.out.println("Telefone: "+this.telefone);
		if(this.celularB)
			System.out.println("Celular: "+this.celular);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
		this.celularB = true;
	}
	
	

}
