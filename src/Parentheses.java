
public class Parentheses {
	
	Parentheses(){
			//hier worden geen () gebruikt bij het optellen, dus eerst vermenigvuldig en dan optellen
		int result = 10 + 10 * 2;
		System.out.println("Result: "+ result + " without parentheses");
		
			// hier worden wel () gebruikt bij het optellen, dus eerst optellen en dan vermedigvuldig		
		result = (10 + 10) * 2;
		System.out.println("Result: "+ result + " with parentheses");
	}

}
