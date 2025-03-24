package Atividade03.dominio;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IRPF {
    private double salarioBase;

    public IRPF(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void calcularAliquota() {
        double imposto = calcularImposto();
        imprimirResultado(imposto);
    }

    private double calcularImposto() {
        if (salarioBase <= 2259.20) {
            return 0.0;
        } else if (salarioBase <= 2826.65) {
            return salarioBase * 0.075;
        } else if (salarioBase <= 3751.05) {
            return salarioBase * 0.15;
        } else if (salarioBase <= 4664.68) {
            return salarioBase * 0.225;
        } else {
            return salarioBase * 0.275;
        }
    }

    private void imprimirResultado(double imposto) {
        System.out.println("====Faixa de rendimento mensal Alíquota (%)====");
        if (imposto == 0.0) {
            System.out.println("Isento");
        } else {
            double aliquota = 0.0;
            if (salarioBase <= 2826.65){
                aliquota = 7.5;
            } else if (salarioBase <= 3751.05){
                aliquota = 15;
            } else if (salarioBase <= 4664.68){
                aliquota = 22.5;
            } else {
                aliquota = 27.5;
            }

            System.out.printf("Imposto aplicado de %.1f%%: %.2f Restando: %.2f\n", aliquota, imposto, (salarioBase - imposto));
        }
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}