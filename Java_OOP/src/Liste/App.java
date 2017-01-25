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
		System.out.println("-------- AUFGABE A1 --------");		
		System.out.println("Erster Wert der Liste (HEAD): " + intList.head());
		System.out.println("Letzter Wert der Liste (TAIL): " + intList.tail());
		
		// AUFGABE A2
		System.out.println("-------- AUFGABE A2 --------");
		System.out.println("SIZE BEFORE: " + intList.size());
		intList.addFirst(777);
		System.out.println("SIZE AFTER: " + intList.size());
		
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(i + ". Element der IntList: " + intList.get(i));
		}
		
		System.out.println("Wert vom letztem, leeren Element: " + intList.get(intList.size()));
		
		
	}

}
