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
		
		System.out.println("---����â---");
		System.out.println("�̸� : " + this.name);
		System.out.println("���ݷ� : " + this.power);
		System.out.println("ü�� : " + this.hp);
		System.out.println("----------");
			
	}
	
	// ���� �մϴ�. ������ ������ �����Ѵ� ����
	// �ٸ� ��ü�� ��ȣ �ۿ� - �޼���� ���� ���� ����
	
//	public void attackMarine(Marine marine) {
//
//		String targetNmae = marine.getName();
//		System.out.println(name+ "��(��)" + targetNmae +" �����մϴ�");
//		System.out.println();
//		marine.beAttacked(this.power);
//		
//		
//	}
//	
//	public void attackZergling(Zergling zergling) {
//		
//		String targetNmae = zergling.getName();
//		System.out.println(name+ "��(��)" + targetNmae +" �����մϴ�");
//		System.out.println();
//		zergling.beAttacked(this.power);
//		
//	}
	
	
	
	
public void beAttacked(int power) {
		
		this.hp -= power;
		
		if(this.hp < 0) 
		{
			hp = 0;
			System.out.println(this.name+"���");
			
		}	
	
		
}

	
public String getName() {
	return this.name;
}


// �ż��� �����ε�


	public void attack(Marine marine) {

		String targetNmae = marine.getName();
		System.out.println(name+ "��(��)" + targetNmae +" �����մϴ�");
		System.out.println();
		marine.beAttacked(this.power);
		
	}
	public void attack(Zergling zergling) {
		
		String targetNmae = zergling.getName();
		System.out.println(name+ "��(��)" + targetNmae +" �����մϴ�");
		System.out.println();
		zergling.beAttacked(this.power);
		
	}



}
