import static org.junit.Assert.*;
//import org.junit.Assert;

import java.util.Iterator;

//import org.junit.Before;
import org.junit.Test;

public class TestInventory {

	/* @Before
	public void setUp() throws Exception {
	}
*/

	Inventory inventory = new Inventory();
	@Test
	public void testAddGuitar() 
	{
		
		inventory.addGuitar("332211", 4999.95, Builder.COLLINGS, "CJ", Type.ACOUSTIC,
                Woodtype.INDIAN_ROSEWOOD, Woodtype.SITKA);
		 Guitar guitar1 = new Guitar();
		guitar1 = inventory.getGuitar("332211");
		String serialNumber1 = guitar1.getSerialNumber();
		assertEquals("332211", serialNumber1);
		//System.out.println("Serial number is" +serialNumber1);
		
		inventory.addGuitar("442211", 2999.95, Builder.FENDER, "CJ", Type.ACOUSTIC,
                Woodtype.INDIAN_ROSEWOOD, Woodtype.ALDER);
		
		for (Iterator i = inventory.guitars.iterator(); i.hasNext(); ) 
		{
		      Guitar guitar2 = (Guitar)i.next();
		      System.out.println("price is" +guitar2.getPrice());
		}
		
	}

	@Test
	public void testGetGuitar() 
	{
		Guitar guitar3 = new Guitar();
		guitar3 = inventory.getGuitar("332211"); 
		Guitar requiredGuitar = new Guitar("332211", 4999.95, Builder.COLLINGS, "CJ", Type.ACOUSTIC,
                Woodtype.INDIAN_ROSEWOOD, Woodtype.SITKA);
		 //System.out.println("price is" +requiredGuitar.getPrice());
		//assertEquals(requiredGuitar, guitar3);
		//assertTrue.guitarEquals
	}

	/*@Test
	public void testSearch() 
	{
		
	}*/

}
