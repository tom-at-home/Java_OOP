package Vererbung;

public class Program {

	public static void main(String[] args) {
		Cat schnurri = new Cat("Schnurri", "blue", "British Shorthair", 12);
		Cat einstein = new Cat("Einstein", "white", "Tricolore", 14);
		
		Dog wuffi = new Dog("Wuffi", "gold", "Golden Retriever");
		Dog karlo = new Dog("Karlo", "black", "Pitbull");

		Cock boxer = new Cock("Boxer", "colorful", "Ancona");
		
		Farm animalFarm = new Farm("Animal Farm");
		animalFarm.addAnimal(schnurri);
		animalFarm.addAnimal(einstein);
		animalFarm.addAnimal(wuffi);
		animalFarm.addAnimal(karlo);
		animalFarm.addAnimal(boxer);
		
		//animalFarm.showAllAnimals();
		//animalFarm.showAllAnimalsWithClasses();	
		animalFarm.showAllAnimalsAndLetCatsPurr();		
		
		
	}

}
