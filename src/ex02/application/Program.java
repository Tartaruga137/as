package ex02.application;
import ex02.entities.Produto;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("==========Product in Life==========");
        System.out.println("Cadastre um produto:");
        System.out.println("Camisa\nCalça");
        System.out.println("==================================");

        System.out.println("Informe a mercadoria: ");
        String mercadoria = sc.nextLine();

        System.out.println("Informe a descrição: ");
        String descricao = sc.nextLine();

        System.out.println("Informe o valor: ");
        double valor = sc.nextDouble();

        System.out.println("==================================");

        Produto produto = new Produto(mercadoria, descricao, valor);

        System.out.println("Produto cadastrado com sucesso!");
        System.out.println("Produto: " + produto.getMercadoria());
        System.out.println("Descrição: " + produto.getDescricao());
        System.out.printf("Valor: R$ %.2f%n ", produto.getValor());
        System.out.println("==================================");
    }
}



