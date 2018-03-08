package com.example.laboratorio.citec.objetos;

import android.widget.EditText;

/**
 * Created by laboratorio on 06-03-2018.
 */

public class Constructora {

    String id_proyecto, encargado,razonSocial,direccion,poblacion,comuna,telefono;

    public Constructora() {
    }

    public Constructora(String id_proyecto, String encargado, String razonSocial, String direccion, String poblacion, String comuna, String telefono) {
        this.id_proyecto = id_proyecto;
        this.encargado = encargado;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.comuna = comuna;
        this.telefono = telefono;
    }

    public String getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(String id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Constructora{" +
                ", id_proyecto='" + id_proyecto + '\'' +
                ", encargado='" + encargado + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", direccion='" + direccion + '\'' +
                ", poblacion='" + poblacion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
