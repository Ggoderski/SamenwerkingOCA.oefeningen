package OefenenMetFelix;

public class Ikea {

	public static void main(String[] args) {
		
		System.out.println("Ikea Deventer is geopend");
		
		String[] keukenNamen = {"Jan", "Kees", null , "Lisa"};
		Keukens afdeling1 = new Keukens();
		afdeling1.verkopersIndelen(keukenNamen);
		for (Verkoper verkoper : afdeling1.verkopers) {
		    verkoper.voorstellen();
		}
		
		
		String[] garderobeNamen = {"Anna", null};
		GarderobeKasten afdeling2 = new GarderobeKasten();
		afdeling2.verkopersIndelen(garderobeNamen);
		for (Verkoper verkoper : afdeling2.verkopers) {
		    verkoper.voorstellen();
		}
		
		
		
		
	}
}

class Afdeling {
	
	Verkoper[] verkopers;
	
	public void verkopersIndelen(int plek, Verkoper v) {
		verkopers[plek] = v;
	}
	
}

class Keukens extends Afdeling {
	
	Verkoper[] verkopers;
	
	public void verkopersIndelen(String[] namen) {
		verkopers = new Verkoper[namen.length];
		for (int i =0; i < verkopers.length; i++) {
			verkopers[i] = new Verkoper(namen[i] + " verkoper bij keukens");
		}
	}
}	
	
	
	
	


class GarderobeKasten extends Afdeling {
	
	Verkoper[] verkopers;
	
	public void verkopersIndelen(String[] namen) {
		verkopers = new Verkoper[namen.length];
		for (int i =0; i < verkopers.length; i++) {
			verkopers[i] = new Verkoper(namen[i] +" verkoper bij garderobekasten");
		}
	}
	
}





class Verkoper  {
	
	String naam;
	
	public Verkoper(String naam) {
		this.naam = naam;
	}
	
	public void voorstellen() {
		System.out.println("Hallo mijn naam is: " + naam);
	}	
}


