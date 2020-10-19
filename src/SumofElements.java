
public class SumofElements {
	
	//Create a Method which accepts Array and returns sum of all elements in array
	//Print 5 Multiplication table without using Multiply operator
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		int sum = sumArray(a);
		System.out.println(sum);
		int result = multiply(5,10);
		System.out.println(result);

	}

	private static int multiply(int i, int j) {
		// i has to sum itself j times to get result
		int k = 1;
		int sum=0;
		while(k<=j) {
			sum =sum+i;
			k++;
		}
		return sum;
	}

	private static int sumArray(int[] a) {
		
		int sum=0;
		// Extract every value of array and sum each value with other
		for(int i =0; i<a.length;i++) {
			//System.out.println(a[i]);
			sum = sum + a[i];
		}
		return sum;
	}

}
