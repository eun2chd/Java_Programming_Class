package ex1;

// new Ű���带 ����ؼ� �޸𸮿� �ø��� ����.
// Ÿ�����θ� ���
public abstract class Unit {

	protected int power;
	protected int hp;
	protected String name;

	public void showInfo() {

		System.out.println("---����â---");
		System.out.println("�̸� : " + this.name);
		System.out.println("���ݷ� : " + this.power);
		System.out.println("ü�� : " + this.hp);
		System.out.println("----------");

	}

	public void beAttacked(int power) {

		this.hp -= power;

		if (this.hp < 0) {
			this.hp = 0;
			System.out.println(this.name + "���");
		}

	}
	
	public String getName() {
		return this.name;
	}




	// �޼��� �����ε�
	public void attack(Unit unit) {

		String targetNmae = unit.getName();
		System.out.println(name + "��(��)" + targetNmae + "�� �����մϴ�");
		System.out.println();
		unit.beAttacked(this.power);
	}

}
