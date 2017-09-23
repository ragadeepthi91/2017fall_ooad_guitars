/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 2
Student 	: RagaDeepthi, Manaswitha & Radhika
Purpose 	: Holds all guitars and implements methods to add, get and search guitar.
*/

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory 
{
  public List guitars;
  public Inventory() 
  {
    guitars = new LinkedList();
  }

  /**
   * Adds a new Guitar to the inventory
   * 
   * @param serialNumber
   * @param price
   * @param builder
   * @param model
   * @param type
   * @param backWood
   * @param topWood
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
  * Search and returns guitars with given price
  * @param priceSpecification Guitar's price
  * @return List returns list of matching guitars, null if not found
  */

public List<Guitar> Searchwithprice(Guitar priceSpecification) 
{
	  List<Guitar> PriceMatchGuitars = new LinkedList<Guitar>();
  for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) 
  {
    Guitar guitar = (Guitar)i.next();
    int Result = Double.compare(priceSpecification.getPrice(),guitar.getPrice()); //variables of type double are compared with Double.compare
    if (Result == 0)              // Double.compare returns 0 if the values are equal
    {
    	PriceMatchGuitars.add(guitar);    //Adds guitars matching with given price 
    }
  }
  return PriceMatchGuitars;
}
}
