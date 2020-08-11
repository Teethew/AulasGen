package entradaESaida;
import java.util.Scanner;

public class IdadeAMD {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int ano = 0, mes = 0, dia = 0;
		System.out.println("Digite sua idade em anos, depois meses, e por fim dias\n");
		ano = s.nextInt();
		mes = s.nextInt();
		dia =  s.nextInt();
		dia = (dia + ano*365 + mes*30);
		System.out.println("\nSua idade é de "+dia+" dias");

	}

}
