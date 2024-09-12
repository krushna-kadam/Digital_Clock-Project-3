package com.Digital_clock_Java_Project;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

public class DigitalClock {

	private JFrame frame;
	 JTextField textField;
	 JTextField textField_1;
	 JTextField textField_2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClock window = new DigitalClock();
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
	public DigitalClock() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 546, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		Font f = null;
		try {
		       f = Font.createFont(Font.TRUETYPE_FONT,DigitalClock.class.getResourceAsStream("/digital-7/digital-7.ttf"));
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 546, 300);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		textField = new JTextField("06");
		textField.setFont(f.deriveFont(Font.BOLD,100f));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBorder(null);
		textField.setEditable(false);
		textField.setBounds(26, 84, 119, 112);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField("06");
		textField_1.setFont(f.deriveFont(Font.BOLD,100f));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBorder(null);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(201, 84, 119, 112);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField("06");
		textField_2.setFont(f.deriveFont(Font.BOLD,100f));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setBorder(null);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(385, 84, 119, 112);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel = new JLabel(":");
		lblNewLabel.setFont(f.deriveFont(Font.BOLD,100f));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(330, 133, 49, 14);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel(":");
		lblNewLabel_1.setFont(f.deriveFont(Font.BOLD,100f));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(152, 84, 45, 112);
		panel.add(lblNewLabel_1);
		
		new ClockThread(this);
	}
}
