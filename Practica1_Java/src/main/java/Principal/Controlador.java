/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import GUI.PrincipalGUI;
import GUI.TablaResultados;
import JFLEX_Y_CUP.AnalizadorLexico;
import JFLEX_Y_CUP.AnalizadorSintactico;
import Objetos.Grafica;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alex
 */
public class Controlador {

    AnalizadorLexico a;
    AnalizadorSintactico s;
    PrincipalGUI principalGUI = new PrincipalGUI(this);
    TablaResultados tablaResultados = new TablaResultados();
    ArrayList<Grafica> graficas = new ArrayList<>();

    public void iniciar() {
        principalGUI.setVisible(true);
    }

    public void analizar() {
        Reader reader = new StringReader(principalGUI.getAreaTexto().getText());
        a = new AnalizadorLexico(reader);
        a.yytext();
        s = new AnalizadorSintactico(a);

        try {
            s.parse();
            verificar();
        } catch (Exception ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void verificar() {
       
    }

    private void llenarTabla() {

        DefaultTableModel modelo = new DefaultTableModel();

        tablaResultados.getTabla().setModel(modelo);

        modelo.addColumn("Lexema");
        //modelo.addColumn("Fila");
        //modelo.addColumn("Columna");

        try {
            s.parse();
            for (int i = 0; i < s.getInstrucciones().size(); i++) {
                for (int j = 0; j < s.getInstrucciones().get(i).size(); j++) {

                    System.out.println(s.getInstrucciones().get(i).get(j));

                    // modelo.addRow(new Object[]{s.getInstrucciones().get(i).get(j)});
                    //modelo.addRow(new Object[]{a.getTokens().get(i).getDatos(), a.getTokens().get(i).getFila(),a.getTokens().get(i).getColumna()});
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

        tablaResultados.setVisible(true);
    }
}
