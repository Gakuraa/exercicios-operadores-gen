package Exercicios;

import java.util.Scanner;

public class Atividade2 {
	
	public static void main(String[] args) {
		
		float nota1,nota2,nota3,nota4,media;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do participante: ");
		nota1 = sc.nextFloat();
		System.out.println("Digite a segunda nota do participante: ");
		nota2 = sc.nextFloat();
		System.out.println("Digite a terceira nota do participante: ");
		nota3 = sc.nextFloat();
		System.out.println("Digite a quarta nota do participante: ");
		nota4 = sc.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println("\nNota1: " + nota1 + "\nNota2: " + nota2 + "\nNota3: " + nota3 + "\nNota4: " + nota4 + "\n\nMédia final: " + media);
		
		sc.close();
								
	}

}
