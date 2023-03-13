package AlexOefenen;

public class OefenenMetVero {
	public static void main(String[] args) {
		
		TandartsPraktijk a = new TandartsPraktijk();
		Tandarts b = new Tandarts();
		Assistenten c = new Assistenten();
		a.Gebouw();
		b.hulp(c);
		c.werken(a);

		
	}

}

class TandartsPraktijk {
	String naam = "Samen werkende tandartsen";
	String openingstijd = "8:00";
	int AantalAss = 4;
	int Aantaltan = 3;
	void Gebouw () {
		System.out.println(naam);
		
	}
	
}

class Tandarts extends TandartsPraktijk {
	void hulp(TandartsPraktijk TD) {
		System.out.println("zo veel assistenten heb ik tot mijn beschikking " + AantalAss);
	}
	
	
}

class Assistenten extends TandartsPraktijk {
	void werken (TandartsPraktijk TD) {
		System.out.println("wij werken in praktijk " + naam + " wij gaan open om " + openingstijd);
	}
	
}

