package Vererbung;

import java.util.ArrayList;

public class Farm {
	private String name;
	
	private ArrayList<Animal> animals = new ArrayList<>();
	
	public Farm(String name) {
		this.name = name;
	}
	
	/* Fuegt ein Tier der Farm hinzu */
	public void addAnimal(Animal animal) {
		this.animals.add(animal);
	}
	
	/* Zeigt alle Tiere der Farm an */
	public void showAllAnimals() {
		for (Animal animal : this.animals) {
			System.out.println("Name: " + animal.getName() + 
					"\t#Legs: " + animal.getNumberOfLegs() + 
					"\tRace: " + animal.getRace());			
		}
	}
	
	/* Zeige alle Tiere mit ihrer Java-Klasse an */
	public void showAllAnimalsWithClasses() {
		for (Animal animal : this.animals) {
			System.out.println("Name: " + animal.getName() + 
					"\t#Legs: " + animal.getNumberOfLegs() + 
					"\tRace: " + animal.getRace() + 
					"\tClass: " + animal.getClass());			
		}
	}
	
	/* Zeige alle Tiere an und lasse die Katzen schnurren */
	public void showAllAnimalsAndLetCatsPurr() {
		for (Animal animal : this.animals) {
			System.out.println("Name: " + animal.getName() + 
					"\t#Legs: " + animal.getNumberOfLegs() + 
					"\tRace: " + animal.getRace());					
			//if(animal.getClass() == new Cat("","","",0).getClass()) {
			if(animal instanceof Cat) {				
				((Cat)animal).purr();
			}
		}
	}
}
