package practice1103.Matango;

public class PoisonMatango extends Matango {
	
	private int numPoison = 5;
	
	public PoisonMatango(char suffix){
		super(suffix);
	}
	
	public void attack(Hero h){
		super.attack(h);
		if (numPoison > 0){
			h.setHp((4  * h.getHp())/ 5);
			numPoison--;
		}
	}

}
