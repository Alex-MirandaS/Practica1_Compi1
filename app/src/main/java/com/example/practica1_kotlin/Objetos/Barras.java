/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.practica1_kotlin.Objetos;

import java.util.ArrayList;

/**
 *
 * @author alex
 */
public class Barras extends Grafica {

    private ArrayList<String> ejesx = new ArrayList<>();
    private ArrayList<String> ejesy = new ArrayList<>();

//    public Barras(String titulo) {
//        super(titulo);
//    }
    public ArrayList<String> getEjesx() {
        return ejesx;
    }

    public void setEjesx(ArrayList<String> ejesx) {
        this.ejesx = ejesx;
    }

    public ArrayList<String> getEjesy() {
        return ejesy;
    }

    public void setEjesy(ArrayList<String> ejesy) {
        this.ejesy = ejesy;
    }

    @Override
    public void datosGrafica(){
        System.out.println(titulo);
        imprimirDatos(ejesx);
        imprimirDatos(ejesy);
        imprimirDatos(unirx);
        imprimirDatos(uniry);
    }
    
}
