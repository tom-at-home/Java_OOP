package tag1;

import java.util.ArrayList;

public class Huette {
	
	public String color;
	public String name;
	public String ringtone;
	public Huette leftNeighbor;
	public Huette rightNeighbor;
	public ArrayList<Human> residents = new ArrayList<>();
	
	public void ring(Huette huette){
		
		if(huette != null)
			System.out.println(huette.ringtone);
		else
			System.out.println("Diese Hütte ist nicht vorhanden");
		
	}
	
	public void printResidents(){
		
		for (int i = 0; i < this.residents.size(); i++) {
			System.out.println(this.residents.get(i).firstname);
		}
		
	}
	
	public void printAttributes(){
		
		System.out.println("Diese Huette mit den Namen " + this.name + " hat die folgenden Bewohner: ");
		this.printResidents();
		
	}
	
	public void showAll() {
		this.printAttributes();
		
		Huette actual_cottage = this.leftNeighbor;
		
		while(actual_cottage != null) {
			actual_cottage.printAttributes();
			actual_cottage = actual_cottage.leftNeighbor;
		}
		
		actual_cottage = this.rightNeighbor;
		while(actual_cottage != null) {
			actual_cottage.printAttributes();
			actual_cottage = actual_cottage.rightNeighbor;
		}
	}
	
	public void showRange(int n) {
		this.printAttributes();
		
		Huette actual_cottage = this.leftNeighbor;
		int i=0;
		
		while(actual_cottage != null && i<n) {
			actual_cottage.printAttributes();
			actual_cottage = actual_cottage.leftNeighbor;
			i++;
		}
		
		actual_cottage = this.rightNeighbor;
		i=0;
		while(actual_cottage != null && i<n) {
			actual_cottage.printAttributes();
			actual_cottage = actual_cottage.rightNeighbor;
			i++;
		}
	}	
	
}
