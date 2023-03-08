
public class LetsGo {
	
	public static void main(String[] args) {
		System.out.println("Lets Go!");
		
		Kantoor k = new Kantoor();
		Werknemer w = new Werknemer();
		k.aannemen(w);
		k.eetschuur.openingsTijden();
		w.salaris = 1200;
		w.opscheppen();
		k.salarisVerhoging(w);
		w.opscheppen();
	}

}







class Kantoor {
	Kantine eetschuur = new Kantine();
	
	public void openGaan() {
		
	}
	
	public void huurBetalen(int huurKosten) {
		
	}
	
	public void aannemen(Werknemer persoon) {
		System.out.println("aannemen");
		
	}
	
	public void salarisVerhoging(Werknemer verhoging) {
		verhoging.salaris += 150;
	}
	
}

class Kantine{
	void openingsTijden() {
		System.out.println("Ik ben open van 6 tot 3");
	}
}

class Werknemer {
	
	int salaris;
	
	public void opscheppen() {
		System.out.println("Mijn salaris is: " + salaris);
		
	}
	
	
}
