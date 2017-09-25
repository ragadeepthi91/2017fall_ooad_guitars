/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 2
Student 	: RagaDeepthi, Manaswitha & Radhika
Purpose 	: Takes in the details of guitar like price,Model,Type and check the guitar availability in the Inventory.
*/

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * prints guitars that matches with user specifications like model, type or price range. 
 * 
*/


public class FindGuitarTester 
{
private static Inventory inventory = new Inventory();

/**
 * Main method to call other classes and access methods to add, get and search guitars that matches given specifications.
 * 
 */

  public static void main(String[] args) 
  {
    // Set up Rick's guitar inventory
    initializeInventory(inventory);
    
    SearchWithSpec();        // Search with required specifications.
    Searchwithpricerange();       // Search with price.
  }
    
    
    /**
     * Finds and prints guitar matching with given specifications
     */
    private static void SearchWithSpec()
    {
    	GuitarSpec whatErinLikes = new GuitarSpec();
        //Set the attributes required for search. Comment other attributes which are not needed
        
        whatErinLikes.setBuilder(Builder.FENDER);
        //whatErinLikes.setModel("Stratocastor");
        whatErinLikes.setType(Type.ELECTRIC);
        //whatErinLikes.setBackWood(Woodtype.ALDER);
        //whatErinLikes.setTopWood(Woodtype.ALDER);
        
    List<Guitar> MatchedGuitars = new LinkedList<>();
    MatchedGuitars= inventory.search(whatErinLikes); // passing GuitarSpec object
    System.out.println("Searching with specifications:");
    if (!MatchedGuitars.isEmpty()) 
    {
      System.out.println("Erin, you might like these guitars:");
      for (Iterator i = MatchedGuitars.iterator();i.hasNext();)
      {
    	  Guitar guitar= (Guitar)i.next();
    	  GuitarSpec spec = guitar.getSpec();
    	  System.out.println("We have a " +
        spec.getBuilder() + " " + spec.getModel() +  " " +
        spec.getType() + " guitar:\n   " +
        spec.getBackWood() + " back and sides,\n   " +
        spec.getTopWood() + " top.\nYou can have it for only $" +
        guitar.getPrice() + "!");
      }
    } 
    else 
    {
      System.out.println("Sorry, Erin, we have nothing for you.");
    }
    }
    
    /**
     * Finds and returns guitars that are in given price range
     */
    
    private static void Searchwithpricerange()
    {
    List<Guitar> PriceRangeGuitars = new LinkedList<>();
    PriceRangeGuitars=inventory.searchwithpricerange(3000, 6000);
    if (!PriceRangeGuitars.isEmpty()) 
    {
        System.out.println("Erin, you might like these guitars in required price range:");
        for (Iterator i = PriceRangeGuitars.iterator();i.hasNext();)
        {
      	  Guitar guitar= (Guitar)i.next();
      	  GuitarSpec spec = guitar.getSpec();
      	  System.out.println("We have a " +
          spec.getBuilder() + " " + spec.getModel() +  " " +
          spec.getType() + " guitar:\n   " +
          spec.getBackWood() + " back and sides,\n   " +
          spec.getTopWood() + " top.\nYou can have it for only $" +
          guitar.getPrice() + "!");
        }
      } 
    else 
    {
        System.out.println("Sorry, Erin, we have nothing for you.");
      }
    }
    
  
  /**
   * Initialize Inventory with list of guitars
   * @params Inventory Inventory object
   */

  private static void initializeInventory(Inventory inventory) 
  {
    inventory.addGuitar("11277", 3999.95, Builder.COLLINGS, "CJ", Type.ACOUSTIC,
                        Woodtype.INDIAN_ROSEWOOD, Woodtype.SITKA);
    inventory.addGuitar("11278", 3999.95, Builder.MARTIN, "CJ", Type.ELECTRIC,
            Woodtype.INDIAN_ROSEWOOD, Woodtype.ALDER);
    inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC,
                        Woodtype.ALDER, Woodtype.ALDER);
    inventory.addGuitar("V9512", 1549.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC,
    		Woodtype.ALDER, Woodtype.ALDER);
    inventory.addGuitar("122784", 5495.95, Builder.MARTIN, "D-18", Type.ACOUSTIC,
                        Woodtype.MAHOGANY, Woodtype.ADIRONDACK);
    inventory.addGuitar("76531", 6295.95, Builder.MARTIN, "OM-28", Type.ACOUSTIC,
    		Woodtype.BRAZILIAN_ROSEWOOD, Woodtype.ADIRONDACK);
    inventory.addGuitar("70108276", 2295.95, Builder.GIBSON, "Les Paul", Type.ELECTRIC,
    		Woodtype.MAHOGANY, Woodtype.MAPLE);
    inventory.addGuitar("82765501", 1890.95, Builder.GIBSON, "SG '61 Reissue",
    		Type.ELECTRIC, Woodtype.MAHOGANY, Woodtype.MAHOGANY);
    inventory.addGuitar("77023", 6275.95, Builder.MARTIN, "D-28", Type.ACOUSTIC,
    		Woodtype.BRAZILIAN_ROSEWOOD,  Woodtype.ADIRONDACK);
    inventory.addGuitar("1092", 12995.95, Builder.OLSON, "SJ", Type.ACOUSTIC,
    		Woodtype.INDIAN_ROSEWOOD, Woodtype.CEDAR);
    inventory.addGuitar("566-62", 8999.95, Builder.RYAN, "Cathedral", Type.ACOUSTIC,
                        Woodtype.COCOBOLO, Woodtype.CEDAR);
    inventory.addGuitar("629584", 2100.95, Builder.PRS, "Dave Navarro Signature",
    		Type.ELECTRIC, Woodtype.MAHOGANY, Woodtype.MAPLE);
  }
}
