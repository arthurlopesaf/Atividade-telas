package org.example.atividade19;

public class Divisibilidade {

    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String DividirPor3ou5(){

        if(num % 3 == 0 || num % 5 == 0){

            return "O número é divisível por 3 ou por 5!";
        }
        return "O número não é divisível por 3 ou por 5!";
    }
}
