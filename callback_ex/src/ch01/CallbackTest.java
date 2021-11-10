package ch01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


// 인터페이스를 선언한다.
interface CallbackBtnAction {
	
	public abstract void clickedAddBtn();
	public void clickedMinusBtn();
	public void clickedmultply();
	public void clickedivison();
	public void clickedDoubleadd();
	public void passValue(int value);
	// 메서드 3개 생성
	
	
} // end of interface

// 콜백 받는 객체 : CallBackBtnAction 인터페이스를 구현해서 메서드를 정의 한다.
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
		// 콜백되어지는 메서드 : 
		System.out.println(this.getClass().getName() + "이 콜백 받았습니다.");
		count++;
		label.setText(count + "");
		
	}

	@Override
	public void clickedMinusBtn() {
		// TODO Auto-generated method stub
		System.out.println("마이너스 콜백 받았습니다.");
		count--;
		label.setText(count + "");
		
	}

	@Override
	public void clickedmultply() {
		// TODO Auto-generated method stub
		System.out.println("곱하기 콜백 받았습니다 [*2]");
		count *= 2;
		label.setText(count + "");
	}

	@Override
	public void clickedivison() {
		// TODO Auto-generated method stub
		System.out.println("나누기 콜백 받았습니다. [/2]");
		count  /= 2;
		label.setText(count + "");
		
		
	}

	@Override
	public void clickedDoubleadd() {
		// TODO Auto-generated method stub
		System.out.println("2더하기 버튼 콜백 받았습니다");
		count += 2;
		label.setText(count + "");
		
	}

	@Override
	public void passValue(int value) {
			
		count  = value;
		label.setText(count + "");
		
		
	}

	
	
	
} // end of mainActivity


// 콜리 : (호출자) : 콜백 받는 객체의 주소값을 알고 있어야 메서드가 호출 되었다고 알릴 수 있다.
class SubActivity extends JFrame implements ActionListener{
	
	JButton btnAdd;
	JButton btnMinus;
	JButton btnmultiply;
	JButton btndivision;
	JButton btndoubleadd;
	
	JButton btnPassValue;
	
	
	// 문제1 버튼 3개 생성
	
	
	// 1. 멤버 변수로 선언을 해 준다.
	CallbackBtnAction callbackBtnAction;
	
	
	
	public SubActivity(CallbackBtnAction callbackBtnAction) {
		// 중요!!
		this.callbackBtnAction = callbackBtnAction;
		
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnAdd = new JButton("더하기 버튼");
		btnMinus = new JButton("빼기 버튼");
		btnmultiply = new JButton("곱하기 버튼");
		btndivision = new JButton("나누기 버튼");
		btndoubleadd = new JButton("2더하기 버튼");

		btnPassValue= new JButton("값 전달 버튼");
		
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

		// 1. 버튼 구분
		JButton targetBtn = (JButton)e.getSource();
		
		if(targetBtn == btnAdd) {
			// 더하기 버튼
			callbackBtnAction.clickedAddBtn();
			
			
		}else if(targetBtn == btnMinus) {
			// 빼기 버튼
			callbackBtnAction.clickedMinusBtn();
		}else if(targetBtn == btnmultiply) {
			
			System.out.println("곱하기버튼");
			callbackBtnAction.clickedmultply();
			
		}else if(targetBtn == btndivision) {
			System.out.println("나누기 버튼");
			callbackBtnAction.clickedivison();
		}else if(targetBtn == btndoubleadd) {
			System.out.println("2더하기 버튼");
			callbackBtnAction.clickedDoubleadd();
		}else if(targetBtn == btnPassValue) {
			System.out.println("값 전달 버튼이 클릭 되었습니다.");
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
