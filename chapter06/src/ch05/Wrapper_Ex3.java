package ch05;

public class Wrapper_Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "10";
		String str2 = "10.5";
		String str3 = "true";
		
		// 8 + "" -> String 
		byte b = Byte.parseByte(str);
		int i = Integer.parseInt(str);
		short s = Short.parseShort(str);
		long l = Long.parseLong(str);
		
		float f = Float.parseFloat(str2);
		System.out.println("f �� : " + f);
		double d = Double.parseDouble(str2);
		boolean bool = Boolean.parseBoolean(str3);
		System.out.println("boolean �� : " + bool);
		System.out.println("d�� : " + d);
		
		if(Boolean.parseBoolean(str3)) {
			System.out.println("boolean ������ ����Ϸ�");
		}
		
		String str10 = "1001";
		String str11 = "2001";
		
		int num = Integer.parseInt(str10);
		int num1 = Integer.parseInt(str11);
		
		System.out.println("����� : " + (num + num1));
		System.out.println("����� : " + (num * num1));
		
		
		
		
		
		System.out.println("���ڿ� byte �� ��ȯ : " + b);
		System.out.println("���ڿ� int�� ��ȯ : " + i);
		System.out.println(b);
		
		
		
		

	}

}
