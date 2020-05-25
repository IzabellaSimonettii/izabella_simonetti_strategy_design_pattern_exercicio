package model;

public class King extends Character {

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("I'm the king");
		this.weapon.useWeapon();
	}

}
