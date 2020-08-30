package com.calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator1 frame = new Calculator1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.BOLD, 20));
		textField.setBounds(22, 52, 435, 50);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		
		JLabel lblNewLabel = new JLabel("Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(22, 13, 151, 35);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"7");
			}
		});
		btnNewButton.setBounds(22, 212, 60, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
			}
		});
		btnNewButton_1.setBounds(106, 212, 60, 25);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("9");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		btnNewButton_1_1.setBounds(192, 212, 60, 25);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		btnNewButton_2.setBounds(22, 271, 60, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("5");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		btnNewButton_2_1.setBounds(106, 271, 60, 25);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("6");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
		});
		btnNewButton_2_2.setBounds(192, 271, 60, 25);
		contentPane.add(btnNewButton_2_2);
		
		JButton btnNewButton_2_3 = new JButton("1");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"1");
			}
		});
		btnNewButton_2_3.setBounds(22, 330, 60, 25);
		contentPane.add(btnNewButton_2_3);
		
		JButton btnNewButton_2_4 = new JButton("2");
		btnNewButton_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		btnNewButton_2_4.setBounds(106, 330, 60, 25);
		contentPane.add(btnNewButton_2_4);
		
		JButton btnNewButton_2_4_1 = new JButton("3");
		btnNewButton_2_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		btnNewButton_2_4_1.setBounds(192, 330, 60, 25);
		contentPane.add(btnNewButton_2_4_1);
		
		JButton btnNewButton_2_3_1 = new JButton("0");
		btnNewButton_2_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		btnNewButton_2_3_1.setBounds(22, 389, 60, 25);
		contentPane.add(btnNewButton_2_3_1);
		
		JButton btnNewButton_2_3_2 = new JButton(".");
		btnNewButton_2_3_2.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton_2_3_2.setFont(new Font("Arial", Font.BOLD, 30));
		btnNewButton_2_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+".");
			}
		});
		btnNewButton_2_3_2.setBounds(106, 389, 60, 25);
		contentPane.add(btnNewButton_2_3_2);
		
		JButton btnNewButton_2_3_3 = new JButton("^");
		btnNewButton_2_3_3.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton_2_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"^");
			}
		});
		btnNewButton_2_3_3.setBounds(192, 389, 60, 25);
		contentPane.add(btnNewButton_2_3_3);
		
		JButton btnNewButton_1_1_1 = new JButton("+");
		btnNewButton_1_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"+");
			}
		});
		btnNewButton_1_1_1.setBounds(297, 212, 60, 25);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2_2_1 = new JButton("-");
		btnNewButton_2_2_1.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"-");
			}
		});
		btnNewButton_2_2_1.setBounds(297, 271, 60, 25);
		contentPane.add(btnNewButton_2_2_1);
		
		JButton btnNewButton_2_4_1_1 = new JButton("/");
		btnNewButton_2_4_1_1.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton_2_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"/");
			}
		});
		btnNewButton_2_4_1_1.setBounds(297, 330, 60, 25);
		contentPane.add(btnNewButton_2_4_1_1);
		
		JButton btnNewButton_2_4_1_2 = new JButton("=");
		btnNewButton_2_4_1_2.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton_2_4_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculator c=new Calculator();
				String exp=textField.getText();String value1="";
		String postfix=c.infixToPostfix(exp);
		if(postfix.equals("Invalid Expression"))
			value1="Invalid Expression";
		else
		   value1=c.evaluatePostfix(postfix);
		textField.setText(value1);
			}
		});
		btnNewButton_2_4_1_2.setBounds(297, 389, 139, 25);
		contentPane.add(btnNewButton_2_4_1_2);
		
		JButton btnNewButton_1_1_2 = new JButton("CLS");
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton_1_1_2.setBounds(376, 153, 60, 25);
		contentPane.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_3 = new JButton("*");
		btnNewButton_1_1_3.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_1_1_3.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"*");
			}
		});
		btnNewButton_1_1_3.setBounds(376, 212, 60, 25);
		contentPane.add(btnNewButton_1_1_3);
		
		JButton btnNewButton_1_1_7 = new JButton("DEL");
		btnNewButton_1_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s=textField.getText();
				textField.setText(s.substring(0,s.length()-1));
			}
		});
		btnNewButton_1_1_7.setBounds(297, 153, 60, 25);
		contentPane.add(btnNewButton_1_1_7);
		
		JButton btnNewButton_1_1_3_1 = new JButton("(");
		btnNewButton_1_1_3_1.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton_1_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"(");
			}
		});
		btnNewButton_1_1_3_1.setBounds(376, 271, 60, 25);
		contentPane.add(btnNewButton_1_1_3_1);
		
		JButton btnNewButton_1_1_3_2 = new JButton(")");
		btnNewButton_1_1_3_2.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton_1_1_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+")");
			}
		});
		btnNewButton_1_1_3_2.setBounds(376, 330, 60, 25);
		contentPane.add(btnNewButton_1_1_3_2);
	}
}
