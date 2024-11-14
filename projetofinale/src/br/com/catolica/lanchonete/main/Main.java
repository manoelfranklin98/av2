package br.com.catolica.lanchonete.main;

import br.com.catolica.lanchonete.Enuns.TipoPagamento;
import br.com.catolica.lanchonete.model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um cliente e um lanche
        Cliente cliente = new Cliente("João", "987654321", 50.0);
        Lanche lanche = new Lanche("X-Burger", 25.0, "Carne, Queijo, Pão");

        // Criando o pedido com cliente, lanche e forma de pagamento
        Pedido pedido = new Pedido(cliente, lanche, TipoPagamento.DINHEIRO);

        while (true) {
            // Menu de opções
            System.out.println("=== Menu de Operações ===");
            System.out.println("1. Iniciar Pedido");
            System.out.println("2. Finalizar Pedido");
            System.out.println("3. Ver Detalhes do Pedido");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa a nova linha do Scanner

            // Ações com base na opção escolhida
            if (opcao == 1) {
                pedido.iniciarPedido();
            } else if (opcao == 2) {
                pedido.finalizarPedido();
            } else if (opcao == 3) {
                System.out.println(pedido);
            } else if (opcao == 4) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}
