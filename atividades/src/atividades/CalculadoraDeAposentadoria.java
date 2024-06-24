package atividades;

import java.util.Scanner;

public class CalculadoraDeAposentadoria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite sua idade: ");
            int idade = Integer.parseInt(scanner.nextLine());

            System.out.print("Digite seu sexo (M/F): ");
            String sexo = scanner.nextLine().toUpperCase();
            if (!sexo.equals("M") && !sexo.equals("F")) {
                System.out.println("Sexo invalido. Use 'M' para masculino ou 'F' para feminino.");
                return;
            }

            System.out.print("Digite seus anos de contribuicao: ");
            int anosContribuicao = Integer.parseInt(scanner.nextLine());

            boolean podeAposentarPorIdade = false;
            boolean podeAposentarPorContribuicao = false;
            int anosFaltantesIdade = 0;
            int anosFaltantesContribuicao = 0;

            if (sexo.equals("M")) {
                podeAposentarPorIdade = idade >= 65;
                podeAposentarPorContribuicao = anosContribuicao >= 35;
                if (!podeAposentarPorIdade) anosFaltantesIdade = 65 - idade;
                if (!podeAposentarPorContribuicao) anosFaltantesContribuicao = 35 - anosContribuicao;
            } else {
                podeAposentarPorIdade = idade >= 60;
                podeAposentarPorContribuicao = anosContribuicao >= 30;
                if (!podeAposentarPorIdade) anosFaltantesIdade = 60 - idade;
                if (!podeAposentarPorContribuicao) anosFaltantesContribuicao = 30 - anosContribuicao;
            }

            if (podeAposentarPorIdade || podeAposentarPorContribuicao) {
                System.out.println("Voce ja pode se aposentar!");
            } else {
                System.out.println("Voce ainda não pode se aposentar.");
                if (anosFaltantesIdade > 0) {
                    System.out.println("Faltam " + anosFaltantesIdade + " anos para aposentadoria por idade.");
                }
                if (anosFaltantesContribuicao > 0) {
                    System.out.println("Faltam " + anosFaltantesContribuicao + " anos para aposentadoria por tempo de contribuicao.");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, insira um numero valido.");
        } finally {
            scanner.close();
        }
    }
}
