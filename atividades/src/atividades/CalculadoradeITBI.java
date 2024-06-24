package atividades;

import javax.swing.JOptionPane;

public class CalculadoradeITBI {

    public static void main(String[] args) {
    	public static void main(String[] args) {
            String inputTransacao = JOptionPane.showInputDialog("Informe o valor da transação do imóvel:");
            String inputVenal = JOptionPane.showInputDialog("Informe o valor venal do imóvel:");
            String inputPorcentagemITBI = JOptionPane.showInputDialog("Informe a porcentagem do ITBI (%):");

            double valorTransacao = Double.parseDouble(inputTransacao);
            double valorVenal = Double.parseDouble(inputVenal);
            double porcentagemITBI = Double.parseDouble(inputPorcentagemITBI);

            double maiorValor = Math.max(valorTransacao, valorVenal);
            double itbi = maiorValor * (porcentagemITBI / 100.0);

            JOptionPane.showMessageDialog(null, "Valor do ITBI a ser pago: R$ " + itbi);
        }
}
