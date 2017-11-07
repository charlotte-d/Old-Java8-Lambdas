package java8lambdas;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * LambdaTester
 * 11/6/17
 *  Creates random buttons to practice with lambdas from Java 8
 * @author Charlotte Dye    
 *
 */
public class LambdaTester {

	public static void main(String[] args) {
		Color[] colors = {Color.BLUE, Color.GREEN, Color.CYAN, Color.PINK, Color.MAGENTA};
		
		JFrame frame = new JFrame("LambdaTester");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.LINE_AXIS));
		
		JButton button1 = new JButton("Click to change border color!");
		button1.addActionListener(e -> buttonPanel.setBorder(BorderFactory.createLineBorder(colors[(int) (Math.random()*colors.length)], 10)));
		buttonPanel.add(button1);
		
		JButton button2 = new JButton("Click to change background color!");
		button2.addActionListener(e -> buttonPanel.setBackground(colors[(int) (Math.random()*colors.length)]));
		buttonPanel.add(button2);
		
		frame.getContentPane().add(buttonPanel);
		frame.pack();
		frame.setSize(800, 200);
		frame.setVisible(true);

	}
	
	

}
