package t20_AWT.T1_Basic;

import java.awt.Frame;

//Container처리(Frame)
public class Test1 {
	public static void main(String[] args) {
		Frame frame = new Frame();
		
		frame.setTitle("AWT 프레임");
		frame.setSize(300,250); // 프레임 크기(폭,높이) - 픽셀단위
		
		frame.setVisible(true); 
	}
}
