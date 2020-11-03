package check;

import java.awt.*;
import check.DatabaseConnection;
import check.Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

//import com.mysql.cj.xdevapi.Statement;

import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JPasswordField txtPassword;
	private JTextField txtId;
	private JPasswordField txtConfpassword;
	private JTextField txtName;
	private JTextField txtBranch;
	private JTextField txtEmailId;
	private JTextField txtSubject;
	private JTextField txtSpecialization;
	JPanel panel_5;
	JPanel panel_6;
	JComboBox<Object> comboBox;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		DatabaseConnection db=new DatabaseConnection();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 932, 581);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel jPanel2 = new JPanel();
		jPanel2.setBackground(new Color(102, 102, 255));
		jPanel2.setBounds(0, 0, 931, 75);
		contentPane.add(jPanel2);
		
		JLabel lblSignUp = new JLabel("Sign Up");
		lblSignUp.setForeground(Color.WHITE);
		lblSignUp.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignUp.setFont(new Font("Tahoma", Font.PLAIN, 28));
		GroupLayout gl_jPanel2 = new GroupLayout(jPanel2);
		gl_jPanel2.setHorizontalGroup(
			gl_jPanel2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jPanel2.createSequentialGroup()
					.addGap(382)
					.addComponent(lblSignUp, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(533, Short.MAX_VALUE))
		);
		gl_jPanel2.setVerticalGroup(
			gl_jPanel2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jPanel2.createSequentialGroup()
					.addGap(21)
					.addComponent(lblSignUp)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		jPanel2.setLayout(gl_jPanel2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(SystemColor.textHighlight, 3));
		panel_1.setBounds(501, 86, 389, 58);
		contentPane.add(panel_1);
		
		JLabel key1 = new JLabel("");
		key1.setIcon(new ImageIcon(SignUp.class.getResource("/img/icons8-password-1-40.png")));
		key1.setBounds(0, 0, 49, 58);
		panel_1.add(key1);
		
		txtPassword = new JPasswordField();
		txtPassword.setText("password");
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtPassword.setBounds(42, 10, 341, 38);
		panel_1.add(txtPassword);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(UIManager.getColor("Tree.selectionBackground"), 4));
		panel.setBounds(34, 86, 389, 58);
		contentPane.add(panel);
		
		JLabel idLabel = new JLabel("");
		idLabel.setIcon(new ImageIcon(SignUp.class.getResource("/img/icons8-user-male-40.png")));
		idLabel.setBounds(0, 0, 51, 58);
		panel.add(idLabel);
		
		txtId = new JTextField();
		txtId.setText("ID");
		txtId.setBounds(45, 10, 338, 38);
		panel.add(txtId);
		txtId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtId.setColumns(10);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(SystemColor.textHighlight, 3));
		panel_1_1.setBounds(501, 178, 389, 58);
		contentPane.add(panel_1_1);
		
		JLabel key2 = new JLabel("");
		key2.setIcon(new ImageIcon(SignUp.class.getResource("/img/icons8-password-1-40.png")));
		key2.setBounds(0, 0, 50, 58);
		panel_1_1.add(key2);
		
		txtConfpassword = new JPasswordField();
		txtConfpassword.setText("Password");
		txtConfpassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtConfpassword.setBounds(42, 10, 341, 38);
		panel_1_1.add(txtConfpassword);
		
		JLabel loginbtn = new JLabel("");
		loginbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(comboBox.getSelectedItem().toString().equals("--SELECT--"))
				{
					JOptionPane.showMessageDialog(null, "Please select if you are a student or an admin");
				}
				else if(comboBox.getSelectedItem().toString().equals("ADMIN"))
				{
					if(
							txtSpecialization.getText().toString().equals("")
							                      ||
							txtSubject.getText().toString().equals("")                      
					  )
					{
						JOptionPane.showMessageDialog(null, "Some things mandatory to enter are missing");
					}
				}
				
				
					if (
							(txtId.getText().equals(""))
							|| 
							(txtBranch.getText().equals(""))
							||
							(txtName.getText().equals("")) 
							|| 
							(String.valueOf(txtPassword.getPassword()).equals(""))
							|| 
							(String.valueOf(txtConfpassword.getPassword()).equals(""))
							||
							(txtEmailId.getText().equals(""))
						) 
					{
						JOptionPane.showMessageDialog(null, "Check Again , Maybe some things need to be entered");
					} 
					else
					{
						if (String.valueOf(txtPassword.getPassword())
								.equals(String.valueOf(txtConfpassword.getPassword())))

						{
							String a = txtId.getText();
							String b = String.valueOf(txtPassword.getPassword());
							String c = txtName.getText();
							String d = txtBranch.getText();
							String f = txtEmailId.getText();
							String g = txtSpecialization.getText();
							String h = txtSubject.getText();

							try {

								if (comboBox.getSelectedItem().toString().equals("STUDENT")) {
									String q = "insert into student values('" + a + "','" + b + "','" + c + "','" + d+ "','" + f + "',0)";
									db.s.executeUpdate(q);
									System.out.println("Values of student inserted successfully");
								} else if (comboBox.getSelectedItem().toString().equals("ADMIN")) {
									String q = "insert into teacher values('" + a + "','" + b + "','" + c + "','" + h+ "','" + g + "','" + f + "','" + d + "')";
									db.s.executeUpdate(q);
									System.out.println("Values of teacher inserted successfully");
								} else {
									JOptionPane.showMessageDialog(null, "Check Again , Some things are not selected");

								}

							} catch (Exception e1) {
								e1.printStackTrace();
							}
							setVisible(false);
							Login L = new Login();
							L.setVisible(true);

						}

						else {
							JOptionPane.showMessageDialog(null, "Confirm Password should be same as password");
							txtConfpassword.setText("");
						}
					} 
				
			}
		});
		loginbtn.setHorizontalAlignment(SwingConstants.CENTER);
		loginbtn.setIcon(new ImageIcon(SignUp.class.getResource("/img/button (2).png")));
		loginbtn.setBounds(409, 473, 114, 58);
		contentPane.add(loginbtn);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(UIManager.getColor("Tree.selectionBackground"), 4));
		panel_2.setBounds(34, 178, 389, 58);
		contentPane.add(panel_2);
		
		JLabel namelabel = new JLabel("");
		namelabel.setIcon(new ImageIcon(SignUp.class.getResource("/img/icons8-user-male-40.png")));
		namelabel.setBounds(0, 0, 51, 58);
		panel_2.add(namelabel);
		
		txtName = new JTextField();
		txtName.setBounds(44, 10, 339, 38);
		panel_2.add(txtName);
		txtName.setText("NAME");
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtName.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(UIManager.getColor("Tree.selectionBackground"), 4));
		panel_3.setBounds(34, 274, 389, 58);
		contentPane.add(panel_3);
		
		JLabel blabel = new JLabel("");
		blabel.setIcon(new ImageIcon(SignUp.class.getResource("/img/icons8-user-male-40.png")));
		blabel.setBounds(0, 0, 51, 58);
		panel_3.add(blabel);
		
		txtBranch = new JTextField();
		txtBranch.setText("BRANCH");
		txtBranch.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtBranch.setColumns(10);
		txtBranch.setBounds(45, 10, 338, 38);
		panel_3.add(txtBranch);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(UIManager.getColor("Tree.selectionBackground"), 4));
		panel_4.setBounds(501, 274, 389, 58);
		contentPane.add(panel_4);
		
		JLabel eLabel = new JLabel("");
		eLabel.setIcon(new ImageIcon(SignUp.class.getResource("/img/icons8-user-male-40.png")));
		eLabel.setBounds(0, 0, 51, 58);
		panel_4.add(eLabel);
		
		txtEmailId = new JTextField();
		txtEmailId.setText("EMAIL ID");
		txtEmailId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtEmailId.setColumns(10);
		txtEmailId.setBounds(45, 10, 338, 38);
		panel_4.add(txtEmailId);
		
		JLabel lblNewLabel_2 = new JLabel("Confirm Password");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(511, 151, 389, 33);
		contentPane.add(lblNewLabel_2);
		
		JLabel stlogin = new JLabel("Are you a student or an ADMIN ?");
		stlogin.setHorizontalAlignment(SwingConstants.CENTER);
		stlogin.setBounds(615, 473, 278, 33);
		contentPane.add(stlogin);
		
		JToggleButton toggle = new JToggleButton("ADMINS ONLY");
		toggle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(toggle.isSelected())
				{
					panel_5.setVisible(true);
					panel_6.setVisible(true);
				}
				else
				{
					panel_5.setVisible(false);
					panel_6.setVisible(false);
				}
				
			}
		});
		toggle.setBounds(383, 362, 161, 29);
		contentPane.add(toggle);
		
		panel_5 = new JPanel();
		panel_5.setVisible(false);
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(UIManager.getColor("Tree.selectionBackground"), 4));
		panel_5.setBounds(34, 403, 389, 58);
		contentPane.add(panel_5);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 51, 58);
		panel_5.add(label);
		
		txtSubject = new JTextField();
		txtSubject.setText("SUBJECT");
		txtSubject.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtSubject.setColumns(10);
		txtSubject.setBounds(45, 10, 338, 38);
		panel_5.add(txtSubject);
		
		panel_6 = new JPanel();
		panel_6.setVisible(false);
		panel_6.setLayout(null);
		panel_6.setBorder(new LineBorder(UIManager.getColor("Tree.selectionBackground"), 4));
		panel_6.setBounds(501, 403, 389, 58);
		contentPane.add(panel_6);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(0, 0, 51, 58);
		panel_6.add(label_1);
		
		txtSpecialization = new JTextField();
		txtSpecialization.setText("SPECIALIZATION");
		txtSpecialization.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtSpecialization.setColumns(10);
		txtSpecialization.setBounds(45, 10, 338, 38);
		panel_6.add(txtSpecialization);
		
		comboBox = new JComboBox<Object>();
		comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] {"--SELECT--", "STUDENT", "ADMIN"}));
		comboBox.setBounds(664, 502, 181, 34);
		contentPane.add(comboBox);
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(SignUp.class.getResource("/img/WhatsApp Image 2020-10-13 at 3.04.06 PM.jpeg")));
		lblNewLabel.setBounds(0, 73, 931, 485);
		contentPane.add(lblNewLabel);
		
		
	}
}
