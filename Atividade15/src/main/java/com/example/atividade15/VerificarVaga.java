package com.example.atividade15;

public class VerificarVaga {

    private boolean possuiDiploma;
    private int idade;

    public boolean isPossuiDiploma() {
        return possuiDiploma;
    }

    public void setPossuiDiploma(boolean possuiDiploma) {
        this.possuiDiploma = possuiDiploma;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String verificacao() {

        if (possuiDiploma == true && idade > 21){

            return "Parabéns, você está qualificado para a vaga";

        }

        return "Você não está qualificado";
    }
}
