package ch01;

public class Marine {
	
	private int power;
	private int hp;
	private String name;
	
	public Marine(String name) {
		
		this.name = name;
		this.power = 10;
		this.hp = 100;
	}
	
	public void  showInfo() {
		
		System.out.println("---정보창---");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("체력 : " + this.hp);
		System.out.println("----------");
			
	}
	
	public void beAttacked(int power) {
		
		this.hp -= power;
		
		if(this.hp < 0) 
		{
			this.hp = 0;
			System.out.println(this.name+"사망");
		}
		
		
	}
		// 마린이 질럿을 공격합니다
		
		// 마린이 저글링을 공격합니다.
//		public void attackZealot(Zealot zealot) {
//
//			String targetNmae = zealot.getName();
//			System.out.println(name+ "이(가)" + targetNmae +" 공격합니다");
//			System.out.println();
//			zealot.beAttacked(this.power);
//			
//			
//		}
//		
//		public void attackZergling(Zergling zergling) {
//			
//			String targetNmae = zergling.getName();
//			System.out.println(name+ "이(가)" + targetNmae +" 공격합니다");
//			System.out.println();
//			zergling.beAttacked(this.power);
//			
//		}
		
		// getname
		
		public String getName() {
			return this.name;
		}

		
// 메서드 오버로딩
		public void attack(Zealot zealot) {
			
			String targetNmae = zealot.getName();
			System.out.println(name+ "이(가)" + targetNmae +" 공격합니다");
			System.out.println();
			zealot.beAttacked(this.power);
		}
		
		public void attack(Zergling zergling) {
			
			String targetNmae = zergling.getName();
			System.out.println(name+ "이(가)" + targetNmae +" 공격합니다");
			System.out.println();
			zergling.beAttacked(this.power);
			
			
			
		}
		
	
	

}
