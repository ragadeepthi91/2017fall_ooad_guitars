/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 2
Student 	: RagaDeepthi, Manaswitha & Radhika
Purpose 	: Custom user defined data type - Type
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
