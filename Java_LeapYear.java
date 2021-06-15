package javaFundamentals;
import java.util.Scanner;

public class Java_LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a year: ");
		year = s.nextInt();
		
		if (year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0)
					System.out.println(year + " is a leap year.");
				else
					System.out.println(year + " is not a leap year.");
			}
			else
				System.out.println(year + " is a leap year");
		}
		else
			System.out.println(year + " is not a leap year.");
	}

}
