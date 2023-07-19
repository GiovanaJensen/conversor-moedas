package br.com.currencyToday.conversorMoedas.frame;
import javax.swing.JOptionPane;

import br.com.currencyToday.conversorMoedas.modelo.ConversorDeMoedas;
import br.com.currencyToday.conversorMoedas.modelo.Dolar;
import br.com.currencyToday.conversorMoedas.modelo.Euro;
import br.com.currencyToday.conversorMoedas.modelo.LibrasEsterlinas;
import br.com.currencyToday.conversorMoedas.modelo.PesoArgentino;
import br.com.currencyToday.conversorMoedas.modelo.PesoChileno;

public class TelaEscolha {
    public void showTelaMoedas(double valor){
        String[] opcoes = {"De real para dólar", "De real para euro", "De real para Libras esterlinas", "De real para peso argentino", "De real para peso chileno"};
        Object opcaoEscolhida = JOptionPane.showInputDialog(null, "Escolha a moeda para a qual você deseja girar seu dinheiro", "Moedas", JOptionPane.INFORMATION_MESSAGE,null, opcoes, opcoes[0]);
        if(opcaoEscolhida == opcoes[0]){
            ConversorDeMoedas conversorDeMoedas = new ConversorDeMoedas();
            Dolar dolar = new Dolar();
            dolar.setValor(0.21);
            conversorDeMoedas.getValorTotal(dolar, valor);
        }else if(opcaoEscolhida == opcoes[1]){
            ConversorDeMoedas conversorDeMoedas = new ConversorDeMoedas();
            Euro euro = new Euro();
            euro.setValor(0.19);
            conversorDeMoedas.getValorTotal(euro, valor);

        }else if(opcaoEscolhida == opcoes[2]){
            ConversorDeMoedas conversorDeMoedas = new ConversorDeMoedas();
            LibrasEsterlinas libras = new LibrasEsterlinas();
            libras.setValor(0.16);
            conversorDeMoedas.getValorTotal(libras, valor);
        }else if(opcaoEscolhida == opcoes[3]){
            ConversorDeMoedas conversorDeMoedas = new ConversorDeMoedas();
            PesoArgentino pesoArgentino = new PesoArgentino();
            pesoArgentino.setValor(55.60);
            conversorDeMoedas.getValorTotal(pesoArgentino, valor);
        }else if(opcaoEscolhida == opcoes[4]){
            ConversorDeMoedas conversorDeMoedas = new ConversorDeMoedas();
            PesoChileno pesoChileno = new PesoChileno();
            pesoChileno.setValor(169.61);
            conversorDeMoedas.getValorTotal(pesoChileno, valor);
        }
    }
}
