package pako.pakenetreffeilta;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProtagonistTest {
    
    public Protagonist testSubject;
    
    public ProtagonistTest() {
    }
    
    @Before
    public void setUp() {
        testSubject = new Protagonist("Paavo Pesusieni");
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void protagonistGetsCorrectName(){
        assertEquals(testSubject.getName(), "Paavo Pesusieni");
    }
    
    @Test
    public void protagonistOccupiesSpaceTrue(){
        assertTrue(testSubject.occupiesSpace());
    }
}
