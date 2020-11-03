package check;
import check.DatabaseConnection;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import check.DatabaseConnection;

public class Login extends JFrame {

	private JPanel MainPage;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		
		DatabaseConnection db=new DatabaseConnection();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1269, 691);
		MainPage = new JPanel();
		MainPage.setBackground(Color.WHITE);
		MainPage.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(MainPage);
		MainPage.setLayout(null);
		
		JPanel jPanel2 = new JPanel();
		jPanel2.setBackground(new Color(102, 102, 255));
		jPanel2.setBounds(0, 0, 434, 644);
		MainPage.add(jPanel2);
		
		JLabel Title = new JLabel();
		Title.setText("TestX");
		Title.setHorizontalAlignment(SwingConstants.CENTER);
		Title.setForeground(Color.WHITE);
		Title.setFont(new Font("Dialog", Font.ITALIC, 48));
		
		JLabel text2 = new JLabel();
		text2.setText("help of TestX.");
		text2.setHorizontalAlignment(SwingConstants.CENTER);
		text2.setForeground(Color.WHITE);
		text2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel text1 = new JLabel();
		text1.setText("Test your skills with the ");
		text1.setHorizontalAlignment(SwingConstants.CENTER);
		text1.setForeground(Color.WHITE);
		text1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel Login = new JLabel();
		Login.setText("LogIn as");
		Login.setHorizontalAlignment(SwingConstants.CENTER);
		Login.setForeground(Color.WHITE);
		Login.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String username=txtUsername.getText().toString();
				String pass=String.valueOf(pwdPassword.getPassword());
				try {
					PreparedStatement ps=db.c.prepareStatement
							("select * from teacher where emp_id=? and t_password=?");
					ps.setString(1,username);
					ps.setString(2,pass);
					
					ResultSet rs=ps.executeQuery();
					if(rs.next())
					{
						ADashboard ad=new ADashboard();
						ad.setVisible(true);
						ad.setAdminId(username);
						setVisible(false);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Account with the given credentials not found");
						txtUsername.setText("ID");
						pwdPassword.setText("Password");
					}
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		label.setIcon(new ImageIcon(Login.class.getResource("/img/button.png")));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String username=txtUsername.getText().toString();
				String pass=String.valueOf(pwdPassword.getPassword());
				try {
					PreparedStatement ps=db.c.prepareStatement
							("select * from student where st_id=? and st_password=?");
					ps.setString(1,username);
					ps.setString(2,pass);
					
					ResultSet rs=ps.executeQuery();
					if(rs.next())
					{
						SDashboard ad=new SDashboard();
						ad.setVisible(true);
						setVisible(false);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Account with the given credentials not found");
						txtUsername.setText("ID");
						pwdPassword.setText("Password");
					}
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/img/button (3).png")));
		GroupLayout gl_jPanel2 = new GroupLayout(jPanel2);
		gl_jPanel2.setHorizontalGroup(
			gl_jPanel2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jPanel2.createSequentialGroup()
					.addGroup(gl_jPanel2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jPanel2.createSequentialGroup()
							.addGap(96)
							.addComponent(Title, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jPanel2.createSequentialGroup()
							.addGap(43)
							.addGroup(gl_jPanel2.createParallelGroup(Alignment.TRAILING)
								.addComponent(text1, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
								.addComponent(text2, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
								.addComponent(Login, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_jPanel2.createSequentialGroup()
							.addGap(23)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
							.addGap(54)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(56, Short.MAX_VALUE))
		);
		gl_jPanel2.setVerticalGroup(
			gl_jPanel2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jPanel2.createSequentialGroup()
					.addGap(78)
					.addComponent(Title, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addComponent(text1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(text2)
					.addGap(163)
					.addComponent(Login, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addGap(54)
					.addGroup(gl_jPanel2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
					.addGap(132))
		);
		jPanel2.setLayout(gl_jPanel2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/img/undraw_secure_login_pdn4.png")));
		lblNewLabel_1.setBounds(613, 25, 487, 287);
		MainPage.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(UIManager.getColor("Tree.selectionBackground"), 4));
		panel.setBounds(679, 363, 389, 58);
		MainPage.add(panel);
		panel.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(0, 0, 50, 58);
		label_1.setIcon(new ImageIcon(Login.class.getResource("/img/icons8-user-male-40.png")));
		panel.add(label_1);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtUsername.setText("Username");
		txtUsername.setBounds(50, 0, 339, 58);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(SystemColor.textHighlight, 3));
		panel_1.setBounds(679, 474, 389, 58);
		MainPage.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Login.class.getResource("/img/icons8-password-1-40.png")));
		label_2.setBounds(0, 0, 51, 48);
		panel_1.add(label_2);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		pwdPassword.setText("Password");
		pwdPassword.setBounds(48, 0, 341, 58);
		panel_1.add(pwdPassword);
		
		
	}
}
