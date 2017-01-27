package Vererbung;

public class Animal {
	/* Attribute eines Tieres */
	private String name;
	protected int numberOfLegs;
	private String color;
	private String race;
	
	public Animal(String name, String color, String race) {
		this.name = name;		
		this.color = color;
		this.race = race;
	}	
	
	/* Getter */
	public String getName() {
		return this.name;
	}
	
	public int getNumberOfLegs() {
		return this.numberOfLegs;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getRace() {
		return this.race;
	}
}
