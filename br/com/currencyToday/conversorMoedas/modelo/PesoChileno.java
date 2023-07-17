package br.com.currencyToday.conversorMoedas.modelo;

public class PesoChileno extends Moeda{
    public PesoChileno(String nome) {
        super(nome);
    }

    @Override
    public void setValor(double valor){
        super.valor = valor;
    }
}
