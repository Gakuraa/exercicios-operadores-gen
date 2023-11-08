package Exercicios;

import java.util.Scanner;

public class Atividade4 {
	
	public static void main(String[] args) {
		float n1,n2,n3,n4,calculo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o numero1: ");
		n1 = sc.nextFloat();
		System.out.println("Informe o numero2: ");
		n2 = sc.nextFloat();
		System.out.println("Informe o numero3: ");
		n3 = sc.nextFloat();
		System.out.println("Informe o numero4: ");
		n4 = sc.nextFloat();
		
		calculo = (n1*n2) - (n3*n4);
		System.out.println("O valor da diferença do produto de n1 e n2 pelo produto de n3 e n4 é: " + calculo);
		
		sc.close();
	}

}
