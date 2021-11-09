package ch02;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class MyFrame5 extends JFrame{
	
	JLabel label;
	
	public MyFrame5() {
		
		initData();
		setInitLayout();
		addEventListener();
	
		
	}
	
	private void initData() {
		
		setTitle("마우스 이벤트");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		label = new JLabel("hello java~");
		label.setSize(80,100);
		
		
	}
	
	private void setInitLayout() {
		
		setVisible(true);
		setLayout(null);
		add(label);
//		label.setLocation(50,60);
	}
	
	private void addEventListener() {
		
		this.addMouseListener(new MouseListener() {
			
			// 마우스가 떨어졌을 때 실행되는 메서드
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
				
			}
			
			// 마우스가 눌러 졌을 때
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
			
			}
			
			// 마우스가 나갔을 때 실행되는 매서드
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
	
			}
			// 마우스가 들어올때 실행되는 메서드
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
			
			}
			
			// 마우스가 클릭 되었을때 실행되는 메서드
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
				int X_num = e.getX();
				int Y_num = e.getY();
				
				label.setLocation(X_num, Y_num);
				
				System.out.println(e.getX() + " : 좌표값 x");
				System.out.println(e.getY() + " : 좌표값 y");
				
			}
		});
		
} // end of addEventListener

	
	public static void main(String[] args) {
		new MyFrame5();
	}

}
