package Exercicio1;

public class Gerente extends Funcionario {

	public Gerente() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aumentaSalario() {
		double aumento = (10 * getSalario())/100;
		double resultado = getSalario() + aumento;
		System.out.println("Aumento: " + aumento);
		System.out.println("Salario do Gerente com aumento: " + resultado); 
	}
}