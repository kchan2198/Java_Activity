package javaFundamentals;
import java.util.Scanner;
import java.util.Random;
public class RpsGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		String r = "Rock";
		String p = "Paper";
		String s = "Scissors";
		String y = "yes";
		String n = "no";
		int computerCount = 0;
		int playerCount = 0;


		String [] rps = {r,p,s};
		String player;
		String computer;
		String playAgain;

		int i;
		
			while (true) {
				System.out.println("Rock, Paper, Scissors: ");
				player = sc.nextLine();

				i = rd.nextInt(3);
				computer = rps[i];

				System.out.println("\nPlayer choose " + player + ", Computer choose " + computer);

				if (player.equalsIgnoreCase(computer)) {
					System.out.println("TIE!");
				}else if (player.equalsIgnoreCase(r) && computer.equalsIgnoreCase(p)) {
					System.out.println("You lose!");
					computerCount++;
				}else if (player.equalsIgnoreCase(r) && computer.equalsIgnoreCase(s)) {
					System.out.println("You win!");
					playerCount++;
				}else if (player.equalsIgnoreCase(p) && computer.equalsIgnoreCase(s)) {
					System.out.println("You lose!");
					computerCount++;
				}else if (player.equalsIgnoreCase(p) && computer.equalsIgnoreCase(r)) {
					System.out.println("You win!");
					playerCount++;
				}else if (player.equalsIgnoreCase(s) && computer.equalsIgnoreCase(r)) {
					System.out.println("You lose!");
					computerCount++;
				}else if (player.equalsIgnoreCase(s) && computer.equalsIgnoreCase(p)) {
					System.out.println("You win!");
					playerCount++;
				}else {
					System.out.println("Invalid input");
				}
				System.out.println();
				System.out.println("Player Score: " + playerCount + "\nComputer Score: " + computerCount);
				System.out.print("\nDo you want to play again? [Y]/[N]");
				playAgain = sc.nextLine();
				if (playAgain.equalsIgnoreCase(y)) {
					continue;
				}else if (playAgain.equalsIgnoreCase(n)) {
					System.out.println("\nThank you for playing! :)");
					break;
				}
				}
			}
}
