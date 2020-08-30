import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Module2 extends JFrame {

	private JPanel contentPane;
	private JTextField tfdat;
	private JTextField tfaf;
	private JTextField tfmop;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Module2 frame = new Module2();
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
	public Module2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Docter's Awalibility");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(300, 36, 306, 70);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Select Your Docter");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(98, 158, 171, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Docter's Appointement Time");
		lblNewLabel_2.setBounds(110, 225, 180, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Appointment Fee");
		lblNewLabel_3.setBounds(110, 289, 159, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mode of Payment");
		lblNewLabel_4.setBounds(110, 356, 159, 16);
		contentPane.add(lblNewLabel_4);
		
		tfdat = new JTextField();
		tfdat.setBounds(465, 222, 231, 22);
		contentPane.add(tfdat);
		tfdat.setColumns(10);
		
		tfaf = new JTextField();
		tfaf.setBounds(465, 286, 231, 22);
		contentPane.add(tfaf);
		tfaf.setColumns(10);
		
		tfmop = new JTextField();
		tfmop.setBounds(465, 353, 231, 22);
		contentPane.add(tfmop);
		tfmop.setColumns(10);
		
		JComboBox cbdat = new JComboBox();
		cbdat.setModel(new DefaultComboBoxModel(new String[] {"Dr Madhu(11am-12am)", "Dr Susma(12am-1pm)", "Dr Harshit(1pm-2pm)"}));
		cbdat.setBounds(306, 222, 147, 22);
		contentPane.add(cbdat);
		
		JComboBox cbaf = new JComboBox();
		cbaf.setModel(new DefaultComboBoxModel(new String[] {"Dr Madhu(1000)", "Dr Susma(2000)", "Dr Harshit(30000)"}));
		cbaf.setBounds(306, 289, 147, 22);
		contentPane.add(cbaf);
		
		JComboBox cbmop = new JComboBox();
		cbmop.setModel(new DefaultComboBoxModel(new String[] {"Online", "Cash", "Demand Draft"}));
		cbmop.setBounds(306, 353, 147, 22);
		contentPane.add(cbmop);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfdat.setText(cbdat.getSelectedItem().toString());
				tfaf.setText(cbaf.getSelectedItem().toString());
				tfmop.setText(cbmop.getSelectedItem().toString());
				JOptionPane.showMessageDialog(rootPane,"Docter Apponntment Time:  "+cbdat.getSelectedItem().toString() +"\n Apointment fee:  "+cbaf.getSelectedItem().toString()+"\nMode of Payment:  "+ cbmop.getSelectedItem().toString());
			}
			
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(526, 407, 97, 25);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("Back");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				MenuPage obj=new MenuPage();
				obj.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(773, 104, 56, 16);
		contentPane.add(lblNewLabel_5);
	}

}
