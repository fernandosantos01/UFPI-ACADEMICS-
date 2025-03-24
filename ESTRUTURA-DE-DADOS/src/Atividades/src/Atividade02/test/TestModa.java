package Atividade02.test;

import Atividade02.dominio.Moda;

public class TestModa {
    public static void main(String[] args) {
        // Teste 1: Array vazio
        System.out.println("Teste 1: Array vazio");
        Moda modaVazia = new Moda(0, new int[]{});
        modaVazia.classificacao();
        System.out.println();

        // Teste 2: Array unimodal (uma única moda)
        System.out.println("Teste 2: Array unimodal");
        int[] numerosUnimodal = {1, 2, 2, 3, 4};
        Moda modaUnimodal = new Moda(numerosUnimodal.length, numerosUnimodal);
        modaUnimodal.exibirArray();
        modaUnimodal.classificacao();
        System.out.println();

        // Teste 3: Array multimodal (múltiplas modas)
        System.out.println("Teste 3: Array multimodal");
        int[] numerosMultimodal = {1, 2, 2, 3, 3, 4};
        Moda modaMultimodal = new Moda(numerosMultimodal.length, numerosMultimodal);
        modaMultimodal.exibirArray();
        modaMultimodal.classificacao();
        System.out.println();

        // Teste 4: Array amodal (nenhum valor se repete)
        System.out.println("Teste 4: Array amodal");
        int[] numerosAmodal = {1, 2, 3, 4, 5};
        Moda modaAmodal = new Moda(numerosAmodal.length, numerosAmodal);
        modaAmodal.exibirArray();
        modaAmodal.classificacao();
    }
}