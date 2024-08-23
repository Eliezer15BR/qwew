/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopilas;

import java.util.*;
public class StackEjercicio {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
        Stack<Integer> A=new Stack();
        System.out.println("Ingrese el numero de elementos que quiere añadir a la pila");
        int m=sc.nextInt();
         System.out.println("Ingreselos");
   llenar(A,m);
    System.out.println(A);
       contarPares(A);
    Stack<Integer> Z=new Stack<Integer>();
        llevarPares(A, Z);
        System.out.println(A);
        System.out.println(Z);
   
    }
    public static void llenar(Stack<Integer> A,int b){
    Scanner sc=new Scanner(System.in);
        for(int i=1;i<=b;i++){
    A.push(sc.nextInt());
    }
    }
    public static void vaciar(Stack<Integer> s, Stack<Integer> b){
    while(!s.empty()){
    b.push(s.pop());
    }
    }
    public static void contarPares(Stack<Integer> Lista){
    Stack<Integer> a=new Stack();
    int contadordePares=0;
    int contadordeImpares=0;
        while(!Lista.empty()){
        if(Lista.peek()%2==0){
        contadordePares++;
        }
        else{
        contadordeImpares++;}
         
        a.push(Lista.pop());
        }
        System.out.println("pares:"+contadordePares+" impares:"+contadordeImpares);
        vaciar(a,Lista);
    }
    public static void llevarPares(Stack<Integer> Lista,Stack<Integer> Pares){
    Stack<Integer> Impares=new Stack<Integer>();
    while(!Lista.empty()){
       
    if(Lista.peek()%2==0){
    Pares.push(Lista.pop());
    }
    else{  
    Impares.push(Lista.pop());
    }
    }  
        vaciar(Impares,Lista);
    }
    
}
