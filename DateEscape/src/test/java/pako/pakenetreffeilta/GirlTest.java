/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pako.pakenetreffeilta;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mattiylh@cs
 */
public class GirlTest {
    
    public Girl testing;
    
    public GirlTest() {
    }
    
    @Before
    public void setUp() {
        testing = new Girl("Paavo Pesusieni");
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void girlsInterestSetsProperlyWithSimpleConstructor(){
        assertEquals(100, testing.getGirlsInterestAmount());
    }
    
    @Test
    public void girlsInterestDecreasesAccordingly(){
        testing.decreaseInterestSansConsequence(50);
        assertEquals(50, testing.getGirlsInterestAmount());
    }
    @Test
    public void girlsInterestIncreasesAccordingly(){
        testing.increaseInterestSansConsequence(50);
        assertEquals(150, testing.getGirlsInterestAmount());
    }
    @Test
    public void girlsInterestIncreasesAccordinglyWithoutExceedingLimit(){
        testing.increaseInterestSansConsequence(150);
        assertEquals(200, testing.getGirlsInterestAmount());
    }
    @Test
    public void girlsInterestDecreasesAccordinglyWithoutGoingBelow0(){
        testing.decreaseInterestSansConsequence(150);
        assertEquals(0, testing.getGirlsInterestAmount());
    }

}
