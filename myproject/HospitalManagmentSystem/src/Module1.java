import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Module1 extends JFrame {

	private JPanel contentPane;
	private JTextField pn;
	private JTextField fn;
	private JTextField cn;
	private JTextField ill;
	private JTextField cd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Module1 frame = new Module1();
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

	public Module1() {
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 991, 546);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter your details");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(111, 160, 147, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Patient's Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(179, 203, 116, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Father's Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(179, 242, 116, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CLN NO");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(179, 287, 116, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Illness");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(179, 335, 116, 16);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Chose docter");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(179, 373, 116, 16);
		contentPane.add(lblNewLabel_5);
		
		pn = new JTextField();
		pn.setBounds(359, 201, 338, 22);
		contentPane.add(pn);
		pn.setColumns(10);
		
		fn = new JTextField();
		fn.setBounds(359, 240, 338, 22);
		contentPane.add(fn);
		fn.setColumns(10);
		
		cn = new JTextField();
		cn.setBounds(357, 285, 340, 22);
		contentPane.add(cn);
		cn.setColumns(10);
		
		ill = new JTextField();
		ill.setBounds(513, 333, 184, 22);
		contentPane.add(ill);
		ill.setColumns(10);
		
		cd = new JTextField();
		cd.setBounds(513, 371, 184, 22);
		contentPane.add(cd);
		cd.setColumns(10);
		
		JList list = new JList();
		list.setBounds(359, 351, 44, -16);
		contentPane.add(list);
		
		JLabel lblNewLabel_6 = new JLabel("PATIENT\"S FOURM");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_6.setBounds(303, 47, 415, 57);
		contentPane.add(lblNewLabel_6);
		
		JComboBox illness = new JComboBox();
		illness.setModel(new DefaultComboBoxModel(new String[] {"flu", "fever"}));
		illness.setToolTipText("");
		illness.setBounds(359, 333, 142, 22);
		contentPane.add(illness);
		
		JComboBox cdoc = new JComboBox();
		cdoc.setModel(new DefaultComboBoxModel(new String[] {"Dr Madhu", "Dr Sushma", "Dr Harshit"}));
		cdoc.setBounds(359, 371, 142, 22);
		contentPane.add(cdoc);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String spn=pn.getText();
				String sfn=fn.getText();
				String scn=cn.getText();
				
				ill.setText(illness.getSelectedItem().toString());
				cd.setText(cdoc.getSelectedItem().toString());
				JOptionPane.showMessageDialog(rootPane,"Patient's name:  "+spn+"\n Father's name:  "+sfn+"\n Clinic no:  "+scn+"\n\n data submitted sucssfully");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(442, 423, 97, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_7 = new JLabel("Back");
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuPage obj=new MenuPage();
				obj.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7.setBounds(749, 110, 56, 16);
		contentPane.add(lblNewLabel_7);
	}
}
