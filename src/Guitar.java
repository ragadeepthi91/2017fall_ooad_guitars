/**
*
* Class: Object-Oriented Design and Analysis
* Professor: Orlando Montalvo
* Assignment: HW 1
* Student: Ragadeepthi
* 
* Holds all the guitar characteristics
* 
*/

public class Guitar {

  private String serialNumber, builder, model, type, backWood, topWood;
  private double price;

  /**
   * This constructor is used to hold the details of guitars
   * 
   * @param serialNumber
   * @param price
   * @param builder
   * @param model
   * @param type
   * @param backWood
   * @param topWood
   */
  public Guitar(String serialNumber, double price,
                String builder, String model, String type,
                String backWood, String topWood) {
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
   * @return String Guitar's serialNumber
   */
  public String getSerialNumber() {
    return serialNumber;
  }
  
  /**
   * 
   * @return double Guitar's price
   */
  public double getPrice() {
    return price;
  }
  
  /**
   * 
   * @param newPrice Guitar's price
   */
  public void setPrice(float newPrice) {
    this.price = newPrice;
  }
  
  /**
   * 
   * @return String Guitar's builder
   */
  public String getBuilder() {
    return builder;
  }
  
  /**
   * 
   * @return String Guitar's model
   */
  public String getModel() {
    return model;
  }
  
  /**
   * 
   * @return String Guitar's type
   */
  public String getType() {
    return type;
  }
  
  /**
   * 
   * @return String Guitar's backwood
   */
  public String getBackWood() {
    return backWood;
  }
  
  /**
   * 
   * @return String Guitar's topwood
   */
  public String getTopWood() {
    return topWood;
  }
}
