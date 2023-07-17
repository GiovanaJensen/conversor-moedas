package br.com.currencyToday.conversorMoedas.frame;

import javax.swing.JOptionPane;

public class telaValor {
    public static void main(String[] args){
            String inputValor = JOptionPane.showInputDialog(null, "Insira um valor:", "Input", JOptionPane.QUESTION_MESSAGE);
            if(inputValor != null){
                try{
                    double valor = Double.parseDouble(inputValor);
                }catch(NumberFormatException error){
                    System.out.println("Valor inserido é inválido! Digite um número por favor!");
                    telaValor.main(args);
                }
            }else{
                System.out.println("Não pode ser nulo");
            }
    }
}