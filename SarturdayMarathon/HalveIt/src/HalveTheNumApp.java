import java.util.Scanner;

public class HalveTheNumApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		double num=scan.nextDouble();
		System.out.printf("%.2f",HalveTheNum.halveTheNumber(num));
		scan.close();
	}

}
