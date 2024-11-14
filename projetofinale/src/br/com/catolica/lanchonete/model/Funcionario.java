package br.com.catolica.lanchonete.model;
import br.com.catolica.lanchonete.model.Funcionario;

public class Funcionario extends Pessoa {
    private String cargo;
    private String Funcionario;

    public Funcionario(String nome, String contato, String cargo) {
        super(nome, contato);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + getNome() + '\'' +
                ", contato='" + getContato() + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}

