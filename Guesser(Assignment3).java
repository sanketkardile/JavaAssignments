package iNeuronStrings;

import java.util.Scanner;

public class Guesser {

	public static void main(String[] args) {
		int flag=0;
		System.out.println("Hey Guesser whats your number?:");
		Scanner scan= new Scanner(System.in);
		int star= scan.nextInt();
		System.out.println("Thanks. Please tell me how many players are playing?:");
		int numPlayers= scan.nextInt();
		int[] arr= new int[numPlayers];
		for(int i=0; i<numPlayers;i++) {
			System.out.println("Player "+(i+1)+" Please guess number:");
			arr[i]= scan.nextInt();
		}
		for(int i=0;i<numPlayers;i++) {
			if(arr[i]==star) {
				System.out.println("Player "+(i+1)+" Guessed Correctly. CONGRATS");
				flag++;
			}
		}
		if (flag==0) System.out.println("Nobody Guessed the number. Number was"+ star+ "Thank you.");

	}

}




