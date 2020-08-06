programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		//O custo ao consumidor de um carro novo é a soma do custo de 
		//fábrica com a percentagem do distribuidor e 
		//dos impostos (aplicados ao custo de fábrica). 
		//Supondo que a percentagem do distribuidor seja de 28% e os 
		//impostos de 45%, escrever um sistema que leia o custo de fábrica 
		//de um carro e escreva o custo ao consumidor. 
		real custonovo, cfabrica, dist, imp;// Declara custo novo, custo de fábrica, % do dist, e % de impostos
		escreva("Digite o custo de fábrica\n");
		leia(cfabrica);
		dist = 0.28;
		imp = 0.45;
		custonovo = cfabrica + cfabrica*dist + cfabrica*imp;
		escreva("O custo do carro novo é de R$ ",custonovo);
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 727; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */