
public class OefenenMetAlex {
	
	public static void main(String[] args) {
		System.out.println("Dit is voetbal");
		
		Voetbal v = new Voetbal();
		v.regels();
		System.out.println("Voetbal team heeft minimaal " + Voetbal.spelers + " spelers nodig");
		Speler s = new Speler();
		s.contract();
		
		
	}

}

class Voetbal {
	static int spelers = 11;
	String bs = "buitenspel";
	String sr = "scheidsrechter";
	int gr = 2;
	
	
	public void regels() {
		System.out.println(spelers + " spelers, " + bs + ", " + sr + ", " + gr + " grensrechters");
	}
	
}

class Clubs {
	
	
	
	
	
}	


class Speler extends Clubs{
	
	boolean accept = true;
	
	
	public void contract() {
		if (accept == true) {
			System.out.println("Speler is aangenomen");
		}
		
	}
	
}




