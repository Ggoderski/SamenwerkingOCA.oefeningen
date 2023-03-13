
public class OCAoefening {
	
	public static void main(String[] args) {
		
		Station s = new Station("Haarlem");
			System.out.println("Station op 6: " + s.locatie);
		s.geefNieuwsteTrein("500");
		System.out.println("");
		
		Conducteur c = new Conducteur();
		String voornaam = "Leo";
		c.naam = "Leo";
		c.zichtVoorstellen();
		c.thuisstation = s;
		c.zichtVoorstellen();
		System.out.println("");
		
		Trein t = new Trein();
		t.etPhoneHome();
	}

}

class Trein {
	
	String treincode;
	Station vertrek = new Station("Utrecht");
	Station bestemming = new Station("Deventer");
	
	public void etPhoneHome() {
		treincode = "600";
		System.out.println("Treinnummer: " + treincode);
		System.out.println("Vertrekt uit: " + vertrek.locatie);
		System.out.println("Bestemming is naar: " + bestemming.locatie);
	}
}

class Conducteur {
	
	String naam;
	
	Station thuisstation = new Station("Breda");
	
	public void zichtVoorstellen() {
		
		System.out.println("Mijn naam is: " + naam);
		System.out.println("Mijn huidige werkplek is in: " + thuisstation.locatie);
	}
}

class Station {
	
	String locatie;
	
	Station(String stadnaam) {
		this.locatie = stadnaam;
		
	}
	
	public Trein geefNieuwsteTrein(String meegeven) {
		Trein t = new Trein();
		t.treincode = meegeven;
			
		return t;
	}
}
