
public class Equals {
	
	Equals(){
		String str1 = "goed";
		String str2 = "fout";
		String str3 = "goed";
			//gebruik equals om string 1 met string 2 te vergelijken
		if(str1.equals(str2)) {
			System.out.println("String 1 en String 2 zijn gelijk");
		}else {
			System.out.println("String 1 en String 2 zijn niet gelijk");
		}
			//gebruik equals om String 1 met String 3 te vergelijken
		if(str1.equals(str3)) {
			System.out.println("String 1 en String 3 zijn gelijk");
		}else {
			System.out.println("String 1 en String 3 zijn niet gelijk");
		}
	}

}
