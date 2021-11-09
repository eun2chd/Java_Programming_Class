package ch03;

public class Warrior {
	
	// 멤버 변수 설계
	
	String WarName; // 전사 이름
	int Attack;  // 전사 공격력
	int Defense; // 전사 방어력
	int PhysicalStrength; // 전사 체력
	int MANA; // 전사 마력
	String Color; // 갑옷 색깔
	
	
	
	
	
	public void ShowWarName() {
		
			System.out.println("----info----");
			System.out.println("이름 : " + WarName );
		
	}
	
	public void ShowDefense() {
			
			System.out.println("방어력 : " + Defense);
		
	}
	
	public void ShowPhysicalSt() {
		
			System.out.println("체력 : " + PhysicalStrength);
			
	}
	
	public void ShowMana() {
		
			System.out.println("마력 : " + MANA);
	}
	

	public static int Attack(int num) {
		
			int sum = 0;
			
			for(int i = 0; i < num; i++)
			{
				sum += i;
			
			}
			return sum;
			
	}
	

	public String ShowColor() {
		
			return Color;
		
	}

	
		
	
	
	
	// 멤버 함수
	
	

}
