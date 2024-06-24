package atividades;

import java.util.Scanner;

public class SistemaDeLogin {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usuario = "java8";
        String senha = "java8";

        int maxTentativas = 3;

        boolean loginBemSucedido = false;
        for (int tentativa = 1; tentativa <= maxTentativas; tentativa++) {
            System.out.print("Login: ");
            String login = scanner.nextLine();
            System.out.print("Senha: ");
            String senhaDigitada = scanner.nextLine();

            if (login.equals(usuario) && senhaDigitada.equals(senha)) {
                loginBemSucedido = true;
                System.out.println("Login bem-sucedido!");
                break;
            } else {
                System.out.println("Login ou senha incorretos. Tentativa " + tentativa + " de " + maxTentativas);
            }
        }

        if (!loginBemSucedido) {
            System.out.println("Numero maximo de tentativas excedido. O sistema sera bloqueado.");
        }
        scanner.close();
    }

}
