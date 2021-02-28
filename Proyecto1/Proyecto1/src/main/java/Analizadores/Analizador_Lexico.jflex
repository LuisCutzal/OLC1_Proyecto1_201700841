/*--------------------------------------------------
 ------------  1ra Area: Codigo de Usuario ---------
 ---------------------------------------------------*/

//------> Paquetes,importaciones
package Analizadores;
import java_cup.runtime.*;
import javax.swing.JOptionPane;

import com.mycompany.proyecto1.error;
import com.mycompany.proyecto1.Ventana;

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
id                  = ({numero}|{cadena})*


LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]

comentariosimple    = "//" {InputCharacter}* {LineTerminator}?
nComentario         = "<! !>" {InputCharacter}* {LineTerminator}?

//------> Estados

%%

/*------------------------------------------------
  ------------  3ra Area: Reglas Lexicas ---------
  ------------------------------------------------*/

//-----> Simbolos

"{"         { System.out.println("Reconocio "+yytext()+" llaveabre"); return new Symbol(Simbolos.llaveabre, yycolumn, yyline, yytext()); }
"}"         { System.out.println("Reconocio "+yytext()+" llavecierra"); return new Symbol(Simbolos.llavecierra, yycolumn, yyline, yytext()); }
"->"        { System.out.println("Reconocio "+yytext()+" fleca"); return new Symbol(Simbolos.flecha, yycolumn, yyline, yytext()); }
"~"         { System.out.println("Reconocio "+yytext()+" tilde"); return new Symbol(Simbolos.tilde, yycolumn, yyline, yytext()); }
";"         { System.out.println("Reconocio "+yytext()+" puntoycoma"); return new Symbol(Simbolos.puntoycoma, yycolumn, yyline, yytext()); }
"."         { System.out.println("Reconocio "+yytext()+" concatenacion"); return new Symbol(Simbolos.concatenacion, yycolumn, yyline, yytext()); }
"*"         { System.out.println("Reconocio "+yytext()+" kleene"); return new Symbol(Simbolos.kleene, yycolumn, yyline, yytext()); }
"\\\""      { System.out.println("Reconocio "+yytext()+" comilladoble"); return new Symbol(Simbolos.comilladoble, yycolumn, yyline, yytext()); }
"+"         { System.out.println("Reconocio "+yytext()+" positivo"); return new Symbol(Simbolos.positivo, yycolumn, yyline, yytext()); }
"?"         { System.out.println("Reconocio "+yytext()+" interrogacion"); return new Symbol(Simbolos.interrogacion, yycolumn, yyline, yytext()); }
"|"         { System.out.println("Reconocio "+yytext()+" disyuncion"); return new Symbol(Simbolos.disyuncion, yycolumn, yyline, yytext()); }
"%%"        { System.out.println("Reconocio "+yytext()+" dobleporcentaje"); return new Symbol(Simbolos.dobleporcentaje, yycolumn, yyline, yytext()); }
"\\'"       { System.out.println("Reconocio "+yytext()+" comillasimple"); return new Symbol(Simbolos.comillasimple, yycolumn, yyline, yytext()); }


//-----> Palabras reservadas
"ER"        { System.out.println("Reconocio "+yytext()+" e_r"); return new Symbol(Simbolos.e_r, yycolumn, yyline, yytext()); }


//-------> Simbolos ER
{numero}    { System.out.println("Reconocio "+yytext()+" numero"); return new Symbol(Simbolos.numero, yycolumn, yyline, yytext()); }
{cadena}    { System.out.println("Reconocio "+yytext()+" cadena"); return new Symbol(Simbolos.cadena, yycolumn, yyline, yytext()); }
{id}    { System.out.println("Reconocio "+yytext()+" id"); return new Symbol(Simbolos.id, yycolumn, yyline, yytext()); }

//------> Espacios
{comentariosimple}      {System.out.println("Comentario: "+yytext()); }
{nComentario}           {System.out.println("NComentario: "+yytext()); }
[ \t\r\n\f]             {/* Espacios en blanco, se ignoran */}

//------> Errores Lexicos
.                       { System.out.println("Error Lexico"+yytext()+" Linea "+yyline+" Columna "+yycolumn); 
                            error nuevo = new error("Error Sintactico (Recuperado)", s.value.toString(), s.right+1, s.left+1);
                            Ventana.listaErrores.add(nuevo);
                        }

