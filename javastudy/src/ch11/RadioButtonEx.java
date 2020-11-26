package ch11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonEx extends JFrame{
	
	public RadioButtonEx() {
		setTitle("라디오버튼 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon icon1 = new ImageIcon("images/heart.png");
		ImageIcon icon2 = new ImageIcon("images/heart2.png");
		
		ButtonGroup g = new ButtonGroup();
		
		
		JRadioButton apple = new JRadioButton("apple");
		JRadioButton pear = new JRadioButton("pear", true);
		JRadioButton cherry = new JRadioButton("cherry", icon1);
		
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(icon2);
		
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		
		setSize(250, 150);
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		new RadioButtonEx();
	}

}
