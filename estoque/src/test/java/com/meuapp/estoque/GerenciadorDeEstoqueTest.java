package com.meuapp.estoque;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.platform.commons.annotation.Testable;

public class GerenciadorDeEstoqueTest {

    private GerenciadorDeEstoque gerenciador;

    @BeforeAll
    public void setUp() {
        gerenciador = new Estoque();
    }

    @Testable
    public void testConsultaProduto() {
        Produto produto = new Produto(3, "Monitor", 300.0, 5);
        gerenciador.cadastrarProduto(produto);
        Produto encontrado = gerenciador.consultarProduto(3);
        assertEquals("Monitor", encontrado.getNome());
    }

}