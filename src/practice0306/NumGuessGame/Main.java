package practice0306.NumGuessGame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("y”‚ ‚ÄƒQ[ƒ€z");
		int ans = new java.util.Random().nextInt(10);
		Scanner inScan = new java.util.Scanner(System.in);
		
		for (int i = 0; i < 5; i++){ // repeat the game 5 times
			System.out.println("0`9‚Ì”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
			int num = inScan.nextInt();
			if (num == ans){
				System.out.println("ƒAƒ^ƒŠI");
				inScan.close();
				break;
			}
			else{
				System.out.println("ˆá‚¢‚Ü‚·B");
			}
		}
		System.out.println("ƒQ[ƒ€‚ğI—¹‚µ‚Ü‚·B");
		inScan.close();
	}

}
