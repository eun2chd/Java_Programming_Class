package ch11;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String �� ä�����α׷��� ������� new�� String �� �����ϸ� �޸𸮿� �����ϰɸ�
//	   �̷����� �ٸ������ �̿�
		
		// �ѹ� ������ String �Һ�(immutable)
		
		// Stringd�� �����ϸ� ������ String �� ����Ǵ� ���� �ƴ� 
		// ���ο� ���ڿ��� �����ȴ�.
		
		String java = new String("java");
		String android = new String("Android");
		
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
		
		System.out.println("---------------------");
		
		// java = java + android;
//		���ڿ��� ���� concat �Լ�
		java = java.concat(android);
		System.out.println(java);
//		���ڿ��� �����ϴ¼��� �����ִ� ������ ����ϰ� ���ο� ������ ���� �Ҵ���

		System.out.println(System.identityHashCode(java));

	}

}
