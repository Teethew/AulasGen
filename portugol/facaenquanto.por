programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		 real n, soma=0.0;
		 inteiro cont=0;
		 faca{
		 	escreva("Digite um número positivo: ")
		 	leia(n);
		 	se(n>0)
		 		soma += n;
		 	cont++;
		 } enquanto (n>0)

		 escreva("\nSoma: ",soma,"\nMédia: ",soma/(cont-1),"\nValores lidos: ",cont-1);
	}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 307; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n, 6, 8, 1}-{soma, 6, 11, 4}-{cont, 7, 11, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */