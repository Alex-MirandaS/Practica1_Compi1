/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JFLEX_Y_CUP;

import Objetos.Token;
import java.util.ArrayList;

/**
 *
 * @author alex
 */
public class NewClass {

    int asdfasdfasdfas;

    private ArrayList<Token> tokens = new ArrayList<Token>();

    public void agregarToken(String lexema, int fila, int columna) {
        tokens.add(new Token(lexema, fila, columna));
           }

    public ArrayList<Token> getTokens() {
        return tokens;
    }

}
