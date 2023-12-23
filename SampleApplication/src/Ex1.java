import java.util.Scanner;
public class Ex1 {
	// Addition of two values
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter 1st Value");
		int x = sc.nextInt();
		System.out.println("Enter 2nd Value");
		int y = sc.nextInt();
		
		int sum = x+y;
		
		System.out.println(x + " and " + y + " addition is " + sum);
	}
}
