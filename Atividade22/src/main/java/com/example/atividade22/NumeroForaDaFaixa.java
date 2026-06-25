package com.example.atividade22;

public class NumeroForaDaFaixa {

    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String ValidarNumero() {

        if (numero > 10 || numero < 0) {
            return "Número inválido!";
        }
        return "Número válido!";
    }
}
