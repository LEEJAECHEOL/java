package ch10;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OpenCallenge extends JFrame {
	private Container c;
	private JPanel pnGame;
	private JLabel laNum1, laNum2, laNum3, laText;
	
	public void initObject() {
		c = getContentPane();
		pnGame = new JPanel();
		laNum1 = new JLabel("0");
		laNum2 = new JLabel("0");
		laNum3 = new JLabel("0");
		laText = new JLabel("게임을 시작합니다.");
	}
	public void initSetting() {
		setTitle("Open Challenge!!");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pnGame.setLayout(null);
		
		laNum1.setOpaque(true);
		laNum1.setSize(50, 50);
		laNum1.setLocation(30, 50);
		laNum1.setBackground(Color.PINK);
		laNum1.setForeground(Color.YELLOW);
		laNum1.setFont(new Font("Selft", Font.BOLD, 50));
		laNum1.setHorizontalAlignment(JLabel.CENTER);

		laNum2.setOpaque(true);
		laNum2.setSize(50, 50);
		laNum2.setLocation(120, 50);
		laNum2.setBackground(Color.PINK);
		laNum2.setForeground(Color.YELLOW);
		laNum2.setFont(new Font("Selft", Font.BOLD, 50));
		laNum2.setHorizontalAlignment(JLabel.CENTER);

		laNum3.setOpaque(true);
		laNum3.setSize(50, 50);
		laNum3.setLocation(220, 50);
		laNum3.setBackground(Color.PINK);
		laNum3.setForeground(Color.YELLOW);
		laNum3.setFont(new Font("Selft", Font.BOLD, 50));
		laNum3.setHorizontalAlignment(JLabel.CENTER);

		laText.setSize(100, 30);
		laText.setLocation(100, 120);
		
		c.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {}
			
			@Override
			public void keyReleased(KeyEvent e) {}
			
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				System.out.println(keyCode);
				if(keyCode == KeyEvent.VK_ENTER) {
					int n1 = (int)(Math.random() * 5);
					int n2= (int)(Math.random() * 5);
					int n3 = (int)(Math.random() * 5);
					laNum1.setText(Integer.toString(n1));
					laNum2.setText(Integer.toString(n2));
					laNum3.setText(Integer.toString(n3));
					if(n1 == n2 && n1 == n3) {
						laText.setText("축하합니다!");
					} else {
						laText.setText("아쉽군요.");
					}
				}
			}
		});
		
		
	}
	public void initBatch() {
		pnGame.add(laNum1);
		pnGame.add(laNum2);
		pnGame.add(laNum3);
		pnGame.add(laText);
		c.add(pnGame);
	}
	
	public OpenCallenge() {
		initObject();
		initSetting();
		initBatch();
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	public static void main(String[] args) {
		new OpenCallenge();
	}

}
