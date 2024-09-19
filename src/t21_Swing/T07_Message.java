package t21_Swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class T07_Message extends JFrame {
	JPanel pn1, pn2;
	JButton btn1, btn2, btn3, btn4, btn5;
	JLabel lblMessage;

	public T07_Message() {
		super("메세지 연습");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); //setLocationRelativeTo(null)은 이 창을 화면의 가운데에 띄우게 해주는 메소드이다
		setResizable(false);
		setLayout(new GridLayout(2,1));

		pn1 = new JPanel();
		btn1=new JButton("경고");
		btn2=new JButton("입력");
		btn3=new JButton("종료");
		btn4=new JButton("종료(예/아니오)");
		btn5=new JButton("예/아니오/취소");

		pn1.add(btn1);
		pn1.add(btn2);
		pn1.add(btn3);
		pn1.add(btn4);
		pn1.add(btn5);

		pn2=new JPanel();
		lblMessage=new JLabel("메세지가 출력됩니다.");
		pn2.add(lblMessage);

		this.add(pn1);
		add(pn2);

		setVisible(true);

		/*======================================*/

		// 경고메세지 버튼 
		btn1.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblMessage.setText("경고버튼을 누르셨습니다.");
				//JOptionPane.showMessageDialog(null, "경고합니다.");
				JOptionPane.showMessageDialog(null, "경고합니다.","경고메세지", JOptionPane.WARNING_MESSAGE);
			}
		});
		//입력메세지 버튼
		btn2.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblMessage.setText("입력버튼을 누르셨습니다.");
			}
		});
		// 종료버튼클릭
		btn3.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});	
		//예/아니오 버튼
		btn4.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				int ans =JOptionPane.showConfirmDialog(null, "종료할까요?","작업 종료창", JOptionPane.YES_NO_OPTION);
				if(ans==0) {
					lblMessage.setText("작업을 계속 진행 합니다.");
				}
				else {
					lblMessage.setText("작업을 종료 합니다.");
				}
			}
		});


		// 예/아니오/취소
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int ans =JOptionPane.showConfirmDialog(null, "종료할까요?","작업 종료창", JOptionPane.YES_NO_CANCEL_OPTION);
				if(ans==0) {
					lblMessage.setText("작업을 계속 진행 합니다.");
				}
				else if(ans==1) {
					lblMessage.setText("작업을 종료 합니다.");
				}
				else {
					JOptionPane.showMessageDialog(null, "작업을 취소합니다.");
					lblMessage.setText("작업을 취소 합니다.");
				}
			}
		});
	}


	public static void main(String[] args) {
		new T07_Message();
	}
}
