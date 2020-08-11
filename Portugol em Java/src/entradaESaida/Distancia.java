package entradaESaida;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Distancia {

	
	
	public static void main(String[] args) {
		/*Construa um programa em c que, tendo como dados de entrada
		dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. 
		A fórmula que efetua tal cálculo é */
		//d = raiz((x2-x1)^2+(y2-y1)^2)
		Scanner s = new Scanner(System.in);
		double x1,x2,y1,y2,d,x,y; //Nota 1, 2 e 3 e a média ponderada
		System.out.print("Digite a coordenada x1\n");
		x1 = s.nextDouble();
		System.out.print("Digite a coordenada x2\n");
		x2 = s.nextDouble();
		System.out.print("Digite a coordenada y1\n");
		y1 = s.nextDouble();
		System.out.print("Digite a coordenada y2\n");
		y2 = s.nextDouble();
		x = Math.pow((x2-x1),2); //(x2-x1)²
		y = Math.pow((y2-y1),2); //(y2-y1)²
		d = Math.sqrt(x+y);		 //√(x² + y²)
		//System.out.println("A distância é igual a "+rnd(d));
		System.out.println("A distância é igual a "+d);
	}
	
	/*public static String rnd(double n) { //pode se usar pra arredondar o resultado
		   DecimalFormat df = new DecimalFormat("0.000");
		   df.setRoundingMode(RoundingMode.HALF_UP);
		   return df.format(n);
		}*/

}
