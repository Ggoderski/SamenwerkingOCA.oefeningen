package OefenenMetFelix;

public class SingletonPattern {

	public static void main(String[] args) {
		
	}
}

class Probe {
	
	int aantal;
	String naam;
	
	// Importent methodes
	
	// Als de klasse niet meer objecten wilt
	// Dan maak je de constructor private
	// Nu kun je alleen de construstor alleen binnen de klasse aanroepen
	private Probe() {
		
		aantal = 5;
		naam = "Joost";
		
	}
	
	//Deze methode neemt de referentie variabele van de Probe klasse en controleert of het object al geïnstantieerd is. 
	//Zo niet, dan wordt er een nieuw object gemaakt en teruggegeven aan de client.
	private static Probe getInstance(Probe probe) {
		if(probe == null) {
			probe = new Probe();
		} return probe;
	}
	//Aangezien getInstance() een statische methode is, kan het alleen in zijn eigen klasse worden aangeroepen en niet op objectniveau. 
	//Elke keer dat deze methode wordt aangeroepen, geeft het hetzelfde object terug. 
	//Hierdoor kan het patroon voorkomen dat meerdere objecten worden gemaakt.
	
	
}
