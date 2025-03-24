package Atividade04.dominio;

public class CPF {
    private String cpf;

    public CPF(String cpf) {
        this.cpf = cpf;
    }

    public boolean calcularDV() {
        if (cpf == null || cpf.length() != 11) {
            System.out.println("CPF inválido: deve conter exatamente 11 dígitos.");
            return false;
        }

        if (!cpf.matches("\\d+")) {
            System.out.println("CPF inválido: deve conter apenas números.");
            return false;
        }

        int count = 0;
        boolean veracidade = false;
        int aux = 10;
        int resultado = 0;
        int resto = 0;
        int primeiroDigito;
        int segundoDigito;

        for (int i = 1; i < cpf.length(); i++) {
            if (cpf.charAt(0) == cpf.charAt(i)) {
                count++;
            }
        }
        if (count == 10) {
            System.out.println("CPF inválido: todos os dígitos são iguais.");
            return false;
        }

        for (int i = 0; i < 9; i++) {
            resultado += Character.getNumericValue(cpf.charAt(i)) * aux;
            aux--;
        }
        resto = resultado % 11;
        if (resto < 2) {
            primeiroDigito = 0;
        } else {
            primeiroDigito = 11 - resto;
        }

        if (Character.getNumericValue(cpf.charAt(9)) != primeiroDigito) {
            System.out.println("CPF inválido: primeiro dígito verificador incorreto.");
            return false;
        }

        aux = 11;
        resultado = 0;
        for (int i = 0; i < 10; i++) {
            resultado += Character.getNumericValue(cpf.charAt(i)) * aux;
            aux--;
        }
        resto = resultado % 11;
        if (resto < 2) {
            segundoDigito = 0;
        } else {
            segundoDigito = 11 - resto;
        }

        if (Character.getNumericValue(cpf.charAt(10)) != segundoDigito) {
            System.out.println("CPF inválido: segundo dígito verificador incorreto.");
            return false;
        }

        System.out.println("CPF válido.");
        return true;
    }

    public String getCpf() {
        return cpf;
    }
}