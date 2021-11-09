package aaa2;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame3 extends JFrame{
	
	JLabel label;
	
	public MyFrame3() {
		// TODO Auto-generated constructor stub
		
		initData();
		setInitLayout();
		addEventListener();
		
	}
	
	private void initData() {
		
		setTitle("마우스 이벤트");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("hello.java~");
		label.setSize(80,100);
	}
	private void setInitLayout() {
		
		setVisible(true);
		setLayout(null);
		add(label);
	}
	private void addEventListener() {
		
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
					System.out.println("111");
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("222");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("333");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("444");
			}		
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("555");
				
			}
		});
		
		
	} // end of eventListener
	
	
	
	public static void main(String[] args) {
		new MyFrame3();
	}

} // end of class
