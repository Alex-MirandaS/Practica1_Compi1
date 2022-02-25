package JFLEX_Y_CUP;
import java_cup.runtime.*;
import Objetos.Token;
import java.util.ArrayList;
%%

/*segunda seccion: configuracion*/
%class AnalizadorLexico
%unicode
%line
%column
%cup
%public

//Palabras Reservadas
/*
DEF = ((("D")|("d"))"ef")
BARRAS = ("Barras")
PIE =("Pie")
TITULO = ("titulo:")
EJEX = ("ejex:")
EJEY = ("ejey:")
ETIQUETAS = ("etiquetas:")
VALORES = ("valores:")
UNIR = ("unir:")
TIPO = ("tipo:")
CANTIDAD = ("Cantidad")
PORCENTAJE = ("Porcentaje")
TOTAL = ("total:")
EXTRA = ("extra:")
//Simbolos
//cadena
PUNTO = "."
COMA = ","
PUNTOYCOMA = ";"
MAS = "+"
MENOS = "-"
POR = "*"
DIVIDIDO = "/"
PABIERTO = "("
PCERRADO = ")"
CORABIERTO = "["
CORCERRADO = "]"
LLABIERTO = "{"
LLCERRADO = "}"
COMILLA = "\""
CABIERTO = "“"
CCERRADO = "”"
COMENTARIO = ("#"(.)*)
ESPACIO = (" ")
COMENTARIO = ("#"(.)*)
DECIMAL = {NUMERO}"."{NUMERO}
CADENA = ({LETRAS}|{NUMERO})+(" ")+({LETRAS}|{NUMERO})+
*/
PUNTO = "."
COMA = ","
NUMERO = [0-9]+
LETRAS = [a-zA-Z]+
ESPACIO = (" ")
%{
//codigo java
  private ArrayList<Token> tokens = new ArrayList<Token>();

    public void agregarToken(String lexema, int fila, int columna) {
        tokens.add(new Token(lexema, fila, columna));
    }

    public ArrayList<Token> getTokens() {
        return tokens;
    }

%}

%eof{
 //System.out.println(getCount());
 //System.out.println("Letras diferentes de A:" + getCountDiffA());
%eof}

%%

/*tercer seccion: reglase lexicas*/

/*{ENTERO}                        { return new Symbol(sym.ENTERO, yyline + 1, yycolumn + 1, new Integer(yytext()));  }
{MAS}                           { return new Symbol(sym.MAS, yyline + 1, yycolumn + 1);  }
{COMA}                          { return new Symbol(sym.COMA, yyline + 1, yycolumn + 1);  }
*/

//Palabras Reservadas
"Def"|"def"     { return new Symbol(sym.DEF, yyline + 1, yycolumn + 1, yytext()); } 
"Barras"        { return new Symbol(sym.BARRAS, yyline + 1, yycolumn + 1);} 
"Pie"           { return new Symbol(sym.PIE, yyline + 1, yycolumn + 1); } 
"titulo:"       { return new Symbol(sym.TITULO, yyline + 1, yycolumn + 1); }
"ejex:"         { return new Symbol(sym.EJEX, yyline + 1, yycolumn + 1); }
"ejey:"         { return new Symbol(sym.EJEY, yyline + 1, yycolumn + 1); }
"etiquetas:"    { return new Symbol(sym.ETIQUETAS, yyline + 1, yycolumn + 1); }
"valores:"      { return new Symbol(sym.VALORES, yyline + 1, yycolumn + 1);}
"unir:"         { return new Symbol(sym.UNIR, yyline + 1, yycolumn + 1); }
"tipo:"         { return new Symbol(sym.TIPO, yyline + 1, yycolumn + 1);}
"Cantidad"      { return new Symbol(sym.CANTIDAD, yyline + 1, yycolumn + 1); }
"Porcentaje"    { return new Symbol(sym.PORCENTAJE, yyline + 1, yycolumn + 1); }
"total:"        { return new Symbol(sym.TOTAL, yyline + 1, yycolumn + 1); }
"extra:"        { return new Symbol(sym.EXTRA, yyline + 1, yycolumn + 1); }
//Simbolos

{PUNTO}         { return new Symbol(sym.PUNTO, yyline + 1, yycolumn + 1); }  
{COMA}          { return new Symbol(sym.COMA, yyline + 1, yycolumn + 1); } 
";"             { return new Symbol(sym.PUNTOYCOMA, yyline + 1, yycolumn + 1);}
"+"             { return new Symbol(sym.MAS, yyline + 1, yycolumn + 1); }
"-"             { return new Symbol(sym.MENOS, yyline + 1, yycolumn + 1); }    
"*"             { return new Symbol(sym.POR, yyline + 1, yycolumn + 1); } 
"/"             { return new Symbol(sym.DIVIDIDO, yyline + 1, yycolumn + 1); } 
"("             { return new Symbol(sym.PABIERTO, yyline + 1, yycolumn + 1); } 
")"             { return new Symbol(sym.PCERRADO, yyline + 1, yycolumn + 1); }
"["             { return new Symbol(sym.CORABIERTO, yyline + 1, yycolumn + 1); }
"]"             { return new Symbol(sym.CORCERRADO, yyline + 1, yycolumn + 1); }
"{"             { return new Symbol(sym.LLABIERTO, yyline + 1, yycolumn + 1); }
"}"             { return new Symbol(sym.LLCERRADO, yyline + 1, yycolumn + 1); }
"\""            { return new Symbol(sym.COMILLA, yyline + 1, yycolumn + 1); }
"“"             { return new Symbol(sym.CABIERTO, yyline + 1, yycolumn + 1);}
"”"             { return new Symbol(sym.CCERRADO, yyline + 1, yycolumn + 1); }
//Texto y Valores
"#"(.)*         { return new Symbol(sym.NUMERO, yyline + 1, yycolumn + 1); }
{NUMERO}        { return new Symbol(sym.NUMERO, yyline + 1, yycolumn + 1); }
{NUMERO} {PUNTO} {NUMERO}                                   { return new Symbol(sym.DECIMAL, yyline + 1, yycolumn + 1);}
"“"{LETRAS}({LETRAS}|{NUMERO}|{ESPACIO})*"”"        { return new Symbol(sym.CADENA, yyline + 1, yycolumn + 1); }
[^] {}