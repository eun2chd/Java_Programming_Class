package ch11;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// StringBuilder, StringBuffer 활용
		// 내부적으로 가변적인 char[] 를 멤버 변수로 가짐.
		// 문자열을 여러번 연결하거나 변경할 때 사용하면 유용하다.
		// StringBuffer 는 멀티 쓰레드 프로그래밍에서 동기화를 보장
		// 단일 쓰레드 프로그램에서는 StringBuilder 사용하기를 권장
		
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder builder = new StringBuilder(java);
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		
		builder.append(android);
		System.out.println("----------------------");
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));

		builder.append("안녕자바");
		builder.append("hi");
		builder.append("자바를 사용하세요");
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		
//		String 타입과 Stringbuilder 는 다른 타입이기때문에 형변환을 해줌
		String tempStr = builder.toString();
		System.out.println(tempStr);
		
		
		
		 
		
		
		
		

	}

}
