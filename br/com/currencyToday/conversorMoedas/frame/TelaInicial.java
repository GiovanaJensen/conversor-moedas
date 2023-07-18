package br.com.currencyToday.conversorMoedas.frame;

import javax.swing.JOptionPane;

public class TelaInicial {
    public static void main(String[] args){
        String[] opcoes = {"Conversor de Moedas"};

        Object opcaoEscolhida = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.INFORMATION_MESSAGE,null, opcoes, opcoes[0]);
        if(opcaoEscolhida == opcoes[0]){
            TelaValor telaValor = new TelaValor();
            telaValor.showTelaValor();
        }
        System.out.println(opcaoEscolhida);
    }
}
