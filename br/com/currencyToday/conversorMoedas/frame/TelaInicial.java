package br.com.currencyToday.conversorMoedas.frame;

import javax.swing.JOptionPane;
// import br.com.currencyToday.conversorMoedas.frame.TelaValor;

public class TelaInicial {
    public static void main(String[] args){
        Object[] opcoes = {"Conversor de Moedas"};

        Object opcaoEscolhida = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.INFORMATION_MESSAGE,null, opcoes, opcoes[0]);
        // if(opcaoEscolhida == opcoes[0]){
        //     TelaValor telaValor = new TelaValor();
        // }
        System.out.println(opcaoEscolhida);
    }
}
