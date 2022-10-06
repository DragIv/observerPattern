package Swing;
	
import java.awt.*;
import javax.swing.*;
	
public class SwingObserver {
	JFrame frame;
	
	public static void main(String[] args) {
		SwingObserver example = new SwingObserver();
		example.go();
	}
	
	public void go() {
		frame = new JFrame();

		JButton button = new JButton("Should I do it?");
		


		button.addActionListener(event ->
			System.out.println("Don't do it, you might regret it!")
		);
		button.addActionListener(event ->
			System.out.println("Come on, do it!")
		);
		frame.getContentPane().add(BorderLayout.CENTER, button);


		// Set frame properties 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(100,100);
		frame.setVisible(true);
	}
}
