/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1;
import java.util.LinkedList;
/**
 *
 * @author Compra
 */

    public class Conjunto{
        public Conjunto conj;
        public String id;
        public String inicioC;
        public String finC;
        
        public Conjunto(Conjunto conj, String id, String inicioC, String finC){
            this.conj=conj;
            this.id=id;
            this.inicioC=inicioC;
            this.finC =finC;
        }

        public Conjunto getConj() {
            return conj;
        }

        public void setConj(Conjunto conj) {
            this.conj = conj;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getInicioC() {
            return inicioC;
        }

        public void setInicioC(String inicioC) {
            this.inicioC = inicioC;
        }

        public String getFinC() {
            return finC;
        }

        public void setFinC(String finC) {
            this.finC = finC;
        }
        
    }
    


/*
import java.util.LinkedList;

public class Expresiones {
    public Arbol raiz; 
    public String id;
    
    public Expresiones(String id, Arbol raiz){
        this.raiz = raiz;
        this.id = id;
    }
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
     public Arbol getArbol(){
        return raiz;
    }    
}



*/