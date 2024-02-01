package ex01.application;
import ex01.entities.Aluno;
import ex01.entities.Professor;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("==========Escola da Vida==========");
        System.out.println("Selecione uma opção para cadastro:");
        System.out.println("[1] Professor\n[2] Aluno");

        int opcao = sc.nextInt();
        System.out.println("==================================");
        switch (opcao) {
            case 1:
                System.out.println("Informe o nome: ");
                String nome = sc2.nextLine();

                System.out.println("Informe a idade: ");
                int idade = sc.nextInt();

                System.out.println("Informe o salário: ");
                double salario = sc.nextDouble();

                System.out.println("==================================");

                Professor professor = new Professor(nome, idade, salario);

                System.out.println("Aluno cadastrado com sucesso!");
                System.out.println("Nome: " + professor.getNome());
                System.out.println("Idade: " + professor.getIdade());
                System.out.println("Salário: " + professor.getSalario());
                System.out.println("==================================");
                break;
            case 2:
                System.out.println("Informe o nome: ");
                nome = sc2.nextLine();

                System.out.println("Informe a idade: ");
                idade = sc.nextInt();

                System.out.println("Informe o matrícula: ");
                int matricula = sc.nextInt();

                System.out.println("==================================");

                Aluno aluno = new Aluno(nome, idade, matricula);

                System.out.println("Aluno cadastrado com sucesso!");
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Idade: " + aluno.getIdade());
                System.out.println("Matrícula: " + aluno.getMatricula());
                System.out.println("==================================");
                break;
            default:
                System.out.println("Valor inválido");
        }
    }
}