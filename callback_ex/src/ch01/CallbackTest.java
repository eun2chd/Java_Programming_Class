package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


// �������̽��� �����Ѵ�.
interface CallbackBtnAction {
	
	public abstract void clickedAddBtn();
	public void clickedMinusBtn();
	public void clickedmultply();
	public void clickedivison();
	public void clickedDoubleadd();
	public void passValue(int value);
	// �޼��� 3�� ����
	
	
} // end of interface

// �ݹ� �޴� ��ü : CallBackBtnAction �������̽��� �����ؼ� �޼��带 ���� �Ѵ�.
class MainActivity extends JFrame implements CallbackBtnAction{
	
	int count;
	JLabel label;
	
	public MainActivity() {
		
		count = 0;
		label = new JLabel(count + "");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		setLayout(new FlowLayout());
		add(label);
		
	}

	@Override
	public void clickedAddBtn() {
		// TODO Auto-generated method stub
		// �ݹ�Ǿ����� �޼��� : 
		System.out.println(this.getClass().getName() + "�� �ݹ� �޾ҽ��ϴ�.");
		count++;
		label.setText(count + "");
		
	}

	@Override
	public void clickedMinusBtn() {
		// TODO Auto-generated method stub
		System.out.println("���̳ʽ� �ݹ� �޾ҽ��ϴ�.");
		count--;
		label.setText(count + "");
		
	}

	@Override
	public void clickedmultply() {
		// TODO Auto-generated method stub
		System.out.println("���ϱ� �ݹ� �޾ҽ��ϴ� [*2]");
		count *= 2;
		label.setText(count + "");
	}

	@Override
	public void clickedivison() {
		// TODO Auto-generated method stub
		System.out.println("������ �ݹ� �޾ҽ��ϴ�. [/2]");
		count  /= 2;
		label.setText(count + "");
		
		
	}

	@Override
	public void clickedDoubleadd() {
		// TODO Auto-generated method stub
		System.out.println("2���ϱ� ��ư �ݹ� �޾ҽ��ϴ�");
		count += 2;
		label.setText(count + "");
		
	}

	@Override
	public void passValue(int value) {
			
		count  = value;
		label.setText(count + "");
		
		
	}

	
	
	
} // end of mainActivity


// �ݸ� : (ȣ����) : �ݹ� �޴� ��ü�� �ּҰ��� �˰� �־�� �޼��尡 ȣ�� �Ǿ��ٰ� �˸� �� �ִ�.
class SubActivity extends JFrame implements ActionListener{
	
	JButton btnAdd;
	JButton btnMinus;
	JButton btnmultiply;
	JButton btndivision;
	JButton btndoubleadd;
	
	JButton btnPassValue;
	
	
	// ����1 ��ư 3�� ����
	
	
	// 1. ��� ������ ������ �� �ش�.
	CallbackBtnAction callbackBtnAction;
	
	
	
	public SubActivity(CallbackBtnAction callbackBtnAction) {
		// �߿�!!
		this.callbackBtnAction = callbackBtnAction;
		
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnAdd = new JButton("���ϱ� ��ư");
		btnMinus = new JButton("���� ��ư");
		btnmultiply = new JButton("���ϱ� ��ư");
		btndivision = new JButton("������ ��ư");
		btndoubleadd = new JButton("2���ϱ� ��ư");

		btnPassValue= new JButton("�� ���� ��ư");
		
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
		add(btnAdd);
		add(btnMinus);
		add(btnmultiply);
		add(btndivision);
		add(btndoubleadd);
	
		add(btnPassValue);
		
		btnAdd.addActionListener(this);
		btnMinus.addActionListener(this);
		btnmultiply.addActionListener(this);
		btndivision.addActionListener(this);
		btndoubleadd.addActionListener(this);
	
		btnPassValue.addActionListener(this);
		
		
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// 1. ��ư ����
		JButton targetBtn = (JButton)e.getSource();
		
		if(targetBtn == btnAdd) {
			// ���ϱ� ��ư
			callbackBtnAction.clickedAddBtn();
			
			
		}else if(targetBtn == btnMinus) {
			// ���� ��ư
			callbackBtnAction.clickedMinusBtn();
		}else if(targetBtn == btnmultiply) {
			
			System.out.println("���ϱ��ư");
			callbackBtnAction.clickedmultply();
			
		}else if(targetBtn == btndivision) {
			System.out.println("������ ��ư");
			callbackBtnAction.clickedivison();
		}else if(targetBtn == btndoubleadd) {
			System.out.println("2���ϱ� ��ư");
			callbackBtnAction.clickedDoubleadd();
		}else if(targetBtn == btnPassValue) {
			System.out.println("�� ���� ��ư�� Ŭ�� �Ǿ����ϴ�.");
			callbackBtnAction.passValue(100);
		}
		
		
		
	}
	
} 






public class CallbackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MainActivity mainActivity =  new MainActivity();
		
		new SubActivity(mainActivity);
		
		

	}

}
