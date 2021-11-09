package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class Myframe1 extends JFrame  implements ActionListener{
	
	JButton button;
	JButton button2;
	
	public Myframe1() {
		// TODO Auto-generated constructor stub
		
		initDate();
		setinitLayout();
		addEventListener();
	}
	
	private void initDate() {
		
		setTitle("이벤트 리스너 연습");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("button1");
		button2 = new JButton("button2");
	}
	
	private void setinitLayout() {
		
		setVisible(true);
		setLayout(new FlowLayout());
		add(button);
		add(button2);
		
		
		
	}
	private void addEventListener() {
		
		// 버튼을 눌렀을때 등록상황
		button.addActionListener(this);
		button2.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("시스템 콜백 실행");
		System.out.println("버튼이 클릭 되었씁니다.");

		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
}


public class EventListenerEx1 {
	
	public static void main(String[] args) {
		
		new Myframe1();
		
			
	}

}
