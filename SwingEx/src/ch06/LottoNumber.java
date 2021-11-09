package ch06;

import java.util.Arrays;
import java.util.Random;

public class LottoNumber {
	
	static final int LOTTO_NUM_SIZE = 6;
	
	// �ζ� ��ȣ�� �����ϴ� ��� (6�ڸ�)
	
	public int[] getLottoNumber() {
		
		// ��ȣ�� ���� ����
		int[] numbers = new int[LOTTO_NUM_SIZE];
		
		Random random = new Random();
		
		for (int i = 0; i < numbers.length; i++) {
			
			numbers[i] = random.nextInt(45) + 1;
			System.out.println("���� i "+i + "\t");
			System.out.println("���� �迭 "+numbers[i] + "\t");
			for (int j = 0; j < i; j++) {
				
				System.out.println("���� j " + j);
				
				if(numbers[i] == numbers[j]) {
					System.out.println("������ �߻�");
					i = i -1;
					break;
				}
			}
			
			
			
		}
		
		// �迭 ����
		Arrays.sort(numbers);
		
		
		return numbers;
		
	}
	
	// �׽�Ʈ �ڵ�
	public static void main(String[] args) {
		
		LottoNumber lottoNumber = new LottoNumber();
		
		int[] nums = lottoNumber.getLottoNumber();
		for(int i : nums) {
			System.out.print(i+"\t");
		}
		
	}
	


}
