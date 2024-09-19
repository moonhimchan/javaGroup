package t20_AWT.T2_Layout;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class T4_GridLayout extends Frame{
	Button btn1,btn2,btn3,btn4,btn5,btnExit;
	Label lblTitle;

	public T4_GridLayout() {
		setTitle("GridLayout 연습!");
		setBounds(300, 350, 300, 350);
		setLayout(new GridLayout(2,3));

		btn1=new Button();
		btn2=new Button();
		btn3=new Button();
		btn4=new Button();
		btn5=new Button();
		btnExit=new Button();
		btn1.setLabel("첫번째");
		btn2.setLabel("첫번째");
		btn3.setLabel("첫번째");
		btn4.setLabel("첫번째");
		btn5.setLabel("첫번째");
		btnExit.setLabel("종료");

		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btnExit);

		setVisible(true);
		
		/*====================================================*/

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
		new T4_GridLayout();		
	}
}
