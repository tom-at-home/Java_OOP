package Loesungen;

// DIMITRI

// verkettete Listen
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
	public int get(int index) {
		if(this.next == null) {
			// darf nicht zurueck gegeben werden
			// TODO: Exception erstellen
		}
		if(index == 0) {
			return this.value;
		} else {
			return this.next.get(index-1);
		}
	}
	
	public int size() {
		if(this.next == null) {
			return 0;
		} else {
			return this.next.size()+1;
		}
	}
	public int head() {
		return this.value;
	}
	
	public int tail() {
		if(this.next.next == null) {
			return this.value;
		} else {
			return this.next.tail();
		}
	}
	
	public void addFirst(int value) {
		if(this.next != null) {
			int zahl = this.value;
			this.value = value;
			this.next.addFirst(zahl);
		} else {
			this.next = new IntList();
			this.value = value;
		}
	}
	
	public void delete(int index) {
		if(this.next.next != null)
		{
			if(index > 0) {
				this.next.delete(index-1);
			} else if(index == 0) {
				this.value = this.next.value;
				this.next.delete(0);
			}
		} else this.next = null;
	}
	
	public boolean contains(int value) {
		if(this.value != value) {
			if(this.next == null) return false;
			if(this.next.contains(value)) return true;
			else return false;
		}
		return true;
	}
}
