package t20_AWT.T1_Basic;

import java.awt.Frame;

@SuppressWarnings("serial")
public class Test2 extends Frame {

	public Test2() {
		super("AWT 프레임");
		//setTitle("AWT 프레임");
		setSize(300,250);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Test2();
	}
}
