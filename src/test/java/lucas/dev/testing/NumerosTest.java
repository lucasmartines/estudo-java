/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucas.dev.testing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Lucas
 */
public class NumerosTest {
    
    private Numeros n;
    public NumerosTest() {
        n = new Numeros();

    }

   
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
//    
    @BeforeEach
    public void setUp() {

    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of numeroPar method, of class Numeros.
     */
    @org.junit.jupiter.api.Test
    public void testNumeroPar() {
         assertEquals(true, n.numeroPar(8) );
    }

    /**
     * Test of areaQuadrado method, of class Numeros.
     */
    @org.junit.jupiter.api.Test
    public void testAreaQuadrado() {
         assertEquals(100,n.areaQuadrado(10));
    }

    /**
     * Test of numeroDivisivel method, of class Numeros.
     */
    @org.junit.jupiter.api.Test
    public void testNumeroDivisivel() {
         assertEquals( n.numeroDivisivel(4, 2), true );
    }
    
}
