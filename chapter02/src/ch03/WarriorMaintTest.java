package ch03;

public class WarriorMaintTest {
	
	public static void main(String[] args) {
		
		Warrior Man = new Warrior();
		
		Man.WarName = "test";
		Man.ShowWarName();
		int su = Man.Attack(10);
		System.out.println("°ø°Ý·Â : " + Man.Attack(11));
		
		int Mdefense = Man.Defense = 30;
		int Mmana = Man.MANA = 100;
		int HP = Man.PhysicalStrength = 600;
		
		Man.Color = "ÃÊ·Ï»ö";
	
		
		
		Man.ShowDefense();
		Man.ShowPhysicalSt();
		Man.ShowMana();
		System.out.println("°©¿Ê »ö±ò : " + Man.ShowColor());
		
		
		
		
	}
	// Ãâ·Â
	
	

	
	

}
