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
public class Ejercicio8 {
    
    int a;
    int b;

    public Ejercicio8(int x, int y) {
        a = x;
        b = y;
    }
    
    public int getNumero1aOrdenar(){
        return a;
    }
    
    public int getNumero2aOrdenar(){
        return b;
    }
    
    public String numerosOdenados(){
        if(a>b){
            return b+","+a;
        }else
            return a+","+b;
    }
    
    
    
}
