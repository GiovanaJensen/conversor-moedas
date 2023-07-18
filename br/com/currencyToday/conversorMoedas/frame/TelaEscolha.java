package br.com.currencyToday.conversorMoedas.frame;
import javax.swing.JOptionPane;

public class TelaEscolha {
    public void showTelaMoedas(double valor){
        String[] opcoes = {"De real para dólar", "De real para euro", "De real para Libras esterlinas", "De real para peso argentino", "De real para peso chileno"};
        Object opcaoEscolhida = JOptionPane.showInputDialog(null, "Escolha a moeda para a qual você deseja girar seu dinheiro", "Moedas", JOptionPane.INFORMATION_MESSAGE,null, opcoes, opcoes[0]);
    }
}
