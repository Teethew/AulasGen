package Polimorfismo;

public class Animais {

	public static void main(String[] args) throws InterruptedException {
		
		Cachorro rex = new Cachorro("Rex",3);
		Cachorro shakira = new Cachorro("Shakira",5);
		
		Cavalo spirit = new Cavalo("Spirit",10);
		
		Preguica sid = new Preguica("Sid",4);
		
		System.out.println("Rex latiu para a Shakira e ela latiu de volta: ");
		Thread.sleep(1000);
		System.out.println("Rex: "+rex.emitirSom());
		Thread.sleep(1000);
		System.out.println("Shakira: "+shakira.emitirSom());
		
		Thread.sleep(1000);
		
		System.out.println("\nO Spirit ouviu os dois e saiu correndo e relinchando...");
		Thread.sleep(1000);
		spirit.correr();
		Thread.sleep(1000);
		System.out.println("Spirit: "+spirit.emitirSom());
		Thread.sleep(1000);
		System.out.println("\nNessa os cachorros deram no pé!");
		Thread.sleep(1000);
		rex.correr();
		Thread.sleep(1000);
		shakira.correr();
		Thread.sleep(1700);
		
		System.out.println("\nA preguiça nem se importou muito com isso, na verdade ela só fez um barulhinho e subiu na árvore...");
		Thread.sleep(1000);
		System.out.println("Sid: "+sid.emitirSom());
		Thread.sleep(1000);
		sid.escalarArvore();
		

	}

}
