package OefenenMetFelix;

public class StrategyPattern {
	
	public static void main(String[] args) {
		
		Boat fishBoat = new FishBoat();
		fishBoat.performDive();
		
	}

}

interface Diveable {
	
	public void dive();
}


class DiveBehavior implements Diveable {
	
	public void dive() {
		// Implementation here
	}
}


class NoDiveBehaviour implements Diveable {
	
	public void dive() {
		
	}
}


abstract class Boat {
	
	Diveable diveable;
	
	void sway() {	}
	void roll() {	}
	
	abstract void present();
	
	public void performDive() {
		diveable.dive();
	}
}

class FishBoat extends Boat {
	
	public FishBoat() {
		diveable = new NoDiveBehaviour();
	}

	
	void present() {
		
	}
}

class SubBoat extends Boat {
	
	public SubBoat() {
		diveable = new DiveBehavior();
	}

	
	void present() {
		
		
	}
}
