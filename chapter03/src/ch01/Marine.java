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
		
		System.out.println("---����â---");
		System.out.println("�̸� : " + this.name);
		System.out.println("���ݷ� : " + this.power);
		System.out.println("ü�� : " + this.hp);
		System.out.println("----------");
			
	}
	
	public void beAttacked(int power) {
		
		this.hp -= power;
		
		if(this.hp < 0) 
		{
			this.hp = 0;
			System.out.println(this.name+"���");
		}
		
		
	}
		// ������ ������ �����մϴ�
		
		// ������ ���۸��� �����մϴ�.
//		public void attackZealot(Zealot zealot) {
//
//			String targetNmae = zealot.getName();
//			System.out.println(name+ "��(��)" + targetNmae +" �����մϴ�");
//			System.out.println();
//			zealot.beAttacked(this.power);
//			
//			
//		}
//		
//		public void attackZergling(Zergling zergling) {
//			
//			String targetNmae = zergling.getName();
//			System.out.println(name+ "��(��)" + targetNmae +" �����մϴ�");
//			System.out.println();
//			zergling.beAttacked(this.power);
//			
//		}
		
		// getname
		
		public String getName() {
			return this.name;
		}

		
// �޼��� �����ε�
		public void attack(Zealot zealot) {
			
			String targetNmae = zealot.getName();
			System.out.println(name+ "��(��)" + targetNmae +" �����մϴ�");
			System.out.println();
			zealot.beAttacked(this.power);
		}
		
		public void attack(Zergling zergling) {
			
			String targetNmae = zergling.getName();
			System.out.println(name+ "��(��)" + targetNmae +" �����մϴ�");
			System.out.println();
			zergling.beAttacked(this.power);
			
			
			
		}
		
	
	

}
