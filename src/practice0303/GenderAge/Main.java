package practice0303.GenderAge;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seibetsu = new java.util.Random().nextInt(2);
		int age = new java.util.Random().nextInt(80);
		System.out.println("こんにちは。");
		
		if (seibetsu == 0) // if 0 male, if 1 female
		{
			System.out.print("私は男です。");
			System.out.println(age + "歳です。");
		}
		else
		{
			System.out.println("私は女です。");
		}
		
		System.out.println("よろしくお願いします。");

	}

}
