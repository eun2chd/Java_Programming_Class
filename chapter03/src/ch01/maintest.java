package ch01;

public class maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10;
		
		// 배열 선언 방법
		int[] arr1 = new int[3];
		int arr2[] = new int[10];
		
		arr1[0] = 33;
		arr1[1] = 10;
		arr1[2] = 11;
		
		// 배열 선언과 동시에 초기화
		int[] numbers1 = new int[] {11,20,30};
		int[] numbers2 = {10,50,100};
		
		System.out.println(numbers1[0]);
		System.out.println(numbers1[1]);
		System.out.println(numbers1[2]);
		System.out.println(numbers1);
		
		String[] strArr = new String[10];
		strArr[0] ="야스오";
		strArr[1] ="티모";
		strArr[2] ="에쉬";
		strArr[3] ="다리우스";
		
		// 1. 화면에 출력
		
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
		
		// 모든 프로그래밍 언어에서는 index - 0 부터 시작합니다.
		// 배열을 사용할때 보통 for문과 관계해서 많이 사용합니다.
		
//		new int[22]; // 배열의 길이는 22 인덱스 21
//		new int[74];  // 배열의 길이는 74 인덱스 73
//		new int[283] // 배열의 길이는 283 인덱스 282
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
