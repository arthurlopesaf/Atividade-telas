package com.example.atividade14;

public class VerificacaoDeCompra {

    private boolean temDinheiro;
    private boolean desejaComprar;

    public boolean temDinheiro() {
        return temDinheiro;
    }

    public void setTemDinheiro(boolean temDinheiro) {
        this.temDinheiro = temDinheiro;
    }

    public boolean desejaComprar() {
        return desejaComprar;
    }

    public void setDesejaComprar(boolean desejaComprar) {
        this.desejaComprar = desejaComprar;
    }

    public String verificarCompra() {

        if (temDinheiro && desejaComprar) {

            return "Você pode comprar um carro";

        } else {

            return "Você não pode comprar um carro";

        }
    }
}
