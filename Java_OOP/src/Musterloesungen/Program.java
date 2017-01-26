package Musterloesungen;

public class Program {

	public static void main(String[] args) {
		IntList intList = new IntList();
		intList.add(5);
		intList.add(8);
		intList.add(-5);
		
		intList.addFirst(12);
		
		intList.delete(2);
		
		//System.out.println(intList.get(2));
		//System.out.println(intList.size());
		
		for (int i = 0; i < intList.size(); i++) {
			System.out.println(i + ": " + intList.get(i));
		}
		
		System.out.println(intList.contains(8));
		System.out.println(intList.contains(-5));
	}

}
