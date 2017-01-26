package Datenkapselung;

public class Program {

	public static void main(String[] args) {
		Human winston = new Human("Winston", "Smith", 34, true);		
		Human frieda = new Human("Frieda", "Froehlich", 28, false);
		Human boris = new Human("Boris", "Bosisovitsch", 39, true);
		Human ali = new Human("Ali", "Baba", 89, true);
		Human alina = new Human("Alina", "Mueller", 72, false);
		
		
		System.out.println("--------- 2 merry + 3 bearChild + 1 birthday -------------");
		System.out.println("Winston heiratet Frieda");
		winston.marry(frieda);
		System.out.println("Frieda bekommt ein Kind namens Hugo");
		Human hugo = frieda.bearChild("Hugo", true);
		System.out.println("Hugo feiert seinen 1. Geburtstag");
		hugo.celebrateBirthday();
		winston.show();
		frieda.show();
		hugo.show();

		System.out.println("--------- 4 divorce -------------");
		System.out.println("Winston trennt sich von Frieda");
		winston.divorce();
		winston.show();
		frieda.show();
		hugo.show();

		System.out.println("--------- 5.1 hasStepparents -------------");
		System.out.println("Hat Hugo Stiefeltern? > " + hugo.hasStepparents());
		frieda.marry(ali);
		System.out.println("Frieda hat Ali geheiratet");
		System.out.println("Hat Hugo Stiefeltern? > " + hugo.hasStepparents());		
		winston.show();
		frieda.show();
		ali.show();		
		hugo.show();		
		
		System.out.println("--------- 5.2 hasStepbrotherOrStepsister -------------");	
		System.out.println("Frieda bekommt ein Kind names Sarah");
		Human sarah = frieda.bearChild("Sarah", false);
		System.out.println("Hat Hugo Stiefgeschwister? > " + hugo.hasStepbrotherOrStepsister());
		System.out.println("Frieda trennt sich von Ali");
		frieda.divorce();
		System.out.println("Ali heiratet Alina");
		ali.marry(alina);
		System.out.println("Alina bekommt ein Kind namens Sandra");
		Human sandra = alina.bearChild("Sandra", false);
		System.out.println("Ali trennt sich von Alina");
		ali.divorce();
		System.out.println("Hat Hugo Stiefgeschwister? > " + hugo.hasStepbrotherOrStepsister());
		System.out.println("Frieda heiratet wieder mit Ali");
		frieda.marry(ali);
		System.out.println("Hat Hugo Stiefgeschwister? > " + hugo.hasStepbrotherOrStepsister());
		winston.show();
		frieda.show();
		ali.show();		
		hugo.show();
		sarah.show();
		System.out.println("Hugos leiblicher Vater ist > " + hugo.getDad().getFirstname());	
		System.out.println("Der Partner von Hugos leiblicher Mutter ist > " + hugo.getMum().getRelative().getFirstname());			
	}

}
