programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		
		inteiro x,vet[10],maiorponto=0,contponto=0
		real acm=0

		para(x=0;x<10;x++)
			{
				vet[x] = Util.sorteia(1, 6) //lib para sortear os lçtos do dado de 6 lados
				acm+=vet[x] //acumula o valor do lçto para somatorio
				se(vet[x]>maiorponto) //verificando se o valor é maior que a var maiorponto
					{
						maiorponto=vet[x] //se for maior, guardo ela em 'maiorponto'
						contponto=1       //contponto recebe o valor de 1 para reiniciar a contagem
					}
				senao se(vet[x]==maiorponto)//verificando se o valor é igual
					{
						contponto+=1	   //contponto recebe +1 para somar ao total da contagem
					}
				
			}
		para(x=0;x<10;x++)
			{
				escreva("\n", x+1,"º dado lançado:  ",vet[x])
				
			}
		escreva("\nSoma: ",acm,"\nMédia: ",acm/10,"\nMaior Ponto: ",maiorponto,"\nOcorrências do maior: ",contponto)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 709; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vet, 8, 12, 3}-{maiorponto, 8, 20, 10}-{contponto, 8, 33, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */