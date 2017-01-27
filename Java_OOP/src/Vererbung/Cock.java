package Vererbung;

public class Cock extends Animal {	
	
	public Cock(String name, String color, String race) {
		super(name, color, race);
		this.numberOfLegs = 2;
		
	}	
	
	/* Laesst den Hahn kraehen */
	public void crow() {
		System.out.println("Kikerikie");
	}
}
