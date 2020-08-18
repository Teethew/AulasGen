package HerançaCapsulamento;

public class TesteFornecedor {

	public static void main(String[] args) {
		
		Fornecedor F1 = new Fornecedor("CASAROTTI","1134388442",5000,6000);
		
		System.out.printf("Fornecedor: %s\nSaldo: R$%.2f\n",F1.getNome(),F1.obterSaldo());
		
		F1.setCelular("11934358672"); //cadastrando um celular novo para o fornecedor CASAROTTI
		
		F1.mostrarTelefones(); //mostrando o novo celular junto com o telefone

	}

}
