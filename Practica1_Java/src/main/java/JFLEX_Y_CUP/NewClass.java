/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JFLEX_Y_CUP;

import Objetos.Barras;
import Objetos.Grafica;
import Objetos.Pie;
import java.util.ArrayList;

/**
 *
 * @author alex
 */
public class NewClass {

    private boolean titulo,
            ejex,
            ejey,
            unir,
            tipo,
            etiquetas,
            valores,
            total,
            unido,
            extra;
    ArrayList<Grafica> graficas = new ArrayList<>();
ArrayList<String> temp = new ArrayList<>();
ArrayList<ArrayList> instrucciones = new ArrayList<>();

    public ArrayList<String> getTemp() {
        return temp;
    }

    public void setTemp(ArrayList<String> temp) {
        this.temp = temp;
    }

    public ArrayList<ArrayList> getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(ArrayList<ArrayList> instrucciones) {
        this.instrucciones = instrucciones;
    }


    //xd
   

//    private void verificarBoolean(boolean valor, String dato) {
//        if (!valor) {
//            valor = true;
//            añadirInstruccion(dato);
//        } else {
////añadir errores semanticos
//        }
//    }
//
//    private void añadirInstruccion(String dato) {
//        temp.getDatos().add(dato);
//    }
//
//    private void iniciarGrafica(String tipo) {
//        if (tipo == "Barras") {
//            temp = new Barras();
//        } else if (tipo == "Pie") {
//            temp = new Pie();
//        }
//    }

    private void reinicio(boolean valor) {
        titulo = valor;
        ejex = valor;
        ejey = valor;
        unir = valor;
        tipo = valor;
        etiquetas = valor;
        valores = valor;
        total = valor;
        unido = valor;
        extra = valor;
    }

}
