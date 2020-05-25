package model;

public class Knight extends Character {

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("I'm the Knight");
		this.weapon.useWeapon();
		
	}

}
