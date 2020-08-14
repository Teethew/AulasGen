package introJOO;

public class Aviao {
	
	private String modelo;
	private int peso;
	private float comprimento;
	private int nAssentos;
	private int numeroSerie;
	private short velMaxima;
	
	public Aviao(String modelo, int peso, float comprimento, int nAssentos, int numeroSerie, short velMaxima ) {
		this.modelo = modelo;
		this.peso = peso;
		this.comprimento = comprimento;
		this.nAssentos = nAssentos;
		this.numeroSerie = numeroSerie;
		this.velMaxima = velMaxima;
	}

	public Aviao() {
		//metodo vazio caso seja necessario instanciar um novo objeto mas sem todas as informaçoes necessarias
	}

	public void printaAviao() {
		System.out.println("Aviao: "+modelo);
		System.out.println("Peso: "+peso+"kg");
		System.out.println("Comprimento: "+comprimento+"m");
		System.out.println("Número de assentos: "+nAssentos);
		System.out.println("Número de série: "+numeroSerie);
		System.out.println("Velocidade de cruzeiro: "+velMaxima+"km/h");
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public int getnAssentos() {
		return nAssentos;
	}

	public void setnAssentos(int nAssentos) {
		this.nAssentos = nAssentos;
	}

	public int getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public short getVelMaxima() {
		return velMaxima;
	}

	public void setVelMaxima(short velMaxima) {
		this.velMaxima = velMaxima;
	}

	
}
