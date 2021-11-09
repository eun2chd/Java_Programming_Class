package ch04;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MyFrame1 extends JFrame {
	
	MyFrame1() {
		
		setTitle("gif 사용해보기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("감사합니다!!");
		ImageIcon img = new ImageIcon("image.gif");
		JLabel imglaJLabel = new JLabel(img);
		
		JLabel bottomTextLabel = new JLabel("고맙습니다!");
		
		c.add(textLabel);
		c.add(imglaJLabel);
		c.add(bottomTextLabel);
		
		setSize(500,500);
		setVisible(true);
	
	}
	
}

public class MainTest2 {
	
	public static void main(String[] args) {
		
		new MyFrame1();
		
		
	}

}
