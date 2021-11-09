package ch02;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Myframe8 extends JFrame {

	BufferedImage backgroundImage;
	BufferedImage imageIcon1;
	BufferedImage imageIcon2;
	MyImagePanel imagePanel;

	
	int xPoint = 200;
	int yPoint = 200;
	
	final int Max_Down=390;
	final int Max_RIGHT=420;
	


	public Myframe8() {
			
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
			
		setTitle("이미지 백그라운드 연습2");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
			
			backgroundImage = ImageIO.read(new File("background1.jpg"));
			imageIcon1 = ImageIO.read(new File("among1.jpg"));
			imageIcon2 = ImageIO.read(new File("rock.png"));
				
		} catch (Exception e) {
			
			System.err.println("파일이 없습니다.");
			System.exit(0);
			// TODO: handle exception
		}
		
		imagePanel = new MyImagePanel();
		
		
	}

	private void setInitLayout() {

		this.setVisible(true);
		this.setResizable(false); // 그림을 늘리지 못하게함
		this.add(imagePanel);
		
		
		
	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
				
			@Override
			public void keyPressed(KeyEvent e) {
				
				int keyCode = e.getKeyCode();
				
				
			
			
				if(keyCode == KeyEvent.VK_UP) {
				
					yPoint -= 10;
					    yPoint = (yPoint < 0) ? 0 : yPoint-10;
					   
				}else if(keyCode == KeyEvent.VK_DOWN) {
						yPoint += 10;
						System.out.println(yPoint);
						yPoint = (yPoint < Max_Down) ? yPoint + 10 : Max_Down;
					
				}else if(keyCode == KeyEvent.VK_LEFT) {
						System.out.println(xPoint);
				
					    xPoint = (xPoint < 0) ? 0 : xPoint-20;
						
//						if(xPoint < 0) {
//							xPoint = -20;
//						}
						
				}else if(keyCode == KeyEvent.VK_RIGHT) {
						xPoint += 10;
						xPoint = (xPoint < Max_RIGHT) ? xPoint + 10 : Max_RIGHT;
				}
				
				repaint();
			
			} // end of keyPressed
		
		});
		
		
	} 
	
	// 내부 클래스
	
	private class MyImagePanel extends JPanel {
		
		@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.drawImage(backgroundImage,0,0,500,500,null);
			g.drawImage(imageIcon1, xPoint ,yPoint ,80,80, null);
			g.drawImage(imageIcon2, 10 ,50 ,50,50, null);
			
		}
		
	}
	
	
	
	

} // end of class
