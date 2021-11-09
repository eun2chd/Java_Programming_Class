package aaa;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ColorChangeFrame extends SuperMyframe implements ActionListener {
	
	

	BorderLayout borderLayout;
	JPanel panel1;
	JPanel panel2;

	final int MAX_COUNT = 7;
	ArrayList<JButton> buttons = new ArrayList<>();
//	JButton[] buttons = new JButton[7];
	String[] ColorName = {"������","��Ȳ��","�����","�ʷϻ�","�Ķ���","����Ÿ","��ũ��"};


	
//	JButton button1;
//	JButton button2;
//	JButton button3;
//	JButton button4;
//	JButton button5;
//	JButton button6;
//	JButton button7;

	public ColorChangeFrame() {

		initData();
		setInitLayout();
		addEventListener();

		// TODO Auto-generated constructor stub
	}

	@Override
	protected void initData() {
		// TODO Auto-generated method stub
		super.initData();
		setTitle("�̺�Ʈ ������ ����3");
		setSize(500, 500);
		borderLayout = new BorderLayout();
		panel1 = new JPanel();
		panel2 = new JPanel();

		for (int i = 0; i < MAX_COUNT; i++) {
			
			buttons.add(new JButton(ColorName[i]));
			
		}
		
//		for (int i = 0; i < buttons.length; i++) {
//			buttons[i] = new JButton(ColorName[i]);
//		}
//		

//		button1 = new JButton("������");
//		button2 = new JButton("��Ȳ��");
//		button3 = new JButton("�����");
//		button4 = new JButton("�ʷϻ�");
//		button5 = new JButton("�Ķ���");
//		button6 = new JButton("����Ÿ");
//		button7 = new JButton("��ũ��");
		
	}

	@Override
	protected void setInitLayout() {
		// TODO Auto-generated method stub
		super.setInitLayout();
		setLayout(borderLayout);

		panel1.setBackground(Color.gray);
		panel1.setPreferredSize(new Dimension(500, 400));
		add(panel1, BorderLayout.NORTH);

		panel2.setBackground(Color.white);
		panel2.setLayout(new FlowLayout());
		panel2.setPreferredSize(new Dimension(500, 100));
		add(panel2);
	
		for (int i = 0; i < MAX_COUNT; i++) {
				
			panel2.add(buttons.get(i));
		}
		
//		for (int i = 0; i < buttons.length; i++) {
//			
//			panel2.add(buttons[i]);
//			
//		}
	
//		panel2.add(button1);
//		panel2.add(button2);
//		panel2.add(button3);
//		panel2.add(button4);
//		panel2.add(button5);
//		panel2.add(button6);
//		panel2.add(button7);

	}

	@Override
	protected void addEventListener() {
		// TODO Auto-generated method stub
		super.addEventListener();
		

		for (int i = 0; i < MAX_COUNT; i++) {
			
			buttons.get(i).addActionListener(this);
		}
		
//		for (int i = 0; i < MAX_COUNT; i++) {
//			
//			buttons[i].addActionListener(this);
//			
//		}

//		button1.addActionListener(this);
//		button2.addActionListener(this);
//		button3.addActionListener(this);
//		button4.addActionListener(this);
//		button5.addActionListener(this);
//		button6.addActionListener(this);
//		button7.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		JButton clickedButton = (JButton) e.getSource();
		System.out.println(clickedButton.getText());

		if (clickedButton.getText().equals(buttons.get(0).getText())) {
			System.out.println("���������� ����");
			panel1.setBackground(Color.red);

		} else if (clickedButton.getText().equals(buttons.get(1).getText())) {

			System.out.println("��Ȯ������ ����");
			panel1.setBackground(Color.orange);
		} else if (clickedButton.getText().equals(buttons.get(2).getText())) {
			System.out.println("��������� ����");
			panel1.setBackground(Color.yellow);

		} else if (clickedButton.getText().equals(buttons.get(3).getText())) {
			System.out.println("�ʷϻ����� ����");
			panel1.setBackground(Color.green);
		} else if (clickedButton.getText().equals(buttons.get(4).getText())) {
			System.out.println("�Ķ������� ����");
			panel1.setBackground(Color.blue);
		} else if (clickedButton.getText().equals(buttons.get(5).getText())) {
			System.out.println("����Ÿ������ ����");
			panel1.setBackground(Color.magenta);
		}else {
			System.out.println("��ũ������ ����");
			panel1.setBackground(Color.pink);
		}
		
	}

	public static void main(String[] args) {
		new ColorChangeFrame();
	}

}
