package model;

public class Troll extends Character {

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("I'm the Troll");
		this.weapon.useWeapon();
		
	}

}
