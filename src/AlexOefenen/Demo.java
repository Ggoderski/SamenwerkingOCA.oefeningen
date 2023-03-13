package AlexOefenen;

public class Demo {
	public static void main(String [] args) {
	boolean b1 = true;
			boolean b2 = false;
			boolean res = b2 || (b1=false);
			System.out.println(b1 + "" + b2 + res);
	}
}
