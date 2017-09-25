/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 2
Student 	: RagaDeepthi, Manaswitha & Radhika
Purpose 	: Custom user defined data type - Type
*/


/**
 * 
 * Type enum is created to define the listed types of Guitar as user defined data types to avoid typing mistakes
 *
 */

public enum Type
  {
	  ELECTRIC,
	  ACOUSTIC;
	  
	  public String toString() {
		  switch(this) {
		  case ACOUSTIC: return "acoustic";
		  case ELECTRIC: return "electric";
		  default: throw new IllegalArgumentException();
		  }
	  }
  }
