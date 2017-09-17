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
   * @return String 
   */
  public String getSerialNumber() {
    return serialNumber;
  }
  
  /**
   * 
   * @return double
   */
  public double getPrice() {
    return price;
  }
  
  /**
   * 
   * @param newPrice
   */
  public void setPrice(float newPrice) {
    this.price = newPrice;
  }
  
  /**
   * 
   * @return String
   */
  public String getBuilder() {
    return builder;
  }
  
  /**
   * 
   * @return String
   */
  public String getModel() {
    return model;
  }
  
  /**
   * 
   * @return String
   */
  public String getType() {
    return type;
  }
  
  /**
   * 
   * @return String
   */
  public String getBackWood() {
    return backWood;
  }
  
  /**
   * 
   * @return String
   */
  public String getTopWood() {
    return topWood;
  }
}
