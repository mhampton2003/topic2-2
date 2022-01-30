package app;

/**
 * 
 * @author Maya
 *
 */
public class Game {

	/**
	 * activates then fires the weapons
	 * @param args Takes in any number of values
	 */
	public static void main(String[] args) {
		Bomb weapon1 = new Bomb();
		Gun weapon2 = new Gun();
		weapon1.activate(true);
		weapon2.activate(true);
		weapon1.fireWeapon(10);
		weapon2.fireWeapon(5);
		weapon1.fireWeapon();
		weapon2.fireWeapon();
			
	}

}
