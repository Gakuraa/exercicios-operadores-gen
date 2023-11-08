package Exercicios;

import java.util.Scanner;

public class Atividade1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float salario;
		float abono;
		float novoSalario;
		
		System.out.println("Digite o valor do salário: ");
		salario = sc.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = sc.nextFloat();
		
		novoSalario = salario + abono;
		System.out.println("O valor do novo salário é de: " + novoSalario);
		sc.close();
	}

}
