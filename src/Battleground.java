
import model.KnifeBehavior;
import model.Knight;
import model.Queen;
import model.SwordBehavior;

public class Battleground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Knight izabella = new Knight();
		KnifeBehavior knife = new KnifeBehavior();
		
		izabella.setWeapon(knife);
		
		izabella.fight();
		
		SwordBehavior sword = new SwordBehavior();
		
		izabella.setWeapon(sword);
		
		izabella.fight();
		
		
		}
}
