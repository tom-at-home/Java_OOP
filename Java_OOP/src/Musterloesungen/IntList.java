package Musterloesungen;

public class IntList {
	public int value;
	public IntList next;
	
	public void add(int value) {
		if(this.next == null) {
			this.value = value;
			this.next = new IntList();
		} else {
			this.next.add(value);
		}
	}
	
	public int head() {
		return this.value;
	}
	
	public int tail() {
		if(this.next.next != null) {
			return this.next.tail();
		} else {
			return this.value;
		}
		
		//return this.get(size()-1);
		/*IntList temp = this;
		for(int i=0; i<this.size(); i++) {
			temp = temp.next;
			if(temp.next.next == null) {
				return temp.value;
			}
		}*/
		
	}
	
	public void addFirst(int value) {
		IntList newElement = new IntList();		
		newElement.value = this.value;
		newElement.next = this.next;
		this.next = newElement;
		this.value = value;
	}
	
	public void delete(int index) {
		if(index == 0) {
			this.value = this.next.value;
			this.next = this.next.next;
		} else {
			this.next.delete(index - 1);
		}
	}
	
	public boolean contains(int value) {
		/* wenn es keinen Nachfolger mehr gibt, dann 
		 * wurde der Wert nicht gefunden; es wird
		 * false zurueckgegeben. */
		if(this.next == null) {
			return false;
		}
		/* Wenn der aktuelle Wert dem gesuchten entspricht,
		 * dann gibt true zurueck.
		 */
		if(this.value == value) {
			return true;		
		} else {		
		/* Ansonsten schau im naechsten Element nach */
			return this.next.contains(value);
		}
	}
	
	public int get(int index) {
		if(this.next == null) {
			// darf nichts zurueck gegeben werden.
			// TODO: Exception erstellen.
		}
		
		if(index == 0) {
			return this.value;
		} else {
			return this.next.get(index - 1);
		}
	}
	
	public int size() {
		if(this.next == null) {
			return 0;
		} else {
			return this.next.size() + 1;
		}
	}	
}
