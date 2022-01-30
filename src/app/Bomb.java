package app;

public class Bomb extends Weapon{
	/**
	 * prints the power and the method that is used
	 * @param power The power of the bomb
	 */
	public void fireWeapon(int power) {
		System.out.println("In Bomb.fireWeapon() with a power of " + power);
	}
	
	/**
	 * prints the method that is used
	 * prints the power of the bomb
	 */
	public void fireWeapon() {
		System.out.println("In overloaded Bomb.fireWeapon()");
		super.fireWeapon(10);
	}

	/**
	 * overrides the activate method
	 * @param enable Whether the bomb is enabled or not
	 */
	@Override
	public void activate(boolean enable) {
		System.out.println("In Bomb.activate() with an enable of " + enable);
		
	}

}
