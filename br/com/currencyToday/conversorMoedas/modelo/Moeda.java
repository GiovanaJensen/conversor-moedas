package br.com.currencyToday.conversorMoedas.modelo;

public abstract class Moeda{
    protected String nome;
    protected double valor;

    public Moeda(String nome) {
        this.nome = nome;
    }

    abstract public void setValor(double valor);

    public double getValor(){
        return this.valor;
    }

    public String getNome(){
        return this.nome;
    }
}