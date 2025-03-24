package Atividade02.dominio;


import java.util.ArrayList;
import java.util.List;

public class Moda {
    private int tamanho;
    private int[] numeros;

    public Moda(int tamanho, int[] numeros) {
        this.tamanho = tamanho;
        this.numeros = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            this.numeros[i] = numeros[i];
        }
    }

    void ordenar() {
        int aux;
        boolean trocou;
        if (numeros != null) {
            for (int i = 0; i < getTamanho() - 1; i++) {
                trocou = false;
                for (int j = 1; j < getTamanho() - i - 1; j++) {
                    if (numeros[j] > numeros[j + 1]) {
                        aux = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = aux;
                        trocou = true;
                    }
                }
                if (!trocou) {
                    break;
                }
            }
        } else {
            System.out.println("Array Vazio!");
        }
    }

    public void classificacao() {
        if (numeros == null || tamanho == 0) {
            System.out.println("Array Vazio!");
            return;
        }

        ordenar();

        int frequenciaMaxima = 1;
        int frequenciaAtual = 1;
        List<Integer> modas = new ArrayList<>();

        for (int i = 1; i < tamanho; i++) {
            if (numeros[i] == numeros[i - 1]) {
                frequenciaAtual++;
            } else {
                if (frequenciaAtual > frequenciaMaxima) {
                    frequenciaMaxima = frequenciaAtual;
                    modas.clear();
                    modas.add(numeros[i - 1]);
                } else if (frequenciaAtual == frequenciaMaxima) {
                    modas.add(numeros[i - 1]);
                }
                frequenciaAtual = 1;
            }
        }

        if (frequenciaAtual > frequenciaMaxima) {
            frequenciaMaxima = frequenciaAtual;
            modas.clear();
            modas.add(numeros[tamanho - 1]);
        } else if (frequenciaAtual == frequenciaMaxima) {
            modas.add(numeros[tamanho - 1]);
        }

        if (frequenciaMaxima == 1) {
            System.out.println("Amodal: Nenhum valor se repete.");
        } else if (modas.size() == 1) {
            System.out.println("Unimodal: Moda = " + modas.getFirst() + " (Frequência: " + frequenciaMaxima + ")");
        } else {
            System.out.println("Multimodal: Modas = " + modas + " (Frequência: " + frequenciaMaxima + ")");
        }
    }

    public void exibirArray() {
        System.out.println("======LISTA-DE-NUMEROS=======");
        for (int num : getNumeros()) {
            System.out.println(num);
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    public int[] getNumeros() {
        return numeros;
    }

}
