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
public class Ejercicio3 {
    int N;
    int suma;
    
    public Ejercicio3(){
        N =0;
        suma=0;
    }
    
    public int asignarContador(int a){
        N = a+1;
        return N;
    }
    
    public int sumaContador(int a, int b){
        suma = a + b;
        return suma;
    }
    
    public int hacersumaHasta10(){
        for(int n = 0;n<=10;n++){
            suma= suma+n;
        }
        return suma;
    }
    
    
    
}
