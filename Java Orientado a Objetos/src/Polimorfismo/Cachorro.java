package Polimorfismo;

public class Cachorro extends Animal {
	
	public Cachorro(String nome, int idade) {
		super(nome,idade);
	}
	
	public void correr() {
		System.out.println("*tup tup tup tup*");
		System.out.println("*tup tup tup tup*");
	}

	
	public String emitirSom() {
		int idade = this.getIdade();
		if(idade<=4)
			return "-AU, AU!";
		else
			return "-WOOF WOOF";
	}

}
