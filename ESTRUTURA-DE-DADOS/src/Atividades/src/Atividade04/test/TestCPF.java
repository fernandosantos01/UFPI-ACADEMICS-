package Atividade04.test;

import Atividade04.dominio.CPF;

public class TestCPF {
    public static void main(String[] args) {
        CPF cpf = new CPF("07623505394");
        System.out.println("CPF 07623505394 é válido? " + cpf.calcularDV());

        CPF cpf1 = new CPF("08759964001");
        System.out.println("CPF 08759964001 é válido? " + cpf1.calcularDV());

        CPF cpf2 = new CPF("11111111111");
        System.out.println("CPF 11111111111 é válido? " + cpf2.calcularDV());

        CPF cpf3 = new CPF("123abc45678");
        System.out.println("CPF 123abc45678 é válido? " + cpf3.calcularDV());

        CPF cpf4 = new CPF("12345678900");
        System.out.println("CPF 12345678900 é válido? " + cpf4.calcularDV());
    }
}
