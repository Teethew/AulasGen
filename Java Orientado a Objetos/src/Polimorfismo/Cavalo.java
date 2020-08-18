package Polimorfismo;

public class Cavalo extends Animal {
	
	public Cavalo(String nome, int idade) {
		super(nome,idade); 
	}

	public String emitirSom() {
		int idade = this.getIdade();
		if(idade>=10)
			return "-IIIIINRIRRIRRIU";
		else
			return "-IINRIRI";
	}
	
	public void correr() {
		System.out.println("*Pocotó*");
		System.out.println("*Pocotó*");
		System.out.println("*Pocotó*");
		System.out.println("*Pocotó*");
		System.out.println("*Pocotó*");
	}
}
