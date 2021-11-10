package ch04;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Activity2 extends JFrame{
	
	String name;
	JPanel panel;
	CallbackCheckPositon checkPositon;
	
	// 콜리 : 호출자
	public Activity2(String name) {
		
		this.name = name;
		// TODO Auto-generated constructor stub
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel = new JPanel();
		
		setVisible(true);
		add(panel);
		panel.setBackground(Color.yellow);
		
		// 마우스 리스너 생성
		this.addMouseListener(new MouseAdapter() {
		   
			@Override
			public void mouseClicked(MouseEvent e) {

				int x = e.getX();
				int y = e.getY();
				// 방어적 코드 필요함
				// todd
				if(checkPositon != null) {
					checkPositon.checkPosition(x, y);
				}
				
			}
		
		});
		
	}
	// 메서드를 통해서 연결하기

	public void setCallbackCheckPositon(CallbackCheckPositon callbackCheckPositon) {
		// 멤버 변수에 주소값을 저장하는 것
		this.checkPositon = callbackCheckPositon;
	}
	
	
	
	
	
	
	
	
	
	
	

}
