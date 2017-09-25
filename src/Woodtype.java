/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 2
Student 	: RagaDeepthi, Manaswitha & Radhika
Purpose 	: Custom user defined data type - Woodtype
*/


/**
 * 
 * Woodtype enum is created to define the listed Woodtypes of Guitar as user defined data types to avoid typing mistakes
 *
 */
public enum Woodtype 
{

		  INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO,
		  CEDAR, ADIRONDACK, ALDER, SITKA;
	
	public String toString() 
	{
			  switch(this)
			  {
			  case INDIAN_ROSEWOOD: return "Indian Rosewood";
			  case BRAZILIAN_ROSEWOOD: return "Brazilian Rosewood";
			  case MAHOGANY: return "Mahogany";
			  case MAPLE: return "maple";
			  case COCOBOLO: return "cocobolo";
			  case CEDAR: return "cedar";
			  case ADIRONDACK: return "Adirondack";
			  case ALDER: return "Alder";
			  case SITKA: return "Sitka";
			  default: throw new IllegalArgumentException();
			  }			  
		  }
}
