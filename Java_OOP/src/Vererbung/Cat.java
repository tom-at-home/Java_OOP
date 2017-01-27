package Vererbung;

public class Cat extends Animal {
	
	private int numberOfWhiskas;
	
	public Cat(String name, String color, String race, int numberOfWhiskas) {
		super(name, color, race);		
		this.numberOfLegs = 4;
		this.numberOfWhiskas = numberOfWhiskas;
	}
	
	public int getNumberOfWhiskas() {
		return this.numberOfWhiskas;
	}
	
	/* Laesst die Katze schnurren */
	public void purr() {
		System.out.println("Brrrrrrrrrrrrr");
	}
}
