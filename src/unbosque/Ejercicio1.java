/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unbosque;

import java.util.Scanner;

/**
 *
 * @author F211
 */
public class Ejercicio1 {
 
    int a;
    int b;
    
    public Ejercicio1(int as, int bs){
        a = as;
        b = bs;
    }
    
    
    Scanner teclado = new Scanner(System.in);
    
    public int getValor1(){
        //System.out.println("ingresar valor 1");
        //a = teclado.nextInt();
        return a;
    }
    
     public int getValor2(){
        //System.out.println("ingresar valor 2");
       // b = teclado.nextInt();
        return b;
    }
     
     public boolean sonIguales(){
         if(a==b){
             return true;
         }
         return false;
     }
     
     public int cualEsMayor(){
         if(a>b){
             return a;
         }else
             return b;
     }
}
