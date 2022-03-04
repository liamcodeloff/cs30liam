package chapter10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class DivisibleBy3 {

	private JFrame frame;
	private JTextField tf1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisibleBy3 window = new DivisibleBy3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DivisibleBy3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lbl = new JLabel("Enter an integer:");
		lbl.setBounds(32, 90, 106, 14);
		frame.getContentPane().add(lbl);
		
		JLabel lbl2 = new JLabel("");
		lbl2.setBounds(182, 143, 202, 19);
		frame.getContentPane().add(lbl2);
		
		JButton jbtn = new JButton("Check");
		jbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String msg = tf1.getText(); /*Saves text from the text field as a string*/
				
				int i = Integer.parseInt(msg); /* parses string msg returning as an integer value*/
				
				if (i % 3 ==0) { /*remainder math, divides int by 3 and searches for a remainder of 0*/
					lbl2.setText("Number is divisible by 3"); /*if remainder is 0 display this message, else print other messaqe*/
					
				} else {
					lbl2.setText("Number is not divisble by 3");
				}
				
				
				
			
				
				
			}
		});
		jbtn.setBounds(30, 139, 89, 23);
		frame.getContentPane().add(jbtn);
		
		tf1 = new JTextField();
		tf1.setBounds(197, 87, 141, 31);
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);
		
		
	}
}
