package Exercicio1;

public class Programador extends Funcionario {

	public Programador() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void aumentaSalario() {
		double aumento = (20 * getSalario())/100;
		double resultado = getSalario() + aumento;
		System.out.println("Aumento: " + aumento);
		System.out.println("Salario do Programador com aumento: " + resultado); 
	}

}