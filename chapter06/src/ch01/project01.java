package ch01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class project01 extends JFrame implements ActionListener{
	
	BorderLayout borderLayout;
	
	BufferedImage backgroundImage;
	BufferedImage ImageIcon1;
	BufferedImage ImageIcon2;
	MyImagePanel imagePanel;
	
	JButton button1;
	JButton button2;
	
	JPanel panel1;
	JPanel panel2;
	
	int xPoint = 200;
	int yPoint = 200;
	
	int DxPoint = 40;
	int DyPoint = 40;
	
	final int UP_MAX = 10;
	final int DOWN_MAX = 250;
	final int LEFT_MAX = 10;
	final int RIGHT_MAX = 330;
	
	

	public project01() {
		
		initData();
		setInitLayout();
		addEventListener();
		
	
	}
	
	private void initData() {
		
		this.setTitle("돌피하기");
		this.setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		try {
			backgroundImage = ImageIO.read(new File("background.png"));
			ImageIcon1 = ImageIO.read(new File("ryan.png"));
			ImageIcon2 = ImageIO.read(new File("rock.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("파일이 없습니다.");
			e.printStackTrace();
		}
		
		
		
		imagePanel = new MyImagePanel();
		
	
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		button1 = new JButton("MOVE");
		button2 = new JButton("STOP");
		
	}
	
	private void setInitLayout() {
		
		this.setVisible(true);
		this.setResizable(false);
		this.add(imagePanel);	
		
		panel2.setBackground(Color.gray);
		panel2.setLayout(new FlowLayout());
		panel2.setPreferredSize(new Dimension(400,40));
		add(panel2,borderLayout.SOUTH);
		
		panel2.add(button1);
		panel2.add(button2);
	

	}
	
	private void addEventListener() {
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		
		
		this.addKeyListener(new KeyAdapter() {
			
		
			@Override
			public void keyPressed(KeyEvent e) {

				int keyCode = e.getKeyCode();
		
				// 키보드 이벤트 발생
				
				switch(keyCode)
				{
				
				case KeyEvent.VK_UP : 
						yPoint = (yPoint < UP_MAX) ?  UP_MAX : yPoint - 10;
						break;
				case KeyEvent.VK_LEFT :
						xPoint = (xPoint < LEFT_MAX) ? LEFT_MAX : xPoint -10;
						break;
				case KeyEvent.VK_RIGHT :
						xPoint = (xPoint < RIGHT_MAX) ? xPoint + 10 : RIGHT_MAX;
						break;
				case KeyEvent.VK_DOWN :
						yPoint +=10;
						yPoint = (yPoint < DOWN_MAX) ? yPoint + 10 : DOWN_MAX;						
						break;
				
				}
				
				repaint();
		
			}
		
		});
		
	

	} // end of listener
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton clickedButton = (JButton) e.getSource();
		Mythread thread = new Mythread();
		
		
		if(clickedButton.getText().equals(button1.getText())){		
			thread.start();
		}
		
		else if(clickedButton.getText().equals(button2.getText()))
		{
			thread.flag = false;
		
		}
		
		
		
		
	}	
	
	class Mythread extends Thread {
		
		boolean flag = true;
		
		@Override
		public void run() {

			while(flag) {
				if(DxPoint < RIGHT_MAX)
				{
					DxPoint += 10;
					repaint();	

				}
				else	if(DxPoint == RIGHT_MAX) {
					
					DxPoint = LEFT_MAX;
					repaint();	
				}
	
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
			
			}
			
			
		}
		
		
	}
}
	
 class MyImagePanel extends JPanel {
		
		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.drawImage(backgroundImage,0,0,400,400,null);
			g.drawImage(ImageIcon1,xPoint,yPoint,80,80,null);
			g.drawImage(ImageIcon2,DxPoint,DyPoint,50,50,null);
			

		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		new project01();
		
		
		
		
	} // end of main

	

} // end of class
