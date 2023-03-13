
public class Ziekenhuis {

	public static void main(String[] args) {
		System.out.println("Welkom in de OCA ziekenhuis");
		System.out.println();
		
		Arts a = new Arts();
		a.naam = "Felix";
		a.eersteOperatie();
		System.out.println();
		
		Patient p = new Patient("Gideon", "Goderski", 27, "Hart problemen");
		p.dosier();
		System.out.println();
		
		
		a.vervangendeArts("Reymond");
		a.nieuwePatient(p);
		
		
		
	}
}

class Arts {
	
	String naam;
	
	Operatie ok = new Operatie("Hart-transplantatie");
	
	public void eersteOperatie() {
		System.out.println("Mijn naam is Dr." + naam);
		System.out.println("Ik heb mijn aller eerste " + ok.operatie);
	}
	
	public void vervangendeArts(String naam) {
		System.out.println("Ik ben de vervangende art Dr." + naam);
		this.naam = naam;
		
	}
	
	public void nieuwePatient(Patient patientZero) {
		System.out.println("Dit is een bijzondere patient");
		
	}
	
	
	
}

class Patient {
	
	String voornaam;
	String achternaam;
	int leeftijd;
	String aandoening;
	
	Patient(String voornaam, String achternaam, int leeftijd, String aandoening) {
		this.voornaam = voornaam;
		this.achternaam = achternaam;
		this.leeftijd = leeftijd;
		this.aandoening = aandoening;
		
	}
	
	public void dosier() {
		System.out.println("---------------------------");
		System.out.println("Hier is de patient dosier");
		System.out.println("---------------------------");
		System.out.println("Patient naam: " + voornaam + " " + achternaam);
		System.out.println("Leeftijd: " + leeftijd);
		System.out.println("Aandoening: " + aandoening);
		System.out.println("---------------------------");
	}
	
}

class Operatie {
	
	String operatie;
	
	Operatie(String soort){
		this.operatie = soort;
		
	}
	
}
