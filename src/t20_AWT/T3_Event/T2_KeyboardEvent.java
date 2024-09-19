package t20_AWT.T3_Event;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

@SuppressWarnings("serial")
public class T2_KeyboardEvent extends Frame implements WindowListener, KeyListener{
	public T2_KeyboardEvent() {
		setTitle("키보드 이벤트 연습!");
		setBounds(300, 250, 300, 300);

		setVisible(true);

		addWindowListener(this);
		addKeyListener(this);
	}

	public static void main(String[] args) {
		new T2_KeyboardEvent();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("키보드 입력중...");
	}
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("키보드 누르는 순간...");
		System.out.println("입력된 키는?" +e.getKeyChar()+"/"+e.getKeyCode());
	}
	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("키보드를 눌렀다가 놓는 순간...");
	}

	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {System.exit(0);}
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
}
