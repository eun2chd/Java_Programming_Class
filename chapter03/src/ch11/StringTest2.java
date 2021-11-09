package ch11;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String 은 채팅프로그램을 예를들면 new나 String 을 남발하면 메모리에 과부하걸림
//	   이럴때는 다른방식을 이용
		
		// 한번 생성된 String 불변(immutable)
		
		// Stringd을 연결하면 기존의 String 에 연결되는 것이 아닌 
		// 새로운 문자열이 생성된다.
		
		String java = new String("java");
		String android = new String("Android");
		
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
		
		System.out.println("---------------------");
		
		// java = java + android;
//		문자열을 연결 concat 함수
		java = java.concat(android);
		System.out.println(java);
//		문자열을 연결하는순간 원래있던 공간을 폐기하고 새로운 공간을 만들어서 할당함

		System.out.println(System.identityHashCode(java));

	}

}
