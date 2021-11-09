package ch01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ColorChangeFrame extends SuperMyframe implements ActionListener {

	BorderLayout borderLayout;
	JPanel panel1;
	JPanel panel2;

	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;

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

		button1 = new JButton("������");
		button2 = new JButton("�����");
		button3 = new JButton("�Ķ���");
		button4 = new JButton("�ʷϻ�");
		button5 = new JButton("��Ȳ��");

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

		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);

	}

	@Override
	protected void addEventListener() {
		// TODO Auto-generated method stub
		super.addEventListener();

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		JButton clickedButton = (JButton) e.getSource();
		System.out.println(clickedButton.getText());

		if (clickedButton.getText().equals(button1.getText())) {
			System.out.println("���������� ����");
			panel1.setBackground(Color.red);

		} else if (clickedButton.getText().equals(button2.getText())) {

			System.out.println("��������� ����");
			panel1.setBackground(Color.yellow);
		} else if (clickedButton.getText().equals(button3.getText())) {
			System.out.println("�Ķ������� ����");
			panel1.setBackground(Color.blue);

		} else if (clickedButton.getText().equals(button4.getText())) {
			System.out.println("�ʷϻ����� ����");
			panel1.setBackground(Color.green);
		} else {
			System.out.println("��Ȳ������ ����");
			panel1.setBackground(Color.orange);
		}
		
	}

	public static void main(String[] args) {
		new ColorChangeFrame();
	}

}
