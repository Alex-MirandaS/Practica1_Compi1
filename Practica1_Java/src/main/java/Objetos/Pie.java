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
public class Pie extends Grafica{
   
    private String tipo;
    private double total;
    private String extra;
    private ArrayList<String> etiquetas = new ArrayList<>();
    private ArrayList<String> valores = new ArrayList<>();

//    public Pie(String titulo) {
//        super(titulo);
//    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public ArrayList<String> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(ArrayList<String> etiquetas) {
        this.etiquetas = etiquetas;
    }

    public ArrayList<String> getValores() {
        return valores;
    }

    public void setValores(ArrayList<String> valores) {
        this.valores = valores;
    }

    @Override
    public void datosGrafica() {
        System.out.println(this.getTitulo());
        System.out.println(tipo);
        imprimirDatos(etiquetas);
        imprimirDatos(valores);
        System.out.println(total);
        imprimirDatos(unirx);
        imprimirDatos(uniry);
        System.out.println(extra);
    }
    

}
