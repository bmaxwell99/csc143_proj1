

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StorageLocationTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StorageLocationTest
{
    /**
     * Default constructor for test class StorageLocationTest
     */
    public StorageLocationTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testConstrAndGets() {
        StorageLocation loc1 = new StorageLocation("WA23Issaquah");
        assertEquals("WA23Issaquah", loc1.getDesignation());
        assertEquals(null, loc1.getStorageUnit(0, 0));
        
        //tests the customer related adders/getters
        loc1.addCustomer("Joe Schmoe", "1-234-567-7890");
        assertEquals(null, loc1.getCustomer(0));
        assertEquals(0, loc1.getNumCustomers());
    }
    
    @Test
    public void testUnitArrayGetters() {
        StorageLocation loc1 = new StorageLocation("WA23Issaquah");
        Customer cust1 = new Customer("Joe Schmoe", "1-234-567-7890");
        
        assertEquals(null, loc1.getUnitsByCustomer(cust1));
        assertEquals(null, loc1.getEmptyUnits());
        assertEquals(null, loc1.getEmptyUnitsOfType(RoomType.STANDARD));
    }
    
    @Test
    public void testAccrueRent()    
    {
    }  
}
