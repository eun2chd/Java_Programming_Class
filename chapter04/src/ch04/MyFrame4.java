package ch04;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyFrame4 extends JFrame{
	
	final int MAX_COUNT = 4;
	
	ArrayList<BufferedImage> image = new ArrayList<>();
	
	
	
	BufferedImage backgroundImage;
	BufferedImage imageIcon;
	BufferedImage imageIcon2;
	BufferedImage imageIcon3;


	MyimagePanel myimagePanel;
	
	
	public MyFrame4()  {
		// TODO Auto-generated constructor stub
		initData();
		setinitLayout();
	}
	
	private void initData() {
		
		setTitle("백그라운드 이미지 넣기");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
			backgroundImage = ImageIO.read(new File("bankground1.jpg"));
			imageIcon = ImageIO.read(new File("among1.jpg"));
			imageIcon2 = ImageIO.read(new File("among2.png"));
			imageIcon3 = ImageIO.read(new File("among3.png"));
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 찾을 수 없습니다.");
		}
		
		myimagePanel = new MyimagePanel();
		
		
		
	}
	
	private void setinitLayout() {
		
		setVisible(true);
		add(myimagePanel);
		
		
		
	}
	
	
	
	
	
	private class MyimagePanel extends JPanel {
		
		
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			
			g.drawImage(backgroundImage,0,0, 500,500, null);
			g.drawImage(imageIcon,200,200, 80,80, null);
			g.drawImage(imageIcon2,100,150, 80,80, null);
			g.drawImage(imageIcon3,50,50, 80,80, null);
			
			
		
		}
		
		
		
		
	} // end of inner class
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new MyFrame4();

		
		
	} // end of main

} // end of class
