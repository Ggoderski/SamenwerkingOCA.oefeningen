package OefenenMetFelix;

public class OverErving {

	public static void main(String[] args) {
		System.out.println("Hiep hiep hoera over erving");
		
		AttractiePark pokemonland = new AttractiePark();
		
		Bezoeker eersteBezoeker = new MinderJarig("Henk");
		((MinderJarig)eersteBezoeker).minLengte = false;
		pokemonland.bezoekerIndelen(0, eersteBezoeker);
		
		Bezoeker tweedeBezoeker = new ExGedetineerde("Joost");
		((ExGedetineerde)tweedeBezoeker).vluchtGevaarlijk = true;
		pokemonland.bezoekerIndelen(6, tweedeBezoeker);
		
		pokemonland.alleBezoekers();
	}
}

class AttractiePark {
	
	///int[] vrijePlekken = new int[10];
	//String[] namen = new String[10];
	Bezoeker[] bezoekers = new Bezoeker[10];
	
	public void bezoekerIndelen(int plek, Bezoeker b) {
		bezoekers[plek] = b;
//		namen[plek] = naam;
	}
	
	public void alleBezoekers() {
		for (int i = 0; i < bezoekers.length; i++) {
			if (bezoekers[i] == null) {
				System.out.println("Plek " + (i+1) + " is nog beschikbaar");
			} else {
				System.out.println("Plek " + (i+1) + " is BEZET door: " + bezoekers[i].naam);
				bezoekers[i].plezierHebben();
				
				if (bezoekers[i] instanceof ExGedetineerde && ((ExGedetineerde)bezoekers[i]).vluchtGevaarlijk) {
					System.out.println("Beveiliging is geinformeerd over vluchtgevaarlijke gedetineerde " + bezoekers[i].naam);
				}
				if (bezoekers[i] instanceof MinderJarig && ((MinderJarig)bezoekers[i]).minLengte) {
					System.out.println(bezoekers[i].naam + " krijgt een pas omdat hij/zij is lang genoeg om alle achtbanen in te gaan");
				}else {
					System.out.println(bezoekers[i].naam + " mag niet de achtbanen in");
				}
				}
			}
		}
	}
	


class Bezoeker {
	
	String naam;
	
	
	public void plezierHebben() {
		System.out.println("Ik ben een bezoeker die plezier heeft");
	}
	
}

class MinderJarig extends Bezoeker{
	
	// Als lengte minder is dan 1,30 mag de persoon niet een achtbaan in
	boolean minLengte;
	
	public MinderJarig(String voornaam) {
		this.naam = voornaam;
	}
	
	public void plezierHebben() {
		System.out.println("Ik ben een minderjarige die aan het gillen is");
	}
}

class MeerJarige extends Bezoeker{
	
	public MeerJarige(String voornaam) {
		this.naam = voornaam;
	}
	
	public void plezierHebben() {
		System.out.println("Ik ben een meer jarige die aan het bier drinken is");
	}
	
}

class ExGedetineerde extends Bezoeker{
	
	boolean vluchtGevaarlijk;
	
	public ExGedetineerde(String voornaam) {
		this.naam = voornaam;
	}
	
	public void plezierHebben() {
		System.out.println("Ik ben een ExGedetineerde die braaf probeert te zijn");
		
		
	}
	
}
