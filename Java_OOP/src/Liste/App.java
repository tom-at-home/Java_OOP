package Liste;

public class App {

	public static void main(String[] args) {

		IntList intList = new IntList();
		intList.add(5);
		intList.add(8);
		intList.add(-5);
		intList.add(10);
		
		System.out.println(intList.get(1));
		System.out.println(intList.size());
		
	}

}
