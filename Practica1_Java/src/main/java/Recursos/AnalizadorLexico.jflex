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

/*BORRAR
%unicode
%line
%column
%int
%public
*/
//Palabras Reservadas
DEF = ("Def"|"def")
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
NUMERO = [0-9]+
DECIMAL = {NUMERO}"."{NUMERO}
LETRAS = [a-zA-Z]+
CADENA = ({LETRAS}|{NUMERO})" "?({LETRAS}|{NUMERO})
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
{DEF}           { /*return new Symbol(sym.DEF, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);} 
{BARRAS}        { /*return new Symbol(sym.BARRAS, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);} 
{PIE}           { /*return new Symbol(sym.PIE, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);} 
{TITULO}        { /*return new Symbol(sym.TITULO, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);}
{EJEX}          { /*return new Symbol(sym.EJEX, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);}
{EJEY}          { /*return new Symbol(sym.EJEY, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);}
{ETIQUETAS}     { /*return new Symbol(sym.ETIQUETAS, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);}
{VALORES}       { /*return new Symbol(sym.VALORES, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);}
{UNIR}          { /*return new Symbol(sym.UNIR, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);}
{TIPO}          { /*return new Symbol(sym.TIPO, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);}
{CANTIDAD}      { /*return new Symbol(sym.CANTIDAD, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);}
{PORCENTAJE}    { /*return new Symbol(sym.PORCENTAJE, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);}
{TOTAL}         { /*return new Symbol(sym.TOTAL, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);}
{EXTRA}         { /*return new Symbol(sym.EXTRA, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);}
//Simbolos
{NUMERO}        { /*return new Symbol(sym.NUMERO, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);}
{DECIMAL}       { /*return new Symbol(sym.DECIMAL, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);}
{LETRAS}        { /*return new Symbol(sym.LETRAS, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);} 
{CADENA}        { /*return new Symbol(sym.CADENA, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);}
{PUNTO}         { /*return new Symbol(sym.PUNTO, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);}  
{COMA}          { /*return new Symbol(sym.COMA, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);} 
{PUNTOYCOMA}    { /*return new Symbol(sym.PUNTOYCOMA, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);}
{MAS}           { /*return new Symbol(sym.MAS, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);}
{MENOS}         { /*return new Symbol(sym.MENOS, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);}    
{POR}           { /*return new Symbol(sym.POR, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);} 
{DIVIDIDO}      { /*return new Symbol(sym.DIVIDIDO, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);} 
{PABIERTO}      { /*return new Symbol(sym.PABIERTO, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);} 
{PCERRADO}      { /*return new Symbol(sym.PCERRADO, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);}
{CORABIERTO}    { /*return new Symbol(sym.CORABIERTO, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);}
{CORCERRADO}    { /*return new Symbol(sym.CORCERRADO, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);}
{LLABIERTO}     { /*return new Symbol(sym.LLABIERTO, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);}
{LLCERRADO}     { /*return new Symbol(sym.LLCERRADO, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);}
{COMILLA}       { /*return new Symbol(sym.COMILLA, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);}
{CABIERTO}      { /*return new Symbol(sym.CABIERTO, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);}
{CCERRADO}      { /*return new Symbol(sym.CCERRADO, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);}
{COMENTARIO}    { /*return new Symbol(sym.NUMERO, yyline + 1, yycolumn + 1);*/ agregarToken(yytext(), yyline+1, yycolumn+1);}

[^] {}