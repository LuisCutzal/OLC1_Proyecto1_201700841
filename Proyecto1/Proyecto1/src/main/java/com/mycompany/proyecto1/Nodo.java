package com.mycompany.proyecto1;
import java.util.ArrayList;

/**
 *
 * @author Compra
 */
public class Nodo {
    
    /*
    *Un token es un par que consiste en un nombre de token y un valor de atributo opcional.
    *Un lexema es una secuencia de caracteres en el programa fuente, que coinciden con el patrón para un token y que el analizador léxico identifica como una instancia de este tóken.
    *Un patrón es una descripción de la forma que pueden tomar los lexemas de un token.
    */
    public String token; //identificar el token que seria el simbolo que es, lo que representa, si es digito o letras
    public String lexema;//lo que viene, si es ID que lexema lo representa
    public int id; //numero de nodo hoja es
    public Nodo HijoIzquierdo;
    public Nodo HijoDerecho;
    //que mas necesito, si es anulable o no, como lo se, poner un boolean, cero o uno, de cualquier forma
   // public boolean NoAnulable;
    public String Anulable;

    public ArrayList<Nodo> hijos = new ArrayList<Nodo>(); //sirve para graficarlo
    
    //constructor para la clase nodo, se puede extender con mas componentes que necesitemos para el proyecto
    public Nodo (String token, String lexema, int id, Nodo HijoIzquierdo, Nodo HijoDerecho,String Anulable){
        //".","",-1,b,c
        //a.toString(), "", parser.conthojas, null, null
        this.token = token;
        this.lexema = lexema;
        this.id= id;
        this.HijoIzquierdo= HijoIzquierdo;
        this.HijoDerecho= HijoDerecho;
        this.Anulable=Anulable;
       // NoAnulable=false;
        if (HijoIzquierdo!=null){
            this.hijos.add(HijoIzquierdo);
           // NoAnulable=true;
        }
        if (HijoDerecho!=null){
            this.hijos.add(HijoDerecho);
           // NoAnulable=true;
        }
    }
    
    
}
