/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopilas;

import com.sun.java.swing.plaf.windows.WindowsComboBoxUI;

/**
 *
 * @author estudiante
 */
public class Mascota {
    private String nombre;
    private String tipo;
    private int edad;
    Mascota(){
        this.nombre="";
        this.tipo="";
        this.edad=-1;
    }
    Mascota(String a,String b,int c){
        this.nombre=a;
        this.tipo=b;
        this.edad=c;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void mostrar(){
    System.out.println(this.nombre+" "+ this.tipo+" "+this.edad);
    }
    
}
