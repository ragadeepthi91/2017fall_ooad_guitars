/**
*
* Class: Object-Oriented Design and Analysis
* Professor: Orlando Montalvo
* Assignment: HW 1
* 
* Date: 09-26-2017
*/

/**
 * 
 * @author Deepthi's
 * @version 1.3
 * 
 * Holds all Guitar Characteristics
 *
 */

public class Guitar {

  /**
   * This constructor is used to hold the details of guitars
   * 
   * @param serialNumber Guitar Serial number
   * @param price Guitar Price
   * @param builder Guitar Builder
   * @param model Guitar model
   * @param type Guitar Type
   * @param backWood Guitar Backwood
   * @param topWood Guitar Topwood
   * 
   * @precondition serialNumber is not empty
   * @precondition price > 0
   * @precondition builder != null
   * @precondition model is not empty
   * @precondition type != null
   * @precondition topWood != null
   * @precondition backWood != null
   * 
   */
  public Guitar(String serialNumber, double price,
                String builder, String model, String type,
                String backWood, String topWood) 
  {
	  
	assert serialNumber != null && !serialNumber.isEmpty();
    assert price > 0.0;
    assert builder != null;
    assert model != null && !model.isEmpty();
	assert type != null;
	assert backWood != null;
	assert topWood != null;
		
    this.serialNumber = serialNumber;
    this.price = price;
    this.builder = builder;
    this.model = model;
    this.type = type;
    this.backWood = backWood;
    this.topWood = topWood;
  }
  
  /**
   * 
   * Gets Guitar SerialNumber
   */
  public String getSerialNumber() {
    return serialNumber;
  }
  
  /**
   * 
   * Gets Guitar Price
   */
  public double getPrice() {
    return price;
  }
  
  /**
   * 
   * @param newPrice Guitar price
   */
  public void setPrice(float newPrice) {
    this.price = newPrice;
  }
  
  /**
   * 
   * Gets Guitar Builder
   */
  public String getBuilder() {
    return builder;
  }
  
  /**
   * 
   * Gets Guitar Model
   */
  public String getModel() {
    return model;
  }
  
  /**
   * 
   * Gets Guitar Type
   */
  public String getType() {
    return type;
  }
  
  /**
   * 
   * Gets Guitar Backwood
   */
  public String getBackWood() {
    return backWood;
  }
  
  /**
   * 
   * Gets Guitar Topwood
   */
  public String getTopWood() {
    return topWood;
  }
  
  private String serialNumber, builder, model, type, backWood, topWood;
  private double price;
}
