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

/**
 * 
 * JUnit test class for guitar inventory
 *
 */

public class TestInventory {

	@Before
	public void setUp() throws Exception {
	}
	Inventory inventory = new Inventory();
	
	public double doubleValue(float value) {
	    return (double)value;
	}
	
	/*
	 * Test AddGuitar() method
	 */


	@Test
	public void testAddGuitar() 
	{
		//Adding first Guitar
		inventory.addGuitar("332211", 4999.95f, Builder.COLLINGS, "CJ", Type.ACOUSTIC,
                Woodtype.INDIAN_ROSEWOOD, Woodtype.SITKA);
		
		Guitar guitar1 = inventory.getGuitar("332211");       // Get guitar with given serial number
		String model = guitar1.getSpec().getModel();   
		// validates the equality of expected and actual value of first guitar
		assertEquals("332211",guitar1.getSerialNumber());
		assertEquals("CJ", model);                     
		assertEquals(Type.ACOUSTIC, guitar1.getSpec().getType());
		assertEquals(Builder.COLLINGS, guitar1.getSpec().getBuilder());
		assertEquals(Woodtype.INDIAN_ROSEWOOD, guitar1.getSpec().getBackWood());
		assertEquals(Woodtype.SITKA, guitar1.getSpec().getTopWood());
		int Result1=Double.compare(doubleValue(4999.95f), guitar1.getPrice());
		assertEquals(0,Result1);
		
		//Adding second Guitar
		inventory.addGuitar("442211", 2999.95f, Builder.FENDER, "CJ", Type.ACOUSTIC,
                Woodtype.INDIAN_ROSEWOOD, Woodtype.ALDER);
		
		
		assertEquals(2, inventory.guitars.size()); // Making sure that first guitar is still available
		
		Guitar guitar2 = inventory.getGuitar("442211"); // Get guitar with given serial number
		String model1 = guitar2.getSpec().getModel(); 
		// validates the equality of expected and actual value of second guitar
		assertEquals("442211",guitar2.getSerialNumber());
		assertEquals("CJ", model1);                     
		assertEquals(Type.ACOUSTIC, guitar2.getSpec().getType());
		assertEquals(Builder.FENDER, guitar2.getSpec().getBuilder());
		assertEquals(Woodtype.INDIAN_ROSEWOOD, guitar2.getSpec().getBackWood());
		assertEquals(Woodtype.ALDER, guitar2.getSpec().getTopWood());
		
		int Result=Double.compare(doubleValue(2999.95f), guitar2.getPrice());
		assertEquals(0,Result);
		
		
		System.out.println("TEST CASE 1: Add method");
		for (Iterator i = inventory.guitars.iterator(); i.hasNext(); ) 
		{
		      Guitar guitar = (Guitar)i.next();
		      //Printing two guitars to make sure that first guitar is still available
		     
		      System.out.println("guitar " +(inventory.guitars.indexOf(guitar)+1)+ ": " + guitar.getSerialNumber() +" is with builder " +
		              guitar.spec.getBuilder() + " , " + guitar.spec.getModel() +  " model, " +
		              guitar.spec.getType() + " guitar type and\n   " +
		              guitar.spec.getBackWood() + " back and sides,\n   " +
		              guitar.spec.getTopWood() + " top.\nYou can have it for only $" +
		              guitar.getPrice() + "!");
		}
		
	} 
	
	/*
	 * Tests GetGuitar() method
	 */
	
	
	
	@Test
	public void testGetGuitar() 
	{
		inventory.addGuitar("332211", 4999.95f, Builder.COLLINGS, "CJ", Type.ACOUSTIC,
                Woodtype.INDIAN_ROSEWOOD, Woodtype.SITKA);
		Guitar guitar3 = inventory.getGuitar("332211"); //get a guitar with given serial number
		//we need to check if the guitar fetched from getGuitar() matches required guitar
		Guitar requiredGuitar = new Guitar("332211", 4999.95f, Builder.COLLINGS, "CJ", Type.ACOUSTIC,
                Woodtype.INDIAN_ROSEWOOD, Woodtype.SITKA);
		//testing the equality of expected and actual values
		assertEquals(requiredGuitar.getSerialNumber(), guitar3.getSerialNumber());
		assertEquals(requiredGuitar.getSpec().getModel(), guitar3.getSpec().getModel());
		assertEquals(requiredGuitar.getSpec().getType(), guitar3.getSpec().getType());
		assertEquals(requiredGuitar.getSpec().getBuilder(), guitar3.getSpec().getBuilder());
		assertEquals(requiredGuitar.getSpec().getBackWood(), guitar3.getSpec().getBackWood());
		assertEquals(requiredGuitar.getSpec().getTopWood(), guitar3.getSpec().getTopWood());
		int Result=Double.compare(requiredGuitar.getPrice(), guitar3.getPrice());
		assertEquals(0,Result);
		
	} 
  
	/*
	 * Tests searchGuitar() method by setting only builder value
	 */
	@Test
	public void testSearchGuitar1()
	{	
		inventory.addGuitar("552211", 2999.95f, Builder.GIBSON, "CJ", Type.ACOUSTIC,
                Woodtype.INDIAN_ROSEWOOD, Woodtype.ALDER);
		inventory.addGuitar("752211", 8999.95f, Builder.FENDER, "CJ", Type.ACOUSTIC,
                Woodtype.INDIAN_ROSEWOOD, Woodtype.CEDAR);
		GuitarSpec whatErinLikes = new GuitarSpec();
	    whatErinLikes.setBuilder(Builder.GIBSON);
	    List<Guitar> MatchedGuitars = new LinkedList<>();    
	    MatchedGuitars= inventory.search(whatErinLikes);
	    if (!MatchedGuitars.isEmpty()) 
	    {
	    for (Iterator<Guitar> i = MatchedGuitars.iterator(); i.hasNext(); ) 
	    {
	      Guitar guitar = (Guitar)i.next();
	      assertEquals("552211", guitar.getSerialNumber());
	    }
	    assertEquals(1, MatchedGuitars.size());
	    }
	}
	
	/*
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
	    if (!MatchedGuitars.isEmpty()) 
	    {
	    	for (Iterator<Guitar> i = MatchedGuitars.iterator(); i.hasNext(); ) 
		    {
		    	Guitar guitar = (Guitar)i.next();
		      assertEquals("752211", guitar.getSerialNumber());
		    }
	    	assertEquals(1, MatchedGuitars.size());
	    }
	}
	/*
	 * Tests searchGuitar() method by setting only Type value
	 */
	
	
	
	@Test
	public void testSearchGuitar3()
	{	
        
		inventory.addGuitar("152211", 8999.95f, Builder.FENDER, "CJ", Type.ELECTRIC,
                Woodtype.INDIAN_ROSEWOOD, Woodtype.CEDAR);
		
		
		GuitarSpec whatErinLikes = new GuitarSpec();
	    whatErinLikes.setType(Type.ELECTRIC);
	    
	    List<Guitar> MatchedGuitars = new LinkedList<>();    
	    MatchedGuitars= inventory.search(whatErinLikes);
	    if (!MatchedGuitars.isEmpty()) 
	    {
	    	for (Iterator<Guitar> i = MatchedGuitars.iterator(); i.hasNext(); ) 
	    	{
			       Guitar guitar = (Guitar)i.next();
			       assertEquals("152211", guitar.getSerialNumber());
				   assertEquals(Type.ELECTRIC, guitar.getSpec().getType());
	    	}
	    	assertEquals(1, MatchedGuitars.size());
	    }
	}
	
	/*
	 * Tests searchGuitar() method by giving specifications
	 */
	
	
	@Test
	public void testSearchGuitar4()
	{	
        
		inventory.addGuitar("3211", 8999.95f, Builder.FENDER, "stratocastor", Type.ELECTRIC,
                Woodtype.ALDER, Woodtype.ALDER);
		
		GuitarSpec whatErinLikes = new GuitarSpec();
	    whatErinLikes.setType(Type.ELECTRIC);
	    whatErinLikes.setModel("Stratocastor");
	    whatErinLikes.setBackWood(Woodtype.ALDER);
	    whatErinLikes.setTopWood(Woodtype.ALDER);
	    whatErinLikes.setBuilder(Builder.FENDER);
	    List<Guitar> MatchedGuitars = new LinkedList<>();    
	    MatchedGuitars= inventory.search(whatErinLikes);
	    if (!MatchedGuitars.isEmpty()) 
	    {
	    	for (Iterator<Guitar> i = MatchedGuitars.iterator(); i.hasNext(); ) 
	    	{
			       Guitar guitar = (Guitar)i.next();
			       assertEquals("3211", guitar.getSerialNumber());
				      assertEquals("stratocastor", guitar.getSpec().getModel());
				      assertEquals(Builder.FENDER, guitar.getSpec().getBuilder());
				      assertEquals(Type.ELECTRIC, guitar.getSpec().getType());
				      assertEquals(Woodtype.ALDER, guitar.getSpec().getTopWood());
				      assertEquals(Woodtype.ALDER, guitar.getSpec().getBackWood());

	    	}
	    	assertEquals(1, MatchedGuitars.size());
	    }
	    
	   
	}
	


}
