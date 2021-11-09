package ch05;

public class SubMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Subway sub = new Subway(11);
		
		Subway sub2 = new Subway(22);
		
		Subway sub3 = new Subway(33);
		
		sub.take(1450);
		sub.take(1450);
		sub.take(1450);
		sub.showInfo();
		System.out.println("--------------------");
		System.out.println();
		sub2.take(1300);
		sub2.take(1300);
		sub2.showInfo();
		System.out.println("--------------------");
		System.out.println();
		sub3.take(1500);
		sub3.take(1500);
		sub3.take(1500);
		sub3.take(1500);
		sub3.showInfo();
		System.out.println("--------------------");
		System.out.println();
		
	}

}
