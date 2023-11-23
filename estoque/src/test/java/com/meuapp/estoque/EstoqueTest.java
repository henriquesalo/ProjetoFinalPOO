package com.meuapp.estoque;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeAll;
import org.junit.platform.commons.annotation.Testable;

public class EstoqueTest {

    private Estoque estoque;

    @BeforeAll
    public void setUp() {
        estoque = new Estoque();
    }

    @Testable
    public void testAdicionarProduto() {
        Produto produto = new Produto(2, "Mouse", 50.0, 15);
        estoque.cadastrarProduto(produto);
        assertNotNull(estoque.consultarProduto(2));
    }
}
