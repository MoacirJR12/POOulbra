package atividades;

import java.util.Scanner;

public class GeradorDeTabuada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um numero para gerar a tabuada: ");
            int numero = Integer.parseInt(scanner.nextLine());

            System.out.println("Tabuada do " + numero + ":");

            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }

        } catch (NumberFormatException e) {
            System.out.println("Por favor, insira um número válido.");
        } finally {
            scanner.close();
        }
    }
}
