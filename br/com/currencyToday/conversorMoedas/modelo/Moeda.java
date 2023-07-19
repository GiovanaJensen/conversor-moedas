package br.com.currencyToday.conversorMoedas.modelo;

public abstract class Moeda{
    protected double valor;

    abstract public void setValor(double valor);

    public double getValor(){
        return this.valor;
    }
}