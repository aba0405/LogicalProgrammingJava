
public class SortArrayDemo {

	public static void main(String[] args) {
		// Sort the Array in Ascending and Descending order
		
		int a[] = {2,6,1,4,9};
		int temp;
		//1,2,3,4,6,9 Bubble sort algorithm
		
		for(int i=0; i<5; i++) {
			
			for(int j=i+1; j<5; j++) {
				
				if(a[i] >a [j]) {
					//Swap
					temp=a[i];
					temp=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println(a[i]);
		}
	}

}
