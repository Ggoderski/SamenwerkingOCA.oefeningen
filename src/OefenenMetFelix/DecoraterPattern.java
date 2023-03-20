package OefenenMetFelix;

public class DecoraterPattern {
	
	public static void main(String[] args) {
		
		Car audi = new Audi();
		Car audiSpoiler = new Spoiler(audi);
		Car audiWithMods = new Nitrous(audiSpoiler);
		audiWithMods.build();
		
	}

}


abstract class Car {
	
	abstract void build();
}


class Audi extends Car {
	
	public void build() {
		System.out.println("Audi is built");
	}
}


abstract class CarMods extends Car {
	
	Car car;
	
	public CarMods(Car car) {
		this.car = car;
	}
}


class Spoiler extends CarMods {
	
	public Spoiler (Car car) {
		super(car);
	}
	
	public void build() {
		car.build();
		addSpoiler();
	}
	
	void addSpoiler() {
		System.out.println("Car is added with spoiler");
	}
}


class Nitrous extends CarMods {
	
	public Nitrous (Car car) {
		super(car);
	}
	
	public void build() {
		car.build();
		addNitrous();
	}
	
	void addNitrous() {
		System.out.println("Car is added with nitrous");
	}
}


