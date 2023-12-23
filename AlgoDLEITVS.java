package justMath;

import java.util.ArrayList;

//Diophantine Linear Equation in Two Variables Solutions
public class AlgoDLEITVS {

	public static void main(String[] args) {
		
		DLEITVS(3,-2,5); //Example: 3y = -2y + 5
		
	}
	
	/**
	 * Format: ay = bx + c <br><br>
	 * Make Sure a, b, c Are Co-prime <br><br>
	 * Returns: int[][] r :<br><br>
	 * x = r[0][0] * k + r[0][1] <br>
	 * y = r[1][0] * k + r[1][1] <br>
	 * for all integers, k
	 * */
	public static int[][] DLEITVS(int a, int b, int c) {
		
		int[][] res = new int[2][2];
		
		if(a < 0) {
			
			a *= -1;
			b *= -1;
			c *= -1;
			
		} else if(a == 0 || b == 0)
			throw new ArithmeticException("Value of a or b cannot be 0");
		
		ArrayList<int[]> eqs = new ArrayList<int[]>();
		int[] vals = new int[4];
		
		vals[0] = a;
		vals[1] = Math.floorDiv(b, a);
		vals[2] = Math.floorMod(b, a);
		vals[3] = c;
		
		eqs.add(vals.clone());
		
		while(true) {
			
			if(vals[0] == 1)
				break;
			
			final int tempStore = vals[2];
			vals[3] = Math.floorMod(-vals[3], vals[0]);
			vals[1] = Math.floorDiv(vals[0], vals[2]);
			vals[2] = Math.floorMod(vals[0], vals[2]);
			vals[0] = tempStore;
			
			eqs.add(vals.clone());
			
		}
		
		int[][] eqArr = new int[eqs.size()][4];
		eqs.toArray(eqArr);
		
		int p = eqArr[eqArr.length - 1][1];
		int q = eqArr[eqArr.length - 1][3];
		
		for(int i = eqArr.length - 2; i >= 0; --i) {
			
			if(i == 0) {
				res[0][0] = p; 
				res[0][1] = q;
			}
			
			p = (eqArr[i][2] * p / eqArr[i][0]) + (eqArr[i][1] * p);
			q = (eqArr[i][1] * q) + ((eqArr[i][2] * q + eqArr[i][3]) / eqArr[i][0]);
		
		}
		
		
		res[1][0] = p;
		res[1][1] = q;
		
		return res;
	}
	
}
