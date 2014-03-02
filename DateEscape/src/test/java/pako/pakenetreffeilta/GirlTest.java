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
    public Reaction sadreaction;
    public Reaction happyreaction;
    
    public GirlTest() {
    }
    
    @Before
    public void setUp() {
        testing = new Girl("Paavo Pesusieni");
        sadreaction = Reaction.SAD;
        happyreaction = Reaction.HAPPY;
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
        testing.decreaseInterestSpecialConsequence(50, sadreaction);
        assertEquals(50, testing.getGirlsInterestAmount());
    }
    @Test
    public void girlsInterestIncreasesAccordingly(){
        testing.increaseInterestSpecialConsequence(50, happyreaction);
        assertEquals(150, testing.getGirlsInterestAmount());
    }
    @Test
    public void girlsInterestIncreasesAccordinglyWithoutExceedingLimit(){
        testing.increaseInterestRegularConsequence(150);
        assertEquals(200, testing.getGirlsInterestAmount());
    }
    @Test
    public void girlsInterestDecreasesAccordinglyWithoutGoingBelow0(){
        testing.decreaseInterestRegularConsequence(150);
        assertEquals(0, testing.getGirlsInterestAmount());
    }

}
