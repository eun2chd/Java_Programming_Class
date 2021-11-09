package ch02;

public class MainTest1 {

	public static void main(String[] args) {
		
		Powder powder  = new Powder();
		Plastic plastic = new Plastic();
		
		ThreeDPrinter1 printer = new ThreeDPrinter1();
		
		printer.setMaterial(powder);
	
		
		System.out.println(printer.getmaterial());
		
		System.out.println("---------------");
		
		ThreeDPrinter2 printer1 = new ThreeDPrinter2();
		printer1.setMaterial(plastic);
		System.out.println(printer1.getmaPlastic());
		
		System.out.println("---------------");
		
		ThreeDPrinter3 printer3 = new ThreeDPrinter3();
		// 재료세팅
		printer3.setMaterial(powder);
		System.out.println(printer3.getMaterial());
//		printer3.setMaterial(plastic);
		System.out.println(printer3.getMaterial());
		
		Powder temp1 = (Powder)printer3.getMaterial();

		
		System.out.println(printer3);
		
		
		
	}
	
}
