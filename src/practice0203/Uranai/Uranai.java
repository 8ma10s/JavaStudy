package practice0203.Uranai;

import java.util.Scanner;

public class Uranai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�悤�����肢�̊ق�");
		System.out.println("���Ȃ��̖��O����͂��Ă�������");
		Scanner inScan = new java.util.Scanner(System.in); //using scanner class instead of allocating a scanner on each read
		String name = inScan.nextLine();
		System.out.println("���Ȃ��̔N�����͂��Ă�������");
		String ageString = inScan.nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(4);
		fortune++;
		System.out.println("�肢�̌��ʂ��o�܂����I");
		System.out.println(age + "�΂�" + name + "����A���Ȃ��̉^�C�ԍ���" + fortune + "�ł�");
		System.out.println("1:��g2:���g3:���g4:��");
		inScan.close();
		
		
	}

}
