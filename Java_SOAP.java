package javaFundamentals;
import java.util.Scanner;
public class Java_SOAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.println("Input any Positive Number: ");
		int num = x.nextInt();
		int count = 1, total = 0;

		while(count <= num)
		{
			total = total + count;
			count++;
		}
		System.out.println("Sum of Positive Numbers until "+ num +" is "+total);
		x.close();
	}

}
