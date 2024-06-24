package atividades;

import javax.swing.JOptionPane;

public class SistemaDeAvaliacao {

	  public static void main(String[] args) {
	      
	        String inputNotaProva1 = JOptionPane.showInputDialog("Informe a nota da primeira prova:");
	        String inputNotaProva2 = JOptionPane.showInputDialog("Informe a nota da segunda prova:");
	        String inputNotaTrabalho = JOptionPane.showInputDialog("Informe a nota do trabalho:");

	        double notaProva1 = Double.parseDouble(inputNotaProva1);
	        double notaProva2 = Double.parseDouble(inputNotaProva2);
	        double notaTrabalho = Double.parseDouble(inputNotaTrabalho);

	        double media = (notaProva1 + notaProva2 + notaTrabalho) / 3.0;

	        String situacao;
	        if (media >= 6.0) {
	            situacao = "Aprovado";
	        } else {
	            situacao = "Reprovado";
	        }

	        JOptionPane.showMessageDialog(null, "Média: " + media + "\nSituação: " + situacao);
	    }
}
