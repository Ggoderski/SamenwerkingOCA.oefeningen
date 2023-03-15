package OefenenMetFelix;

public class Exceptions {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		
		try {
			student.smoesVerzinnen();
		} catch (zijnHuisjeKapotException e) {
			System.out.println("Martijn wordt gebeld");
		}
		
	}

}

class zijnHuisjeKapotException extends Exception {
	
}

class Student {
	
	boolean creatief; 
	
	public void smoesVerzinnen() throws zijnHuisjeKapotException{
		if (creatief == true) {
			System.out.println("Beste smoes ooit gemaakt!");
		} else {
			throw new zijnHuisjeKapotException();
		}
		
	}
}

class TraineeShip {
	
}


// als student niet creatief is gooit deze een Exception