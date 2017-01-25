package Liste;

public class IntList {
	
	public int value;
	public IntList next;
	
	public void add(int value){
		
		if(this.next == null){
			this.value = value;
			this.next = new IntList();
		}
		else {
			this.next.add(value);
		}
		
	}
	
	public int get(int index) {
		
		if(this.next == null){
			// darf nichts zurueck gegeben werden.
			// TODO: Exception erstellen.
		}
		
		if(index == 0){
			return this.value;
		} else {
			return this.next.get(index - 1);
		}
				
	}
	
	public int size(){
		
		if(this.next == null){
			return 0;
		} else {
			return this.next.size() + 1;
		}
		
	}
	
	public int head() {
		
		return this.value;
		
	}
	
	public int tail(){
		
		// LÖSUNG MIT REKURSION
		if(this.next.next == null){
			return this.value;
		} else {
			return this.next.tail();
		}
		
		// EINFACHE LÖSUNG
		//return this.get(this.size()-1);
		
	}
	
	public void addFirst(int value){
		
		//System.out.println(this);
		//this.add(value);
		
		//IntList tempObj = new IntList();
		//tempObj.value = value;
		//tempObj.next = this;
		
		//this.add(value);
		
		// Temporaere Kopie
		//IntList tempObj = this;
		//this.next = tempObj;
		//this.value = value;
		
		//tempObj.value = value;
		//tempObj.next = ;
		

		//this.value = value;
		//this.next = tempObj;
		
		//this.value = value;
		//this.next = new IntList();
		
		if(this.next == null){
			this.value = this.next.value;
		} else {
			//return this.next.size() + 1;
		}
		
		//for (int i = 0; i < this.size(); i++) {
			
		//}
		
		
		
	}
	

	public void test (){
		
		System.out.println(this.next);
		
	}
	
	
	
}
