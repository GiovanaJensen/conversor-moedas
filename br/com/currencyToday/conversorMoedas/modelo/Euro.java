package br.com.currencyToday.conversorMoedas.modelo;

public class Euro extends Moeda{
    public Euro(String nome) {
        super(nome);
    }

    @Override
    public void setValor(double valor){
        super.valor = valor;
    }
}