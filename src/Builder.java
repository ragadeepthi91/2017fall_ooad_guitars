/**
Class		: Object-Oriented Design and Analysis
Professor	: Orlando Montalvo
Assignment	: HW 2
Student 	: RagaDeepthi, Manaswitha & Radhika
Purpose 	: Custom user defined data type - Builder
*/
public enum Builder
{
	FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYAN, PRS;
	  public String toString() {
		  switch(this) {
		  case FENDER: return "Fender";
		  case MARTIN: return "Martin";
		  case GIBSON: return "Gibson";
		  case COLLINGS: return "Collings";
		  case OLSON: return "Olson";
		  case RYAN: return "Ryan";
		  case PRS: return "PRS";
		  default: throw new IllegalArgumentException();
		  }
	  }
}
