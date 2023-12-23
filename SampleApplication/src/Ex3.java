import java.util.Scanner;
public class Ex3 {
	// Find the big number from two number using conditional operators
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter 1st value");
		int x = sc.nextInt();
		System.out.println("Enter 2nd value");
		int y = sc.nextInt();
		// x = 10, y = 50
		int big = (x>y) ? x : y;
		
		System.out.println(x + " and " + y  + " Big Number " + big);
	}
}