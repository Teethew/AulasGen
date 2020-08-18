package HerançaCapsulamento;

public class TesteEmpregado {

	public static void main(String[] args) {
		Empregado edu = new Empregado("Eduardo Costa","11963345687","Rua dos coqueiros, 6060",244,3000,14);
		
		System.out.printf("Empregado: %s\n",edu.getNome());
		System.out.printf("Salario Base: R$%.2f\n",edu.getSalarioBase());
		System.out.printf("Salario liquido: R$%.2f\n",edu.calcularSalario());
		edu.mostrarTelefones();
		
		edu.setCelular("1144564456"); //novo fixo
		
		System.out.println("Info atualizada: ");
		
		System.out.printf("Empregado: %s\n",edu.getNome());
		System.out.printf("Salario Base: R$%.2f\n",edu.getSalarioBase());
		System.out.printf("Salario liquido: R$%.2f\n",edu.calcularSalario());
		edu.mostrarTelefones();
		
	}

}
