package ch11;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// StringBuilder, StringBuffer Ȱ��
		// ���������� �������� char[] �� ��� ������ ����.
		// ���ڿ��� ������ �����ϰų� ������ �� ����ϸ� �����ϴ�.
		// StringBuffer �� ��Ƽ ������ ���α׷��ֿ��� ����ȭ�� ����
		// ���� ������ ���α׷������� StringBuilder ����ϱ⸦ ����
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder builder = new StringBuilder(java);
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		
		builder.append(android);
		System.out.println("----------------------");
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));

		builder.append("�ȳ��ڹ�");
		builder.append("hi");
		builder.append("�ڹٸ� ����ϼ���");
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		
//		String Ÿ�԰� Stringbuilder �� �ٸ� Ÿ���̱⶧���� ����ȯ�� ����
		String tempStr = builder.toString();
		System.out.println(tempStr);
		
		
		
		 
		
		
		
		

	}

}
