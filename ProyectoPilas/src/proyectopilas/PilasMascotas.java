/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopilas;
import java.util.*;
public class PilasMascotas {
    public static void main(String[]args){
    
        Stack<Mascota> A=new Stack();
        A.push(new Mascota("toto","perro",7));
         A.push(new Mascota("toby","perro",5));
          A.push(new Mascota("miau","gato",2));
           A.push(new Mascota("tim","gato",8));
            A.push(new Mascota("paco","loro",9));
            MostrarM(A);
    }
    public static void MostrarM(Stack<Mascota> FS){
    Stack<Mascota> aux=new Stack();
    while (!FS.empty()){
    Mascota mx=FS.pop();
    mx.mostrar();
    aux.push(mx);
    }
        vaciar(aux, FS);
    }
    public static void vaciar(Stack<Mascota> s, Stack<Mascota> b){
    while(!s.empty()){
    b.push(s.pop());
    }
    }
    public static void lleva(){
    Stack<Mascota> aux1=new Stack();
    Stack<Mascota> aux2=new Stack();
    
}}
