package ch04;

public class Hero {

	String name;
	int hp;

	public Hero(String name, int hp) {

		this.name = name;
		this.hp = hp;



	}

	public void attack(int power) {

		System.out.println("기본 공격");

		this.hp -= power;

		if (this.hp < 0) {
			this.hp = 0;
		}

	}

}
