/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 2
Student 	: RagaDeepthi, Manaswitha & Radhika
Purpose 	: Holds all guitars and implements methods to add, get and search guitar by specifications or price range.
*/

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * Holds all the available guitars and methods to add, get and search guitars
 *
 */

public class Inventory 
{
  List guitars;
  
  /**
   * Class constructor 
   */
  public Inventory() 
  {
    guitars = new LinkedList();
  }

  /**
   * Adds a new Guitar to the inventory
   * 
   * @param serialNumber Guitar Serial number
   * @param price Guitar price
   * @param builder Guitar Builder
   * @param model Guitar Model
   * @param type Guitar Type
   * @param backWood Guitar Backwood
   * @param topWood Guitar Topwood
   */
  
  public void addGuitar(String serialNumber, double price,
                        Builder builder, String model,
                        Type type, Woodtype backWood, Woodtype topWood) 
  {
    Guitar guitar = new Guitar(serialNumber, price, builder,
                               model, type, backWood, topWood);
    guitars.add(guitar);
  }
  
  /**
   * Finds and returns guitar with specified serial number
   * @param serialNumber Guitar's serial number
   * @return Guitar returns guitar that matches given serial number, null if not found
   */
  
  public Guitar getGuitar(String serialNumber) 
  {
    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }
  
  /**
   * Search and returns guitar/guitars that matches given spec
   * @param searchGuitar GuitarSpec object with search values
   * @return List returns list of matching guitars, null if not found
   */
  
  
 public List<Guitar> search(GuitarSpec searchGuitar) 
 {
	  List<Guitar> MatchedGuitars = new LinkedList<Guitar>();
    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) 
    {
      Guitar guitar = (Guitar)i.next();
      GuitarSpec guitarspec = guitar.getSpec();
 
      if(searchGuitar.Match(guitarspec)) //passing guitarspec object created for every guitar in the list
      {
    	  MatchedGuitars.add(guitar);   //If matched, guitar is added to the list
      }
    }
    return MatchedGuitars;
  }


 
 /**
  * Search and returns guitars in the given price range
  * 
  * @param minPrice Minimum price in the price range given for search
  * @param maxPrice Maximum price in the price range given for search
  * @return List returns list of matching guitars, null if not found
  */
 
 public List<Guitar> searchwithpricerange(double minPrice, double maxPrice)
 {
 	 List<Guitar> PriceRangeGuitars = new LinkedList<Guitar>();
 	 for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
 		 double range1 = minPrice;	
 		 double range2 = maxPrice;
 		 Guitar guitar = (Guitar)i.next();
 		 int Result1 = Double.compare(range1, guitar.getPrice());
 		 int Result2 = Double.compare(range2, guitar.getPrice());
 		  if((Result1<=0)&&(Result2>=0)) 
 		  {
 		 PriceRangeGuitars.add(guitar);
 		 }
 		 
 	 }
 	
 	return PriceRangeGuitars;
 }

}
