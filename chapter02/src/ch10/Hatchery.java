package ch10;

public class Hatchery {
	
	public static int zerglingcount=0;
	private int HacheryId;
	private String name;
	
	
	public Hatchery(int id) {
		
		this.HacheryId = id;
		name = "��ó��";
	}
	
	public Zergling creatZergling() {
		
		System.out.println("���۸� ����");
		zerglingcount++;
		return new  Zergling("���۸�");
		
		
	}

}
