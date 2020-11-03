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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class QuizCrud extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizCrud frame = new QuizCrud();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private String Quiz_id="";
	
	public void setQuiz_id(String str)
    {
    	Quiz_id = str;
    }
	/**
	 * Create the frame.
	 */
	public QuizCrud() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1230, 721);
		contentPane = new JPanel();
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
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame jf=new JFrame();
				jf.setAlwaysOnTop(true);
				int a=JOptionPane.showConfirmDialog(jf, "Are you sure you want to Logout?","Confirmation",JOptionPane.YES_NO_OPTION);
				if(a==0)
				{
					setVisible(false);
					Loader signup=new Loader();
					signup.setVisible(true);
					
				}
			}
		});
		lblNewLabel_4.setIcon(new ImageIcon(QuizCrud.class.getResource("/img/icons8-export-64.png")));
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_jPanel2 = new GroupLayout(jPanel2);
		gl_jPanel2.setHorizontalGroup(
			gl_jPanel2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1220, Short.MAX_VALUE)
				.addGroup(gl_jPanel2.createSequentialGroup()
					.addGap(448)
					.addComponent(lblDashboard, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 473, Short.MAX_VALUE)
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
		
		JLabel lblAdd = new JLabel("Add");
		lblAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				AddQuize addQue = new AddQuize();
				addQue.setQuiz_id(Quiz_id);
				addQue.setVisible(true);
			}
		});
		lblAdd.setIcon(new ImageIcon(QuizCrud.class.getResource("/img/icons8-add-property-64.png")));
		lblAdd.setFont(new Font("Segoe Script", Font.PLAIN, 21));
		lblAdd.setBounds(502, 155, 157, 48);
		contentPane.add(lblAdd);
		
		JLabel lblUpdate = new JLabel("Update");
		lblUpdate.setFont(new Font("Segoe Script", Font.PLAIN, 21));
		lblUpdate.setBounds(231, 298, 87, 39);
		contentPane.add(lblUpdate);
		
		JLabel lblDelete = new JLabel("Delete");
		lblDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DeleteQ addQue = new DeleteQ();
				addQue.setVisible(true);
			}
		});
		lblDelete.setFont(new Font("Segoe Script", Font.PLAIN, 20));
		lblDelete.setBounds(904, 300, 75, 34);
		contentPane.add(lblDelete);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(QuizCrud.class.getResource("/img/undraw_product_iteration_kjok.png")));
		label.setBounds(483, 273, 197, 132);
		contentPane.add(label);
		
		JLabel lblAllQuestions = new JLabel("All Questions");
		lblAllQuestions.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				AllQ addQue = new AllQ();
				addQue.setVisible(true);
			}
		});
		lblAllQuestions.setFont(new Font("Segoe Script", Font.PLAIN, 20));
		lblAllQuestions.setBounds(530, 438, 150, 39);
		contentPane.add(lblAllQuestions);
	}
}
