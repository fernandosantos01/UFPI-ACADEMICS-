package Atividade01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Menu {
    static Scanner in = new Scanner(System.in);
    static List<Integer> numero = new ArrayList<>();

    public static void main(String[] args) {
        int opc;
        int quantNum;
        do {
            menu();
            opc = in.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Você deseja inserir quantos numeros?");
                    quantNum = in.nextInt();
                    for (int i = 0; i < quantNum; i++) {
                        System.out.println("Insira o " + (i + 1) + "° numero: ");
                        inserir(in.nextInt());
                    }
                    break;

                case 2:
                    System.out.println("Você deseja alterar quantos numeros?");
                    quantNum = in.nextInt();
                    for (int i = 0; i < quantNum; i++) {
                        System.out.println("Insira o " + (i + 1) + "° numero que você deseja alterar: ");
                        alterar(in.nextInt());
                    }
                    break;
                case 3:
                    System.out.println("Você deseja excluir quantos numeros?");
                    quantNum = in.nextInt();
                    for (int i = 0; i < quantNum; i++) {
                        System.out.println("Insira o " + (i + 1) + "° numero que você deseja excluir: ");
                        excluir(in.nextInt());
                    }

                    break;
                case 4:
                    System.out.println("Digite o numero que você deseja pesquisar: ");
                    if (pesquisar(in.nextInt()) != -1) {
                        System.out.println("Numero Pesquisado está contido na lista!");
                    } else {
                        System.out.println("Numero Pesquisado não encontrado!");
                    }
                    break;
                case 5:
                    listarTodos();
                    break;
                case 9:
                    System.out.println("Programa Encerrado!!");
                    break;
                default:
                    System.out.println("Numero Invalido!");
            }

        } while (opc != 9);
        System.out.println("Saindo do Programa...");
    }

    public static void menu() {
        System.out.println("============MENU===========");
        System.out.println("1. Inserir");
        System.out.println("2. Alterar");
        System.out.println("3. Excluir");
        System.out.println("4. Pesquisar");
        System.out.println("5. Listar todos");
        System.out.println("9. Sair");
    }

    public static void inserir(int num) {
        numero.add(num);
    }

    public static void alterar(int num) {
        if (numero.contains(num)) {
            numero = numero.stream()
                    .filter(n -> n != num)
                    .collect(Collectors.toList());
            System.out.println("Insira o novo numero: ");
            inserir(in.nextInt());
        } else {
            System.out.println("O numero que você deseja alterar não está contido na lista!!!");
        }

    }

    public static void excluir(int num) {
        if (numero.contains(num)) {
            numero = numero.stream()
                    .filter(n -> n != num)
                    .collect(Collectors.toList());
        } else {
            System.out.println("O numero que você deseja excluir não está contido na lista!!!");
        }

    }

    public static int pesquisar(int num) {
        return numero.stream()
                .filter(n -> n == num)
                .findFirst()
                .orElse(-1);

    }

    public static void listarTodos() {
        System.out.println("=======LISTA-COM-TODOS-OS-NUMEROS=======");
        if ((long) numero.size() > 0) {
            numero.forEach(System.out::println);
        } else {
            System.out.println("A lista está vazia!!!");
        }
    }
}
