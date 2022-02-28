/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.practica1_kotlin.Principal;

import com.example.practica1_kotlin.Instrucciones.ErrorObjeto;
import com.example.practica1_kotlin.JFLEX_Y_CUP.AnalizadorLexico;
import com.example.practica1_kotlin.JFLEX_Y_CUP.AnalizadorSintactico;
import com.example.practica1_kotlin.Objetos.Barras;
import com.example.practica1_kotlin.Objetos.Grafica;
import com.example.practica1_kotlin.Objetos.Pie;

import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author alex
 */
public class Controlador {
    
    AnalizadorLexico a;
    AnalizadorSintactico s;
    ArrayList<Grafica> graficas = new ArrayList<>();
    ArrayList<ErrorObjeto> errores = new ArrayList<>();

    public void analizar(String string) {
        Reader reader = new StringReader(string);
        a = new AnalizadorLexico(reader);
        s = new AnalizadorSintactico(a);
        try {
            s.parse();
            errores = s.getErrores();
            verificar();
        } catch (Exception ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void verificar() {
        ArrayList<String> temp;
        boolean error = false;
        for (int i = 0; i < s.getInstrucciones().size(); i++) {
            temp = s.getInstrucciones().get(i);
            for (int j = temp.size() - 1; j >= 0; j--) {
                
                if (esRepetido(j, temp)) {
                    error = true;
                    break;
                }

                //System.out.println(temp.get(j));
                // modelo.addRow(new Object[]{s.getInstrucciones().get(i).get(j)});
                //modelo.addRow(new Object[]{a.getTokens().get(i).getDatos(), a.getTokens().get(i).getFila(),a.getTokens().get(i).getColumna()});
            }
            if (!error) {
                graficas.add(crearGrafica(temp));
            }
            //impprimir graficas

        }
        if (errores.size() == 0) {
            for (int j = 0; j < graficas.size(); j++) {
                graficas.get(j).datosGrafica();
                System.out.println("\n" + "FIN DE UNA GRAFICA" + "\n");
            }
        } else {
            for (int i = 0; i < s.getErrores().size(); i++) {
                s.getErrores().get(i).verDatos();
            }
        }
    }
    
    private Grafica crearGrafica(ArrayList<String> temp) {
        String tipoGrafica = temp.get(temp.size() - 1);
        Grafica graficaTemp;
        boolean esBarras = false;
        if (tipoGrafica.equals("Barras")) {
            graficaTemp = new Barras();
            esBarras = true;
        } else {
            graficaTemp = new Pie();
        }
        
        temp.remove(temp.size() - 1);
        return verificarDatos(graficaTemp, temp);
        
    }
    
    private Grafica verificarDatos(Grafica graficaTemp, ArrayList<String> temp) {
        
        char tempFor;
        
        for (int i = 0; i < temp.size(); i++) {
            tempFor = (temp.get(i)).charAt(0);
            temp.set(i, quitarInicio(temp.get(i)));
            switch (tempFor) {
                case 'T':
                    graficaTemp.setTitulo(temp.get(i));
                    break;
                case 'X':
                    ((Barras) graficaTemp).setEjesx(separarValores(temp.get(i), 0, 1));
                    break;
                case 'Y':
                    ((Barras) graficaTemp).setEjesy(separarValores(temp.get(i), 0, 1));
                    break;
                case 'U':
                    graficaTemp.setUnirx(separarValores(temp.get(i), 0, 2));
                    graficaTemp.setUniry(separarValores(temp.get(i), 1, 2));
                    break;
                case 'O':
                    ((Pie) graficaTemp).setTipo(temp.get(i));
                    break;
                case 'E':
                    ((Pie) graficaTemp).setEtiquetas(separarValores(temp.get(i), 0, 1));
                    break;
                case 'V':
                    ((Pie) graficaTemp).setValores(separarValores(temp.get(i), 0, 1));
                    break;
                case 'L':
                    ((Pie) graficaTemp).setTotal(Double.parseDouble(temp.get(i)));
                    break;
                case 'A':
                    ((Pie) graficaTemp).setExtra(temp.get(i));
                    break;
                default:
                    break;
            }
            
        }
        return graficaTemp;
    }
    
    private String quitarInicio(String get) {
        char[] datos = get.toCharArray();
        String texto = "";
        for (int i = 1; i < datos.length; i++) {
            texto += datos[i];
        }
        return texto;
    }
    
    private ArrayList<String> separarValores(String get, int valorInicio, int iteracion) {
        
        String[] datos = removerCaracter(get, ",");
        String datoValido[];
        ArrayList<String> datosArray = new ArrayList<>();
        for (int i = valorInicio; i < datos.length; i += iteracion) {
            datoValido = removerCaracter(datos[i], "\n");
            datosArray.add(datoValido[datoValido.length - 1]);
        }
        return datosArray;
    }
    
    private String[] removerCaracter(String dato, String string) {
        String[] datos = dato.split(string);
        return datos;
    }
    
    private boolean esRepetido(int indice, ArrayList<String> array) {
        
        char temp = (array.get(indice)).charAt(0);
        char tempFor;
        int contador = 0;
        for (int i = 0; i < array.size(); i++) {
            tempFor = (array.get(i)).charAt(0);
            if (temp == tempFor) {
                contador++;
                if (contador > 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public ArrayList<ErrorObjeto> getErrores(){
        return errores;
    }

    public ArrayList<Grafica> getGraficas(){
        return graficas;
    }

}
