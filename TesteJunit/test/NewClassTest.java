/

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GC-Aula
 */
public class NewClassTest {
    /* Aula GC "02/05/2019" mais na verdade hoje é dia 06/06/2019 */
    public NewClassTest() {
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
    public void testSomeMethod() {
        NewClass var = new NewClass();
        var.novo("Norton");
        assertEquals(var.getNome(), "Norton");
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
