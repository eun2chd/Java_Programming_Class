package ch01;

public class Zergling {

	private int power;
	private int hp;
	private String name;
	
	public Zergling(String name) {
		
		this.name = name;
		this.power = 5;
		this.hp = 100;
	}
	
	public void  showInfo() {
		
		System.out.println("---정보창---");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("체력 : " + this.hp);
		System.out.println("----------");
			
	}
	
	// 공격 당합니다.

public void beAttacked(int power) {
		
		this.hp -= power;
		
		if(this.hp < 0) 
		{
			hp = 0;
			System.out.println(this.name+"사망");
		}	
		
		
		
}

//public void attackZealot(Zealot Zealot) {
//
//	String targetName = Zealot.getName();
//	System.out.println(name+ "이(가)" +targetName + " 공격합니다");
//	System.out.println();
//	Zealot.beAttacked(this.power);
//	
//	
//}
//
//public void attackMarine(Marine Marine) {
//	
//	String targetName = Marine.getName();
//	System.out.println(name+ "이(가) "+ targetName +" 공격합니다");
//	System.out.println();
//	Marine.beAttacked(this.power);
//	
//}


public String getName() {
	return this.name;
}





// 매서드 오버로딩

public void attack(Zealot zealot) {
	
	String targetName = zealot.getName();
	System.out.println(name+ "이(가)" +targetName + " 공격합니다");
	System.out.println();
	zealot.beAttacked(this.power);
	
}
public void attack(Marine marine) {
	
	String targetName = marine.getName();
	System.out.println(name+ "이(가) "+ targetName +" 공격합니다");
	System.out.println();
	marine.beAttacked(this.power);
	
	
}


// 저글링이 질럿을 공격합니다.
// 저글링이 마린을 공격합니다.




	
	
}
