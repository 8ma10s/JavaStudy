package practice0502.Email;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create Scanner
		Scanner inScan = new java.util.Scanner(System.in);
		
		//Scan components of the email
		System.out.println("Enter the email address");
		String address = inScan.nextLine();
		System.out.println("Enter the title");
		String title = inScan.nextLine();
		System.out.println("Enter the content");
		String text = inScan.nextLine();
		
		//Check if title is empty, then send accordingly
		if (title.isEmpty()){
			email(address,text);
		}
		else{
			email(title, address, text);
		}
		
		//close Scanner
		inScan.close();
		
	}
	
	// Function intended to do the actual work
	public static void email(String title, String address, String text){
		System.out.println("Sent an email to \"" + address + "\" with the following content");
		System.out.println("Title: " + title);
		System.out.println("Body: " + text);
	}
	
	//Same function, if no title
	public static void email (String address, String text){
		System.out.println("Sent an email to \"" + address + "\" with the following content");
		System.out.println("Title: (No Title)");
		System.out.println("Body: " + text);
	}
}
