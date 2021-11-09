package ch07;

public class Hero {

	private String name;
	private int hp;
	private double defense;
	private int level;

	public int getHP() {

		return this.hp;

	}

	public int getLevel() {

		return this.level;

	}

	public double getDefen() {
		return defense;

	}

	public void setHP(int hp) {
		
		if(hp < 0)
		{
			System.out.println("잘못 입력 하였습니다.");
		}
		else {
			this.hp = hp;
		}
		
	

	}

	public void setLevel(int level) {
		
		if(level < 0)	{
	
			System.out.println("잘못 입력 하였습니다.");
		}
		else {
			
			this.level = level;
			
		}
			
			
	}

	public void setDefen(double defense) {
		
		if(defense < 0) {
			
			System.out.println("잘못 입력 하였습니다.");
		}
		else
		{
			this.defense=defense;

		}
		
		
	}
	
	

	public String getName() {

		return this.name;

	}

	public void setName(String name) {
		// 방어적 코드 작성

		if (name == null || name == "" || name.length() < 2) {

			System.out.println("잘못된 입력 입니다. 이름을 다시 작성하세요");
			System.out.println();
		} else {
			this.name = name;
		}

	}

	public static void main(String[] args) {

		// hero 객체 생성 후 getter , setter 메서드를 사용

		Hero h1 = new Hero();
		h1.setName("티모");
		String name = h1.getName();
		System.out.println(name);
	
		
		
		h1.setHP(100);
		h1.setLevel(30);
		h1.setDefen(50.5);
		
		int hp = h1.getHP();
		int level = h1.getLevel();
		double defnse = h1.getDefen();
		
		
		System.out.println();
		System.out.println(hp);
		System.out.println(level);
		System.out.println(defnse);
		
		
	
	}

}
