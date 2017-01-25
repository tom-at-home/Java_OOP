package tag1;

public class App {

	public static void main(String[] args) {

		App village = new App();
		
		village.build();
		
	}
	
	public void build(){
		
		Huette h1 = new Huette();
		h1.color = "white";
		h1.name = "H1";
		h1.ringtone = "h1ring";

		Huette h2 = new Huette();
		h2.color = "yellow";
		h2.name = "H2";
		h2.ringtone = "h2ring";

		Huette h3 = new Huette();
		h3.color = "black";
		h3.name = "H3";
		h3.ringtone = "h3ring";

		Huette h4 = new Huette();
		h4.color = "red";
		h4.name = "H4";
		h4.ringtone = "h4ring";
		
		Huette h5 = new Huette();
		h5.color = "brown";
		h5.name = "H5";
		h5.ringtone = "h5ring";
		
		h1.leftNeighbor = null;		
		h1.rightNeighbor = h2;

		h2.leftNeighbor = h1;
		h2.rightNeighbor = h3;
		
		h3.leftNeighbor = h2;
		h3.rightNeighbor = h4;
		
		h4.leftNeighbor = h3;
		h4.rightNeighbor = h5;
		
		h5.leftNeighbor = h4;
		h5.rightNeighbor = null;
		
		//System.out.println(h2.rightNeighbor.rightNeighbor.ringtone);
		
		//h3.ring(h3.leftNeighbor);
		
		Human r1 = new Human();
		r1.firstname = "vorname_1";
		r1.lastname = "nachname_1";
		r1.age = 10;
		//r1.child = null;

		Human r11 = new Human();
		r11.firstname = "vorname_11";
		r11.lastname = "nachname_11";
		r11.age = 10;
		//r2.child = null;
		
		Human r12 = new Human();
		r12.firstname = "vorname_12";
		r12.lastname = "nachname_12";
		r12.age = 12;
		
		Human r111 = new Human();
		r111.firstname = "vorname_111";
		r111.lastname = "nachname_111";
		r111.age = 111;		
		
		Human r121 = new Human();
		r121.firstname = "vorname_121";
		r121.lastname = "nachname_121";
		r121.age = 121;
		//r3.child = null;
		
		Human r122 = new Human();
		r122.firstname = "vorname_122";
		r122.lastname = "nachname_122";
		r122.age = 122;	

		Human r1221 = new Human();
		r1221.firstname = "vorname_1221";
		r1221.lastname = "nachname_1221";
		r1221.age = 1221;
		
		Human r1222 = new Human();
		r1222.firstname = "vorname_1222";
		r1222.lastname = "nachname_1222";
		r1222.age = 1222;
		
		Human r12221 = new Human();
		r12221.firstname = "vorname_12221";
		r12221.lastname = "nachname_12221";
		r12221.age = 12221;			
		
		h1.residents.add(r1);
		h1.residents.add(r11);
		h3.residents.add(r12);
		
		r1.children.add(r11);
		r1.children.add(r12);
		r11.children.add(r111);
		r12.children.add(r121);
		r12.children.add(r122);
		r122.children.add(r1221);
		r122.children.add(r1222);
		r1222.children.add(r12221);
		
		r1.showAllChildren();
		System.out.println("-------------------------");
		r1.showAllGrandchildren();
		System.out.println("-------------------------");
		//r1222.showProgeny();
		// Neuer Aufruf
		r122.showFamilyTree();
		
	}
	
}
