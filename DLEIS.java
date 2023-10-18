package justMath;

public class DLEIS {

	public static void main(String[] args) {
		
		//ay = bx + c
		
		int a = 212;
		int b = 657;
		int c = 513;
		
		try  {
			
			int t = b;
			
			while(true) {
				
				t = b;
				b = a;
				
				c = -c;
				
				while(c < 0)
					c += a;
				
				a = t % a;
				
				if(a == 0)
					break;
				
				System.out.println(a + " " + b + " " + c);
				
			}
			
		} catch(Exception e) {e.printStackTrace();}
		
	}

}
