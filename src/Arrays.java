public class Arrays {
	
	Arrays(){
		int[] numb = new int[5];
		int[] ers = {1,2,3,4,5};
		
		for(int i = 0; i < numb.length; i++) {
			System.out.println("Numbers " + i + ": " + numb[i]);
		}
		
		System.out.println();
		
		for(int j = 0; j < ers.length; j++) {
			System.out.println("Numbers " + j + ": " + ers[j]);
		}
		
		System.out.println();
		
		int[][] matrix = new int[3][3];
		
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		
		matrix[1][0] = 4;
		matrix[1][1] = 5;
		matrix[1][2] = 6;
		
		matrix[2][0] = 7;
		matrix[2][1] = 8;
		matrix[2][2] = 9;
		
		
	}

	

}
