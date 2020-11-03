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
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;

public class Quize2 extends JFrame {

	private JPanel contentPane;
	private String Quiz_id;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quize frame = new Quize();
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
	
	public Quize2() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1242, 713);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel jPanel2 = new JPanel();
		jPanel2.setBounds(0, 0, 1243, 74);
		jPanel2.setBackground(new Color(102, 102, 255));
		contentPane.add(jPanel2);
		
		JLabel lblDashboard = new JLabel("Quize ");
		lblDashboard.setHorizontalAlignment(SwingConstants.CENTER);
		lblDashboard.setForeground(Color.WHITE);
		lblDashboard.setFont(new Font("Verdana", Font.PLAIN, 32));
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Quize.class.getResource("/img/icons8-export-64.png")));
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel = new JLabel("");
		GroupLayout gl_jPanel2 = new GroupLayout(jPanel2);
		gl_jPanel2.setHorizontalGroup(
			gl_jPanel2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1243, Short.MAX_VALUE)
				.addGroup(gl_jPanel2.createSequentialGroup()
					.addGroup(gl_jPanel2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jPanel2.createSequentialGroup()
							.addGap(448)
							.addComponent(lblDashboard, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 482, Short.MAX_VALUE)
							.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jPanel2.createSequentialGroup()
							.addGap(243)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_jPanel2.setVerticalGroup(
			gl_jPanel2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 74, Short.MAX_VALUE)
				.addGroup(gl_jPanel2.createSequentialGroup()
					.addGroup(gl_jPanel2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jPanel2.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_4, 0, 0, Short.MAX_VALUE))
						.addGroup(gl_jPanel2.createSequentialGroup()
							.addGap(23)
							.addComponent(lblDashboard)))
					.addGap(460)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(132))
		);
		jPanel2.setLayout(gl_jPanel2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(UIManager.getColor("Tree.selectionBackground"), 4));
		panel_1.setBounds(228, 147, 970, 120);
		contentPane.add(panel_1);
		
		JLabel label_1 = new JLabel("Q2.");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setBounds(0, 0, 50, 58);
		panel_1.add(label_1);
		
		JLabel lblNewLabel_1 = new JLabel("Question will be here");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(57, 10, 903, 100);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(UIManager.getColor("Tree.selectionBackground"), 4));
		panel_2.setBounds(228, 313, 646, 61);
		contentPane.add(panel_2);
		
		JLabel label_1_1 = new JLabel("A");
		label_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_1.setFont(new Font("Verdana", Font.PLAIN, 18));
		label_1_1.setBounds(0, 0, 50, 64);
		panel_2.add(label_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setFont(new Font("Verdana", Font.PLAIN, 20));
		rdbtnNewRadioButton.setBounds(56, 6, 584, 49);
		panel_2.add(rdbtnNewRadioButton);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new LineBorder(UIManager.getColor("Tree.selectionBackground"), 4));
		panel_2_1.setBounds(228, 409, 646, 61);
		contentPane.add(panel_2_1);
		
		JLabel label_1_1_1 = new JLabel("B");
		label_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 18));
		label_1_1_1.setBounds(0, 0, 50, 64);
		panel_2_1.add(label_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		rdbtnNewRadioButton_1.setBounds(56, 6, 584, 49);
		panel_2_1.add(rdbtnNewRadioButton_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBorder(new LineBorder(UIManager.getColor("Tree.selectionBackground"), 4));
		panel_2_2.setBounds(228, 502, 646, 61);
		contentPane.add(panel_2_2);
		
		JLabel label_1_1_2 = new JLabel("C");
		label_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_1_2.setFont(new Font("Verdana", Font.PLAIN, 18));
		label_1_1_2.setBounds(0, 0, 50, 64);
		panel_2_2.add(label_1_1_2);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_2.setFont(new Font("Verdana", Font.PLAIN, 20));
		rdbtnNewRadioButton_2.setBounds(56, 6, 584, 49);
		panel_2_2.add(rdbtnNewRadioButton_2);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setLayout(null);
		panel_2_3.setBorder(new LineBorder(UIManager.getColor("Tree.selectionBackground"), 4));
		panel_2_3.setBounds(228, 606, 646, 61);
		contentPane.add(panel_2_3);
		
		JLabel label_1_1_3 = new JLabel("D");
		label_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_1_3.setFont(new Font("Verdana", Font.PLAIN, 18));
		label_1_1_3.setBounds(0, 0, 50, 64);
		panel_2_3.add(label_1_1_3);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_3.setFont(new Font("Verdana", Font.PLAIN, 20));
		rdbtnNewRadioButton_3.setBounds(56, 6, 584, 49);
		panel_2_3.add(rdbtnNewRadioButton_3);
		
		JLabel label = new JLabel(">");
		label.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label.setBounds(1176, 623, 34, 39);
		contentPane.add(label);
	}

	public void setQuiz_id(String id) {
		 Quiz_id = id;
	}
}
