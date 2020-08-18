package projeto;

public abstract class Casa {
	private String nome;
	private int cont; //número de vezes que a casa foi escolhida no quiz
	
	public Casa(String nome) {
		this.nome = nome;
	}
	
	public abstract void lemaDaCasa();
	
	public void add(){
		this.cont++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	
	
}
