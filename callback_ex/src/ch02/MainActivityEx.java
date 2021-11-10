package ch02;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

// 콜백 받는 객체 count 가 더해지는 결과가 나오는 곳
public class MainActivityEx extends JFrame implements CallbackBtn2{
	
	int count;
	JLabel label;
	
	public MainActivityEx() {
		// TODO Auto-generated constructor stub
		initData();
		setInitLayout();
		addEventListener();
	}
	private void initData() {
		
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		label = new JLabel(count + "");
		
		
		
	}
	private void setInitLayout() {
		
		setVisible(true);
		setLayout(new FlowLayout());
		add(label);
		
		
	}
	private void addEventListener(){
		
	}
	@Override
	public void clickadd() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void clickminus() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void clickmultply() {
		// TODO Auto-generated method stub
		
	}
	
	

}
