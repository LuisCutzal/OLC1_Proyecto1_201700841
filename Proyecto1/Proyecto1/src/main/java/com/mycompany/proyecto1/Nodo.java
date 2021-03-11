package com.mycompany.proyecto1;
import java.util.ArrayList;

    /*
    *Un token es un par que consiste en un nombre de token y un valor de atributo opcional.
    *Un lexema es una secuencia de caracteres en el programa fuente, que coinciden con el patrón para un token y que el analizador léxico identifica como una instancia de este tóken.
    *Un patrón es una descripción de la forma que pueden tomar los lexemas de un token.
    */
public class Nodo {
    //identifico que quiero que tenga el nodo, que pertenece a las expresiones
    public String token; //identificar el token que seria el simbolo que es, lo que representa, si es digito o letras
    public String lexema;//lo que viene, si es ID que lexema lo representa
    public int id; //numero de nodo hoja es
    public Nodo HijoIzquierdo;
    public Nodo HijoDerecho;
    public String aceptar;
    public String Anulable;
    
    public String siguiente;
    public String anterior;
    //que mas necesito, si es anulable o no, como lo se, poner un boolean, cero o uno, de cualquier forma
   // public boolean NoAnulable;

    public ArrayList<Nodo> hijos = new ArrayList<Nodo>(); //sirve para graficarlo
    public ArrayList<String> A = new ArrayList<String>();
    //tambien podemos tener una lista de siguientes o primeros al igual de la anulabilidad
    //constructor para la clase nodo, se puede extender con mas componentes que necesitemos para el proyecto
    public Nodo (String token, String lexema, int id, Nodo HijoIzquierdo, Nodo HijoDerecho, String Anulable, String sig, String ant){
        //".","",-1,b,c
        //a.toString(), "", parser.conthojas, null, null

        this.token = token;
        this.lexema = lexema;
        this.id= id;
        this.HijoIzquierdo= HijoIzquierdo;
        this.HijoDerecho= HijoDerecho;
        this.Anulable=Anulable;
        this.siguiente=sig;
        this.anterior=ant;
        aceptar="#";
       // NoAnulable=false;
        if (HijoIzquierdo!=null){
            this.hijos.add(HijoIzquierdo);
            this.A.add(Anulable);
           // NoAnulable=true;
        }
        if (HijoDerecho!=null){
            this.hijos.add(HijoDerecho);
           // NoAnulable=true;
        }
//        if(this.token=="."){
//            
//        }
    }
    
    
}
