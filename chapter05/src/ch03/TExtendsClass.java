package ch03;

public class TExtendsClass {
	
	// < T extends Ŭ����> ����ϱ�
	// T �ڷ����� ������ ���� �� �� ����
	// (�������� ������ �ڷ������� �ƹ� Ŭ������ �� �� �ִ�.)
	
	public static void main(String[] args) {
		
		GenericPrinter2<Powder> powderPrinter = new GenericPrinter2<>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powder);
		System.out.println("------------");
		
		
		
		
	}
	
	
}
