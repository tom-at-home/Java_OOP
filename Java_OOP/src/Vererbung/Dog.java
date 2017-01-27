package Vererbung;

public class Dog extends Animal {
		
	public Dog(String name, String color, String race) {
		super(name, color, race);
		this.numberOfLegs = 4;
		
	}	
	/* Laesst den Hund knurren */
	public void growl() {
		System.out.println("Grrrrrrrrrrrrrrrrr");
	}

	
}
