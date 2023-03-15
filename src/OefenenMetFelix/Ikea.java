package OefenenMetFelix;

public class Ikea {

	public static void main(String[] args) {
		
		System.out.println("Ikea Deventer is geopend");
		
	}
}

class Afdeling {
	
	int maxVerkopers;
	
}

class Keukens extends Afdeling {
	
	Keukens() {
		maxVerkopers = 3;
	}
	
}

class GarderobeKasten extends Afdeling {
	
	
	
}



class Persoon {
	
	String naam;
	
}

class Verkoper extends Persoon {
	
	String functie;
	
}

class Klant extends Persoon {
	
}
