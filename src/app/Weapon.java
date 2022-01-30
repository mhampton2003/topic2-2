package app;

public abstract class Weapon {
	/**
	 * prints out the power of the weapon and the method that was used
	 * @param power The power of the weapon
	 */
	public void fireWeapon(int power) {
		System.out.println("In Weapon.fireWeapon() with a power of " + power);
	}
	
	/**
	 * activates the weapon
	 * @param enable Whether the weapon is enabled or not
	 */
	public abstract void activate(boolean enable);
}
