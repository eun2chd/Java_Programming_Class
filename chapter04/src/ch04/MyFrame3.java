package ch04;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.*;


class ImagePanel extends JPanel {
	
	private Image image; 
	// ������� ���� �̹������� �޴� ����

	
	public ImagePanel(String imageName) {
		
		image = new ImageIcon(imageName).getImage();
		
	}
	
	@Override
	protected void paintBorder(Graphics g) {
		// TODO Auto-generated method stub
		super.paintBorder(g);
		g.drawImage(image,0,0,getWidth(),getHeight(), null);
	}
	
	
	
	// ������ �����ε�
	
	
	public ImagePanel() {

		image = new ImageIcon("image1.png").getImage();
		
	
		
	}
	
	@Override
	public void paint(Graphics g) {
			
		super.paint(g);
		g.drawImage(image, 0,0,getWidth(), getHeight(), null);
		
		
	}
	
	
}
///

public class MyFrame3 extends JFrame{
	
	private ImagePanel imagePanel;
	private ImagePanel imagePanel2;
	private JButton button;
	
	
	public MyFrame3() {
		
		initData();
		setInLayout();
	}
	
	private void initData() {
		
		setTitle("J�гο� �̹��� �ֱ�");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		imagePanel = new ImagePanel();
		imagePanel2 = new ImagePanel("image2.png");
		button = new JButton("��ư�Դϴ�.");
		
	}
	private void setInLayout() {
		
		setVisible(true);
		setLayout(new GridLayout(2,1));
		add(imagePanel);
		add(imagePanel2);
		
		imagePanel.add(button);
		
	}
	
	
	public static void main(String[] args) {
		  
		new MyFrame3();
	}

}
