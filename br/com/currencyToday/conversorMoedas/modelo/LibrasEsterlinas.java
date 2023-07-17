package br.com.currencyToday.conversorMoedas.modelo;

public class LibrasEsterlinas extends Moeda{
    public LibrasEsterlinas(String nome) {
        super(nome);
    }

    @Override
    public void setValor(double valor){
        super.valor = valor;
    }
}
