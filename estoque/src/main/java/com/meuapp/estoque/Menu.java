package com.meuapp.estoque;

import java.util.Scanner;

public class Menu {
    private final GerenciadorDeEstoque gerenciador;
    private final Scanner scanner;

    public Menu(GerenciadorDeEstoque gerenciador, Scanner scanner) {
        this.gerenciador = gerenciador;
        this.scanner = scanner;
    }

    public void exibirMenu() {
        int opcao;
        do {
            mostrarOpcoes();
            opcao = Integer.parseInt(scanner.nextLine());
            tratarOpcao(opcao);
        } while (opcao != 5);
    }

    private void mostrarOpcoes() {
        System.out.println("\n--- Menu de Gerenciamento de Estoque ---");
        System.out.println("1. Cadastrar Produto");
        System.out.println("2. Consultar Produto");
        System.out.println("3. Atualizar Produto");
        System.out.println("4. Excluir Produto");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private void tratarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                cadastrarProduto();
                break;
            case 2:
                consultarProduto();
                break;
            case 3:
                atualizarProduto();
                break;
            case 4:
                excluirProduto();
                break;
            case 5:
                System.out.println("Saindo do sistema...");
                break;
            default:
                System.out.println("Opção inválida. Por favor, tente novamente.");
        }
    }

    private void cadastrarProduto() {
        System.out.println("\n--- Cadastro de Produto ---");
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o preço do produto: ");
        double preco = Double.parseDouble(scanner.nextLine());
        System.out.print("Digite a quantidade do produto: ");
        int quantidade = Integer.parseInt(scanner.nextLine());

        Produto produto = new Produto(0, nome, preco, quantidade);
        gerenciador.cadastrarProduto(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    private void consultarProduto() {
        System.out.println("\n--- Consulta de Produto ---");
        System.out.print("Digite o ID do produto: ");
        int id = Integer.parseInt(scanner.nextLine());

        Produto produto = gerenciador.consultarProduto(id);
        if (produto != null) {
            System.out.println("Produto encontrado: " + produto.getNome() + ", Preço: " + produto.getPreco() + ", Quantidade: " + produto.getQuantidade());
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private void atualizarProduto() {
        System.out.println("\n--- Atualização de Produto ---");
        System.out.print("Digite o ID do produto: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Digite o novo nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o novo preço do produto: ");
        double preco = Double.parseDouble(scanner.nextLine());
        System.out.print("Digite a nova quantidade do produto: ");
        int quantidade = Integer.parseInt(scanner.nextLine());

        Produto produto = new Produto(id, nome, preco, quantidade);
        gerenciador.atualizarProduto(produto);
        System.out.println("Produto atualizado com sucesso!");
    }

    private void excluirProduto() {
        System.out.println("\n--- Exclusão de Produto ---");
        System.out.print("Digite o ID do produto que deseja excluir: ");
        int id = Integer.parseInt(scanner.nextLine());

        gerenciador.excluirProduto(id);
        System.out.println("Produto excluído com sucesso!");
    }

    public void setScanner(Scanner scanner2) {
    }
}
