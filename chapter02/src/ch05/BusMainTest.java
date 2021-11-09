package ch05;

public class BusMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bus bus101 = new Bus(101);
		
		Bus bus102 = new Bus(102);
		
		bus101.showInfo();
		System.out.println("-------------------------");
		bus102.showInfo();
		
		bus101.take(1200);
		bus101.showInfo();
		System.out.println("-------------------------");
		
		bus102.take(1200);
		bus102.take(500);
		bus102.showInfo();

	}

}
