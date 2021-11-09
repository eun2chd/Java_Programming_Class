package ch08;


public class Unit {
	
	public static int zealotC = 0;
	public static int zerlingC = 0;
	public static int marineC = 0;
	
	private int Id; // �ǹ� ��ȣ
	private String IDname; // �ǹ� �̸� ex) �跰,��ó�� ���
	int power;
	int hp;
	String name;
	


	public Unit(String name, int hp, int power, int id, String IDname) {

		this.power = power;
		this.hp = hp;
		this.name = name;
		this.IDname = IDname;
		this.Id = id;

	}
	
	
	public void showInfo() {

		System.out.println("=======����â======");
		System.out.println("name: " + this.name);
		System.out.println("hp : " + this.hp);
		System.out.println("power : " + this.power);
		System.out.println("=================");
		System.out.println();

	}

	public void attack(Marine marine) {
		
		marine.beAttack(power);
		System.out.println(this.name + " ��(��) " + marine.name + "�� �����߽��ϴ�.");
		System.out.println(marine.name + "�� ���� ü�� : " + marine.hp);
		System.out.println(this.name + "���ݷ� :" +  this.power);
		System.out.println("---------------------------------");
		System.out.println();
	
	}
	public void attack(Zealot zealot) {
		
		zealot.beAttack(power);
		System.out.println(this.name + "��(��)" + zealot.name + "�� �����߽��ϴ�.");
		System.out.println(zealot.name + "�� ���� ü�� : " + zealot.hp);
		System.out.println(this.name + "���ݷ� :" +  this.power);
		System.out.println("---------------------------------");
		System.out.println();
	
	}
	public void attack(Zerling zerling) {
		
		zerling.beAttack(power);
		System.out.println(this.name + "��(��)" + zerling.name + "�� �����߽��ϴ�.");
		System.out.println(zerling.name + "�� ���� ü�� : " + zerling.hp);
		System.out.println(this.name + "���ݷ� :" +  this.power);
		System.out.println("---------------------------------");
		System.out.println();

	}
	
	public String getReturnIdName() {
		
		return this.IDname;
		
	}
	
	public int getID() {
		
		return this.Id;
	}

	public void marineCreat(Marine marine) {
		
		System.out.println(marine.getID()+"��"+marine.getReturnIdName() + " ���� "+marine.name + "����");
		System.out.println();
		marineC++;
		
	}
	public void zealotCreat(Zealot zealot) {
		
		System.out.println(zealot.getID()+"��"+zealot.getReturnIdName() + "����"+zealot.name + "����");
		System.out.println();
		zealotC++;
		
	}	
	public void zerlingCreat(Zerling zerling) {
		
		System.out.println(zerling.getID()+"��"+zerling.getReturnIdName() + "����"+zerling.name + "����");
		System.out.println();
		zerlingC++;
		
	}
	
	

	
	// ����
	public void beAttack(int power) {

		this.hp -= power;
		
		if (hp < 0) {

			hp = 0;
			System.out.println("����Ͽ����ϴ�!");
			System.out.println("-------------------");

		}

	}

}
