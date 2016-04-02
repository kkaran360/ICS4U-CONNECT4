package karan.harsh;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class HomePanel extends JPanel {
	
	final int FONT_SIZE = 48;
	JLabel lblGameTitle;
	
	public HomePanel() {
		
		setBackground(Color.BLACK);
		setLayout(new GridLayout(8, 0, 55, 20));
		setPreferredSize(new Dimension(500, 600));
		setFont(new Font("Kristen ITC",Font.PLAIN, FONT_SIZE));
		
		add (lblGameTitle);
		
		
	}
}
