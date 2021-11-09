package ch03;

public class GenericPrinter<T>  {
	
//	T 라는 대체 문자를 사용한다. E -element  - Key ,  V - value
	// 자료형 매개변수 ( type paramater)
	
	private T material;
	
	public T getMaterial() {
		
		return material;
		
		
	}
	public void setrMaterial(T material) {
		
		this.material = material;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return material.toString();
	}
	

}
