package studio1;

import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner var = new Scanner(System.in);
			System.out.println("Enter a value for n1: ");
			int n1 = var.nextInt();
			System.out.println("Enter a value for n2: ");
			int n2 = var.nextInt();
			double average = (n1 + n2)/2.0;
			System.out.println("The average of n1 and n2 is " + average +".");
	}

}
