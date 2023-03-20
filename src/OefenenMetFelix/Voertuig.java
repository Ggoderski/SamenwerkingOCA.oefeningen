package OefenenMetFelix;

public class Voertuig {
	
	public static void main(String[] args) {
		
		Jetski j1 = new Suzuki();
		j1.setAantalPk(j1.bepaalAantalPk());
		System.out.println("Deze jetski heeft " + j1.getAantalPk() + "pk");
		
	}

}



class Jetski {
	
	public int aantalPk;
	
	public int getAantalPk() {
		return aantalPk;
	}
	
	public void setAantalPk(int aantalPk) {
		this.aantalPk = aantalPk;
	}
	
	public int bepaalAantalPk() {
		return 0;
	}
	
}

class Suzuki extends Jetski {
	
	public int bepaalAantalPk() {
		return 300;
	}
	
}

class Mitshubishi extends Jetski {
	
	public int bepaalAantalPk() {
		return 250;
	}
	
}



