package ch03;

public class MainTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �� ������  (&& , ||) ���ۼ�Ʈ, ��Ƽ�� ��
		// ���� �����ڿ� ȥ���Ͽ� ���� ��� ��
		// ������ ����� true, false
		
		int num1 = 10;
		int num2 = 20;
		// 1. ���� &&
		// 
		
		// ���� =1 , ���� = 0
		
		boolean flag1 = (num1 > 0) && (num2 > 0); // 1 && 1 = 1
		
		boolean flag2 = (num1 > 0) && (num2 < 0); // 1 && 0 = 0
		
		// 2. �� �� (||)
		
		boolean flag3 = (num1 < 0) || (num2 > 0); // 0 || 1 = 1
		boolean flag4 = (num1 > 0) || (num2 > 0); // 1 || 1 = 1
		
		System.out.println(flag4);
		System.out.println("====================");
		
		// num1 = 10
		boolean flag5 = (num1 < 0) && (num2 > 0); 
		
		boolean flag6 = (num1 > 0) || (num2 > 0); 
		
		
		
		
		
		
		
		
		

	}

}
