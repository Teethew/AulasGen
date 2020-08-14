package introJOO;

public class InfoAviao {

	public static void main(String[] args) {
		Aviao a1 = new Aviao("Model 75S", 878, 7.54F, 2, 8584670, (short) 217); //registro dos avioes
		Aviao a2 = new Aviao();
		
		//registrando as informacoes do segundo aviao atraves de setters
		
		a2.setModelo("Boeing 707");
		a2.setPeso(49900);
		a2.setComprimento(46.61F);
		a2.setnAssentos(166);
		a2.setNumeroSerie(3285);
		a2.setVelMaxima((short)972);
		
		
		a1.printaAviao(); //impressao dos dados do aviao
		System.out.println("----------------------------");
		a2.printaAviao();
		
		//vamos mudar um dado do Model 75 S e verificar se esta ok:
		
		a1.setNumeroSerie(8584673);
		
		System.out.println("\n*Alteração no número de série do Model 75S: \n");
		a1.printaAviao();

	}

}
