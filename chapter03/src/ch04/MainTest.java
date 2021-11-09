package ch04;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Archer arc = new Archer("궁수", 100);
		Warrior war = new Warrior("전사",100 );
		Wizard wiz = new Wizard("법사", 100);
		
		arc.fireArrow();
		war.comboAttack();
		wiz.freezing();
		
		int hp = war.hp;
		String name = war.name;
		war.comboAttack();
		System.out.println("name "+ name);
		System.out.println("hp :" + hp);
		
		
	
	}
	

}
