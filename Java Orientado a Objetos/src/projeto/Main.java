package projeto;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		//declaração do scanner
		Scanner s = new Scanner(System.in);
		
		//instanciamento das casas
		Sonserina opcaoA = new Sonserina("Sonserina");
		Corvinal opcaoB = new Corvinal("Corvinal");
		Grifinoria opcaoC = new Grifinoria("Grifinoria");
		LufaLufa opcaoD = new LufaLufa("Lufa-Lufa");
		
		//as casas serão adicionadas à essa colection para depois podermos verificar qual foi a mais escolhida no teste
		List <Casa> casa = new ArrayList();
		
		casa.add(opcaoA);
		casa.add(opcaoB);
		casa.add(opcaoC);
		casa.add(opcaoD);
		
		
		//aqui instanciaremos arraylists relacionados às opções das perguntas		
		Collection<String> perguntas = new ArrayList();
		
		List <String> opcoesA = new ArrayList();
		List <String> opcoesB = new ArrayList();
		List <String> opcoesC = new ArrayList();
		List <String> opcoesD = new ArrayList();
		
		
		//variáveis auxiliares
		int j = 0;
		int maior = 0;
		int maiorCasa = 0; //índice da casa com maior pontuação no teste
		
		
		//populando o arraylist com as perguntas
		perguntas.add("1) Qual das seguintes habilidades tem mais a ver com você?");
		perguntas.add("2) Qual dessas mentalidades está mais presente na sua personalidade?");
		perguntas.add("3)Como \" Dev \" qual dos adjetivos abaixo mais te ofenderia caso você fosse chamado?");
		perguntas.add("4) O que você prefere fazer no seu tempo livre?");
		perguntas.add("5) Em uma história, que personalidade você prefere que o/a protagonista tenha?");
		perguntas.add("6) Qual gênero musical mais te agrada?");
		perguntas.add("7) Escolha dentre essas uma linguagem de programação...!!!");
		perguntas.add("8) Se pudesse comer apenas uma coisa pro resto da vida, o que seria?");
		perguntas.add("9) Qual seu estilo de jogos você prefere?");
		perguntas.add("10) Com qual personagem de Turma da Mônica você mais se identifica?");
		perguntas.add("11) Escolha uma série:");
		perguntas.add("12) Escolha um pesadelo do primeiro módulo:");
		perguntas.add("13) Escolha um bruxo famoso do filme:");
		
		//populando o set referente as opções A (Sonserina)
		opcoesA.add("Comunicação ");
		opcoesA.add("Mentalidade de crescimento ");
		opcoesA.add("Noob ");
		opcoesA.add("Sair para dançar com os amigos ");
		opcoesA.add("Que seja mais impulsivo/a e direto/a ");
		opcoesA.add("Rock ");
		opcoesA.add("Python ");
		opcoesA.add("Comida Japonesa ");
		opcoesA.add("MOBA's ");
		opcoesA.add("Cebolinha ");
		opcoesA.add("Breaking Bad ");
		opcoesA.add("Git e GitHub ");
		opcoesA.add("Lord Voldemort ");
		
		//populando o set referente as opções B (Corvinal)
		opcoesB.add("Atenção aos detalhes");
		opcoesB.add("Orientação ao futuro");
		opcoesB.add("Irrelevante");
		opcoesB.add("Ficar em casa lendo ou assistindo série");
		opcoesB.add("Que seja mais sábio/a e age como ");
		opcoesB.add("Clássica");
		opcoesB.add("Kotlin");
		opcoesB.add("Pizza");
		opcoesB.add("Jogos de Cartas");
		opcoesB.add("Cascão");
		opcoesB.add("Dark");
		opcoesB.add("Interfaces");
		opcoesB.add("Luna Lovegood");
		
		//populando o set referente as opções C (Grifinoria)
		opcoesC.add("Proatividade");
		opcoesC.add("Persistência");
		opcoesC.add("Covarde");
		opcoesC.add("Ficar em casa jogando online");
		opcoesC.add("Que seja paciente, mas não leve desaforo para casa");
		opcoesC.add("Eletrônica");
		opcoesC.add("Java");
		opcoesC.add("Hambúrguer");
		opcoesC.add("Jogos de Luta 2D");
		opcoesC.add("Mônica");
		opcoesC.add("Peaky Blinders");
		opcoesC.add("Polimorfismo");
		opcoesC.add("Hermione");
		
		//populando o set referente as opções D (Lufa-Lufa)
		opcoesD.add("Trabalho em equipe");
		opcoesD.add("Responsabilidade pessoal");
		opcoesD.add("Ignorante");
		opcoesD.add("Fazer ligação com o crush");
		opcoesD.add("Que tenha uma empatia enorme e boa");
		opcoesD.add("Sertanejo");
		opcoesD.add("JavaScript");
		opcoesD.add("Churrasco");
		opcoesD.add("MMORPG");
		opcoesD.add("Magali");
		opcoesD.add("Stranger Things");
		opcoesD.add("Collections");
		opcoesD.add("Ninfadora Tonks");
		
				
		for(String i:perguntas) {
			
			
			//System.out.println("Sonserina: "+casa.get(0).getCont()+"\nCorvinal: "+casa.get(1).getCont()+"\nGrifinoria: "+casa.get(2).getCont()+"\nLufa-Lufa: "+casa.get(3).getCont());
			
			char opcao; //será onde a opcao digitada pelo usuario sera armazenada
			while(true) {
				System.out.println(i); //mostra a pergunta para o usuario
				//os prints abaixo mostram as respectivas opcoes, contidas nos List opcoesA, opcoesB, ...
				System.out.println("a) "+opcoesA.get(j)); 
				System.out.println("b) "+opcoesB.get(j));
				System.out.println("c) "+opcoesC.get(j));
				System.out.println("d) "+opcoesD.get(j));
				//opcao le o próximo char digitado no console
				opcao = s.next().charAt(0);
				if(opcao == 'a' || opcao == 'A') {
					opcaoA.add();
					break;
				}
				if(opcao == 'b' || opcao == 'B') {
					opcaoB.add();
					break;
				}
				if(opcao == 'c' || opcao == 'C') {
					opcaoC.add();
					break;
				}
				if(opcao == 'd' || opcao == 'D') {
					opcaoD.add();
					break;
				} else System.out.println("Opção inválida!\n");
			}
			j++;
		}
		
		for(int i=0;i<casa.size();i++) {
			int temp; //variável temporária que recebe o contador da casa na posição i do List casa
			temp = casa.get(i).getCont();
			if(temp>maior) { //vai comparar se o contador da casa é maior que o número que estava armazenado antes
				maior = casa.get(i).getCont();
				maiorCasa = i;
			}
		}
		
		System.out.println("Você tirou: "+casa.get(maiorCasa).getNome()+"!");
		casa.get(maiorCasa).lemaDaCasa();

	}

}
