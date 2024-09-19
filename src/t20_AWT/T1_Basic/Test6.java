package t20_AWT.T1_Basic;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class Test6 extends Frame implements WindowListener {

	public Test6() {
		super("AWT 프레임");
		//setTitle("AWT 프레임");
		//setSize(300,250);
		setBounds(300, 200, 350, 250);
		
		// 레이블 컴포넌트
		Label label= new Label("레이블 테스트 입니다.");
		this.add(label);
		
		//버튼 컴포런트
		Button button=new Button("Exit");
		//this.add(button);
		add(button);
		
		setVisible(true);

		addWindowListener(this);
	}

	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}

	public static void main(String[] args) {
		new Test6();
	}
}
