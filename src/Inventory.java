/**
*
* Class: Object-Oriented Design and Analysis
* Professor: Orlando Montalvo
* Assignment: HW 1
* 
* Date: 09-26-2017
*/

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Deepthi's
 * @version 1.3
 * 
 * Implements methods to add and search guitars matching the given specifications 
 */ 


public class Inventory {
  
/**
 * Constructor to initialize guitars
 */
  public Inventory() 
  {
    guitars = new LinkedList();
  }
  
  /**
   * Adds a new guitar to the inventory
   * 
   * @param serialNumber Guitar Serial number
   * @param price Guitar Price
   * @param builder Guitar Builder
   * @param model Guitar model
   * @param type Guitar Type
   * @param backWood Guitar Backwood
   * @param topWood Guitar Topwood
   */

  public void addGuitar(String serialNumber, double price,
                        String builder, String model,
                        String type, String backWood, String topWood) {
    Guitar guitar = new Guitar(serialNumber, price, builder,
                               model, type, backWood, topWood);
    guitars.add(guitar);
  }
  
  /**
   * Searches inventory and returns guitar matching with given serial number.
   * 
   * @param serialNumber This is the single parameter to getGuitar method
   * @return Guitar guitar that matches serial number, null if not found.
   */
  public Guitar getGuitar(String serialNumber) {
    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }
  
  /**
   * 
   * Finds and returns the guitar that matches given guitar(searchGuitar)
   * 
   * @param searchGuitar guitar with given specifications
   * @return Guitar guitar that matches given guitar, null if not found.
   */
  
  public Guitar search(Guitar searchGuitar) {
    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      // Ignore price and serial number since they are unique
      
      String builder = searchGuitar.getBuilder();
      if ((builder != null) && (!builder.equals("")) &&
          (!builder.equals(guitar.getBuilder())))
        continue;
      String model = searchGuitar.getModel();
      if ((model != null) && (!model.equals("")) &&
          (!model.equals(guitar.getModel())))
        continue;
      String type = searchGuitar.getType();
      if ((type != null) && (!searchGuitar.equals("")) &&
          (!type.equals(guitar.getType())))
        continue;
      String backWood = searchGuitar.getBackWood();
      if ((backWood != null) && (!backWood.equals("")) &&
          (!backWood.equals(guitar.getBackWood())))
        continue;
      String topWood = searchGuitar.getTopWood();
      if ((topWood != null) && (!topWood.equals("")) &&
          (!topWood.equals(guitar.getTopWood())))
        continue;
      return guitar;
    }
    return null;
  }
  
  private List<Guitar> guitars;
}
