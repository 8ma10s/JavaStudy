package practice0303.GenderAge;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seibetsu = new java.util.Random().nextInt(2);
		int age = new java.util.Random().nextInt(80);
		System.out.println("����ɂ��́B");
		
		if (seibetsu == 0) // if 0 male, if 1 female
		{
			System.out.print("���͒j�ł��B");
			System.out.println(age + "�΂ł��B");
		}
		else
		{
			System.out.println("���͏��ł��B");
		}
		
		System.out.println("��낵�����肢���܂��B");

	}

}
