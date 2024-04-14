package task1;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuess {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean check=true;
		int won=0;
		int limit=0;
		do {
			System.out.println("Enter guessed number:");
			int guessNumber=sc.nextInt();
			int randomNumer=randomNumber();
			//System.out.println( "generated random number:"+randomNumer);
			if(guessNumber==randomNumer) { 
				
				System.out.println("You Won the Game.");
				System.out.println("Do You want to continue the Game (Y/N)");
				String choice=sc.next();
				if(choice.equalsIgnoreCase("N")) {
					check=false;
				}
				won++;
				limit=0;
			}else if(guessNumber<randomNumer) { 
				System.out.println("Your Number is too Low!");
			}else {
				System.out.println("Your Number is too high!");
			}
			if(limit==10) {
				System.out.println("You have reached maximum Limits");
			}
			limit++;
			
		}while(check && limit<=10);
		System.out.println("Total wins: "+won+" times");
		
	}
	public static int randomNumber() {
		Random random=new Random();
		int min=1;
		int max=100;
		return random.nextInt(max - min + 1) + min;
	}

}
