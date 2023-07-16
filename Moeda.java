public class Moeda{
    protected String nome;
    protected double valor;

    public Moeda(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return this.valor;
    }

    public String getNome(){
        return this.nome;
    }
}