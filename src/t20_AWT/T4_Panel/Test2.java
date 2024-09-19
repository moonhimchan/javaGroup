package t20_AWT.T4_Panel;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class Test2 extends Frame {
	Panel pn1, pn2, pn3, pn4, pn5;
	Label lbl1, lbl2, lbl3;
	Button btnExit;
	
	public Test2() {
		setTitle("패널 연습");
		setBounds(400, 350, 400, 350);
		setLayout(new GridLayout(1, 2));
		
		pn1 = new Panel();
		pn1.setLayout(new GridLayout(3, 1));
		pn2 = new Panel();
		pn2.setLayout(new GridLayout(1, 1));
		pn2.setBackground(Color.BLUE);
		
		btnExit = new Button("Exit");
		btnExit.setBackground(Color.MAGENTA);
		pn2.add(btnExit);
		
		pn3 = new Panel();
		pn4 = new Panel();
		pn5 = new Panel();
		pn3.setBackground(Color.YELLOW);
		pn4.setBackground(Color.GRAY);
		pn5.setBackground(Color.GREEN);
		
		lbl1 = new Label("첫번째 패널입니다.");
		lbl2 = new Label("두번째 패널입니다.");
		lbl3 = new Label("세번째 패널입니다.");
		
		pn3.add(lbl1);
		pn4.add(lbl2);
		pn5.add(lbl3);
		
		pn1.add(pn3);
		pn1.add(pn4);
		pn1.add(pn5);
		
		add(pn1);
		add(pn2);
		
		setVisible(true);
		
		/* ============================= */
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new Test2();
	}
}
