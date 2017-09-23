/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 2
Student 	: RagaDeepthi, Manaswitha & Radhika
Purpose 	: Holds Guitar characteristics for searching and match method.
*/

import java.util.Iterator;
public class GuitarSpec
{
private String model;
private Builder builder; 
private Type type;
private Woodtype backWood, topWood;

/**
 * 
 * @param builder Guitar's Builder
 * @param model Guitar's Model
 * @param type Guitar's Type
 * @param backWood Guitar's BackWood
 * @param topWood Guitar's TopWood
 */

public GuitarSpec(Builder builder, String model, Type type,
              Woodtype backWood, Woodtype topWood)
{
	    this.builder = builder;
	    this.model = model;
	    this.type = type;
	    this.backWood = backWood;
	    this.topWood = topWood;
}

 public GuitarSpec() 
{
}
 
 /**
  * Matches each guitar with search guitar
  * @param guitarspec GuitarSpec Object for each guitar
  * @return Boolean returns true if a guitar matches with search guitar, false if not.
  */
 
 public Boolean Match(GuitarSpec guitarspec)
 {
	 String model1=""; 
	 //'this' refers to SearchGuitar and guitarspec refers to each guitar in inventory
	 if(this.getModel() != null && !this.getModel().equals(""))
	 {
		model1 = this.getModel().toLowerCase();    //model value is converted to string if it is not null or empty.
	 }
	 //compare all the specifications
	 if ((this.getBuilder() == null ) || (this.getBuilder() == guitarspec.getBuilder())) 
	  {if ((this.getModel() == null) || (this.getModel().equals("")) ||
	          (model1.equals(guitarspec.getModel().toLowerCase())))
	   {if ((this.getType() == null ) || (this.getType() == guitarspec.getType()))
	    {if ((this.getBackWood() == null ) || (this.getBackWood() == guitarspec.getBackWood()))
	     {if ((this.getTopWood() == null ) || (this.getTopWood() == guitarspec.getTopWood()))
	      return true;
	     }}}}
	 return false;
 }
 
 /**
  * 
  * @return Builder Guitar's builder
  */
 
  public Builder getBuilder() 
  {
    return builder;
  }
  
  /**
   * 
   * @param builder Guitar's builder
   */
  public void setBuilder(Builder builder) 
  {
	    this.builder = builder;
  }
  /**
   * 
   * @return String Guitar's model
   */
  public String getModel() 
  {
    return model;
  }
  /**
   * 
   * @param model Guitar's model
   */
  public void setModel(String model) 
  {
	    this.model = model;
  }
  /**
   * 
   * @return Type Guitar's type
   */
  public Type getType() 
  {
    return type;
  }
  /**
   * 
   * @param type Guitar's type
   */
  public void setType(Type type) 
  {
	    this.type = type;
  }
  /**
   * 
   * @return Woodtype Guitar's Back wood
   */
  public Woodtype getBackWood() 
  {
    return backWood;
  }
  /**
   * 
   * @param backWood Guitar's back wood
   */
  public void setBackWood(Woodtype backWood) 
  {
	    this.backWood = backWood;
  }
  /**
   * 
   * @return Woodtype Guitar's Top wood
   */
  public Woodtype getTopWood() 
  {
    return topWood;
  }
  /**
   * 
   * @param topWood Guitar's top wood
   */
  public void setTopWood(Woodtype topWood) 
  {
	    this.topWood = topWood;
  }
}
