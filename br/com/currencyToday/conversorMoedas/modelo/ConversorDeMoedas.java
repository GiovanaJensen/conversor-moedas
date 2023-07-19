package br.com.currencyToday.conversorMoedas.modelo;

import br.com.currencyToday.conversorMoedas.frame.TelaResultado;

public class ConversorDeMoedas {
    protected double valorTotal;
    public void getValorTotal(Moeda moeda, double valor){
        this.valorTotal = moeda.getValor() * valor;
        TelaResultado telaResultado = new TelaResultado();
        telaResultado.showTelaResultado(this.valorTotal);
    }
}
