package ch10;

public class Gateway {
	
	
	public static int zealotCount = 0;
	private int gatewayId;
	private String name;
	
	 
	public Gateway(int id) {
		
		this.gatewayId = id;
		name = "����Ʈ����";
		
	}
	
	// ���� �����ϱ�
	
	public Zealot cerateZealot() {
		
		System.out.println("���� ����");
		zealotCount++;
		return new Zealot("����");
		
		
				
		
	}
	
	
	
	
	
	
	

}
