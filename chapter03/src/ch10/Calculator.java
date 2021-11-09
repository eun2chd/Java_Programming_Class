package ch10;

public abstract class Calculator implements Calc {
	
@Override
public int add(int num1, int num2) {
	
	int sum = num1 + num2;
	
	return sum;
}

@Override
	public int substract(int num1, int num2) {
	
	int sum = num1 -num2;
	
		return sum;
	}
	

}
