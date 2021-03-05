/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1;

public class Expresiones {
    public String id;
    public Arbol raiz;
    
    public Expresiones(String id, Arbol raiz){
        this.id=id;
        this.raiz=raiz;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Arbol getRaiz() {
        return raiz;
    }

    public void setRaiz(Arbol raiz) {
        this.raiz = raiz;
    }
}
