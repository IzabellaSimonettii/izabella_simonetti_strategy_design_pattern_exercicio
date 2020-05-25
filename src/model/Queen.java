package model;

public class Queen extends Character{

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("I'm The Queen!");
		this.weapon.useWeapon();
	}

}
