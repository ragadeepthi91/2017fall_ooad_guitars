/**
*
* Class: Object-Oriented Design and Analysis
* Professor: Orlando Montalvo
* Assignment: HW 1
* Student: Ragadeepthi
* 
* Implements methods to add and search guitars matching with given specifications
* 
*/

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
  private List<Guitar> guitars;
  
//constructor to intitialise guitars
  public Inventory() {
    guitars = new LinkedList();
  }
  
  /**
   * Adds a new guitar to the inventory
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
      // Ignore serial number since that's unique
      // Ignore price since that's unique
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
}
