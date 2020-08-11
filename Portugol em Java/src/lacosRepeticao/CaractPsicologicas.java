package lacosRepeticao;

import java.util.Scanner;

public class CaractPsicologicas {

	public static void main(String[] args) {
		// Uma empresa desenvolveu uma pesquisa para saber as características
		//psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		//era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
		//(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		//agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		//pessoas, calcule e mostre: (WHILE) 
		/*
		> o número de pessoas calmas; 
		> o número de mulheres nervosas; 
		> o número de homens agressivos;
		> o número de outros calmos; 
		> o número de pessoas nervosas com mais de 40 anos; 
		> o número de pessoas calmas com menos de 18 anos. */
		
		Scanner s = new Scanner(System.in);
		final int n = 150; //número de pesquisados
		int dados[] = new int[3];
		int pessCalm=0,mulNerv=0,homAgr=0,outCalm=0,nerv40=0,calm18=0; 
		int i = 0;
		
		/*Para efeito didático, entende-se que os dados entrados serão válidos.*/
		
		while(i<n) {
			System.out.print("\n\n");
			System.out.print("Digite sua idade: ");
			dados[0] = s.nextInt();
			System.out.print("Qual seu sexo? (1-feminino / 2-masculino / 3-Outros): ");
			dados[1] = s.nextInt();
			System.out.print("Digite: \n1, se for calmx; \n2, se for nervosx; \n3, se for agressivx: ");
			dados[2] = s.nextInt();
			if(dados[2]==1) /*calmx*/ 
			{
				pessCalm++;
				if(dados[1]==3) //calmx e outros
					outCalm++;
				if(dados[0]<18) //calmx e menor de 18
					calm18++;
			} 
			else if(dados[2]==2) /*nervosx*/ 
			{
				if(dados[1]==1) //mulher e nervosa
					mulNerv++;
				if(dados[0]>40) //nervosx e com mais de 40 anos
					nerv40++;
			} 
			else /*agressivx*/ 
			{
				if(dados[1]==2)
					homAgr++;
			} 
			i++;
		}
		System.out.println("\n\n\n____________________________________\n");
		System.out.println("Pessoas calmas: "+pessCalm);
		System.out.println("Mulheres nervosas: "+mulNerv);
		System.out.println("Homens agressivos: "+homAgr);
		System.out.println("Outros calmxs: "+outCalm);
		System.out.println("Pessoas nervosas com mais de 40: "+nerv40);
		System.out.println("Pessoas calmas menores de 18 "+calm18);
		
		
		
	}

}
