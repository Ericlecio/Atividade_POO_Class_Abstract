package Exercicio1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Funcionario fg = new Gerente();
		Gerente g1 = (Gerente) fg;

		Funcionario fp = new Programador();
		Programador p1 = (Programador) fp;

		g1.setNome("Ericlecio");
		g1.setSalario(1500);

		p1.setNome("João");
		p1.setSalario(1000);

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite \n1-Imprimir dados ou \n2-Aumentar Salario: ");
		int numero = scanner.nextInt();

		if (numero == 1) {
			System.out.print("Imprimir dados do Gerente ou Programador, digite 1 ou 2: ");
			int escolha = scanner.nextInt();

			if(escolha == 1) {
				System.out.println("Nome: " + g1.getNome()+ ", " + "Salario: " + g1.getSalario());
				System.out.print("Deseja Aumentar o Salario do Gerente ? digite 1 para aumentar ou 0 para sair ");
				int escolhaescolha = scanner.nextInt();

				if(escolhaescolha == 1){
					g1.aumentaSalario();
				}
				else {
				}
			}
			if(escolha == 2) {
				System.out.println("Nome: " + p1.getNome()+ ", " + "Salario: " + p1.getSalario());
				System.out.print("Deseja Aumentar o Salario do Programador ? digite 1 para aumentar ou 0 para sair ");
				int escolhaescolha = scanner.nextInt();

				if(escolhaescolha == 1){
					p1.aumentaSalario();
				}
				else {
				}
			}
			else {
			}
		}

		if (numero == 2) {
			System.out.print("Aumentar Salario do Gerente ou Programador, digite 1 ou 2: ");
			int escolha = scanner.nextInt();

			if(escolha == 1) {
				System.out.println("Nome: " + g1.getNome()+ ", " + "Salario: " + g1.getSalario());
				p1.aumentaSalario();
			}
			if(escolha == 2) {
				System.out.println("Nome: " + p1.getNome()+ ", " + "Salario: " + p1.getSalario());
				p1.aumentaSalario();

			}else {
			}
		}
		else {
		}
	}
}