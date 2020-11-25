package ch13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.time.LocalDateTime;

import javax.swing.JFrame;
import javax.swing.JLabel;

class ThreadClock implements Runnable {
	private JLabel labelHour, labelMinute, labelSec;

	public ThreadClock(JLabel labelHour, JLabel labelMinute, JLabel labelSec) {
		this.labelHour = labelHour;
		this.labelMinute = labelMinute;
		this.labelSec = labelSec;
	}

	@Override
	public void run() {
		while(true) {
			LocalDateTime now = LocalDateTime.now();
			labelHour.setText(Integer.toString(now.getHour()));
			labelMinute.setText(Integer.toString(now.getMinute()));
			labelSec.setText(Integer.toString(now.getSecond()));
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				return;
			}
		}
		
	}
	
}

public class Example03 extends JFrame{
	
	public Example03() {
		LocalDateTime now = LocalDateTime.now();
		setTitle("digital clock");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,200);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel gubun = new JLabel(":");
		gubun.setFont(new Font("Gothic", Font.ITALIC, 80));
		JLabel gubun2 = new JLabel(":");
		gubun2.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		JLabel hour = new JLabel(Integer.toString(now.getHour()));
		hour.setFont(new Font("Gothic", Font.ITALIC, 80));

		JLabel min = new JLabel(Integer.toString(now.getMinute()));
		min.setFont(new Font("Gothic", Font.ITALIC, 80));

		JLabel sec = new JLabel(Integer.toString(now.getSecond()));
		sec.setFont(new Font("Gothic", Font.ITALIC, 80));
		

		ThreadClock clocks = new ThreadClock(hour, min, sec);
		Thread th = new Thread(clocks);
		th.start();
		
		
		c.add(hour);
		c.add(gubun);
		c.add(min);
		c.add(gubun2);
		c.add(sec);
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Example03();
		
	}

}
