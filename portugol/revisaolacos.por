
/* CLIQUE NO SINAL DE "+", À ESQUERDA, PARA EXIBIR A DESCRIÇÃO DO EXEMPLO
 *  
 * Copyright (C) 2014 - UNIVALI - Universidade do Vale do Itajaí
 * 
 * Este arquivo de código fonte é livre para utilização, cópia e/ou modificação
 * desde que este cabeçalho, contendo os direitos autorais e a descrição do programa, 
 * seja mantido.
 * 
 * Se tiver dificuldade em compreender este exemplo, acesse as vídeoaulas do Portugol 
 * Studio para auxiliá-lo:
 * 
 * https://www.youtube.com/watch?v=K02TnB3IGnQ&list=PLb9yvNDCid3jQAEbNoPHtPR0SWwmRSM-t
 * 
 * Descrição:
 * 
 * 	Este exemplo pede ao usuario que informe um valor inteiro. Logo após, calcula e
 * 	exibe a soma dos números de 1 e até o número digitado.
 * 	
 * Autores:
 * 
 * 	Giordana Maria da Costa Valle
 * 	Carlos Alexandre Krueger
 * 	
 * Data: 01/06/2013
 */

programa
{
	inclua biblioteca Matematica --> mat
	inclua biblioteca Util --> u
	funcao inicio() 
	{
		inteiro m[2][2],n[2][2];
		para(inteiro i=0;i<2;i++){
			escreva("\n"); //caso use o sorteia, fica melhor para organizar
			para(inteiro j=0;j<2;j++){
				//m[i][j] = u.sorteia(-50,50);
				escreva("Digite um numero "); leia(m[i][j]);
				//escreva(m[i][j]," ");
			}
		}

		escreva("\n");
		inteiro maior = m[0][0];
		para(inteiro i=0;i<2;i++){
			escreva("\n");//comentar caso use o sorteia
			para(inteiro j=0;j<2;j++){
				se(maior<m[i][j]){
					maior = m[i][j];
				}
				escreva(m[i][j]," ");//comentar caso use o sorteia
			}
		}
		escreva("\n\nA matriz m, multiplicada por ",maior," fica: \n");
		para(inteiro i=0;i<2;i++){
			escreva("\n");
			para(inteiro j=0;j<2;j++){
				n[i][j] = m[i][j]*maior;
				escreva(n[i][j]," ");	
			}
		}

		escreva("\n");
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 821; 
 * @DOBRAMENTO-CODIGO = [1];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {m, 34, 10, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */