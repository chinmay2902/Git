package check;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class QuizDashBoard extends JFrame {

	private JPanel contentPane;
	private JPanel panel6;
    private String qu_id="";
	
	
    public void setQu_id(String str)
    {
    	qu_id=str;
    }
    
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizDashBoard frame = new QuizDashBoard();
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
	public QuizDashBoard() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 942, 579);
		setExtendedState(MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(new Color(5, 1, 20));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(16, 0, 43));
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(36, 0, 70));
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(60, 9, 108));
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(new Color(90, 24, 154));
		
		JPanel panel4 = new JPanel();
		panel4.setBackground(new Color(123, 44, 191));
		
		JPanel panel5 = new JPanel();
		panel5.setBackground(new Color(157, 78, 221));
		
		panel6 = new JPanel();
		panel6.setBackground(new Color(199, 125, 255));
		
		JLabel adminTitleLabel = new JLabel("QUIZ DASHBOARD");
		adminTitleLabel.setIcon(new ImageIcon(QuizDashBoard.class.getResource("/img/google.png")));
		adminTitleLabel.setFont(new Font("Phosphate", Font.BOLD | Font.ITALIC, 35));
		adminTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		adminTitleLabel.setForeground(new Color(0, 184, 255));
		
		JLabel lblNewLabel = new JLabel("QUIZ ID");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Phosphate", Font.BOLD, 27));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel qid = new JLabel(qu_id);
		qid.setForeground(Color.CYAN);
		qid.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 15));
		qid.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(225)
					.addComponent(adminTitleLabel, GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(108)
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
							.addGap(14))
						.addGroup(gl_panel.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(qid, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(qid, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
						.addComponent(adminTitleLabel, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		
		
		JLabel logout = new JLabel("LOGOUT");
		logout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame jf=new JFrame();
				jf.setAlwaysOnTop(true);
				int a=JOptionPane.showConfirmDialog(jf, "Are you sure you want to Logout?","Confirmation",JOptionPane.YES_NO_OPTION);
				if(a==0)
				{
					setVisible(false);
					SignUp signup=new SignUp();
					signup.setVisible(true);
					
				}
			}
			
			
		});
		logout.setForeground(Color.CYAN);
		logout.setFont(new Font("Marker Felt", Font.BOLD | Font.ITALIC, 20));
		logout.setIcon(new ImageIcon(QuizDashBoard.class.getResource("/img/exit.png")));
		logout.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel6 = new GroupLayout(panel6);
		gl_panel6.setHorizontalGroup(
			gl_panel6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel6.createSequentialGroup()
					.addGap(45)
					.addComponent(logout, GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
					.addGap(105))
		);
		gl_panel6.setVerticalGroup(
			gl_panel6.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel6.createSequentialGroup()
					.addContainerGap()
					.addComponent(logout, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel6.setLayout(gl_panel6);
		
		JLabel leaderboard = new JLabel("LEADERBOARD");
		leaderboard.setForeground(Color.CYAN);
		leaderboard.setFont(new Font("Marker Felt", Font.BOLD | Font.ITALIC, 20));
		leaderboard.setIcon(new ImageIcon(QuizDashBoard.class.getResource("/img/trophy.png")));
		leaderboard.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel5 = new GroupLayout(panel5);
		gl_panel5.setHorizontalGroup(
			gl_panel5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel5.createSequentialGroup()
					.addGap(39)
					.addComponent(leaderboard, GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
					.addGap(86))
		);
		gl_panel5.setVerticalGroup(
			gl_panel5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel5.createSequentialGroup()
					.addContainerGap()
					.addComponent(leaderboard, GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel5.setLayout(gl_panel5);
		
		JLabel allQ = new JLabel("ALL QUESTIONS");
		allQ.setForeground(Color.CYAN);
		allQ.setFont(new Font("Marker Felt", Font.BOLD | Font.ITALIC, 20));
		allQ.setIcon(new ImageIcon(QuizDashBoard.class.getResource("/img/test.png")));
		allQ.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel4 = new GroupLayout(panel4);
		gl_panel4.setHorizontalGroup(
			gl_panel4.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel4.createSequentialGroup()
					.addGap(70)
					.addComponent(allQ, GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
					.addGap(65))
		);
		gl_panel4.setVerticalGroup(
			gl_panel4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel4.createSequentialGroup()
					.addContainerGap()
					.addComponent(allQ, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
					.addGap(14))
		);
		panel4.setLayout(gl_panel4);
		
		JLabel deleteQ = new JLabel("DELETE QUESTION");
		deleteQ.setForeground(Color.CYAN);
		deleteQ.setFont(new Font("Marker Felt", Font.BOLD | Font.ITALIC, 20));
		deleteQ.setIcon(new ImageIcon(QuizDashBoard.class.getResource("/img/trash.png")));
		deleteQ.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel3 = new GroupLayout(panel3);
		gl_panel3.setHorizontalGroup(
			gl_panel3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel3.createSequentialGroup()
					.addGap(51)
					.addComponent(deleteQ, GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
					.addGap(78))
		);
		gl_panel3.setVerticalGroup(
			gl_panel3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel3.createSequentialGroup()
					.addGap(6)
					.addComponent(deleteQ, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
					.addGap(6))
		);
		panel3.setLayout(gl_panel3);
		
		JLabel updateQ = new JLabel("UPDATE QUESTION");
		updateQ.setForeground(Color.CYAN);
		updateQ.setFont(new Font("Marker Felt", Font.BOLD | Font.ITALIC, 20));
		updateQ.setIcon(new ImageIcon(QuizDashBoard.class.getResource("/img/captcha.png")));
		updateQ.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel2 = new GroupLayout(panel2);
		gl_panel2.setHorizontalGroup(
			gl_panel2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel2.createSequentialGroup()
					.addGap(70)
					.addComponent(updateQ, GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
					.addGap(57))
		);
		gl_panel2.setVerticalGroup(
			gl_panel2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel2.createSequentialGroup()
					.addGap(6)
					.addComponent(updateQ, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
					.addGap(6))
		);
		panel2.setLayout(gl_panel2);
		
		JLabel AddQ = new JLabel("ADD A QUESTION");
		AddQ.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				AddQue addQue = new AddQue();
				addQue.setVisible(true);
			}
		});
		AddQ.setForeground(Color.CYAN);
		AddQ.setFont(new Font("Marker Felt", Font.BOLD | Font.ITALIC, 20));
		AddQ.setIcon(new ImageIcon(QuizDashBoard.class.getResource("/img/add-button.png")));
		AddQ.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel1 = new GroupLayout(panel1);
		gl_panel1.setHorizontalGroup(
			gl_panel1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel1.createSequentialGroup()
					.addGap(40)
					.addComponent(AddQ, GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
					.addGap(57))
		);
		gl_panel1.setVerticalGroup(
			gl_panel1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel1.createSequentialGroup()
					.addContainerGap()
					.addComponent(AddQ, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel1.setLayout(gl_panel1);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 931, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel1, GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
					.addGap(6)
					.addComponent(panel2, GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(6)
					.addComponent(panel4, GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(6)
					.addComponent(panel6, GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel1, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
						.addComponent(panel2, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel3, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
						.addComponent(panel4, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel5, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
						.addComponent(panel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(5))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
