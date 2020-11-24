package ch09;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;

public class Swing04 extends JFrame {
	
	private JPanel panelTop, panelCenter;
	private JButton btnOpen, btnRead, btnClose;
	private JLabel laJava, laHello, laLove;
	
	public void initObject() {
		panelTop = new JPanel();
		panelCenter = new JPanel();
		btnOpen = new JButton("Open");
		btnRead = new JButton("Read");
		btnClose = new JButton("Close");
		laJava = new JLabel("Java");
		laHello = new JLabel("Hello");
		laLove = new JLabel("Love");
	}
	public void initSetting() {
		setTitle("Open Challenge 9");
		setSize(400, 400);
		panelTop.setBackground(Color.GRAY);

		panelCenter.setLayout(null);
		laJava.setBounds(358, 93, 61, 16);
		laHello.setBounds(162, 31, 61, 16);
		laLove.setBounds(19, 188, 61, 16);
	}
	public void initBatch() {
		
		getContentPane().add(panelTop, BorderLayout.NORTH);
		panelTop.add(btnOpen);
		panelTop.add(btnRead);
		panelTop.add(btnClose);
		
		getContentPane().add(panelCenter, BorderLayout.CENTER);
		panelCenter.add(laJava);
		panelCenter.add(laHello);
		panelCenter.add(laLove);
	}

	public Swing04() {
		initObject();
		initSetting();
		initBatch();
		setVisible(true);
	}
	public static void main(String[] args) {
		new Swing04();
	}
}
