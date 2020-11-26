package ch11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx extends JFrame{
	
	public CheckBoxEx() {
		setTitle("체크박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon icon1 = new ImageIcon("images/heart.png");
		ImageIcon icon2 = new ImageIcon("images/heart2.png");
		
		JCheckBox apple = new JCheckBox("apple");
		JCheckBox pear = new JCheckBox("pear", true);
		JCheckBox cherry = new JCheckBox("cherry", icon1);
		
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(icon2);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250, 150);
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		new CheckBoxEx();
	}

}
