import java.util.Scanner;

public abstract class TimeConverter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the minutes");
		int minutes=scan.nextInt();
		
		System.out.printf("%.1f",convertToHours(minutes));
		scan.close();

	}
	public static double convertToHours(int minutes) {
		return minutes/60.0;
	
	}
}
