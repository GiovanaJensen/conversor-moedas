package br.com.currencyToday.conversorMoedas.frame;

import javax.swing.JOptionPane;

public class TelaValor{
        public void showTelaValor(){
            String inputValor = JOptionPane.showInputDialog(null, "Insira um valor:", "Input", JOptionPane.QUESTION_MESSAGE);
            if(inputValor != null){
                try{
                    double valor = Double.parseDouble(inputValor);
                    TelaEscolha telaEscolha = new TelaEscolha();
                    telaEscolha.showTelaMoedas(valor);
                }catch(NumberFormatException error){
                    System.out.println("Valor inserido é inválido! Digite um número por favor!");
                    showTelaValor();
                }
            }
    }
}