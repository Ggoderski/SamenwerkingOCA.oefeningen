
public class MultiArrays {
	
	MultiArrays(){
		System.out.println("Multi arrays");
		
		//Array z = new Array{2,4,8,14,19};
		
		//int[] i = new Array{2,4,8,14,19};
		
		int[] j = new int[] {2,4,8,14,19};
		int[] k = {2,4,8,14,19};
		
		int[] l = new int[4];
	
		System.out.println(j[3]);
		
		int[] g[] = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(g[2][1]);
		
		int[][][] bb = {{{5}},{{},{},{3,4,5,25,27}}};
		//int[][][] bb = {{{3}}};
		System.out.println(bb[0][0][0]);
		
		
		System.out.println(bb[1][2][4]);
	
	}
}
