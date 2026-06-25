package com.example.atividade21;

public class ReconhecimentoDoUsuario {

    private String usuario;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String ReconhecerUsuario() {

        if (usuario.equals("Wilson") || usuario.equals("Gloria")){

            return "Olá, bem-vindo(a) de volta!";
        }
        return "Usuário inválido!";
    }
}
