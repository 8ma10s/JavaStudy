package practice0404.NumGuessQuiz;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {3, 4, 9}; //prepare an array
		
		System.out.println("1Œ…‚Ì”š‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		int input = new java.util.Scanner(System.in).nextInt(); //let user type in a number
		
		for (int value : numbers){
			if(value == input){ //if input matches any element in the array, output "correct"
				System.out.println("ƒAƒ^ƒŠI");
			}
		}
	}
}
