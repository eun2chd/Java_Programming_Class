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
		
		System.out.println("---����â---");
		System.out.println("�̸� : " + this.name);
		System.out.println("���ݷ� : " + this.power);
		System.out.println("ü�� : " + this.hp);
		System.out.println("----------");
			
	}
	
	// ���� ���մϴ�.

public void beAttacked(int power) {
		
		this.hp -= power;
		
		if(this.hp < 0) 
		{
			hp = 0;
			System.out.println(this.name+"���");
		}	
		
		
		
}

//public void attackZealot(Zealot Zealot) {
//
//	String targetName = Zealot.getName();
//	System.out.println(name+ "��(��)" +targetName + " �����մϴ�");
//	System.out.println();
//	Zealot.beAttacked(this.power);
//	
//	
//}
//
//public void attackMarine(Marine Marine) {
//	
//	String targetName = Marine.getName();
//	System.out.println(name+ "��(��) "+ targetName +" �����մϴ�");
//	System.out.println();
//	Marine.beAttacked(this.power);
//	
//}


public String getName() {
	return this.name;
}





// �ż��� �����ε�

public void attack(Zealot zealot) {
	
	String targetName = zealot.getName();
	System.out.println(name+ "��(��)" +targetName + " �����մϴ�");
	System.out.println();
	zealot.beAttacked(this.power);
	
}
public void attack(Marine marine) {
	
	String targetName = marine.getName();
	System.out.println(name+ "��(��) "+ targetName +" �����մϴ�");
	System.out.println();
	marine.beAttacked(this.power);
	
	
}


// ���۸��� ������ �����մϴ�.
// ���۸��� ������ �����մϴ�.




	
	
}
