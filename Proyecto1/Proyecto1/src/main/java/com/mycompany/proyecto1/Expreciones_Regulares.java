package com.mycompany.proyecto1;
public class Expreciones_Regulares {
    public String nombre, exp_reg;
    
    public Expreciones_Regulares(String nombre, String exp_reg){
        this.nombre=nombre;
        this.exp_reg=exp_reg;
    }

    public String getNombre() { //obtener
        return nombre;
    }

    public void setNombre(String nombre) { //asignar
        this.nombre = nombre;
    }

    public String getExp_reg() {
        return exp_reg;
    }

    public void setExp_reg(String exp_reg) {
        this.exp_reg = exp_reg;
    }
}
