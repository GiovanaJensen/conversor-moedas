package br.com.currencyToday.conversorMoedas.frame;

import javax.swing.JOptionPane;

public class TelaResultado {
    public void showTelaResultado(double valorTotal){
        JOptionPane.showMessageDialog(null, "O valor de conversão é " + valorTotal, "Message", JOptionPane.INFORMATION_MESSAGE);
        TelaContinar telaContinar = new TelaContinar();
        telaContinar.showTelaContinuar();
    }
}
