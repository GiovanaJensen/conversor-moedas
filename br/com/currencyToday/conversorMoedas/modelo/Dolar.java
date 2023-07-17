package br.com.currencyToday.conversorMoedas.modelo;

public class Dolar extends Moeda{
    public Dolar(String nome) {
        super(nome);
    }

    @Override
    public void setValor(double valor){
        super.valor = valor;
    }
}
