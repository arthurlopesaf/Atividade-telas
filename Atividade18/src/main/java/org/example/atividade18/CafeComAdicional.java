package org.example.atividade18;

public class CafeComAdicional {

    private boolean leite;
    private boolean acucar;

    public boolean isLeite() {
        return leite;
    }

    public void setLeite(boolean leite) {
        this.leite = leite;
    }

    public boolean isAcucar() {
        return acucar;
    }

    public void setAcucar(boolean acucar) {
        this.acucar = acucar;
    }

    public String PrepararCafe(){

        if (leite && acucar){

            return "Café preparado com leite e açúcar!";

        } else if (leite) {
            
            return "Café preparado com leite!";
            
        } else if (acucar) {

            return "Café preparado com açúcar";
            
        }

        return "Café preparado sem adicionais";
    }
}
