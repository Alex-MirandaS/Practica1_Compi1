/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import GUI.PrincipalGUI;
import GUI.TablaResultados;
import JFLEX_Y_CUP.AnalizadorLexico;
import JFLEX_Y_CUP.AnalizadorSintactico;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
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

    public void iniciar() {
        principalGUI.setVisible(true);
    }

    public void analizar() {
        Reader reader = new StringReader(principalGUI.getAreaTexto().getText());
        a = new AnalizadorLexico(reader);
        a.yytext();
        s = new AnalizadorSintactico(a);

        llenarTabla();

    }

    private void llenarTabla() {

        DefaultTableModel modelo = new DefaultTableModel();

        tablaResultados.getTabla().setModel(modelo);

        modelo.addColumn("Lexema");
        //modelo.addColumn("Fila");
        //modelo.addColumn("Columna");

        try {
            s.parse();
            for (int i = 0; i < a.getTokens().size(); i++) {

                modelo.addRow(new Object[]{s.getS().toString()});

                //modelo.addRow(new Object[]{a.getTokens().get(i).getDatos(), a.getTokens().get(i).getFila(),a.getTokens().get(i).getColumna()});
            }
        } catch (Exception ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

        tablaResultados.setVisible(true);
    }
}
