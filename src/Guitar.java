/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 2
Student 	: RagaDeepthi, Manaswitha & Radhika
Purpose 	: Implements the properties and functions of Guitar.
*/

/**
 * 
 * Holds guitar properties and methods to fetch or set values.
 */

public class Guitar {

  private String serialNumber;
  private double price;
  public GuitarSpec spec;
  
  /**
   * Default Constructor
   */

  
  public Guitar()
  {  
  }
  
  /**
   * Constructor with the following arguments
   * 
   * @param serialNumber Guitar Serial number
   * @param price Guitar price
   * @param builder Guitar Builder
   * @param model Guitar Model
   * @param type Guitar Type
   * @param backWood Guitar Backwood
   * @param topWood Guitar Topwood
   */


  public Guitar(String serialNumber, double price, Builder builder, String model, 
		  Type type, Woodtype backWood, Woodtype topWood) 
  {
    this.serialNumber = serialNumber;
    this.price = price;
    spec = new GuitarSpec(builder, model,type, backWood, topWood);
    this.spec = spec;
  }

  /**
   * @return String return Guitar serial number
  */
  
  public String getSerialNumber() {
    return serialNumber;
  }

  /**
   * @param serialnumber Set Guitar Serial number
  */
  
  public void setSerialNumber(String serialnumber) {
	    this.serialNumber = serialnumber;
	  }
  
  /**
   * @return double returns Guitar price
  */
  
  public double getPrice() {
    return price;
  }
  
 /**
  * 
  * @param newPrice Set Guitar price
  */
  
  public void setPrice(double newPrice) {
    this.price = newPrice;
  }
  
  /**
   * 
   * @return GuitarSpec returns GuitarSpec object of a guitar
   */
  
 public GuitarSpec getSpec()
 {
	 return spec;
 }
}

