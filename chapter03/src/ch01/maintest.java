package ch01;

public class maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10;
		
		// �迭 ���� ���
		int[] arr1 = new int[3];
		int arr2[] = new int[10];
		
		arr1[0] = 33;
		arr1[1] = 10;
		arr1[2] = 11;
		
		// �迭 ����� ���ÿ� �ʱ�ȭ
		int[] numbers1 = new int[] {11,20,30};
		int[] numbers2 = {10,50,100};
		
		System.out.println(numbers1[0]);
		System.out.println(numbers1[1]);
		System.out.println(numbers1[2]);
		System.out.println(numbers1);
		
		String[] strArr = new String[10];
		strArr[0] ="�߽���";
		strArr[1] ="Ƽ��";
		strArr[2] ="����";
		strArr[3] ="�ٸ��콺";
		
		// 1. ȭ�鿡 ���
		
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		System.out.println(strArr[3]);
		
		
		System.out.println(strArr.length);
		
		
		for(int i = 0; i<strArr.length;i++)
		{
						
				if(strArr[i] == null){
					
				}
				else
				{
					System.out.println(strArr[i]);
				}
							
		}
		
		// ��� ���α׷��� ������ index - 0 ���� �����մϴ�.
		// �迭�� ����Ҷ� ���� for���� �����ؼ� ���� ����մϴ�.
		
//		new int[22]; // �迭�� ���̴� 22 �ε��� 21
//		new int[74];  // �迭�� ���̴� 74 �ε��� 73
//		new int[283] // �迭�� ���̴� 283 �ε��� 282
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
