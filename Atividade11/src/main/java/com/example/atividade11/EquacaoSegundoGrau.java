package com.example.atividade11;

public class EquacaoSegundoGrau {

    private int a;
    private int b;
    private int c;

    public EquacaoSegundoGrau(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String calcular() {
        if (a == 0) {
            return "Não é equação de 2º grau";
        }

        double delta = (b * b) - (4 * a * c);

        if (delta < 0) {
            return "Não existem raízes reais";
        }

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        return String.format("x1 = %.2f | x2 = %.2f", x1, x2);
    }
}