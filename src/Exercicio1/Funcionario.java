package Exercicio1;

public abstract class Funcionario {
	private String nome;
	private double salario;

	//METODOS
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public abstract void aumentaSalario();
	
	
	//GETS E SETS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}