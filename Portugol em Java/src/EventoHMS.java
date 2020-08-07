import java.util.Scanner;
public class EventoHMS {
	/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica
	expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int hora, seg, min;
		System.out.print("Digite o tempo de duração em segundos\n");
		seg = s.nextInt();
		hora = seg/3600;
		seg = seg - hora*3600;
		min = seg/60;
		seg = seg - min*60;
		System.out.println("\nO tempo de duração é de "+hora+" horas "+min+ " minutos e "+ seg+" segundos");


	}

}
