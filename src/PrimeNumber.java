
public class PrimeNumber {

	public static void main(String[] args) {
		// 11 can not be multiply by other number = Prime number
		// 11%2= not 0 if it is then prime number
		
		boolean flag = false;
		int val = 11;
		for (int i=2; i<=val/2; i++) {
			if(val%i==0) {
				flag=true;
				break;
			}
		}
		if(flag)
			System.out.println("It is not Prime");
		else
			System.out.println("It is Prime");

	}

}
