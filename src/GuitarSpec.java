import java.util.Iterator;
public class GuitarSpec
{
private String model;
private Builder builder; 
private Type type;
private Woodtype backWood, topWood;

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

 //match will be called in search method of inventory class to match these specs.
 /*
  * for(eachguitar in the inventory)
  * {
  * String model = searchguitar.getmodel();
  * String eachmodel = eachguitarfromforloop.getmodel();
  * similarly compare all other attributes
  * }
  * 
  * In search function
  * List<Guitar> glist = new ArrayList<Guitar>();
  * if(eacgguitar.match(searchguitar))
  * {
  *  glist.append(eachguitar);
  * }
  */
 
 public Boolean Match(GuitarSpec searchGuitar, GuitarSpec guitarspec)
 {
	 String model = searchGuitar.getModel().toLowerCase();
	 if ((searchGuitar.getBuilder() == null ) || (searchGuitar.getBuilder() == guitarspec.getBuilder()))
	  {if ((model == null) || (model.equals("")) ||
	          (model.equals(guitarspec.getModel().toLowerCase())))
	   {if ((searchGuitar.getType() == null ) || (searchGuitar.getType() == guitarspec.getType()))
	    {if ((searchGuitar.getBackWood() == null ) || (searchGuitar.getBackWood() == guitarspec.getBackWood()))
	     {if ((searchGuitar.getTopWood() == null ) || (searchGuitar.getTopWood() == guitarspec.getTopWood()))
	      return true;
	     }}}}
	 return false;
 }
  public Builder getBuilder() 
  {
    return builder;
  }
  public void setBuilder(Builder builder) 
  {
	    this.builder = builder;
  }
  public String getModel() 
  {
    return model;
  }
  public void setModel(String model) 
  {
	    this.model = model;
  }
  public Type getType() 
  {
    return type;
  }
  public void setType(Type type) 
  {
	    this.type = type;
  }
  public Woodtype getBackWood() 
  {
    return backWood;
  }
  public void setBackWood(Woodtype backWood) 
  {
	    this.backWood = backWood;
  }
  public Woodtype getTopWood() 
  {
    return topWood;
  }
  public void setTopWood(Woodtype topWood) 
  {
	    this.topWood = topWood;
  }
}
