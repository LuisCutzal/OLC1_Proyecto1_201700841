/*--------------------------------------------------
 ------------  1ra Area: Codigo de Usuario ---------
 ---------------------------------------------------*/

//------> Paquetes,importaciones
package Analizadores;
import java_cup.runtime.*;


/*----------------------------------------------------------
  ------------  2da Area: Opciones y Declaraciones ---------
  ----------------------------------------------------------*/
%%
%{
    //----> Codigo de usuario en sintaxis java
%}

//-------> Directivas
%public 
%class Analizador_Lexico
%cupsym Simbolos
%cup
%char
%column
%full
%ignorecase
%line
%unicode

//------> Expresiones Regulares

numero              = [0-9]+
Letra               = [a-zA-ZñÑ]
cadena              = [\"][^\"\n]+[\"]
id                  = {Letra}({Letra}|{numero}|_)*

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]

comentariosimple    = "//" {InputCharacter}* {LineTerminator}?
comentariodoble     = [\<!][^]+[\!>] {InputCharacter}* {LineTerminator}?
//------> Estados

%%

/*------------------------------------------------
  ------------  3ra Area: Reglas Lexicas ---------
  ------------------------------------------------*/

//-----> Simbolos

"{"         { System.out.println("Reconocio "+yytext()+" llaveabre"); return new Symbol(Simbolos.llaveabre, yycolumn, yyline, yytext()); }
"}"         { System.out.println("Reconocio "+yytext()+" llavecierra"); return new Symbol(Simbolos.llavecierra, yycolumn, yyline, yytext()); }
":"         { System.out.println("Reconocio "+yytext()+" dospuntos"); return new Symbol(Simbolos.dospuntos, yycolumn, yyline, yytext()); }
"-"         { System.out.println("Reconocio "+yytext()+" guion"); return new Symbol(Simbolos.guion, yycolumn, yyline, yytext()); }
">"         { System.out.println("Reconocio "+yytext()+" mayor"); return new Symbol(Simbolos.mayor, yycolumn, yyline, yytext()); }
"~"         { System.out.println("Reconocio "+yytext()+" tilde"); return new Symbol(Simbolos.tilde, yycolumn, yyline, yytext()); }
","         { System.out.println("Reconocio "+yytext()+" coma"); return new Symbol(Simbolos.coma, yycolumn, yyline, yytext()); }
";"         { System.out.println("Reconocio "+yytext()+" puntoycoma"); return new Symbol(Simbolos.puntoycoma, yycolumn, yyline, yytext()); }
"%"         { System.out.println("Reconocio "+yytext()+" porcentaje"); return new Symbol(Simbolos.porcentaje, yycolumn, yyline, yytext()); }
"\""         { System.out.println("Reconocio "+yytext()+" comilladoble"); return new Symbol(Simbolos.comilladoble, yycolumn, yyline, yytext()); }
"\'"         { System.out.println("Reconocio "+yytext()+" comillasimple"); return new Symbol(Simbolos.comillasimple, yycolumn, yyline, yytext()); }
"."         { System.out.println("Reconocio "+yytext()+" concatenacion"); return new Symbol(Simbolos.concatenacion, yycolumn, yyline, yytext()); }
"*"         { System.out.println("Reconocio "+yytext()+" kleene"); return new Symbol(Simbolos.kleene, yycolumn, yyline, yytext()); }
"+"         { System.out.println("Reconocio "+yytext()+" positivo"); return new Symbol(Simbolos.positivo, yycolumn, yyline, yytext()); }
"?"         { System.out.println("Reconocio "+yytext()+" interrogacion"); return new Symbol(Simbolos.interrogacion, yycolumn, yyline, yytext()); }
"|"         { System.out.println("Reconocio "+yytext()+" disyuncion"); return new Symbol(Simbolos.disyuncion, yycolumn, yyline, yytext()); }
"\n"         { System.out.println("Reconocio "+yytext()+" saltolinea"); return new Symbol(Simbolos.saltolinea, yycolumn, yyline, yytext()); }
"\“"         { System.out.println("Reconocio "+yytext()+" comillaAbrir"); return new Symbol(Simbolos.comillaAbrir, yycolumn, yyline, yytext()); }
"\”"         { System.out.println("Reconocio "+yytext()+" comillaCerrar"); return new Symbol(Simbolos.comillaCerrar, yycolumn, yyline, yytext()); }
//-----> Palabras reservadas
"CONJ"        { System.out.println("Reconocio "+yytext()+" conj"); return new Symbol(Simbolos.conj, yycolumn, yyline, yytext()); }

//-------> Simbolos ER
{numero}    { System.out.println("Reconocio "+yytext()+" numero"); return new Symbol(Simbolos.numero, yycolumn, yyline, yytext()); }
{Letra}    { System.out.println("Reconocio "+yytext()+" letra"); return new Symbol(Simbolos.letra, yycolumn, yyline, yytext()); }
{cadena}    { System.out.println("Reconocio "+yytext()+" cadena"); return new Symbol(Simbolos.cadena, yycolumn, yyline, yytext()); }
{id}    { System.out.println("Reconocio "+yytext()+" id"); return new Symbol(Simbolos.id, yycolumn, yyline, yytext()); }

//------> Espacios
{comentariosimple}      {System.out.println("Comentario: "+yytext()); }
{comentariodoble}       {System.out.println("Comentario doble: "+yytext()); }
[ \t\r\n\f]             {/* Espacios en blanco, se ignoran */}

//------> Errores Lexicos
.                       { System.out.println("Error Lexico"+yytext()+" Linea "+yyline+" Columna "+yycolumn); 
                           
                        }