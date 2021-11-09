package ch03;

import ch02.Plastic;
import ch02.Powder;

public class GenericPrinterTest {
	
	public static void main(String[] args) {
		
		
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		// 사용할 때 자료형을 넣어 주면된다.
		
		// 사용방법; T 대신에 사용할 때 어떤 자료형을 사용할지 지정해 주면 된다.
		GenericPrinter<Powder> genericPrinter1 = new GenericPrinter<Powder>();
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<Plastic>();
		
		// 재료 넣기
		genericPrinter1.setrMaterial(powder);
		genericPrinter2.setrMaterial(plastic);
		
		// 재료 꺼내기
		Powder tempPowder = genericPrinter1.getMaterial();
		Plastic plastic2 = genericPrinter2.getMaterial();
		
		
		System.out.println(tempPowder);
		System.out.println("--------------------");
		System.out.println(plastic2);
		
		System.out.println("--------------------");
		
		System.out.println(genericPrinter1);
		System.out.println(genericPrinter2);
		
		
		
		
		
		
	}

}
