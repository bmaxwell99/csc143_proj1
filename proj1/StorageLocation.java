
/**
 * This object holds all information related to any instance of the Storage 
 * Location
 *
 * @author (Brian Maxwell)
 * @version (4)
 */
public class StorageLocation
{
    // instance variables
    private String designation;
    private StorageUnit[][] storageUnits = new StorageUnit[12][20];
    private Customer[] customers = new Customer[100];

    /**
     * Constructor for objects of class StorageLocation
     * 
     * @param   designation     the name of the store location to be instantiated
     */
    public StorageLocation(String designation)
    {
        this.designation = designation;
    }

    /**
     * a getter method for Designation
     *
     * @return    the designation for the store
     */
    public String getDesignation()
    {
        return designation;
    }

    /**
     * a getter method for any particular Storage  Unit
     * 
     * @param   row     the index of the row to be retrieved
     * @param   col     the index of the column to be retrieved
     * @return          the Storage Unit at the specified indexes
     */
    public StorageUnit getStorageUnit(int row, int col)
    {
        return null;
    }
    
    /**
     * adds a new customer to the array Customers
     *
     * @param   name        Customer name to be added
     * @param   pNumber     Customer phone number to be added
     * 
     */
    public void addCustomer(String name, String pNumber)
    {
    }

    /**
     * Get the customer at the given index
     * 
     * @param  index     the given index
     * @return           the customer at the given index
     */
    public Customer getCustomer(int index)
    {
        return null;
    }

    /**
     * gets the number of the customers currently in the array customers
     *
     * @return    the number of customers
     */
    public int getNumCustomers()
    {
        return 0;
    }
    
    /**
     * charges every storage unit's monthly rent to the customer who owns it
     *
     */
    public void accrueRent()
    {
    }

    /**
     * retreives an array of storage units owned by any particulat customer
     *
     * @param  Customer     the customer whose units are being retrieved
     * @return              the array of Storage Units owned
     */
    public StorageUnit[] getUnitsByCustomer(Customer cust)
    {
        return null;
    }

    /**
     * Retrieves an array of all empty units
     *
     * @return    an array of StorageUnits that are empty
     */
    public StorageUnit[] getEmptyUnits()
    {
        return null;
    }

     /**
     * Retrieves an array of all empty units of a given type
     *
     * @param   roomType    type of the room to be searched for
     * @return              an array of StorageUnits, of the type, that are empty
     */
    public StorageUnit[] getEmptyUnitsOfType(RoomType roomType)
    {
        return null;
    }
}

