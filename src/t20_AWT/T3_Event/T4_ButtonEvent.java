package t20_AWT.T3_Event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class T4_ButtonEvent extends Frame implements ActionListener {
	Button btnPlay, btnStop, btnExit, btnMessage;
	Label lblMessage;
	
	public T4_ButtonEvent() {
		setTitle("버튼 이벤트 연습!");
		setBounds(350, 300, 300, 250);
		setLayout(new FlowLayout());
		
		btnPlay = new Button("Start");
		btnStop = new Button("Stop");
		btnExit = new Button("Exit");
		btnMessage = new Button("Message");
		
		add(btnPlay);
		add(btnStop);
		add(btnExit);
		add(btnMessage);
		
		lblMessage = new Label();
		add(lblMessage);
		
		setVisible(true);
		
		/* ==================================== */
		
		btnPlay.addActionListener(this);
		btnStop.addActionListener(this);
		btnExit.addActionListener(this);
		btnMessage.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new T4_ButtonEvent();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button btnText = (Button) e.getSource();
		
		if(btnText.getLabel().equals("Start")) { 
			System.out.println("시작버튼을 눌렀습니다.");
			lblMessage.setText("start");			
		}
		else if(btnText.getLabel().equals("Stop")) {
			System.out.println("정지버튼을 눌렀습니다.");
			lblMessage.setText("Stop");
		}
		else if(btnText.getLabel().equals("Exit")) {
			System.out.println("종료버튼을 눌렀습니다.");
			System.exit(0);
		}
		else if(btnText.getLabel().equals("Message")) {
			System.out.println("메세지버튼을 눌렀습니다.");
			lblMessage.setText("message");
		}
	}
}
