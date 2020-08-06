programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real h;
		caracter g;
		escreva("Digite sua altura\n");
		leia(h);
		escreva("Digite H para homem e M para mulher\n");
		leia(g);
		se (g == 'H' ou g == 'h'){
			escreva("Seu peso ideal é de: ");
			escreva((72.7*h - 58)," kg.");
		} senao se(g == 'M' ou g == 'm'){
			escreva("Seu peso ideal é de: ");
			escreva((62.1*h - 44.7)," kg.");
		} senao {
			escreva("Erro. Verifique as informações inseridas e tente novamente.");
		}
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */