
public class TestPyramid {

	public static void main(String[] args) {
		// Program for Printing Pyramid Pattern in Java
		
		//System.out.println("*");
		
		for(int i=1; i<5; i++) { //outer loop prints 4 formats
			//logic-take care the printing right format
			for(int j=1; j<=i; j++ ) {
				System.out.print("*");
				System.out.print("\t");
			}
			System.out.println();
			
		}

	}

}
