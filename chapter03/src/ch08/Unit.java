package ch08;


public class Unit {
	
	public static int zealotC = 0;
	public static int zerlingC = 0;
	public static int marineC = 0;
	
	private int Id; // 건물 번호
	private String IDname; // 건물 이름 ex) 배럭,해처리 등등
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

		System.out.println("=======정보창======");
		System.out.println("name: " + this.name);
		System.out.println("hp : " + this.hp);
		System.out.println("power : " + this.power);
		System.out.println("=================");
		System.out.println();

	}

	public void attack(Marine marine) {
		
		marine.beAttack(power);
		System.out.println(this.name + " 이(가) " + marine.name + "을 공격했습니다.");
		System.out.println(marine.name + "의 남은 체력 : " + marine.hp);
		System.out.println(this.name + "공격력 :" +  this.power);
		System.out.println("---------------------------------");
		System.out.println();
	
	}
	public void attack(Zealot zealot) {
		
		zealot.beAttack(power);
		System.out.println(this.name + "이(가)" + zealot.name + "을 공격했습니다.");
		System.out.println(zealot.name + "의 남은 체력 : " + zealot.hp);
		System.out.println(this.name + "공격력 :" +  this.power);
		System.out.println("---------------------------------");
		System.out.println();
	
	}
	public void attack(Zerling zerling) {
		
		zerling.beAttack(power);
		System.out.println(this.name + "이(가)" + zerling.name + "을 공격했습니다.");
		System.out.println(zerling.name + "의 남은 체력 : " + zerling.hp);
		System.out.println(this.name + "공격력 :" +  this.power);
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
		
		System.out.println(marine.getID()+"번"+marine.getReturnIdName() + " 에서 "+marine.name + "생산");
		System.out.println();
		marineC++;
		
	}
	public void zealotCreat(Zealot zealot) {
		
		System.out.println(zealot.getID()+"번"+zealot.getReturnIdName() + "에서"+zealot.name + "생산");
		System.out.println();
		zealotC++;
		
	}	
	public void zerlingCreat(Zerling zerling) {
		
		System.out.println(zerling.getID()+"번"+zerling.getReturnIdName() + "에서"+zerling.name + "생산");
		System.out.println();
		zerlingC++;
		
	}
	
	

	
	// 공격
	public void beAttack(int power) {

		this.hp -= power;
		
		if (hp < 0) {

			hp = 0;
			System.out.println("사망하였습니다!");
			System.out.println("-------------------");

		}

	}

}
