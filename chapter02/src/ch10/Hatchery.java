package ch10;

public class Hatchery {
	
	public static int zerglingcount=0;
	private int HacheryId;
	private String name;
	
	
	public Hatchery(int id) {
		
		this.HacheryId = id;
		name = "해처리";
	}
	
	public Zergling creatZergling() {
		
		System.out.println("저글링 생산");
		zerglingcount++;
		return new  Zergling("저글링");
		
		
	}

}
