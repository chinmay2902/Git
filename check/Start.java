package check;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Start extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start frame = new Start();
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
	public Start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel jPanel2 = new JPanel();
		jPanel2.setBackground(new Color(102, 102, 255));
		jPanel2.setBounds(0, 0, 556, 80);
		contentPane.add(jPanel2);
		
		JLabel lblStartQuiz = new JLabel("Are you Ready");
		lblStartQuiz.setHorizontalAlignment(SwingConstants.CENTER);
		lblStartQuiz.setForeground(Color.WHITE);
		lblStartQuiz.setFont(new Font("Verdana", Font.PLAIN, 32));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_jPanel2 = new GroupLayout(jPanel2);
		gl_jPanel2.setHorizontalGroup(
			gl_jPanel2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_jPanel2.createSequentialGroup()
					.addContainerGap(91, Short.MAX_VALUE)
					.addGroup(gl_jPanel2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jPanel2.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_jPanel2.createSequentialGroup()
							.addComponent(lblStartQuiz, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE)
							.addGap(161))))
		);
		gl_jPanel2.setVerticalGroup(
			gl_jPanel2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_jPanel2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, 0, 0, Short.MAX_VALUE)
					.addGap(9)
					.addComponent(lblStartQuiz)
					.addGap(21))
		);
		jPanel2.setLayout(gl_jPanel2);
		
		JButton btnStart = new JButton("Start");
		btnStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				Quize addQue = new Quize();
				addQue.setVisible(true);
			}
			
		});
		btnStart.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnStart.setBounds(207, 165, 85, 21);
		contentPane.add(btnStart);
		
		textField = new JTextField();
		textField.setBounds(33, 244, 474, 97);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
