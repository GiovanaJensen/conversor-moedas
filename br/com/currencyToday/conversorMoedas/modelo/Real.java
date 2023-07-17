package br.com.currencyToday.conversorMoedas.modelo;

public class Real extends Moeda{
    public Real(String nome) {
        super(nome);
    }

    @Override
    public void setValor(double valor){
        super.valor = valor;
    }
}
