package Polimorfismo;

import java.util.ArrayList;
import java.util.Collection;

public class Collections {

	public static void main(String[] args) {
		Collection<String> lista1 = new ArrayList<String>();
		lista1.add("Cadeira: 58");
		lista1.add("Poltrona: 1");
		lista1.add("Mesa de Centro: 7");
		
		System.out.println("Itens em estoque:");
		for(String item:lista1) {
			System.out.println(item);
		}
		System.out.println("\n*******************\n");
		System.out.println("Última poltrona vendida!");
		System.out.println("\n*******************\n");
		lista1.remove("Poltrona");
		
		lista1.add("Cadeira de Massagem: 20");
		
		System.out.println("Chegaram mais 20 cadeiras de massagem!");
		System.out.println("\n*******************\n");
		System.out.println("Itens em estoque:");
		
		for(String item:lista1) {
			System.out.println(item);
		}
		
	}

}
