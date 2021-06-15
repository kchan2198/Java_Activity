package javaFundamentals;
import java.util.Scanner;
import java.util.Random;
public class Java_Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int FirstNum = r.nextInt(10);
		int	SecondNum = r.nextInt(10);
		int total;
		
		System.out.println("First number: " + FirstNum);
		System.out.println("Second number: " + SecondNum);
		System.out.println("\nOperation\nA. Addition\nB. Subtraction\nC.Multiplication\nD.Division");
		System.out.print("\nChoose Operation: ");
		String O = s.next();
		char Operation = O.charAt(0);
		System.out.print("What is the sum? ");
		int gSum = s.nextInt();
		
		if (Operation == 'A' || Operation == 'a')
		{
			total = FirstNum + SecondNum;
			if (gSum == total)
			{
				System.out.print("Correct.");
			}
		else
			{
			System.out.println("Wrong: The correct answer is: " + total);
			}
		} else if (Operation == 'B' || Operation == 'b')
		{
			total = FirstNum - SecondNum;
			if (gSum == total)
			{
				System.out.print("Correct.");
			}
		else
			{
			System.out.println("Wrong: The correct answer is: " + total);
			}
		} else if (Operation == 'C' || Operation == 'c')
		{
			total = FirstNum * SecondNum;
			if (gSum == total)
			{
				System.out.print("Correct.");
			}
		else
			{
			System.out.println("Wrong: The correct answer is: " + total);
			}
		} else if (Operation == 'D' || Operation == 'd')
		{
			total = FirstNum / SecondNum;
			if (gSum == total)
			{
				System.out.print("Correct.");
			}
		else
			{
			System.out.println("Wrong: The correct answer is: " + total);
			}
		}
}
}