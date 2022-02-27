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
public class Barras extends Grafica {

    private String titulo;
    private ArrayList<String> ejesx = new ArrayList<>();
    private ArrayList<Double> ejesy = new ArrayList<>();
    private ArrayList<String> unirx = new ArrayList<>();
    private ArrayList<String> uniry = new ArrayList<>();

    public Barras(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<String> getEjesx() {
        return ejesx;
    }

    public void setEjesx(ArrayList<String> ejesx) {
        this.ejesx = ejesx;
    }

    public ArrayList<Double> getEjesy() {
        return ejesy;
    }

    public void setEjesy(ArrayList<Double> ejesy) {
        this.ejesy = ejesy;
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

    
    
}
