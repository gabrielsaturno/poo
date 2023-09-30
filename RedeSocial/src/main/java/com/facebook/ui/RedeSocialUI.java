package com.facebook.ui;

import com.facebook.dominio.RedeSocial;

import java.util.Scanner;

public class RedeSocialUI {
    private static Scanner console = new Scanner(System.in);

    private static RedeSocial redeSocial = new RedeSocial();

    public static void main(String[] args) {
        var console = new Scanner(System.in);

        while(true) {
            System.out.println("Escolha uma das opções:");
            System.out.println("\tCriar Conta [c]");
            System.out.println("\tSair [s]");

            var opcao = console.nextLine();

            if(opcao.equalsIgnoreCase("c")) {
                criarConta();
            }else if(opcao.equalsIgnoreCase("s")) {
                System.out.println("Bye Bye...");
                break;
            } else {
                System.out.println("OPÇÃO INVÁLIDA!");
            }
        }
    }

    private static void criarConta() {
        System.out.println("Qual é o seu e-email?");
        var email = console.nextLine();

        System.out.println("Qual é o seu nome?");
        var nome = console.nextLine();

        System.out.println("Qual é a sua senha?");
        var senha = console.nextLine();

        var u = redeSocial.criarConta(email, senha, nome);

        System.out.println("Conta criada com sucesso!");
        System.out.println(u);
    }
}
