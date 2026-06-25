package com.example.atividade13;

public class ValidarPermissao {

    private int idade;
    private boolean temCarteira;

    public boolean temCarteira() {
        return temCarteira;
    }

    public void setTemCarteira(boolean temCarteira) {
        this.temCarteira = temCarteira;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String validar() {

        if (idade >= 18 && temCarteira == true) {

            return "Você tem permissão para dirigir";

        } else {

            return "Você não tem permissão para dirigir";

        }
    }
}
