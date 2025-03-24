package Atividade03.test;

import Atividade03.dominio.IRPF;

public class TestIRPF {
    public static void main(String[] args) {
        // Teste para salário isento (até 2259.20)
        IRPF irpfIsento = new IRPF(2259.20);
        System.out.println("Teste para salário isento:");
        irpfIsento.calcularAliquota();
        System.out.println();

        // Teste para faixa de 7.5% (2259.21 até 2826.65)
        IRPF irpf7_5 = new IRPF(2259.21);
        System.out.println("Teste para faixa de 7.5%:");
        irpf7_5.calcularAliquota();
        System.out.println();

        // Teste para faixa de 15% (2826.66 até 3751.05)
        IRPF irpf15 = new IRPF(2826.66);
        System.out.println("Teste para faixa de 15%:");
        irpf15.calcularAliquota();
        System.out.println();

        // Teste para faixa de 22.5% (3751.06 até 4664.68)
        IRPF irpf22_5 = new IRPF(3751.06);
        System.out.println("Teste para faixa de 22.5%:");
        irpf22_5.calcularAliquota();
        System.out.println();

        // Teste para faixa de 27.5% (acima de 4664.68)
        IRPF irpf27_5 = new IRPF(4664.69);
        System.out.println("Teste para faixa de 27.5%:");
        irpf27_5.calcularAliquota();
    }
}