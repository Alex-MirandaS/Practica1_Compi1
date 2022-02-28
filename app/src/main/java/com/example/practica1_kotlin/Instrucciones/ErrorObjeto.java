/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.practica1_kotlin.Instrucciones;

/**
 *
 * @author alex
 */
public class ErrorObjeto {

    private String lexema, tipoError,mensaje;
    private int fila, columna;

    public ErrorObjeto(String lexema, String tipoError, String mensaje, int fila, int columna) {
        this.lexema = lexema;
        this.tipoError = tipoError;
        this.mensaje = mensaje;
        this.fila = fila;
        this.columna = columna;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public String getTipoError() {
        return tipoError;
    }

    public void setTipoError(String tipoError) {
        this.tipoError = tipoError;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    public void verDatos(){
        System.out.println("Error \n"+lexema+"\n"+fila+"\n"+columna+"\n"+tipoError+mensaje);
    }

}

