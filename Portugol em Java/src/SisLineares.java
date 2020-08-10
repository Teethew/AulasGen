import java.util.Scanner;

public class SisLineares {

	public static void main(String[] args) {
		//Um sistema de equações lineares do tipo: | ax + by = c |
		//					   | dx + ey = f |
		//
		//pode ser resolvido segundo mostrado abaixo :
		//x = ce-bf  e y = af-cd
		//    -----        -----
		//    ae-bd        ae-bd
		//
		//Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.
		
		Scanner s = new Scanner(System.in);
		
		double a,b,c,d,e,f,x,y;
		System.out.print("Digite a, b, c, d, e e f\n");
		a = s.nextDouble();   d = s.nextDouble();
		b = s.nextDouble();   e = s.nextDouble();
		c = s.nextDouble();   f = s.nextDouble();
			
		x = (c*e-b*f)/(a*e-b*d);
		y = (a*f-c*d)/(a*e-b*d);
		System.out.print("Os valores são\nx = "+x+" e y = "+y);

		
		
		
	}

}
