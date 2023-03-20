package OefenenMetFelix;

public class InterfaceEnAbstract {
	
	public static void main(String[] args) {
		System.out.println("hiep hiep hoera abstract");
		
		Apparaat apparaat = new Televisie();
		apparaat.soort = "tv";
		apparaat.prijs = 200;
		apparaat.aanzetten();
		
		BraveBurger felix = new BraveBurger();
		Taartvorkje t = new Taartvorkje();
		felix.dingGebruiken(t);
		felix.dingGebruiken(new Taartvorkje());
	}

}

abstract class Apparaat {

	String soort;
	int prijs;
	
	abstract public void aanzetten();
}

class Televisie extends Apparaat {
	
	public void aanzetten() {
		System.out.println("Ik ben nu in de televisie");
		
	}
	
}

class MediamarktVerkoper {
	
	public Apparaat aansmeren() {
		Apparaat a = new Televisie();
		return a;
		
	}
}

interface Ekeurmerk {
	
	public void keuren();
		
	}

abstract class Vork implements Ekeurmerk {
	
}

class Taartvorkje extends Vork {
	
	public void keuren() {
		System.out.println("Lekker prikken met een taart vorkje");
	}
}

class BraveBurger {
	
	void dingGebruiken(Ekeurmerk keurmerk) {
		System.out.println("Ik ben vrolijk aan het gebruiken");
		keurmerk.keuren();
	}
}