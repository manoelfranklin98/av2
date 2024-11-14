package br.com.catolica.lanchonete.model;


public class Pedido implements IPedido {
    private Cliente cliente;
    private Lanche lanche;
    private StatusPedido status;
    private TipoPagamento tipoPagamento;

    public Pedido(Cliente cliente, Lanche lanche, TipoPagamento tipoPagamento) {
        this.cliente = cliente;
        this.lanche = lanche;
        this.tipoPagamento = tipoPagamento;
        this.status = StatusPedido.PENDENTE;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Lanche getLanche() {
        return lanche;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    @Override
    public void iniciarPedido() {
        System.out.println("Pedido iniciado para " + cliente.getNome());
    }

    @Override
    public void finalizarPedido() {
        if (cliente.getSaldo() >= lanche.getPreco()) {
            cliente.setSaldo(cliente.getSaldo() - lanche.getPreco());
            this.status = StatusPedido.FINALIZADO;
            System.out.println("Pedido finalizado. Pagamento realizado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente +
                ", lanche=" + lanche +
                ", status=" + status +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }
}

