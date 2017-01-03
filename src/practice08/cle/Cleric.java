package practice08.cle;

public class Cleric {
	String name;
	int hp = 50;
	final int MAXHP = 50;
	int mp = 10;
	final int MAXMP = 50;
	
	void selfAid(){ //use 5MP to recover HP to maxHP
		mp -=5;
		hp = MAXHP;
	}
	
	int pray(int sec){ //regain sec+0 ~ sec+2 MP
		int recAmt = (new java.util.Random().nextInt(3)) + sec;
		hp += recAmt;
		
		if (hp > MAXHP){
			recAmt -= (hp - MAXHP);
			hp = MAXHP;
		}
		
		return recAmt;
		
	}
	

}
