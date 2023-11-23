package com.meuapp.estoque;

public interface GerenciadorDeEstoque {
    void cadastrarProduto(Produto produto);
    Produto consultarProduto(int id);
    void atualizarProduto(Produto produto);
    void excluirProduto(int id);
}


