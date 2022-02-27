/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.ArrayList;

/**
 *
 * @author alex
 */
public abstract class Grafica {

    protected String titulo;
    protected ArrayList<String> unirx = new ArrayList<>();
    protected ArrayList<String> uniry = new ArrayList<>();

//    public Grafica(String titulo) {
//        this.titulo = titulo;
//    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<String> getUnirx() {
        return unirx;
    }

    public void setUnirx(ArrayList<String> unirx) {
        this.unirx = unirx;
    }

    public ArrayList<String> getUniry() {
        return uniry;
    }

    public void setUniry(ArrayList<String> uniry) {
        this.uniry = uniry;
    }

    public abstract void datosGrafica();

    public void imprimirDatos(ArrayList<String> datos) {
        for (int i = 0; i < datos.size(); i++) {
            System.out.println(datos.get(i));
        }
    }

}
