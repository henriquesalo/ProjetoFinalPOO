package com.meuapp.estoque;

import org.junit.jupiter.api.BeforeAll;
import org.junit.platform.commons.annotation.Testable;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class MenuTest {
    private Menu menu;
    private GerenciadorDeEstoque gerenciador;

    @BeforeAll
    public void setUp() {
        gerenciador = new Estoque(); // ou mock, se preferir
        menu = new Menu(gerenciador, new Scanner(System.in));
    }

    @Testable
    public void testMenuOpcaoCadastrar() {
        String input = "1\nNomeProduto\n10.0\n5\n5";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        menu.setScanner(new Scanner(in));

    }
}

