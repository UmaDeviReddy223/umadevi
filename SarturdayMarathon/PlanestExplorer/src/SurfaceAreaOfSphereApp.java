import java.util.Scanner;

public class SurfaceAreaOfSphereApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the radius");
		double radius=scan.nextDouble();		
		PlanestExplorer  PlanestExplorer=new PlanestExplorer();
        System.out.printf("%.2f",PlanestExplorer.calculateSurfaceArea(radius));
        scan.close();
	}

	}


