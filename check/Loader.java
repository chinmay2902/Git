package check;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import AppPackage.AnimationClass;
import javafx.animation.*;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;;

public class Loader extends JFrame  {

	private JPanel contentPane;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JLabel label5;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loader frame = new Loader();
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
	public Loader() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 696, 480);
		
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label1 = new JLabel("");
		label1.setIcon(new ImageIcon(Loader.class.getResource("/img/a6.png")));
		label1.setBounds(0, 0, 222, 202);
		contentPane.add(label1);
		
		label4 = new JLabel("");
		label4.setIcon(new ImageIcon(Loader.class.getResource("/img/a7.png")));
		label4.setBounds(433, 282, 249, 195);
		contentPane.add(label4);
		
		label2 = new JLabel("");
		label2.setHorizontalAlignment(SwingConstants.LEFT);
		label2.setIcon(new ImageIcon(Loader.class.getResource("/img/a4.png")));
		label2.setBounds(0, 228, 357, 249);
		contentPane.add(label2);
		
		label3 = new JLabel("");
		label3.setHorizontalAlignment(SwingConstants.RIGHT);
		label3.setIcon(new ImageIcon(Loader.class.getResource("/img/a5.png")));
		label3.setBounds(325, 0, 357, 215);
		contentPane.add(label3);
		
		label5 = new JLabel("");
		label5.setIcon(new ImageIcon(Loader.class.getResource("/img/a8.png")));
		label5.setBounds(218, 193, 187, 72);
		contentPane.add(label5);
		
		AnimationClass anim =new AnimationClass();
		
		anim.jLabelXLeft(label1.getX(), -1000, 3, 1, label1);
		anim.jLabelXLeft(label2.getX(), -1000, 3, 1, label2);
		anim.jLabelXRight(label3.getX(), 1000, 3, 1, label3);
		anim.jLabelXRight(label4.getX(), 1000, 3, 1, label4);
		anim.jLabelYUp(label5.getY(), 50, 5, 1, label5);
		
		JLabel lblSignUp = new JLabel("Sign Up");
		lblSignUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			    SignUp L = new SignUp();
			    L.setVisible(true);
			}
		});
		lblSignUp.setForeground(Color.WHITE);
		lblSignUp.setFont(new Font("Segoe Print", Font.PLAIN, 21));
		lblSignUp.setBounds(420, 373, 103, 31);
		contentPane.add(lblSignUp);
		
		JLabel lblLogIn = new JLabel("Log In");
		lblLogIn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			    Login L = new Login();
			    L.setVisible(true);
			}
		});
		lblLogIn.setFont(new Font("Segoe Script", Font.PLAIN, 21));
		lblLogIn.setForeground(Color.WHITE);
		lblLogIn.setBounds(205, 373, 103, 31);
		contentPane.add(lblLogIn);
		
		JLabel lblNewLabel = new JLabel("Test your Skills with Test X");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe Script", Font.PLAIN, 20));
		lblNewLabel.setBounds(178, 193, 359, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("And get Genuine RANK");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Segoe Script", Font.PLAIN, 21));
		lblNewLabel_1.setBounds(198, 262, 325, 45);
		contentPane.add(lblNewLabel_1);
		
		
	}
}
