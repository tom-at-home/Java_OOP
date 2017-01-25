package Liste;

public class App {

	public static void main(String[] args) {

		IntList intList = new IntList();
		intList.add(5);
		intList.add(8);
		intList.add(-5);
		intList.add(10);

		System.out.println("SIZE BEFORE: " + intList.size());
		//System.out.println(intList.get(1));
		//System.out.println(intList.size());
		//System.out.println(intList.head());
		//System.out.println(intList.tail());
		intList.addFirst(15);
		
		System.out.println("SIZE AFTER: " + intList.size());
		
		System.out.println("ELEMENT: " + intList.get(0));
		
		
	}

}
