package br.com.currencyToday.conversorMoedas.modelo;

public class PesoArgentino extends Moeda{
    public PesoArgentino(String nome) {
        super(nome);
    }

    @Override
    public void setValor(double valor){
        super.valor = valor;
    }
}
