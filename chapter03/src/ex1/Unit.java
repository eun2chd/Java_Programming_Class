package ex1;

// new 키워드를 사용해서 메모리에 올릴수 없다.
// 타입으로만 사용
public abstract class Unit {

	protected int power;
	protected int hp;
	protected String name;

	public void showInfo() {

		System.out.println("---정보창---");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("체력 : " + this.hp);
		System.out.println("----------");

	}

	public void beAttacked(int power) {

		this.hp -= power;

		if (this.hp < 0) {
			this.hp = 0;
			System.out.println(this.name + "사망");
		}

	}
	
	public String getName() {
		return this.name;
	}




	// 메서드 오버로딩
	public void attack(Unit unit) {

		String targetNmae = unit.getName();
		System.out.println(name + "이(가)" + targetNmae + "을 공격합니다");
		System.out.println();
		unit.beAttacked(this.power);
	}

}
