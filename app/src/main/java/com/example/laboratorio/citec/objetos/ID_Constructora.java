package com.example.laboratorio.citec.objetos;

/**
 * Created by laboratorio on 08-03-2018.
 */

public class ID_Constructora {

    String id_constructora;

    public ID_Constructora() {
    }

    public ID_Constructora(String id_constructora) {
        this.id_constructora = id_constructora;
    }

    public String getId_constructora() {
        return id_constructora;
    }

    public void setId_constructora(String id_constructora) {
        this.id_constructora = id_constructora;
    }

    @Override
    public String toString() {
        return "ID_Constructora{" +
                "id_constructora='" + id_constructora + '\'' +
                '}';
    }
}
