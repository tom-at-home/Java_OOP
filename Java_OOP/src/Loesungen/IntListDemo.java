package Loesungen;

// DIMITRI

//verkettete Listen
public class IntListDemo {

	public static void main(String[] args) {
		IntList intList = new IntList();
		intList.add(5);
		intList.add(8);
		intList.add(-5);
		intList.add(13);
		intList.add(4);
		intList.add(-3);
		intList.add(2);
		
		System.out.println("Element an der 2. Stelle: " + intList.get(2));
		System.out.println("Die Liste ist " + intList.size() + " Elemente lang");
		
		System.out.println("\nListe: ");
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(i + ": " + intList.get(i));
		}
		System.out.println();
		System.out.println("The head of intList: " + intList.head());
		System.out.println("The tail of intList: " + intList.tail());
		System.out.println();
		
		System.out.println("Element an die erste Stelle hinzufuegen:");
		intList.addFirst(15);
		
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(i + ": " + intList.get(i));
		}
		
		System.out.println("\nLoeschen eines Elements an der Stelle 1:");
		intList.delete(1);
		
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(i + ": " + intList.get(i));
		}
		
		System.out.println("\nLoeschen eines Elements an der Stelle 3:");
		intList.delete(3);
		
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(i + ": " + intList.get(i));
		}
		
		System.out.println("\nWert 4 ist in der Liste enthalten: " + intList.contains(4));
		System.out.println("Wert 10 ist in der Liste enthalten: " + intList.contains(10));
		
	}
}
