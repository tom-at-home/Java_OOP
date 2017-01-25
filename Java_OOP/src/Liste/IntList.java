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
		
		// LOESUNG MIT REKURSION
		if(this.next.next == null){
			return this.value;
		} else {
			return this.next.tail();
		}
		
		// EINFACHE LOESUNG
		//return this.get(this.size()-1);
		
	}
	
	public void addFirst(int value){
		
		if(this.next.next == null){
			this.next.value = this.value;
			this.next.next = new IntList();
		} else {
			this.next.addFirst(value);
			this.next.value = this.value;
			this.value = value;
		}

	}
	

	public void delete(int index){
		
		
		
	}
	
	public boolean contains(int value){
		
		// EINFACHE LOESUNG, NICHT REKURSIV
		for(int i = 0; i < this.size(); i++){
			if(this.get(i) == value)
				return true;
		}
		
		return false;
			
	}
	
}
