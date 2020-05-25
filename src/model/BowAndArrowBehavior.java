package model;

import model.interfaces.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		// TODO Auto-generated method stub
		System.out.println("I'm shooting the arrow with a Bow");
	}

}
