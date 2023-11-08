package Exercicios;

import java.util.Scanner;

public class Atividade3 {
	
	public static void main(String[] args) {
		
		float salBruto, adNoturno, hrExtra, desc, salLiq;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário bruto: ");
		salBruto = sc.nextFloat();
		System.out.println("Digite o valor do adicional noturno: ");
		adNoturno = sc.nextFloat();
		System.out.println("Digite o valor das horas extras: ");
		hrExtra = sc.nextFloat();
		System.out.println("Digite o valor do desconto: ");
		desc = sc.nextFloat();	
		
		salLiq = salBruto + adNoturno + (hrExtra * 5) - desc;
		System.err.println("O valor do salário líquido é de: " + salLiq);
		
		sc.close();
		
	}

}
