package introJOO;

public class DadosClientes {

	public static void main(String[] args) {
	Cliente jose = new Cliente("José da Cunha",393194,1186654567); //cadastro dos novos clientes
	Cliente maria = new Cliente("Maria Antonieta",345633,13956783214L);
	
	jose.printaCliente(); //impressao dos dados dos clientes
	System.out.println("----------------------------");
	maria.printaCliente();
	
	//vamos mudar algum dado dos clientes ja cadastrados e verificar se funcionara normalmente:
	
	jose.setTelefoneCliente(1147758622);
	
	System.out.println("\nAlteração no telefone do cliente José da Cunha: \n");
	jose.printaCliente();

	}

}
