/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unbosque;

/**
 *
 * @author wilvergzalduae
 */
public class Ejercicio5 {
    
    int r;
    int h;
    double area;
    double volumen;
    
    public Ejercicio5(int a,int b){
        r=a;
        h=b;
    }

    public int getRadio() {
        return r;
    }
    
    public int getAltura() {
        return h;
    }
    
    public double getVolumen() {
        volumen = (Math.PI)*(r*r)*h;
        return volumen;
    }
    
    public double getArea() {
        area = 2*(Math.PI)*r*(h*r);
        return area;
    }
    
}
