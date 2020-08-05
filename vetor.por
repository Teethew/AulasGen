programa
{
	inclua biblioteca Util --> u
	funcao inicio()
	{
		const inteiro LINHAS = 3;
		const inteiro COLUNAS = 3;
		inteiro M[LINHAS][COLUNAS], somat=0, somad=0;

		escreva("Digite a matriz M");
		para(inteiro i=0;i<LINHAS;i++){
			escreva("\n");
			para(inteiro j=0;j<COLUNAS;j++){
				leia(M[i][j]);
				//M[i][j] = u.sorteia(0, 100);
				//escreva(M[i][j]," ");
				somat += M[i][j];
			}
			somad += M[i][i];
		}
		para(inteiro i=0;i<LINHAS;i++){
			escreva("\n( ");
			para(inteiro j=0;j<COLUNAS;j++){
				escreva(M[i][j]," ");	
			}
			escreva("
			)");
		}
		escreva("\n");
		escreva("\nA soma total foi ",somat);
		escreva("\nA soma da diagonal principal foi ",somad);
		escreva("\n");
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 624; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */