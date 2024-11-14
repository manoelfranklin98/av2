package br.com.catolica.lanchonete.model;

public class Lanche extends Produto {
    private String ingredientes;

    public Lanche(String nome, double preco, String ingredientes) {
        super(nome, preco, TipoProduto.LANCHE);
        this.ingredientes = ingredientes;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Lanche{" +
                "nome='" + getNome() + '\'' +
                ", preco=" + getPreco() +
                ", ingredientes='" + ingredientes + '\'' +
                '}';
    }
}

