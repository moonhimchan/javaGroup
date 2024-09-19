package t20_AWT.T1_Basic;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.accessibility.AccessibleAction;

@SuppressWarnings("serial")
public class Test7 extends Frame implements WindowListener, ActionListener {

	public Test7() {
		super("AWT 프레임");
		//setTitle("AWT 프레임");
		//setSize(300,250);
		setBounds(300, 200, 350, 250);

		// 레이블 컴포넌트
		Label label= new Label("레이블 테스트 입니다.");
		this.add(label);

		//버튼 컴포런트
		Button exitBtn=new Button("Exit");
		//this.add(button);
		add(exitBtn);

		setVisible(true);

		addWindowListener(this);
		exitBtn.addActionListener(this);
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
		new Test7();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
