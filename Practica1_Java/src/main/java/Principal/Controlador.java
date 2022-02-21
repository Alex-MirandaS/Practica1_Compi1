/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import GUI.PrincipalGUI;
import GUI.TablaResultados;
import JFLEX_Y_CUP.AnalizadorLexico;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alex
 */
public class Controlador {

    AnalizadorLexico a;
    PrincipalGUI principalGUI = new PrincipalGUI(this);
    TablaResultados tablaResultados = new TablaResultados();
    
    
    public void iniciar() {
       principalGUI.setVisible(true);
    }
    
    
    public void analizar() {
        Reader reader = new StringReader(principalGUI.getAreaTexto().getText());
        a = new AnalizadorLexico(reader);
        
        try {
            a.yylex();
            llenarTabla();
        } catch (IOException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    private void llenarTabla() {

        DefaultTableModel modelo = new DefaultTableModel();

        tablaResultados.getTabla().setModel(modelo);

            modelo.addColumn("Lexema");
            modelo.addColumn("Fila");
            modelo.addColumn("Columna");

            for (int i = 0; i < a.getTokens().size(); i++) {
                modelo.addRow(new Object[]{a.getTokens().get(i).getDatos(), a.getTokens().get(i).getFila(),a.getTokens().get(i).getColumna()});
            }

        tablaResultados.setVisible(true);
    }
}
