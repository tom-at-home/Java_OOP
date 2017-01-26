package Datenkapselung;

import java.util.ArrayList;

public class Human {
	/* Attribute eines Menschen */
	private String firstname;
	private String lastname;
	private boolean isMale;
	private int age;

	/* Partner des Menschen */
	private Human relative;
	
	/* Beziehungen des Menschen zu anderen Menschen */
	private ArrayList<Human> children = new ArrayList<>();
	private Human mum;
	private Human dad;
	
	
	/* Konstruktor der Klasse */
	public Human(String firstname, String lastname, int age, boolean isMale) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;		
		this.isMale = isMale;
	}
	
	public Human bearChild(String firstname, boolean isMale){
		
		if(!this.isMale && this.relative != null){
			Human child = new Human(firstname, this.lastname, 0, isMale);
			child.mum = this;
			child.dad = this.relative;
			this.children.add(child);
			this.relative.children.add(child);
			return child;
		}
		else{
			System.out.println("Diese Geburt ist so nicht moeglich!");
			return null;			
		}
		
	}
	
	public Human getRelative() {
		return this.relative;
	}	
	
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/* Gibt das Geschlecht des Menschen zurueck */
	public boolean getIsMale() {
		return this.isMale;
	}
	
	/* Gib mir das Alter des Menschen zurueck */
	public int getAge() {
		return this.age;
	}
	
	public Human getMum() {
		return this.mum;
	}

	public Human getDad() {
		return this.dad;
	}

	/* Setze das Alter des Menschen */
	public void celebrateBirthday(int age) {
		if(age > this.age) {
			this.age = age;
		}
	}
	
	/* Diese Methode laesst diesen Menschen mit einem anderen 
	 * verheiraten. Dabei uebernimmt diese dessen Nachnamen.
	 */
	public void marry(Human relative) {
		/* Die Heirat darf nur stattfinden, wenn beide Menschen
		 * erwachsen sind und noch nicht verheiratet sind.
		 */
		if(this.age > 17
				&& relative.age > 17 
				&& this.relative == null
				&& relative.relative == null
				&& this.isMale != relative.isMale) {
			/* Setze die Partner gegenseitig */
			this.relative = relative;
			relative.relative = this;
			/* Ersetze den eigenen Nachnamen 
			 * mit dem Nachnamen des Partners */
			this.lastname = relative.lastname;
		}
	}
	
	public void divorce(){
		
		if(this.relative != null){
			this.relative.relative = null;
			this.relative = null;
		}
		
	}
	
	public boolean hasStepparents(){
		
		return ((this.mum.relative != this.dad) && (this.mum.relative != null))
				|| ((this.dad.relative != this.mum) && (this.dad.relative != null));

	}
	
	public boolean hasStepbrotherOrStepsister(){
		
		if(this.hasStepparents()){

			if(this.mum.relative != this.dad){
				System.out.println("Stiefvater hat Kinder: " + this.mum.relative.children.size());
				for(int i = 0; i < this.mum.relative.children.size(); i++){

					if(this.mum.relative.children.get(i).mum != this.mum){
						return true;
					}
				}
			}

			else{
				if(this.dad.relative != this.mum){
					for(int i = 0; i < this.dad.relative.children.size(); i++){
						if(this.dad.relative.children.get(i).dad != this.dad){
							return true;
						}
					}
				}
			}
			
		}	
		
		return false;
		
	}
	
	public void show() {
		if(this.relative != null) {
			System.out.println(this.firstname + " " + this.lastname + " ( " + this.age + " ) " 
					+ "has the relative " + this.relative.firstname 
					+ " " + this.relative.lastname);
		} else {
			System.out.println(this.firstname + " " + this.lastname + " ( " + this.age + " ) "
					+ " has no relative");
		}
	}
}
