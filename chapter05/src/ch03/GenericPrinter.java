package ch03;

public class GenericPrinter<T>  {
	
//	T ��� ��ü ���ڸ� ����Ѵ�. E -element  - Key ,  V - value
	// �ڷ��� �Ű����� ( type paramater)
	
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
