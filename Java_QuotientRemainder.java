package javaFundamentals;
import java.util.Scanner;
public class Java_QuotientRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
        int quotient = n1 / n2;
        int remainder = n1 % n2;
        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder);
    }
}
