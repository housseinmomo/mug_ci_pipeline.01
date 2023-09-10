package com.mugen.mugen_ci_pipeline01;


import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatriceTests {


    @Test
    public void testAdd(){
        Calculatrice calculatrice = new Calculatrice();
        int result = calculatrice.add(5, 5);
        assertEquals(10, result);
    }

    @Test
    public void testMult(){
        Calculatrice calculatrice = new Calculatrice();
        int result = calculatrice.mult(3, 5);
        assertEquals(15, result);
    }

    @Test
    public void testSous() {
        Calculatrice calculatrice = new Calculatrice();
        int result = calculatrice.sous(10, 8);
        assertEquals(2, result);
    }

    @Test
    public void testDiv() {
        Calculatrice calculatrice = new Calculatrice();
        double result = calculatrice.div(  10 , 5);
        assertEquals(2.0, result, 0.001);
    }

    @Test
    public void tesDivIfParamBEqualTo0() {
        Calculatrice calculatrice = new Calculatrice();
        double result = calculatrice.div(10, 0);
        assertEquals(0.0, result, 0.001);
    }
}
