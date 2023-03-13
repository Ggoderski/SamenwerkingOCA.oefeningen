
public class ocavoorbeeld {

	public static void main(String[] args) {
		System.out.println("Lets go");
		Kantoor k = new Kantoor();
		Werknemer v = new Werknemer();
		v.salaris = 1200;
		k.Aannemen(v);
		v.Opscheppen();
		k.SalarisVerhoging(v);
		Lokaal l = new Lokaal();
		int a = l.MaximumAantal();
		System.out.println(a);

	}

}

class Kantoor {
	void Aannemen(Werknemer W) {
		System.out.println("Aannemen");

	}

	void OpenGaan() {

	}

	void SalarisVerhoging(Werknemer E) {
		E.salaris += 150;
		System.out.println("mijn salaris is " + E.salaris);
	}

}

class Lokaal {
	int maxA = 25;

	int MaximumAantal() {

		System.out.println("In maximuum aantal");

		return maxA;
	}
}

class Werknemer {
	int salaris;

	void Opscheppen() {
		System.out.println("mijn salaris is" + salaris);

	}

}
