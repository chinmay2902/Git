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
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.AbstractListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Frame;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.UIManager;

public class ADashboard extends JFrame {

	private JPanel contentPane;
	private String adminid;
	private JTable table;
	String inout="out";
	private JTextField peekTxt;
	
	public void setAdminId(String x)
	{
		adminid=x;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ADashboard frame = new ADashboard();
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
	public ADashboard() {
		
		DatabaseConnection db=new DatabaseConnection();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 100, 1315, 736);
		contentPane = new JPanel();
		contentPane.setAlignmentX(Component.RIGHT_ALIGNMENT);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		
		JPanel jPanel2 = new JPanel();
		jPanel2.setBounds(0, 0, 1315, 80);
		jPanel2.setBackground(new Color(102, 102, 255));
		
		JLabel lblDashboard = new JLabel("Dashboard");
		lblDashboard.setHorizontalAlignment(SwingConstants.CENTER);
		lblDashboard.setForeground(Color.WHITE);
		lblDashboard.setFont(new Font("Verdana", Font.PLAIN, 32));
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setIcon(new ImageIcon(ADashboard.class.getResource("/img/icons8-export-64.png")));
		GroupLayout gl_jPanel2 = new GroupLayout(jPanel2);
		gl_jPanel2.setHorizontalGroup(
			gl_jPanel2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jPanel2.createSequentialGroup()
					.addGap(551)
					.addComponent(lblDashboard, GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
					.addGap(414)
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_jPanel2.setVerticalGroup(
			gl_jPanel2.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_jPanel2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jPanel2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jPanel2.createSequentialGroup()
							.addComponent(lblNewLabel_4)
							.addContainerGap())
						.addGroup(gl_jPanel2.createSequentialGroup()
							.addComponent(lblDashboard, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(460))))
		);
		jPanel2.setLayout(gl_jPanel2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(386, 80, 539, 388);
		lblNewLabel_1.setBackground(new Color(0, 0, 102));
		lblNewLabel_1.setIcon(new ImageIcon(ADashboard.class.getResource("/img/undraw_data_trends_b0wg.png")));
		
		JLabel lblNewLabel = new JLabel("Add new quiz");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				New addQue = new New();
				addQue.setVisible(true);
			}
		});
		lblNewLabel.setBounds(1001, 95, 247, 117);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		lblNewLabel.setIcon(new ImageIcon(ADashboard.class.getResource("/img/icons8-concept-64.png")));
		
		JPanel inOutPanel = new JPanel();
		inOutPanel.setVisible(false);
		inOutPanel.setBounds(0, 80, 253, 564);
		inOutPanel.setBackground(new Color(0, 0, 204));
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel_1);
		contentPane.add(jPanel2);
		contentPane.add(lblNewLabel);
		contentPane.add(inOutPanel);
		
		JLabel name = new JLabel("DEFAULT");
		name.setFont(new Font("Marker Felt", Font.BOLD | Font.ITALIC, 24));
		name.setForeground(Color.CYAN);
		name.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel id = new JLabel("DEFAULT");
		id.setFont(new Font("Marker Felt", Font.BOLD | Font.ITALIC, 24));
		id.setForeground(Color.CYAN);
		id.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel sub = new JLabel("DEFAULT");
		sub.setFont(new Font("Marker Felt", Font.BOLD | Font.ITALIC, 24));
		sub.setForeground(Color.CYAN);
		sub.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel special = new JLabel("DEFAULT");
		special.setFont(new Font("Marker Felt", Font.BOLD | Font.ITALIC, 24));
		special.setForeground(Color.CYAN);
		special.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel email = new JLabel("DEFAULT");
		email.setFont(new Font("Marker Felt", Font.BOLD | Font.ITALIC, 24));
		email.setForeground(Color.CYAN);
		email.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel branch = new JLabel("DEFAULT");
		branch.setFont(new Font("Marker Felt", Font.BOLD | Font.ITALIC, 24));
		branch.setForeground(Color.CYAN);
		branch.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel profile = new JLabel("PROFILE");
		profile.setIcon(new ImageIcon(ADashboard.class.getResource("/img/admin.png")));
		profile.setFont(new Font("Marker Felt", Font.BOLD | Font.ITALIC, 25));
		profile.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_inOutPanel = new GroupLayout(inOutPanel);
		gl_inOutPanel.setHorizontalGroup(
			gl_inOutPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_inOutPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_inOutPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_inOutPanel.createSequentialGroup()
							.addComponent(profile, GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_inOutPanel.createSequentialGroup()
							.addGap(67)
							.addComponent(branch, GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
						.addComponent(email, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
						.addComponent(special, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
						.addComponent(sub, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
						.addComponent(id, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
						.addComponent(name, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)))
		);
		gl_inOutPanel.setVerticalGroup(
			gl_inOutPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_inOutPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(name, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(id, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(sub, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(special, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(email, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(branch, GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(profile, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
					.addContainerGap())
		);
		inOutPanel.setLayout(gl_inOutPanel);
		
		JLabel lblLoadYourQuizzes = new JLabel("Load Your Quizzes");
		lblLoadYourQuizzes.setBounds(1001, 218, 247, 80);
		lblLoadYourQuizzes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try 
				{
					PreparedStatement ps1=db.c.prepareStatement("select * from quiz where creator_id=?");
					ps1.setString(1,adminid);
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
		lblLoadYourQuizzes.setIcon(new ImageIcon(ADashboard.class.getResource("/img/icons8-concept-64.png")));
		lblLoadYourQuizzes.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		contentPane.add(lblLoadYourQuizzes);
		
		JLabel inOutLabel = new JLabel("");
		inOutLabel.setBounds(0, 645, 61, 63);
		inOutLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(inout.equals("out"))
				{
					inOutPanel.setVisible(false);
					inOutLabel.setIcon(new ImageIcon(ADashboard.class.getResource("/img/right-arrow.png")));
					inout="in";
				}
				else
				{
					inOutPanel.setVisible(true);
					inOutLabel.setIcon(new ImageIcon(ADashboard.class.getResource("/img/left-arrow.png")));
					inout="out";
					
					String tname = null;
					String tid=null;
					String tsub=null;
					String tspec=null;
					String temail=null;
					String tbranch=null;
					
					
					PreparedStatement ps2;
					try {
						ps2 = db.c.prepareStatement("select t_name,emp_id,subject,specialization,email_id,branch from teacher where emp_id=?");
						ps2.setString(1,adminid);
						ResultSet rs2=ps2.executeQuery();
						while(rs2.next())
						{
							tname=rs2.getString(1);
							tid=rs2.getString(2);
							tsub=rs2.getString(3);
							tspec=rs2.getString(4);
							temail=rs2.getString(5);
							tbranch=rs2.getString(6);
									
						}
						
						name.setText(tname);
						id.setText(tid);
						sub.setText(tsub);
						special.setText(tspec);
						email.setText(temail);
						branch.setText(tbranch);
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			}
		});
		inOutLabel.setIcon(new ImageIcon(ADashboard.class.getResource("/img/right-arrow.png")));
		contentPane.add(inOutLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Peek a quiz with its ID");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String quizid=peekTxt.getText().toString();
				if(quizid.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Please enter a valid quiz ID");
				}
				else
				{
					try
					{
						PreparedStatement ps3 = db.c.prepareStatement("select * from quiz where quiz_id=? and creator_id=?");
						ps3.setString(1, quizid);
						ps3.setString(2, adminid);
						ResultSet rs3=ps3.executeQuery();
						if(rs3.next())
						{
							//JOptionPane.showMessageDialog(null, "Opening the quiz ...");
							//setVisible(false);
							QuizCrud qdb=new QuizCrud();
							qdb.setVisible(true);
							qdb.setQuiz_id(quizid);
							setVisible(false);
						}
						else
						{
							JOptionPane.showMessageDialog(null,"Please enter a valid quiz ID");
						}
					} 
					catch (SQLException e1) 
					{
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
				}
				
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon(ADashboard.class.getResource("/img/icons8-add-property-64.png")));
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(994, 328, 287, 80);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(UIManager.getColor("Tree.selectionBackground"), 4));
		panel_1_1.setBounds(1055, 398, 204, 61);
		contentPane.add(panel_1_1);
		
		peekTxt = new JTextField();
		peekTxt.setBounds(10, 10, 184, 40);
		panel_1_1.add(peekTxt);
		peekTxt.setBackground(Color.WHITE);
		peekTxt.setForeground(new Color(0, 255, 255));
		peekTxt.setColumns(10);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new LineBorder(UIManager.getColor("Tree.selectionBackground"), 4));
		panel_1_1_1.setBounds(396, 487, 588, 168);
		contentPane.add(panel_1_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 567, 148);
		panel_1_1_1.add(scrollPane);
		scrollPane.setForeground(Color.CYAN);
		scrollPane.setBackground(Color.CYAN);
		
		table = new JTable();
		table.setShowGrid(true);
		table.setShowVerticalLines(true);
		table.setShowHorizontalLines(true);
		scrollPane.setViewportView(table);
	}
}
