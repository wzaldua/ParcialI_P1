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
public class Ejercicio2 {
    int a;
    int b;
    int c;

    public Ejercicio2(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    public int getValor1() {
        return a;
    }
    
    public int getValor2() {
        return b;
    }
    
    public int getValor3() {
        return c;
    }
    
    public boolean aEsMayor(){
        if(a>b){
            if(a>c){
                return true;
            }
        }
        return false;
    }
    
    public boolean bEsMayor(){
        if(b>a){
            if(b>c){
                return true;
            }
        }
        return false;
    }
    
    public boolean cEsMayor(){
        if(c>a){
            if(c>b){
                return true;
            }
        }
        return false;
    }
    
    
}
