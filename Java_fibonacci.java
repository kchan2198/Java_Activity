package javaFundamentals;
import java.util.Scanner;
public class Java_fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num;
		int num1 = 0, num2 = 1, num3;
		num = s.nextInt();

		for (int i = 1; i <= num; i++) {
		System.out.print(num1 + " , ");
		
		num3 = num1 + num2;
		num1 = num2;
		num2 = num3;
		}
	}
}
