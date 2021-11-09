package ch10;

public class CompleteCalc extends Calculator{

	
	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		int result = 0;
	
		if(num2 == 0)
		{
			System.out.println("0으로 나눌수  없습니다.");
			result = ERROR;
		}else {
		
			result = num1 / num2;
		}
		
		return result;
		
	}

	@Override
	public void showinfo() {
		
		System.out.println("모두 구현 했습니다.");
		
	}
	
	

}
