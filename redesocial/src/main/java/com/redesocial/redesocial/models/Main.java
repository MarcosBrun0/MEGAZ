package com.redesocial.redesocial.models;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int escolha;
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();

    do {
        System.out.println("Bem vindo ao Megaz");
        System.out.println("1 Cadastro ");
        System.out.println("2 Login ");
        escolha = scanner.nextInt();
        switch (escolha) {
            case 1:
                User usuario = new User();
                usuario.Fazer_Cadastro();
                users.add(usuario);
                usuario.Status();
                break;

            case 2:
                System.out.println("Escreva seu email");
                String teste_email = scanner.next();
                System.out.println("Escreva seu senha");
                String teste_senha = scanner.next();
                for (int i =0; i<users.size(); i++){
                    if(users.get(i).getEmail().contentEquals(teste_email) && users.get(i).getSenha().contentEquals(teste_senha)){
                        System.out.println("Voce foi logado");
                        break;
                    }
                }

            default:
                System.out.println("opcao errada");
        }
    }while(escolha!=0);
    }
}