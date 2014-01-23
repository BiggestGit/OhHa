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
public class CoordinateTest {
    
    public CoordinateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

        @Test
        public void setsXCoordinateUpProperly(){
            Coordinate xy = new Coordinate(1,2);
            assertEquals(xy.getX(), 1);
        }

        @Test
        public void setsYCoordinateUpProperly(){
            Coordinate xy = new Coordinate(1,2);
            assertEquals(xy.getY(), 2);
        }
    
    @Test
    public void equalsGivesTrueWhenCoordinatesSame(){
        Coordinate coord1 = new Coordinate(1,1);
        Coordinate coord2 = new Coordinate(1,1);
        assertTrue(coord1.equals(coord2));
    }
    @Test
    public void equalsGivesFalseWhenCoordinatesDifferent(){
        Coordinate coord1 = new Coordinate(1,1);
        Coordinate coord2 = new Coordinate(2,2);
        assertFalse(coord1.equals(coord2));
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
