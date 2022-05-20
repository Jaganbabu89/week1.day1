package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int n = 13;
		boolean flag = false;
		int m = n/2;
		
		if (n == 0 || n == 1) {
			System.out.println(n+" is not Prime number");
		}
		
		else {
			for (int i = 2; i <= m; i++) {
				if (n%i == 0) {
					System.out.println(n+" is not Prime number");
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println(n+" is Prime number");
			}
		}

	}

}
