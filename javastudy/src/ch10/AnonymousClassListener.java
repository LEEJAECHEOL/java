package ch10;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class AnonymousClassListener extends JFrame {

	public AnonymousClassListener() {
		setTitle("Action EventListener Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action")) {
					b.setText("액션");
				}else {
					b.setText("Action");
				}
				setTitle(b.getText());
			}
		});
		c.add(btn);
		setSize(350, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new AnonymousClassListener();
	}

}
