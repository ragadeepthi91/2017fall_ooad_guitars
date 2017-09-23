/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 2
Student 	: RagaDeepthi, Manaswitha & Radhika
Purpose 	: JUnit test to test add, get and search methods
*/

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class TestInventory1 {

	@Before
	public void setUp() throws Exception {
	}

	Inventory inventory = new Inventory();
	
	/**
	 * Test AddGuitar() method
	 */
	@Test
	public void testAddGuitar() 
	{
		
		inventory.addGuitar("332211", 4999.95f, Builder.COLLINGS, "CJ", Type.ACOUSTIC,
                Woodtype.INDIAN_ROSEWOOD, Woodtype.SITKA);
		 Guitar guitar1 = new Guitar();
		guitar1 = inventory.getGuitar("332211"); // guitar with given serial number
		String model = guitar1.getSpec().getModel(); //serial number of guitar fetched
		assertEquals("CJ", model); // validates the equality of expected and actual value
		
		inventory.addGuitar("442211", 2999.95f, Builder.FENDER, "CJ", Type.ACOUSTIC,
                Woodtype.INDIAN_ROSEWOOD, Woodtype.ALDER);
		
		System.out.println("Test case 1: Add method");
		for (Iterator i = inventory.guitars.iterator(); i.hasNext(); ) 
		{
		      Guitar guitar2 = (Guitar)i.next();
		      //checking if first guitar is still available after adding second guitar
		      System.out.println("Serial number of guitar " +(inventory.guitars.indexOf(guitar2)+1)+ " is " +guitar2.getSerialNumber());
		}
		
	}
	
	/**
	 * Tests GetGuitar() method
	 */
	
	@Test
	public void testGetGuitar() 
	{
		inventory.addGuitar("332211", 4999.95f, Builder.COLLINGS, "CJ", Type.ACOUSTIC,
                Woodtype.INDIAN_ROSEWOOD, Woodtype.SITKA);
		Guitar guitar3 = new Guitar();
		guitar3 = inventory.getGuitar("332211"); //get a guitar with given serial number
		//we need to check if the guitar fetched from getGuitar() matches required guitar
		Guitar requiredGuitar = new Guitar("332211", 4999.95f, Builder.COLLINGS, "CJ", Type.ACOUSTIC,
                Woodtype.INDIAN_ROSEWOOD, Woodtype.SITKA);
		//testing the equality of expected and actual values
		assertEquals(requiredGuitar.getSerialNumber(), guitar3.getSerialNumber());
		System.out.println("Test Case 2: Get method");
		System.out.println("Serial number of the required guitar is " +requiredGuitar.getSerialNumber());
		System.out.println("Serial number of the actual guitar is " +guitar3.getSerialNumber());
		
	}
  
	/**
	 * Tests searchGuitar() method by setting only builder value
	 */
	@Test
	public void testSearchGuitar1()
	{	
		inventory.addGuitar("552211", 2999.95f, Builder.GIBSON, "CJ", Type.ACOUSTIC,
                Woodtype.INDIAN_ROSEWOOD, Woodtype.ALDER);
		inventory.addGuitar("652211", 1999.95f, Builder.GIBSON, "CJ", Type.ACOUSTIC,
                Woodtype.INDIAN_ROSEWOOD, Woodtype.CEDAR);
		inventory.addGuitar("752211", 8999.95f, Builder.FENDER, "CJ", Type.ACOUSTIC,
                Woodtype.INDIAN_ROSEWOOD, Woodtype.CEDAR);
		GuitarSpec whatErinLikes = new GuitarSpec();
	    whatErinLikes.setBuilder(Builder.GIBSON);
	    List<Guitar> MatchedGuitars = new LinkedList<>();    
	    MatchedGuitars= inventory.search(whatErinLikes);
	    System.out.println("Test case 3: Search method with builder value");
	    if (!MatchedGuitars.isEmpty()) 
	    {
	      System.out.println("Size of the guitars list is " +MatchedGuitars.size());
	      assertEquals(2,MatchedGuitars.size());
	    }
	}
	
	/**
	 * Tests searchGuitar() method by setting only builder value
	 */
	@Test
	public void testSearchGuitar2()
	{	
        
		inventory.addGuitar("752211", 8999.95f, Builder.FENDER, "CJ", Type.ACOUSTIC,
                Woodtype.INDIAN_ROSEWOOD, Woodtype.CEDAR);
		
		GuitarSpec whatErinLikes = new GuitarSpec();
	    whatErinLikes.setBuilder(Builder.FENDER);
	    List<Guitar> MatchedGuitars = new LinkedList<>();    
	    MatchedGuitars= inventory.search(whatErinLikes);
	    System.out.println("Test case 4: Search method with builder value");
	    if (!MatchedGuitars.isEmpty()) 
	    {
	      System.out.println("Size of the guitars list is " +MatchedGuitars.size());
	      assertEquals(1,MatchedGuitars.size());
	    }
	}
	/**
	 * Tests searchGuitar() method by setting only type value
	 */
	
	@Test
	public void testSearchGuitar3()
	{	
        
		inventory.addGuitar("152211", 8999.95f, Builder.FENDER, "CJ", Type.ELECTRIC,
                Woodtype.INDIAN_ROSEWOOD, Woodtype.CEDAR);
		inventory.addGuitar("52211", 8999.95f, Builder.FENDER, "CJ", Type.ELECTRIC,
                Woodtype.INDIAN_ROSEWOOD, Woodtype.SITKA);
		
		GuitarSpec whatErinLikes = new GuitarSpec();
	    whatErinLikes.setType(Type.ELECTRIC);
	    List<Guitar> MatchedGuitars = new LinkedList<>();    
	    MatchedGuitars= inventory.search(whatErinLikes);
	    System.out.println("Test case 5: Search method with only type value");
	    if (!MatchedGuitars.isEmpty()) 
	    {
	      System.out.println("Size of the guitars list is " +MatchedGuitars.size());
	      assertEquals(2,MatchedGuitars.size());
	    }
	}
	
	/**
	 * Tests searchGuitar() method by setting builder, type, model, backwood and topwood values
	 */
	
	@Test
	public void testSearchGuitar4()
	{	
        
		inventory.addGuitar("3211", 8999.95f, Builder.FENDER, "stratocastor", Type.ELECTRIC,
                Woodtype.ALDER, Woodtype.ALDER);
		inventory.addGuitar("2211", 8999.95f, Builder.FENDER, "stratocastor", Type.ELECTRIC,
                Woodtype.ALDER, Woodtype.ALDER);
		
		GuitarSpec whatErinLikes = new GuitarSpec();
	    whatErinLikes.setType(Type.ELECTRIC);
	    whatErinLikes.setModel("Stratocastor");
	    whatErinLikes.setBackWood(Woodtype.ALDER);
	    whatErinLikes.setTopWood(Woodtype.ALDER);
	    whatErinLikes.setBuilder(Builder.FENDER);
	    List<Guitar> MatchedGuitars = new LinkedList<>();    
	    MatchedGuitars= inventory.search(whatErinLikes);
	    System.out.println("Test case 6: Search method");
	    if (!MatchedGuitars.isEmpty()) 
	    {
	      System.out.println("Size of the guitars list is " +MatchedGuitars.size());
	      assertEquals(2,MatchedGuitars.size());
	    }
	}
	
}
