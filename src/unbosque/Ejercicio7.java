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
public class Ejercicio7 {
    
    int calificacion;

    public Ejercicio7(int a) {
        calificacion=a;
    }
    
    public int getCalificacion(){
        return calificacion;
    }
    
    public String getNuevaNota(){
        if(calificacion>=19 && calificacion<=20){
            return "A";
        }else if(calificacion>=16 && calificacion<=18){
            return "B";
        }else if(calificacion>=13 && calificacion<=15){
            return "C";
        }else if(calificacion>=10 && calificacion<=12){
            return  "D";
        }else if(calificacion>=1 && calificacion<=9){
            return  "E";
        }
        return null;
    }
    
}
