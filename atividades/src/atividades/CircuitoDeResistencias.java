package atividades;

import java.util.Scanner;

public class CircuitoDeResistencias {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite os valores das quatro resistencias ligadas em serie:");

            double[] resistencias = new double[4];
            for (int i = 0; i < 4; i++) {
                System.out.print("Resistencia " + (i + 1) + ": ");
                resistencias[i] = Double.parseDouble(scanner.nextLine());
            }
            
            double resistenciaEquivalente = 0;
            for (double resistencia : resistencias) {
                resistenciaEquivalente += resistencia;
            }

            double maiorResistencia = resistencias[0];
            double menorResistencia = resistencias[0];
            for (int i = 1; i < resistencias.length; i++) {
                if (resistencias[i] > maiorResistencia) {
                    maiorResistencia = resistencias[i];
                }
                if (resistencias[i] < menorResistencia) {
                    menorResistencia = resistencias[i];
                }
            }

            System.out.println("Resistencia Equivalente: " + resistenciaEquivalente + " Ohms");
            System.out.println("Maior Resistencia: " + maiorResistencia + " Ohms");
            System.out.println("Menor Resistencia: " + menorResistencia + " Ohms");

        } catch (NumberFormatException e) {
            System.out.println("Por favor, insira um numero valido para as resistencias.");
        } finally {
            scanner.close();
        }
    }

}
