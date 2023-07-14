import java.util.Scanner;

public class InchesToFeetApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter height ");
		double inches=scan.nextDouble();
		InchesToFeet InchesToFeet=new InchesToFeet();
		System.out.printf("%.2f",InchesToFeet.convertInchesToFeet(inches));
        scan.close();
	}

}
