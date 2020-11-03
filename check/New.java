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
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class New extends JFrame {

	private JPanel contentPane;
	private JTextField txtQuizId;
	private JTextField txtDueDate;
	private JTextField txtQuizDate;
	private JTextField txtUserId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New frame = new New();
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
	public New() {
		DatabaseConnection db=new DatabaseConnection();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1050, 655);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel jPanel2 = new JPanel();
		jPanel2.setBackground(new Color(102, 102, 255));
		jPanel2.setBounds(0, 0, 1036, 74);
		contentPane.add(jPanel2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel = new JLabel("");
		
		JLabel lblAddQuiz = new JLabel("Add Quiz");
		lblAddQuiz.setFont(new Font("Segoe Script", Font.PLAIN, 29));
		GroupLayout gl_jPanel2 = new GroupLayout(jPanel2);
		gl_jPanel2.setHorizontalGroup(
			gl_jPanel2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jPanel2.createSequentialGroup()
					.addGroup(gl_jPanel2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jPanel2.createParallelGroup(Alignment.LEADING)
							.addComponent(lblNewLabel_4, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_jPanel2.createSequentialGroup()
								.addGap(243)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_jPanel2.createSequentialGroup()
							.addGap(426)
							.addComponent(lblAddQuiz, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(433, Short.MAX_VALUE))
		);
		gl_jPanel2.setVerticalGroup(
			gl_jPanel2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 74, Short.MAX_VALUE)
				.addGroup(gl_jPanel2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jPanel2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jPanel2.createSequentialGroup()
							.addComponent(lblAddQuiz, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_jPanel2.createSequentialGroup()
							.addComponent(lblNewLabel_4, 0, 0, Short.MAX_VALUE)
							.addGap(460)
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(132))))
		);
		jPanel2.setLayout(gl_jPanel2);
		
		JPanel panel_2_4_1 = new JPanel();
		panel_2_4_1.setLayout(null);
		panel_2_4_1.setBorder(new LineBorder(UIManager.getColor("Tree.selectionBackground"), 4));
		panel_2_4_1.setBounds(335, 144, 264, 61);
		contentPane.add(panel_2_4_1);
		
		JLabel label_1_1_4_1 = new JLabel("");
		label_1_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_1_4_1.setFont(new Font("Verdana", Font.PLAIN, 18));
		label_1_1_4_1.setBounds(0, 0, 65, 64);
		panel_2_4_1.add(label_1_1_4_1);
		
		txtQuizId = new JTextField();
		txtQuizId.setText("Quiz Id");
		txtQuizId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtQuizId.setColumns(10);
		txtQuizId.setBounds(10, 10, 244, 41);
		panel_2_4_1.add(txtQuizId);
		
		JPanel panel_2_4_1_1 = new JPanel();
		panel_2_4_1_1.setLayout(null);
		panel_2_4_1_1.setBorder(new LineBorder(UIManager.getColor("Tree.selectionBackground"), 4));
		panel_2_4_1_1.setBounds(335, 362, 264, 61);
		contentPane.add(panel_2_4_1_1);
		
		JLabel label_1_1_4_1_1 = new JLabel("");
		label_1_1_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_1_4_1_1.setFont(new Font("Verdana", Font.PLAIN, 18));
		label_1_1_4_1_1.setBounds(0, 0, 65, 64);
		panel_2_4_1_1.add(label_1_1_4_1_1);
		
		txtDueDate = new JTextField();
		txtDueDate.setText("Due Date");
		txtDueDate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtDueDate.setColumns(10);
		txtDueDate.setBounds(10, 10, 244, 41);
		panel_2_4_1_1.add(txtDueDate);
		
		JPanel panel_2_4_1_2 = new JPanel();
		panel_2_4_1_2.setLayout(null);
		panel_2_4_1_2.setBorder(new LineBorder(UIManager.getColor("Tree.selectionBackground"), 4));
		panel_2_4_1_2.setBounds(335, 260, 264, 61);
		contentPane.add(panel_2_4_1_2);
		
		JLabel label_1_1_4_1_2 = new JLabel("");
		label_1_1_4_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_1_4_1_2.setFont(new Font("Verdana", Font.PLAIN, 18));
		label_1_1_4_1_2.setBounds(0, 0, 65, 64);
		panel_2_4_1_2.add(label_1_1_4_1_2);
		
		txtQuizDate = new JTextField();
		txtQuizDate.setText("Quiz Date");
		txtQuizDate.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtQuizDate.setColumns(10);
		txtQuizDate.setBounds(10, 10, 244, 41);
		panel_2_4_1_2.add(txtQuizDate);
		
		JPanel panel_2_4_1_3 = new JPanel();
		panel_2_4_1_3.setLayout(null);
		panel_2_4_1_3.setBorder(new LineBorder(UIManager.getColor("Tree.selectionBackground"), 4));
		panel_2_4_1_3.setBounds(335, 448, 264, 61);
		contentPane.add(panel_2_4_1_3);
		
		JLabel label_1_1_4_1_3 = new JLabel("");
		label_1_1_4_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_1_4_1_3.setFont(new Font("Verdana", Font.PLAIN, 18));
		label_1_1_4_1_3.setBounds(0, 0, 65, 64);
		panel_2_4_1_3.add(label_1_1_4_1_3);
		
		txtUserId = new JTextField();
		txtUserId.setText("User Id");
		txtUserId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtUserId.setColumns(10);
		txtUserId.setBounds(10, 10, 244, 41);
		panel_2_4_1_3.add(txtUserId);
		
		JLabel lblAddQuiz_1 = new JLabel("Add Quiz");
		lblAddQuiz_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id = txtQuizId.getText();
				String date = txtQuizDate.getText();
				String due = txtDueDate.getText();
				String cId = txtUserId.getText();
				
				
				
				try {
					PreparedStatement ps = db.c.prepareStatement("insert into quiz values(?,STR_TO_DATE(?, '%d-%m-%Y'),STR_TO_DATE(?, '%d-%m-%Y'),?)");
					ps.setString(1, id);
					ps.setString(2, date);
					ps.setString(3, due);
					ps.setString(4, cId);
					
					ps.executeUpdate();
					

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
				setVisible(false);
				AddQuize addQue = new AddQuize();
				addQue.setVisible(true);
			}
		});
		lblAddQuiz_1.setFont(new Font("Segoe Script", Font.PLAIN, 29));
		lblAddQuiz_1.setBounds(410, 530, 177, 60);
		contentPane.add(lblAddQuiz_1);
	}

}
