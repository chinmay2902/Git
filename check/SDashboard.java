package check;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import check.DatabaseConnection;
import net.proteanit.sql.DbUtils;

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
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.GregorianCalendar;
import javax.swing.JTextField;

public class SDashboard extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtStartWithId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SDashboard frame = new SDashboard();
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
	public SDashboard() {
		DatabaseConnection db=new DatabaseConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1234, 697);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel jPanel2 = new JPanel();
		jPanel2.setBackground(new Color(102, 102, 255));
		jPanel2.setBounds(0, 0, 1220, 74);
		contentPane.add(jPanel2);
		
		JLabel lblDashboard = new JLabel("Dashboard");
		lblDashboard.setHorizontalAlignment(SwingConstants.CENTER);
		lblDashboard.setForeground(Color.WHITE);
		lblDashboard.setFont(new Font("Verdana", Font.PLAIN, 32));
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(SDashboard.class.getResource("/img/icons8-export-64.png")));
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_jPanel2 = new GroupLayout(jPanel2);
		gl_jPanel2.setHorizontalGroup(
			gl_jPanel2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1243, Short.MAX_VALUE)
				.addGroup(gl_jPanel2.createSequentialGroup()
					.addGap(448)
					.addComponent(lblDashboard, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 482, Short.MAX_VALUE)
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
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
					.addGap(592))
		);
		jPanel2.setLayout(gl_jPanel2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(SDashboard.class.getResource("/img/undraw_exams_g4ow.png")));
		lblNewLabel.setBounds(357, 73, 553, 333);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(SDashboard.class.getResource("/img/undraw_predictive_analytics_kf9n.png")));
		lblNewLabel_1.setBounds(969, 116, 166, 107);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Leader Board");
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(979, 230, 136, 39);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(UIManager.getColor("Tree.selectionBackground"), 4));
		panel_1.setBounds(195, 405, 827, 226);
		contentPane.add(panel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 805, 206);
		panel_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		table.setRowMargin(2);
		table.setRowHeight(30);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{},
				{},
				{},
				{},
				{},
				{},
				{},
				{},
				{},
				{},
				{},
				{},
				{},
				{},
				{},
				{},
			},
			new String[] {
			}
		));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(UIManager.getColor("Tree.selectionBackground"), 4));
		panel_1_1.setBounds(909, 367, 113, 39);
		contentPane.add(panel_1_1);
		
		JLabel lblNewLabel_6 = new JLabel("Refresh");
		lblNewLabel_6.setBounds(10, 12, 93, 17);
		panel_1_1.add(lblNewLabel_6);
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				try 
				{
				
					PreparedStatement ps1=db.c.prepareStatement("select quiz_id,T_name \r\n" + 
							"from quiz,teacher\r\n" + 
							"where teacher.emp_id=quiz.Creator_id;");
					ResultSet rs=ps1.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
				catch (SQLException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_6.setFont(new Font("Segoe Script", Font.PLAIN, 20));
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new LineBorder(UIManager.getColor("Tree.selectionBackground"), 4));
		panel_1_1_1.setBounds(66, 132, 188, 52);
		contentPane.add(panel_1_1_1);
		
		txtStartWithId = new JTextField();
		txtStartWithId.setFont(new Font("Segoe Script", Font.PLAIN, 20));
		txtStartWithId.setText("Start with Id");
		txtStartWithId.setBounds(10, 10, 168, 32);
		panel_1_1_1.add(txtStartWithId);
		txtStartWithId.setColumns(10);
		
		JLabel lblStart = new JLabel("Start");
		lblStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id=txtStartWithId.getText();
				setVisible(false);
				Quize addQue = new Quize();
				addQue.setQuiz_id(id);
				addQue.setVisible(true);
			}
		});
		lblStart.setFont(new Font("Segoe Script", Font.PLAIN, 24));
		lblStart.setBounds(99, 194, 82, 27);
		contentPane.add(lblStart);
	}
}
