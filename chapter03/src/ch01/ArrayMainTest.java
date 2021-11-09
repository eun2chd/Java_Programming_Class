package ch01;

public class ArrayMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = new int[12];
		
		// 질럿을 담을수 있는 배열을 12칸 만듬
		
		Zealot[] zealotes = new Zealot[12];
		
		// 마린
		Marine[] marine = new Marine[12];
		
		// 저글링
		Zergling[] zergling = new Zergling[12];
		
		// 배열은 for문과 함께 많이 사용
		
		for(int i = 0; i<zealotes.length;i++)
		{
			zealotes[i] = new Zealot("질럿0" + (i+1));
			
		}
		for(int i = 0; i<marine.length;i++)
		{
			marine[i] = new Marine("마린1" + (i+1));
		}
		for(int i = 0; i<zergling.length;i++)
		{
			zergling[i] = new Zergling("저글링1" + (i+1));
		}
		
		
		
		
		for(int i =0;i<zealotes.length;i++) {

				zealotes[i].showInfo();
		}
		for(int i =0;i<marine.length;i++) {
			
			
			marine[i].showInfo();
	}
		for(int i =0;i<zergling.length;i++) {
			
			
			zergling[i].showInfo();
	}
	

		
		
		
		
		
		

	}

}
