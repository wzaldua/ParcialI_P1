/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unbosque;

/**
 *
 * @author F211
 */
public class Ejercicio4 {
    int a;
    int b;
    double hipotenusa;

    public Ejercicio4(int x, int y) {
        a=x;
        b=y;
    }
    
    public int getCatetoA(){
        return a;
    }
    
    public int getCatetoB(){
        return b;
    }
    
    public double calcularHipotenusa(){
        int aux = (a*a)+(b*b);
        hipotenusa = Math.sqrt(aux);
        return hipotenusa;  
    }
    
}
