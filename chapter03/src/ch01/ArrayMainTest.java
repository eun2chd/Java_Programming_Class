package ch01;

public class ArrayMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = new int[12];
		
		// ������ ������ �ִ� �迭�� 12ĭ ����
		
		Zealot[] zealotes = new Zealot[12];
		
		// ����
		Marine[] marine = new Marine[12];
		
		// ���۸�
		Zergling[] zergling = new Zergling[12];
		
		// �迭�� for���� �Բ� ���� ���
		
		for(int i = 0; i<zealotes.length;i++)
		{
			zealotes[i] = new Zealot("����0" + (i+1));
			
		}
		for(int i = 0; i<marine.length;i++)
		{
			marine[i] = new Marine("����1" + (i+1));
		}
		for(int i = 0; i<zergling.length;i++)
		{
			zergling[i] = new Zergling("���۸�1" + (i+1));
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
