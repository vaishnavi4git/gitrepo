import java.util.Scanner;
public class Ex2 {
	// Find area of circle
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		final float pi = 3.14f;  // constant variable
		System.out.println("Enter radius of the circle ");
		float radius = sc.nextFloat();
		
		float area = pi*radius*radius;
		
		System.out.println("Area of Circle is " + area);
	}
}