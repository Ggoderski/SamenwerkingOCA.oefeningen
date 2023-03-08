
public class Variables {

	//Declare and initialize variables (including casting of primitive data types)		
	Variables(){
			//declaration
			short a;
			int b;
			
			//assign
			a = 5;
			b = 10;
			
			//initialization
			long c = 1000;
			double d = 5.5;
			
			//casting
			short e = (short)c;
			
			//widening
			c = e;
			
			//optellen variables
			System.out.println(a + a + "Hoi" + a + a);
			System.out.println(b + b);
			System.out.println(c + c);
			System.out.println(d + d);
}}
