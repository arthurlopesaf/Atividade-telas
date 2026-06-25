package com.example.atividade20;

public class ConfirmarCompra {

    private boolean desejaComprar;

    public boolean isDesejaComprar() {
        return desejaComprar;
    }

    public void setDesejaComprar(boolean desejaComprar) {
        this.desejaComprar = desejaComprar;
    }

    public String ConfirmarCompra() {

        if (desejaComprar) {
            return "Obrigado pela compra!";
        }
        return "Compra não realizada!";
    }
}
