package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int x = 0;
		int y = 1;
		int range = 8;
		int sum = 0;
		
		System.out.print(x+" "+y);
		
		for (int i = 1; i < range; i++) {
			sum = x + y;
			System.out.print(" "+sum);
			x = y;
			y = sum;
			
		}

	}

}
