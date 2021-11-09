package ch01;

public class Zealot {
	
	private int power;
	private int hp;
	private String name;
	
	public Zealot(String name) {
		
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
	
	// 공격 합니다. 질럿이 마린을 공격한는 동작
	// 다른 객체와 상호 작용 - 메서드로 참조 변수 전달
	
//	public void attackMarine(Marine marine) {
//
//		String targetNmae = marine.getName();
//		System.out.println(name+ "이(가)" + targetNmae +" 공격합니다");
//		System.out.println();
//		marine.beAttacked(this.power);
//		
//		
//	}
//	
//	public void attackZergling(Zergling zergling) {
//		
//		String targetNmae = zergling.getName();
//		System.out.println(name+ "이(가)" + targetNmae +" 공격합니다");
//		System.out.println();
//		zergling.beAttacked(this.power);
//		
//	}
	
	
	
	
public void beAttacked(int power) {
		
		this.hp -= power;
		
		if(this.hp < 0) 
		{
			hp = 0;
			System.out.println(this.name+"사망");
			
		}	
	
		
}

	
public String getName() {
	return this.name;
}


// 매서드 오버로딩


	public void attack(Marine marine) {

		String targetNmae = marine.getName();
		System.out.println(name+ "이(가)" + targetNmae +" 공격합니다");
		System.out.println();
		marine.beAttacked(this.power);
		
	}
	public void attack(Zergling zergling) {
		
		String targetNmae = zergling.getName();
		System.out.println(name+ "이(가)" + targetNmae +" 공격합니다");
		System.out.println();
		zergling.beAttacked(this.power);
		
	}



}
