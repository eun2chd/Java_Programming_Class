package ch03;

import ch02.Plastic;
import ch02.Powder;

public class GenericPrinterTest {
	
	public static void main(String[] args) {
		
		
		Powder powder = new Powder();
		Plastic plastic = new Plastic();
		
		// ����� �� �ڷ����� �־� �ָ�ȴ�.
		
		// �����; T ��ſ� ����� �� � �ڷ����� ������� ������ �ָ� �ȴ�.
		GenericPrinter<Powder> genericPrinter1 = new GenericPrinter<Powder>();
		GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<Plastic>();
		
		// ��� �ֱ�
		genericPrinter1.setrMaterial(powder);
		genericPrinter2.setrMaterial(plastic);
		
		// ��� ������
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
