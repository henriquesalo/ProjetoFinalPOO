package com.meuapp.estoque;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(estoque, scanner);
        menu.exibirMenu();
    }
}

