package quiz1;
import java.util.Scanner;

public class question1 {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Total Touchdowns: ");
		double TD = scanner.nextDouble();
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter Total Yards: ");
		double YDS = scanner1.nextDouble();
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Enter Number of Interceptions: ");
		double INT = scanner2.nextDouble();
		
		Scanner scanner3 = new Scanner(System.in);
		System.out.println("Enter Number of Completions: ");
		double COMP = scanner3.nextDouble();
		
		Scanner scanner4 = new Scanner(System.in);
		System.out.println("Enter Number of Passes Attempted: ");
		double ATT = scanner4.nextDouble();
		
		scanner.close();
		scanner1.close();
		scanner2.close();
		scanner3.close();
		scanner4.close();
		
		double a = Math.min(Math.max((COMP/ATT - .3) * 5, 0), 2.375);
		double b = Math.min(Math.max((YDS/ATT - 3) * .25, 0), 2.375);
		double c = Math.min(Math.max((TD/ATT * 20), 0), 2.375);
		double d = Math.min(Math.max((2.375 - (INT/ATT) * 25), 0), 2.375);
		double PR = ((a + b + c + d)/6) * 100;
		System.out.println("QB Rating is "+ PR);
	}	
}
