package ch10;

public class Gateway {
	
	
	public static int zealotCount = 0;
	private int gatewayId;
	private String name;
	
	 
	public Gateway(int id) {
		
		this.gatewayId = id;
		name = "게이트웨이";
		
	}
	
	// 질럿 생성하기
	
	public Zealot cerateZealot() {
		
		System.out.println("질럿 생산");
		zealotCount++;
		return new Zealot("질럿");
		
		
				
		
	}
	
	
	
	
	
	
	

}
