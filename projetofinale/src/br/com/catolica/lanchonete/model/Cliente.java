package br.com.catolica.lanchonete.model;

public class Cliente extends Pessoa {
    private double saldo;

    public Cliente(String nome, String contato, double saldo) {
        super(nome, contato);
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + getNome() + '\'' +
                ", contato='" + getContato() + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}

