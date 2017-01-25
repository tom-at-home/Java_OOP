package Liste;

public class App {

	public static void main(String[] args) {

		IntList intList = new IntList();
		intList.add(5);
		intList.add(8);
		intList.add(-5);
		intList.add(10);


		//System.out.println(intList.get(1));
		//System.out.println(intList.size());
		
		
		// AUFGABE A1
		System.out.println("-------- AUFGABE A1 - HEAD und TAIL -------");		
		System.out.println("Erster Wert der Liste (HEAD): " + intList.head());
		System.out.println("Letzter Wert der Liste (TAIL): " + intList.tail());
		
		// AUFGABE A2
		System.out.println("-------- AUFGABE A2 - addFirst --------");
		System.out.println("LIST SIZE BEFORE: " + intList.size());
		intList.addFirst(777);
		System.out.println("LIST SIZE AFTER: " + intList.size());
		
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(i + ". Element der IntList: " + intList.get(i));
		}
		
		System.out.println("Wert vom letzten, leeren Element: " + intList.get(intList.size()));
		
		// AUFGABE A3
		System.out.println("-------- AUFGABE A3 - delete --------");
		System.out.println("LIST SIZE BEFORE: " + intList.size());
		intList.delete(0);
		System.out.println("LIST SIZE AFTER: " + intList.size());
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(i + ". Element der IntList: " + intList.get(i));
		}
		
		// AUFGABE A4
		System.out.println("-------- AUFGABE A4 - contains --------");
		System.out.println("Ist die 777 ist in der Liste enthalten? > " + intList.contains(777));
		System.out.println("Ist die 5 ist in der Liste enthalten? > " + intList.contains(5));
		System.out.println("Ist die 8 ist in der Liste enthalten? > " + intList.contains(8));
		System.out.println("Ist die -5 ist in der Liste enthalten? > " + intList.contains(-5));
		System.out.println("Ist die 10 ist in der Liste enthalten? > " + intList.contains(10));
		System.out.println("Ist die 100 ist in der Liste enthalten? > " + intList.contains(100));
		System.out.println("Ist die 0 ist in der Liste enthalten? > " + intList.contains(0));
		
	}

}
