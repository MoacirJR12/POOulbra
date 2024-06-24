package atividades;

import java.util.Scanner;

public class ExemploScanner {

	public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite um número inteiro: ");
	        int inteiro = scanner.nextInt();
	        System.out.println("Você digitou o número inteiro: " + inteiro);

	        System.out.print("Digite um número de ponto flutuante: ");
	        double pontoFlutuante = scanner.nextDouble();
	        System.out.println("Você digitou o número de ponto flutuante: " + pontoFlutuante);

	        scanner.nextLine();
	        
	        System.out.print("Digite uma string: ");
	        String string = scanner.nextLine();
	        System.out.println("Você digitou a string: " + string);

	        System.out.print("Digite uma linha de texto: ");
	        String linhaTexto = scanner.nextLine();
	        System.out.println("Você digitou: " + linhaTexto);
	        
	        scanner.close();

	}

}
