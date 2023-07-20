package br.com.currencyToday.conversorMoedas.frame;

import javax.swing.JOptionPane;

public class TelaContinar {
    public void showTelaContinuar(){
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Select an option", JOptionPane.YES_NO_CANCEL_OPTION);
        if(opcao == 0){
            TelaInicial telaInicial = new TelaInicial();
            telaInicial.showTelaInicial();
        }else if(opcao == 1){
            JOptionPane.showMessageDialog(null, "Programa finalizado", "Programa finalizado", JOptionPane.CLOSED_OPTION);
        }else{
            JOptionPane.showMessageDialog(null, "Programa concluído", "Programa concluído", JOptionPane.CLOSED_OPTION);
        }
    }
}
