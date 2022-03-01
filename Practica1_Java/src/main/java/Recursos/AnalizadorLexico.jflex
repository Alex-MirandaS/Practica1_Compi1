package JFLEX_Y_CUP;
import java_cup.runtime.*;
%%

/*segunda seccion: configuracion*/
%class AnalizadorLexico
%unicode
%line
%column
%cup
%public

//Palabra Reservadas
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

//Texto y Valores
COMENTARIO = ("#"(.)*)
NUMERO = [0-9]+
LETRAS = [a-zA-Z]+
ESPACIO = ("")
CADENA = ({COMILLA}{LETRAS}({LETRAS}|{NUMERO}|{ESPACIO})*{COMILLA})|({CABIERTO}{LETRAS}({LETRAS}|{NUMERO}|{ESPACIO})*{CCERRADO})

%{
//codigo java

%}
%eof{
%eof}
%%

/*tercer seccion: reglase lexicas*/
/*{ENTERO}                        { return new Symbol(sym.ENTERO, yyline + 1, yycolumn + 1, new Integer(yytext()));  }
*/

//Palabras Reservadas
{DEF}           { return new Symbol(sym.DEF, yyline + 1, yycolumn + 1, yytext()); } 
{BARRAS}        { return new Symbol(sym.BARRAS, yyline + 1, yycolumn + 1, yytext());} 
{PIE}           { return new Symbol(sym.PIE, yyline + 1, yycolumn + 1, yytext()); } 
{TITULO}        { return new Symbol(sym.TITULO, yyline + 1, yycolumn + 1, yytext()); }
{EJEX}          { return new Symbol(sym.EJEX, yyline + 1, yycolumn + 1, yytext()); }
{EJEY}          { return new Symbol(sym.EJEY, yyline + 1, yycolumn + 1, yytext()); }
{ETIQUETAS}     { return new Symbol(sym.ETIQUETAS, yyline + 1, yycolumn + 1, yytext()); }
{VALORES}       { return new Symbol(sym.VALORES, yyline + 1, yycolumn + 1, yytext());}
{UNIR}          { return new Symbol(sym.UNIR, yyline + 1, yycolumn + 1, yytext()); }
{TIPO}          { return new Symbol(sym.TIPO, yyline + 1, yycolumn + 1, yytext());}
{CANTIDAD}      { return new Symbol(sym.CANTIDAD, yyline + 1, yycolumn + 1, yytext()); }
{PORCENTAJE}    { return new Symbol(sym.PORCENTAJE, yyline + 1, yycolumn + 1, yytext()); }
{TOTAL}         { return new Symbol(sym.TOTAL, yyline + 1, yycolumn + 1, yytext()); }
{EXTRA}         { return new Symbol(sym.EXTRA, yyline + 1, yycolumn + 1, yytext()); }

//Simbolos
{PUNTO}         { return new Symbol(sym.PUNTO, yyline + 1, yycolumn + 1, yytext()); }  
{COMA}          { return new Symbol(sym.COMA, yyline + 1, yycolumn + 1, yytext()); } 
{PUNTOYCOMA}    { return new Symbol(sym.PUNTOYCOMA, yyline + 1, yycolumn + 1, yytext());}
{MAS}           { return new Symbol(sym.MAS, yyline + 1, yycolumn + 1, yytext()); }
{MENOS}         { return new Symbol(sym.MENOS, yyline + 1, yycolumn + 1, yytext()); }    
{POR}           { return new Symbol(sym.POR, yyline + 1, yycolumn + 1, yytext()); } 
{DIVIDIDO}      { return new Symbol(sym.DIVIDIDO, yyline + 1, yycolumn + 1, yytext()); } 
{PABIERTO}      { return new Symbol(sym.PABIERTO, yyline + 1, yycolumn + 1, yytext()); } 
{PCERRADO}      { return new Symbol(sym.PCERRADO, yyline + 1, yycolumn + 1, yytext()); }
{CORABIERTO}    { return new Symbol(sym.CORABIERTO, yyline + 1, yycolumn + 1, yytext()); }
{CORCERRADO}    { return new Symbol(sym.CORCERRADO, yyline + 1, yycolumn + 1, yytext()); }
{LLABIERTO}     { return new Symbol(sym.LLABIERTO, yyline + 1, yycolumn + 1, yytext()); }
{LLCERRADO}     { return new Symbol(sym.LLCERRADO, yyline + 1, yycolumn + 1, yytext()); }
{COMILLA}       { return new Symbol(sym.COMILLA, yyline + 1, yycolumn + 1, yytext()); }
{CABIERTO}      { return new Symbol(sym.CABIERTO, yyline + 1, yycolumn + 1, yytext());}
{CCERRADO}      { return new Symbol(sym.CCERRADO, yyline + 1, yycolumn + 1, yytext()); }

//Texto y Valores
{COMENTARIO}    { return new Symbol(sym.NUMERO, yyline + 1, yycolumn + 1, yytext()); }
{NUMERO}        { return new Symbol(sym.NUMERO, yyline + 1, yycolumn + 1, yytext()); }
{NUMERO} {PUNTO} {NUMERO}       { return new Symbol(sym.DECIMAL, yyline + 1, yycolumn + 1, yytext());}
{CADENA}        { return new Symbol(sym.CADENA, yyline + 1, yycolumn + 1, yytext()); }

[^] {}