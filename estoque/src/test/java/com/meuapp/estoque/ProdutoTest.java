package com.meuapp.estoque;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.platform.commons.annotation.Testable;

public class ProdutoTest {

    @Testable
    public void testCriacaoProduto() {
        Produto produto = new Produto(1, "Teclado", 100.0, 10);
        assertEquals("Teclado", produto.getNome());
        assertEquals(100.0, produto.getPreco(), 0.01);
        assertEquals(10, produto.getQuantidade());
    }

}

