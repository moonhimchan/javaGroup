package t20_AWT.T4_Panel;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class Test1 extends Frame {
	Panel pn1,pn2,pn3;
	Label lbl1,lbl2,lbl3;

	public Test1() {
		setTitle("패널 연습");
		setBounds(400,350,400,350);
		setLayout(new GridLayout(3,1));

		//첫번째 패널
		pn1=new Panel();
		lbl1=new Label("첫번째 패널입니다.");
		pn1.add(lbl1);
		add(pn1);

		//두번째 패널
		pn2=new Panel();
		lbl2=new Label("두번째 패널입니다.");
		pn2.add(lbl2);
		add(pn2);

		//세번째 패널
		pn3=new Panel();
		lbl3=new Label("세번째 패널입니다.");
		pn3.add(lbl3);
		add(pn3);

		setVisible(true);

		/*====================================*/

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new Test1();
	}
}
