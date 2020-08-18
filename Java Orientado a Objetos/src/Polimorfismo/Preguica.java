package Polimorfismo;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome,idade); 
	}
	
	public String emitirSom() {
		return "-uhmm";
	}
	
	public void escalarArvore() throws InterruptedException {
		System.out.println("A preguiça está subindo na árvore...");
		System.out.println("...");
		Thread.sleep(1000);
		System.out.println("...");
		Thread.sleep(1000);
		System.out.println("...");
		Thread.sleep(1000);
		System.out.println("Que demora!");
		Thread.sleep(1000);
		System.out.println("...");
		Thread.sleep(1000);
		System.out.println("...");
		Thread.sleep(1000);
		System.out.println("...");
		Thread.sleep(1000);
		System.out.println(this.getNome()+": "+this.emitirSom());
		Thread.sleep(1000);
		System.out.println("Finalmente! A preguiça subiu na árvore.");
	}
	
}
