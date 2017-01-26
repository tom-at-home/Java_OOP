package Datenkapselung;

public class Program {

	public static void main(String[] args) {
		Human winston = new Human("Winston", "Smith", 34, true);		
		Human frieda = new Human("Frieda", "Froehlich", 28, false);		
		Human ali = new Human("Ali", "Baba", 89, true);
		
		winston.marry(frieda);
		
		winston.show();
		frieda.show();
		ali.show();
		
		Human hugo = frieda.bearChild("Hugo", true);
		
		hugo.show();
		

		
		Human herbert = frieda.bearChild("Herbert", true);
		
		herbert.show();
		
		winston.divorce();
		
		frieda.marry(ali);
		
		//System.out.println(herbert.getMum().getFirstname());
		
		System.out.println(herbert.hasStepparents());
		
		System.out.println(false || true);
		
		winston.show();
		frieda.show();
		ali.show();		
		

	}

}
