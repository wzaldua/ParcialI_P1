/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;
import org.testng.Assert;
import org.testng.annotations.Test;
import unbosque.Ejercicio4;

/**
 *
 * @author F211
 */
public class testEjercicio4 {
    
    @Test
    public void testgetValor1(){
        Ejercicio4 n = new Ejercicio4(2,4);
        Assert.assertEquals(n.getValor1(), 2);     
    }
    
    @Test
    public void testgetValor2(){
        Ejercicio2 n = new Ejercicio2(2,4,5);
        Assert.assertEquals(n.getValor2(), 4);     
    }
    
}
