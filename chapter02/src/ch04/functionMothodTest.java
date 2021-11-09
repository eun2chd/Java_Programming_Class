package ch04;

import java.util.Random;
import java.util.Scanner;

public class functionMothodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print();
		three();

	}

	public static void star(int num) {

		int star = num;

		for (int i = 0; i < star; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("☆");
			}
			System.out.println();
		}

	}

	public static void three() {

		Random rand = new Random();
		int randword;
		int count = 5;
		String a = "가위";
		String b = "바위";
		String c = "보";
		
		Scanner sc = new Scanner(System.in);
		

		/*randword = rand.nextInt(3);*/
			randword = 1;

		while (count != 0) {
			System.out.println();
			System.out.println();
			
			System.out.println("----- 숫자를 고르세요 ------");
			System.out.println("        남은 횟수 : " + count) ;
			System.out.println("가위 [ 0 ] 바위 [ 1 ] 보 [ 2 ] ");
			int input = sc.nextInt();
			
			if(input == 0)
			{
				if(randword == 2)
				{
					System.out.println("이겼습니다.");
					System.out.println("사용자 : " + a);
					System.out.println("컴퓨터 : " + c);
					break;
				}
				else if(input == 0 && randword == 0)
				{
					System.out.println("비겼습니다.");
					System.out.println("사용자 : " + a);
					System.out.println("컴퓨터 :"  + a);
					count--;
					System.out.println("남은 기회 : " + count);
				}
				else if(randword == 1)
				{
					System.out.println("LOSE.");
					System.out.println("사용자 : " + a);
					System.out.println("컴퓨터 : " + b);
					count--;
					System.out.println("남은 기회 : " + count);
					
				}
				
			}
			
			
			
		
		}

	}

	public static void print() {

		System.out.println("가위바위보 게임을 시작하겠습니다.");
		System.out.println("총 게임은 5번 진행됩니다.");
		System.out.println("승리하면 프로그램은 종료됩니다..");
	}

}
