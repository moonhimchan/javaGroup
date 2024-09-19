package t20_AWT.T2_Layout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class T1_FlowLayout extends Frame{
	// 생성자를 통해서 UI 설계처리한다.
	public T1_FlowLayout() {
		super("FlowLayout 연습!");

		setBounds(300,250,300,300);
		setLayout(new FlowLayout());
		Button btn1 = new Button("버튼1");
		Button btn2 = new Button("버튼2");
		Button btn3 = new Button("버튼3");
		Button btn4 = new Button("버튼4");
		Button btn5 = new Button("버튼5");
		Button btn6 = new Button("버튼6");

		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);


		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);//UI 유조인페이스 
			}
		});

		setVisible(true);
	}

	public static void main(String[] args) {
		new T1_FlowLayout();
	}
}
