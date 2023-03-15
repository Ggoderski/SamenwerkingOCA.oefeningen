package OefenenMetFelix;

public class PasSysteem {
	
	public static void main(String[] args) {
		
	
	Pas pas = new Pas();
	
	try {
		pas.gestolenPas();
	}catch (PasjegeblokeertException e) {
		System.out.println("Je kunt deze pas niet meer gebruiken");
	}
	}
}

class Pas {
	
	//wordt geblokeer als die true is
	boolean geblokeert = true;
	
	public void gestolenPas() throws PasjegeblokeertException{
		
		if (geblokeert == true) {
			throw new PasjegeblokeertException();
		}
				
	}
}


class PasjegeblokeertException extends Exception { 
	
}


