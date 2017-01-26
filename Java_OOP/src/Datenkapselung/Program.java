package Datenkapselung;

public class Program {

	public static void main(String[] args) {
		Human winston = new Human("Winston", "Smith", 34, true);		
		Human frieda = new Human("Frieda", "Froehlich", 28, false);		
		Human ali = new Human("Ali", "Baba", 89, true);
		Human alina = new Human("Alina", "Mueller", 72, false);
		
		winston.marry(frieda);
		ali.marry(alina);
		
		Human karoline = alina.bearChild("Karoline", false);
		
		winston.show();
		frieda.show();
		ali.show();
		
		Human hugo = frieda.bearChild("Hugo", true);
		
		hugo.show();
		
		Human herbert = frieda.bearChild("Herbert", true);
		
		herbert.show();
		
		ali.divorce();
		winston.divorce();
		
		frieda.marry(ali);
		Human simone = frieda.bearChild("Simone", false);
		//frieda.divorce();
		
		//System.out.println(herbert.getMum().getFirstname());
		
		//System.out.println(herbert.hasStepparents());
		
		System.out.println("Hat Herbert Stiefgeschwister? > " + herbert.hasStepbrotherOrStepsister());
		
		winston.show();
		frieda.show();
		ali.show();		
		//karoline.show();

	}

}
