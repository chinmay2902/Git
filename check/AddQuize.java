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
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AddQuize extends JFrame {

	private JPanel contentPane;
	private JTextField txtOption1;
	private JTextField txtOption2;
	private JTextField txtOption3;
	private JTextField txtOption4;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddQuize frame = new AddQuize();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	int id=0;
	private String Quiz_id="";
	private JTextField txtAddQuizId;
	private JTextField txtAns;
	private JTextField txtQ;
	public void setQuiz_id(String s)
	{
		Quiz_id=s;
	}
	/**
	 * Create the frame.
	 */
	public AddQuize() {
		DatabaseConnection db=new DatabaseConnection();
		
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1243, 675);
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
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(new ImageIcon(AddQuize.class.getResource("/img/icons8-export-64.png")));
		lblNewLabel_4.setOpaque(true);
		
		JLabel lblNewLabel = new JLabel("");
		GroupLayout gl_jPanel2 = new GroupLayout(jPanel2);
		gl_jPanel2.setHorizontalGroup(
			gl_jPanel2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1254, Short.MAX_VALUE)
				.addGroup(gl_jPanel2.createSequentialGroup()
					.addGroup(gl_jPanel2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jPanel2.createSequentialGroup()
							.addGap(448)
							.addComponent(lblDashboard, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 493, Short.MAX_VALUE)
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 72, 1243, 593);
		contentPane.add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(UIManager.getColor("Tree.selectionBackground"), 4));
		panel_1.setBounds(44, 80, 1043, 117);
		panel.add(panel_1);
		
		JTextArea Question = new JTextArea();
		Question.setFont(new Font("Verdana", Font.PLAIN, 16));
		Question.setText("Enter the first Question");
		Question.setBounds(44, 10, 989, 97);
		panel_1.add(Question);
		
		txtQ = new JTextField();
		txtQ.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtQ.setText("Q");
		txtQ.setBounds(10, 10, 32, 43);
		panel_1.add(txtQ);
		txtQ.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(UIManager.getColor("Tree.selectionBackground"), 4));
		panel_2.setBounds(44, 206, 646, 61);
		panel.add(panel_2);
		
		JLabel label_1_1 = new JLabel("A");
		label_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_1.setFont(new Font("Verdana", Font.PLAIN, 18));
		label_1_1.setBounds(0, 0, 50, 64);
		panel_2.add(label_1_1);
		
		txtOption1 = new JTextField();
		txtOption1.setText("Option 1");
		txtOption1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtOption1.setColumns(10);
		txtOption1.setBounds(50, 10, 586, 41);
		panel_2.add(txtOption1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new LineBorder(UIManager.getColor("Tree.selectionBackground"), 4));
		panel_2_1.setBounds(44, 293, 646, 61);
		panel.add(panel_2_1);
		
		JLabel label_1_1_1 = new JLabel("B");
		label_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_1_1.setFont(new Font("Verdana", Font.PLAIN, 18));
		label_1_1_1.setBounds(0, 0, 50, 64);
		panel_2_1.add(label_1_1_1);
		
		txtOption2 = new JTextField();
		txtOption2.setText("Option 2");
		txtOption2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtOption2.setColumns(10);
		txtOption2.setBounds(50, 10, 586, 41);
		panel_2_1.add(txtOption2);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBorder(new LineBorder(UIManager.getColor("Tree.selectionBackground"), 4));
		panel_2_2.setBounds(44, 380, 646, 61);
		panel.add(panel_2_2);
		
		JLabel label_1_1_2 = new JLabel("C");
		label_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_1_2.setFont(new Font("Verdana", Font.PLAIN, 18));
		label_1_1_2.setBounds(0, 0, 50, 64);
		panel_2_2.add(label_1_1_2);
		
		txtOption3 = new JTextField();
		txtOption3.setText("Option 3");
		txtOption3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtOption3.setColumns(10);
		txtOption3.setBounds(50, 10, 586, 41);
		panel_2_2.add(txtOption3);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setLayout(null);
		panel_2_3.setBorder(new LineBorder(UIManager.getColor("Tree.selectionBackground"), 4));
		panel_2_3.setBounds(44, 474, 646, 61);
		panel.add(panel_2_3);
		
		JLabel label_1_1_3 = new JLabel("D");
		label_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_1_3.setFont(new Font("Verdana", Font.PLAIN, 18));
		label_1_1_3.setBounds(0, 0, 50, 64);
		panel_2_3.add(label_1_1_3);
		
		txtOption4 = new JTextField();
		txtOption4.setText("Option 4");
		txtOption4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtOption4.setColumns(10);
		txtOption4.setBounds(50, 10, 586, 41);
		panel_2_3.add(txtOption4);
		
		JPanel panel_2_4 = new JPanel();
		panel_2_4.setLayout(null);
		panel_2_4.setBorder(new LineBorder(UIManager.getColor("Tree.selectionBackground"), 4));
		panel_2_4.setBounds(51, 10, 264, 61);
		panel.add(panel_2_4);
		
		JLabel label_1_1_4 = new JLabel("");
		label_1_1_4.setIcon(new ImageIcon(AddQuize.class.getResource("/img/icons8-add-property-64.png")));
		label_1_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_1_4.setFont(new Font("Verdana", Font.PLAIN, 18));
		label_1_1_4.setBounds(0, 0, 65, 64);
		panel_2_4.add(label_1_1_4);
		
		txtAddQuizId = new JTextField();
		txtAddQuizId.setText("Add Quiz Id");
		txtAddQuizId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtAddQuizId.setColumns(10);
		txtAddQuizId.setBounds(75, 10, 179, 41);
		panel_2_4.add(txtAddQuizId);
		
		JLabel lblAddToQuiz = new JLabel("Add To Quiz");
		lblAddToQuiz.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//id=0;
					String que = Question.getText();
					String opt1 = txtOption1.getText();
					String opt2 = txtOption2.getText();
					String opt3 = txtOption3.getText();
					String opt4 = txtOption4.getText();
					String QuizId = txtAddQuizId.getText();
					String ans=txtAns.getText();
					String qno=txtQ.getText();
					
					
					try {
						PreparedStatement ps = db.c.prepareStatement("insert into question values(?,?,?,?,?,?,?,?)");
						ps.setString(1, qno);
						ps.setString(2, que);
						ps.setString(3, opt1);
						ps.setString(4, opt2);
						ps.setString(5, opt3);
						ps.setString(6, opt4);
						ps.setString(7, ans);
						ps.setString(8, QuizId);

						ps.executeUpdate();
						

					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					JOptionPane.showMessageDialog(null,"Question Added");
					setVisible(false);
					AddQuize addQue = new AddQuize();
					addQue.setQuiz_id(Quiz_id);
					addQue.setVisible(true);
				}
			
		});
		lblAddToQuiz.setFont(new Font("Segoe Script", Font.PLAIN, 21));
		lblAddToQuiz.setBounds(1016, 522, 180, 59);
		panel.add(lblAddToQuiz);
		
		JPanel panel_2_4_1 = new JPanel();
		panel_2_4_1.setLayout(null);
		panel_2_4_1.setBorder(new LineBorder(UIManager.getColor("Tree.selectionBackground"), 4));
		panel_2_4_1.setBounds(823, 440, 264, 61);
		panel.add(panel_2_4_1);
		
		JLabel label_1_1_4_1 = new JLabel("");
		label_1_1_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_1_4_1.setFont(new Font("Verdana", Font.PLAIN, 18));
		label_1_1_4_1.setBounds(0, 0, 65, 64);
		panel_2_4_1.add(label_1_1_4_1);
		
		txtAns = new JTextField();
		txtAns.setText("Correct Answer");
		txtAns.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtAns.setColumns(10);
		txtAns.setBounds(10, 10, 244, 41);
		panel_2_4_1.add(txtAns);
	}
}
