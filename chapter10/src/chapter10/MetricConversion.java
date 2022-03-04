package chapter10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class MetricConversion {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
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
	public MetricConversion() {
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
		JLabel lbl2 = new JLabel("");
		lbl2.setBounds(93, 155, 246, 33);
		frame.getContentPane().add(lbl2);
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			String unit = (String)comboBox.getSelectedItem(); /*saves current combobox item as string*/
			
			if (unit == "Inches to Centimeters") { /*prints inches to centimeters conversion*/
				lbl2.setText("1 inch = 2.54 centimeters");
			}
			if (unit == "Feet to Meters") { /*prints feet to meters conversion*/
				lbl2.setText("1 foot = 0.3048 meters");
			}
			if (unit == "Gallons to Liters") { /*prints gallons to liters conversion*/
				lbl2.setText("1 gallon = 4.5461 liters");
			}
			if (unit == "Pounds to Kilograms") { /*prints pounds to kg conversion*/
				lbl2.setText("1 pound = 0.4536 kilograms");
			}
				
			
			}
		}); /*saves different conversion choices as combo box options*/
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Inches to Centimeters", "Feet to Meters", "Gallons to Liters", "Pounds to Kilograms"}));
		comboBox.setBounds(93, 100, 177, 22);
		frame.getContentPane().add(comboBox);
		
		
		
		JLabel lbl = new JLabel("Select a conversion type:");
		lbl.setBounds(93, 75, 177, 14);
		frame.getContentPane().add(lbl);
		
		
	}
}
