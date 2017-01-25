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
	
}
