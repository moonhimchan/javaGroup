package t20_AWT.T2_Layout;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class T5_AbsoluteLayout extends Frame {
	Button btn1,btn2,btn3,btn4,btn5,btnExit;
	Label lblTitle;

	public T5_AbsoluteLayout() {
		setTitle("사용자지정 레이아웃");
		setBounds(400, 300, 350, 400);
		setLayout(null);

		btn1=new Button("일");
		btn2=new Button("이");
		btn3=new Button("삼");
		btn4=new Button("사");
		btn5=new Button("오");
		btnExit=new Button("종료");

		btn1.setBounds(100,100,150,30);
		btn2.setBounds(100,140,150,30);
		btn3.setBounds(100,180,150,30);
		btn4.setBounds(100,220,150,30);
		btn5.setBounds(100,260,150,30);
		btnExit.setBounds(100,300,150,30);

		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btnExit);

		setVisible(true);


		/*==========================================*/

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);	
			}
		});

		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new T5_AbsoluteLayout();
	}
}
