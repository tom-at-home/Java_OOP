package tag1;

import java.util.ArrayList;

public class Human {
	public String firstname;
	public String lastname;
	public int age;
	public ArrayList<Human> children = new ArrayList<>();
	
	public void swim() {		
		System.out.println(this.firstname + " is asd.");
	}
	
	public void celebrate_birthday() {
		System.out.println(this.firstname + " has birthday..");
		this.age++;
	}
	
	public void showAllChildren(){
		
		for ( Human human : this.children) {
			System.out.println(this.firstname + " hat die folgenden Kinder: "
					+ human.firstname + " " + human.lastname + " (" + human.age + ")");
		}
		
	}
	
	public void showAllGrandchildren(){
		
		for (int kind = 0; kind < this.children.size(); kind++) {
			//this.children.get(i).showAllChildren();
			
			for ( int enkel = 0; enkel < this.children.get(kind).children.size(); enkel++ ) {
				System.out.println(this.firstname + " hat die folgenden Enkelkinder: "
						+ this.children.get(kind).children.get(enkel).firstname + " " + this.children.get(kind).children.get(enkel).lastname + " (" + this.children.get(kind).children.get(enkel).age + ")");
			}
			
		}
	}
	
	public void showProgeny(){

		Human current_progeny = this;
		System.out.println(this.firstname);

		if(this.children.size() > 0){

			for(int i = 0; i < this.children.size(); i++){

				current_progeny = this.children.get(i);
				current_progeny.showProgeny();

			}

		}

	}
		
	public void showProgenyShort(){
			
		System.out.println(this.firstname);
		
		if(this.children.size() > 0){
			
			for(int i = 0; i < this.children.size(); i++){

				this.children.get(i).showProgenyShort();
					
			}	
	
		}
		
	}
	
	public void showFamilyTree() {
		
		for (Human child : children) {
			System.out.println(child.firstname);
			child.showFamilyTree();
		}
		
	}
	
}
