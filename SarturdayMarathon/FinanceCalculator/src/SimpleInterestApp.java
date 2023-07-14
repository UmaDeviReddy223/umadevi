import java.util.Scanner;

public class SimpleInterestApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 System.out.println("enter principle amount");
		 double principle=scan.nextDouble();
		 System.out.println("enter rate of interest");
		 double rate=scan.nextDouble();
		 System.out.println("enter time in years");
		 double time=scan.nextDouble();
		 
		 SimpleInterest SimpleInterest=new SimpleInterest();
		 System.out.printf("%.2f",SimpleInterest.calculateSimpleInterest(principle, rate, time));
		 scan.close();
	}

}
