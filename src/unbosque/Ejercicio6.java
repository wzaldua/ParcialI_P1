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
public class Ejercicio6 {
    
    int a;
    
    public Ejercicio6(int x){
        a=x;
    }
    
    public int getvalor(){
        return a;
    }

    public boolean esUnNumeroPar() {
        if(a%2==0){
            return true;
        }else
            return false;      
    }
    
}
