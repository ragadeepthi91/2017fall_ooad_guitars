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

  public void addGuitar(String serialNumber, double price,
                        Builder builder, String model,
                        Type type, Woodtype backWood, Woodtype topWood) 
  {
    Guitar guitar = new Guitar(serialNumber, price, builder,
                               model, type, backWood, topWood);
    guitars.add(guitar);
  }
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
 public List<Guitar> search(GuitarSpec searchGuitar) {
	  List<Guitar> MatchedGuitars = new LinkedList<Guitar>();
    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      GuitarSpec guitarspec = guitar.getSpec();
      GuitarSpec g = new GuitarSpec();
      if(g.Match(searchGuitar, guitarspec))
      {
    	  MatchedGuitars.add(guitar);
      }
      // Ignore serial number since that's unique
      // Ignore price since that's unique
      //boolean flag = guitarspec.matches(guitarspec,searchGuitar);
     // if(flag)
     /*if ((searchGuitar.getBuilder() != null ) && (searchGuitar.getBuilder() != guitarspec.getBuilder()))
        continue;
      String model = searchGuitar.getModel().toLowerCase();
      if ((model != null) && (!model.equals("")) &&
          (!model.equals(guitarspec.getModel().toLowerCase())))
        continue;
      if ((searchGuitar.getType() != null ) && (searchGuitar.getType() != guitarspec.getType()))
        continue;
      if ((searchGuitar.getBackWood() != null ) && (searchGuitar.getBackWood() != guitarspec.getBackWood()))
        continue;
      if ((searchGuitar.getTopWood() != null ) && (searchGuitar.getTopWood() != guitarspec.getTopWood()))
          continue;
      MatchedGuitars.add(guitar); */
    }
    return MatchedGuitars;
  }
}
