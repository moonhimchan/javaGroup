package t20_AWT.T2_Layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class T3_BorderLayout extends Frame {
	Button btn1,btn2,btn3,btn4,btn5;

	public T3_BorderLayout() {
		/*=================UI(화면설계)===================*/ 
		setTitle("BorderLayout 연습!");
		setBounds(300, 200, 300, 300);
		setLayout(new BorderLayout());

		btn1=new Button("동쪽");
		btn2=new Button("서쪽");
		btn3=new Button("남쪽");
		btn4=new Button("북쪽");
		btn5=new Button("가운데");

		add(btn1, BorderLayout.EAST);
		add(btn2, BorderLayout.WEST);
		add(btn3, BorderLayout.SOUTH);
		//add(btn4, BorderLayout.NORTH);
		//add(btn5, BorderLayout.CENTER);
		add(btn4, "North");
		add(btn5, "Center");

		setVisible(true);

		/*==================코드(메소드처리)============*/

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}

	public static void main(String[] args) {
		new T3_BorderLayout();
	}
}
