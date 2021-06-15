package javaFundamentals;
import java.util.Scanner;
public class Java_SimpleCalcSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char operator;
		Double n1, n2, total;
		Scanner s = new Scanner(System.in);

		// ask users to enter operator
		System.out.println("Choose an operator: \n+, -, *, or /");
		operator = s.next().charAt(0);

		System.out.print("Enter First Number: ");
		n1 = s.nextDouble();

		System.out.print("Enter Second Number: ");
		n2 = s.nextDouble();

		switch (operator) {
		case '+':
			total = n1 + n2;
			System.out.println(n1 + " + " + n2 + " = " + total);
			break;
		case '-':
			total = n1 - n2;
			System.out.println(n1 + " - " + n2 + " = " + total);
			break;
		case '*':
			total = n1 * n2;
			System.out.println(n1 + " * " + n2 + " = " + total);
			break;
		case '/':
			total = n1 / n2;
			System.out.println(n1 + " / " + n2 + " = " + total);
			break;
		default:
			System.out.println("Invalid operator!");
			break;
		}
		s.close();
	}

}
