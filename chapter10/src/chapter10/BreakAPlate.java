package chapter10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;


public class BreakAPlate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
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
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ImageIcon plates1 = new ImageIcon("..//chapter10/plates.gif");
		ImageIcon plates2 = new ImageIcon("..//chapter10/src/chapter10/plates_all_broken.gif");
		ImageIcon plates3 = new ImageIcon("..//chapter10/src/chapter10/plates_two_broken.gif");
		ImageIcon tiger = new ImageIcon("..//chapter10/src/chapter10/tiger_plush.gif");
		ImageIcon pholder = new ImageIcon("..//chapter10/src/chapter10/placeholder.gif");
		ImageIcon sticker = new ImageIcon("..//chapter10/src/chapter10/sticker.gif");
		/*sets images as icon, loading them ahead of time so they can be called when needed*/



		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		JLabel lbl = new JLabel("");
		lbl.setBounds(72, 11, 278, 99);
		panel.add(lbl);
		
		JLabel lbl2 = new JLabel("");
		lbl2.setBounds(159, 192, 129, 58);
		panel.add(lbl2);
		/*first label holds plates, sets unbroken plates at start of the game, second label holds prize,
		sets placeholder at beginning of game*/
		lbl.setIcon(plates1);
		lbl2.setIcon(pholder);
	
		
		JButton btn = new JButton("Play");
		btn.setBounds(177, 135, 63, 29);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				/* chooses random int between 0 and 1*/
				Random rand = new Random();
				int prize = rand.nextInt(2);
				
				if (prize == 0) { /* if random int is 0 then player wins*/
					lbl.setIcon(plates2);
					lbl2.setIcon(tiger);
				} else {
					lbl.setIcon(plates3);
					lbl2.setIcon(sticker);
				}
				
				
			}
		});
		panel.add(btn);
		/*reset button to return game to default state after being played*/
		JButton btn2 = new JButton("Reset");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbl.setIcon(plates1);
				lbl2.setIcon(pholder);
				
			}
		});
		btn2.setBounds(10, 138, 89, 23);
		panel.add(btn2);
		
		
		
	}
}
