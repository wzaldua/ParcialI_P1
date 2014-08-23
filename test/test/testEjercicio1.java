/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import org.testng.annotations.Test;
import org.testng.Assert;
import unbosque.Ejercicio1;

/**
 *
 * @author F211
 */
public class testEjercicio1 {
    
    @Test
    public void testgetValor1(){
        Ejercicio1 n = new Ejercicio1(0,1);
        Assert.assertEquals(n.getValor1(), 0);     
    }
    
    @Test
    public void testgetValor2(){
        Ejercicio1 n = new Ejercicio1(0,2);
        Assert.assertEquals(n.getValor2(), 2);
    }
    
    @Test
    public void testsonIguales(){
        Ejercicio1 n = new Ejercicio1(2,1);
        Assert.assertEquals(n.sonIguales(), false);
    }
    
    @Test
    public void cualEsMayor(){
        Ejercicio1 n = new Ejercicio1(0,2);
        Assert.assertEquals(n.cualEsMayor(), 2);
    }
}
