package OefenenMetFelix;

public class SafeOrOut {
	
	public static void main(String[] args) {
		
		Player p = new Player();
		
		try {
			p.yourOut();
		} catch (YouAreSafeOrOutException e) {
			System.out.println("The umpire needs a screen review");
		}
	}

}

class Player {
	
	boolean caughtTheBall;
	
	public void yourOut() throws YouAreSafeOrOutException {
		
		if (!caughtTheBall == true) {
			throw new YouAreSafeOrOutException();
		}
	}
	
}



class YouAreSafeOrOutException extends Exception {
	
}
