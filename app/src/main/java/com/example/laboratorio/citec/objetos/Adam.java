package com.example.laboratorio.citec.objetos;

/**
 * Created by laboratorio on 08-03-2018.
 */

public class Adam {
    String id_adam, variable1, variable2, variable3, variable4, variable6, variable7, variable5, variable8;

    public Adam() {
    }

    public Adam(String id_adam, String variable1, String variable2, String variable3, String variable4, String variable6, String variable7, String variable5, String variable8) {

        this.id_adam = id_adam;
        this.variable1 = variable1;
        this.variable2 = variable2;
        this.variable3 = variable3;
        this.variable4 = variable4;
        this.variable6 = variable6;
        this.variable7 = variable7;
        this.variable5 = variable5;
        this.variable8 = variable8;
    }

    public String getId_adam() {
        return id_adam;
    }

    public void setId_adam(String id_adam) {
        this.id_adam = id_adam;
    }

    public String getVariable1() {
        return variable1;
    }

    public void setVariable1(String variable1) {
        this.variable1 = variable1;
    }

    public String getVariable2() {
        return variable2;
    }

    public void setVariable2(String variable2) {
        this.variable2 = variable2;
    }

    public String getVariable3() {
        return variable3;
    }

    public void setVariable3(String variable3) {
        this.variable3 = variable3;
    }

    public String getVariable4() {
        return variable4;
    }

    public void setVariable4(String variable4) {
        this.variable4 = variable4;
    }

    public String getVariable6() {
        return variable6;
    }

    public void setVariable6(String variable6) {
        this.variable6 = variable6;
    }

    public String getVariable7() {
        return variable7;
    }

    public void setVariable7(String variable7) {
        this.variable7 = variable7;
    }

    public String getVariable5() {
        return variable5;
    }

    public void setVariable5(String variable5) {
        this.variable5 = variable5;
    }

    public String getVariable8() {
        return variable8;
    }

    public void setVariable8(String variable8) {
        this.variable8 = variable8;
    }

    @Override
    public String toString() {
        return "Adam{" +
                "id_adam='" + id_adam + '\'' +
                "variable1='" + variable1 + '\'' +
                ", variable2='" + variable2 + '\'' +
                ", variable3='" + variable3 + '\'' +
                ", variable4='" + variable4 + '\'' +
                ", variable6='" + variable6 + '\'' +
                ", variable7='" + variable7 + '\'' +
                ", variable5='" + variable5 + '\'' +
                ", variable8='" + variable8 + '\'' +
                '}';
    }
}
