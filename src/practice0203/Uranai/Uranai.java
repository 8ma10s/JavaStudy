package practice0203.Uranai;

import java.util.Scanner;

public class Uranai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("‚æ‚¤‚±‚»è‚¢‚ÌŠÙ‚Ö");
		System.out.println("‚ ‚È‚½‚Ì–¼‘O‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		Scanner inScan = new java.util.Scanner(System.in); //using scanner class instead of allocating a scanner on each read
		String name = inScan.nextLine();
		System.out.println("‚ ‚È‚½‚Ì”N—î‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		String ageString = inScan.nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(4);
		fortune++;
		System.out.println("è‚¢‚ÌŒ‹‰Ê‚ªo‚Ü‚µ‚½I");
		System.out.println(age + "Î‚Ì" + name + "‚³‚ñA‚ ‚È‚½‚Ì‰^‹C”Ô†‚Í" + fortune + "‚Å‚·");
		System.out.println("1:‘å‹g2:’†‹g3:¬‹g4:‹¥");
		inScan.close();
		
		
	}

}
