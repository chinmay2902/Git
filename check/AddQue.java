package check;
import java.awt.BorderLayout;
import java.sql.*;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class AddQue extends JFrame {

	private JPanel contentPane;
	private JTextField QuetextField;
	private JTextField opt1text;
	private JTextField opt2text;
	private JTextField opt3text;
	private JTextField opt4text;
	JComboBox comboBox;
	Connection conn;
	int id=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddQue frame = new AddQue();
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
	public AddQue() {
		
		DatabaseConnection db=new DatabaseConnection();
		
		
		setResizable(false);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(175, 100, 930, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 112, 111);
		panel.setBackground(new Color(58, 12, 163));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(AddQue.class.getResource("/MiniProjectResources/add.png")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(6, 6, 100, 99);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 111, 112, 436);
		panel_1.setBackground(new Color(63, 55, 201));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel number = new JLabel(String.valueOf(id));
		number.setBounds(6, 180, 100, 99);
		number.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 60));
		number.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(number);
		
		JLabel QuestionNoLabel = new JLabel("Question No");
		QuestionNoLabel.setFont(new Font("Marker Felt", Font.ITALIC, 22));
		QuestionNoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		QuestionNoLabel.setBounds(6, 129, 100, 71);
		panel_1.add(QuestionNoLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(112, 0, 818, 111);
		panel_2.setBackground(new Color(72, 12, 168));
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel addTitle = new JLabel("ADD NEW QUESTION");
		addTitle.setBounds(42, 6, 611, 99);
		addTitle.setFont(new Font("Marker Felt", Font.ITALIC, 52));
		addTitle.setHorizontalAlignment(SwingConstants.CENTER);
		addTitle.setForeground(new Color(76, 201, 240));
		panel_2.add(addTitle);
		
		JLabel back = new JLabel("");
		back.setIcon(new ImageIcon(AddQue.class.getResource("/MiniProjectResources/previous.png")));
		back.setHorizontalAlignment(SwingConstants.CENTER);
		back.setBounds(710, 6, 102, 99);
		panel_2.add(back);
		
		JPanel saveIcon = new JPanel();
		saveIcon.setBounds(818, 111, 112, 436);
		saveIcon.setBackground(new Color(58, 12, 163));
		contentPane.add(saveIcon);
		saveIcon.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				id=0;
				String que=QuetextField.getText();
				String opt1=opt1text.getText();
				String opt2=opt2text.getText();
				String opt3=opt3text.getText();
				String opt4=opt4text.getText();
				String ans=comboBox.getSelectedItem().toString();
				
				try {
				Statement stmt=conn.createStatement();
				
					ResultSet rs=stmt.executeQuery("select count(*) from question");
					if(rs.first())
					{
						id=(rs.getInt(1))+1;
					}
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				try {
					PreparedStatement ps=conn.prepareStatement("insert into question values(?,?,?,?,?,?,?,?)");
					ps.setInt(1,id);
					ps.setString(2,que);
					ps.setString(3,opt1);
					ps.setString(4,opt2);
					ps.setString(5,opt3);
					ps.setString(6,opt4);
					ps.setString(7,ans);
					ps.setString(8,"01");
					
					ps.executeUpdate();
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(AddQue.class.getResource("/MiniProjectResources/button.png")));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(6, 33, 100, 95);
		saveIcon.add(lblNewLabel_1);
		
		JLabel clrIcon = new JLabel("");
		clrIcon.setIcon(new ImageIcon(AddQue.class.getResource("/MiniProjectResources/clear.png")));
		clrIcon.setHorizontalAlignment(SwingConstants.CENTER);
		clrIcon.setBounds(6, 229, 100, 95);
		saveIcon.add(clrIcon);
		
		JLabel saveLabel = new JLabel("SAVE");
		saveLabel.setForeground(Color.CYAN);
		saveLabel.setFont(new Font("Marker Felt", Font.BOLD | Font.ITALIC, 25));
		saveLabel.setHorizontalAlignment(SwingConstants.CENTER);
		saveLabel.setBounds(0, 140, 100, 44);
		saveIcon.add(saveLabel);
		
		JLabel lblNewLabel_2 = new JLabel("CLEAR");
		lblNewLabel_2.setForeground(Color.CYAN);
		lblNewLabel_2.setFont(new Font("Marker Felt", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(6, 336, 100, 39);
		saveIcon.add(lblNewLabel_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(112, 111, 705, 83);
		panel_4.setBackground(new Color(86, 11, 173));
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel QL = new JLabel("QUESTION : ");
		QL.setBounds(6, 18, 140, 48);
		QL.setFont(new Font("Marker Felt", Font.ITALIC, 28));
		QL.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(QL);
		
		QuetextField = new JTextField();
		QuetextField.setBounds(158, 18, 541, 48);
		panel_4.add(QuetextField);
		QuetextField.setColumns(10);
		
		JPanel opt2Text = new JPanel();
		opt2Text.setBounds(112, 194, 705, 298);
		opt2Text.setBackground(new Color(67, 97, 238));
		contentPane.add(opt2Text);
		opt2Text.setLayout(null);
		
		JLabel options = new JLabel("OPTIONS :");
		options.setBounds(6, 6, 137, 36);
		options.setFont(new Font("Marker Felt", Font.BOLD | Font.ITALIC, 25));
		options.setHorizontalAlignment(SwingConstants.CENTER);
		opt2Text.add(options);
		
		JLabel opt1 = new JLabel("1");
		opt1.setBounds(38, 54, 61, 28);
		opt1.setFont(new Font("Marker Felt", Font.BOLD | Font.ITALIC, 25));
		opt1.setHorizontalAlignment(SwingConstants.CENTER);
		opt2Text.add(opt1);
		
		JLabel opt2 = new JLabel("2");
		opt2.setBounds(38, 116, 61, 28);
		opt2.setFont(new Font("Marker Felt", Font.BOLD | Font.ITALIC, 25));
		opt2.setHorizontalAlignment(SwingConstants.CENTER);
		opt2Text.add(opt2);
		
		JLabel opt3 = new JLabel("3");
		opt3.setBounds(38, 184, 61, 28);
		opt3.setFont(new Font("Marker Felt", Font.BOLD | Font.ITALIC, 25));
		opt3.setHorizontalAlignment(SwingConstants.CENTER);
		opt2Text.add(opt3);
		
		JLabel opt4 = new JLabel("4");
		opt4.setBounds(38, 249, 61, 28);
		opt4.setFont(new Font("Marker Felt", Font.BOLD | Font.ITALIC, 25));
		opt4.setHorizontalAlignment(SwingConstants.CENTER);
		opt2Text.add(opt4);
		
		opt1text = new JTextField();
		opt1text.setBounds(157, 48, 542, 36);
		opt2Text.add(opt1text);
		opt1text.setColumns(10);
		
		opt2text = new JTextField();
		opt2text.setBounds(157, 110, 542, 36);
		opt2Text.add(opt2text);
		opt2text.setColumns(10);
		
		opt3text = new JTextField();
		opt3text.setBounds(157, 178, 542, 36);
		opt2Text.add(opt3text);
		opt3text.setColumns(10);
		
		opt4text = new JTextField();
		opt4text.setBounds(157, 243, 542, 36);
		opt2Text.add(opt4text);
		opt4text.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(112, 492, 705, 55);
		panel_6.setBackground(new Color(114, 9, 183));
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Marker Felt", Font.BOLD | Font.ITALIC, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"--SELECT CORRECT OPTION--", "1", "2", "3", "4"}));
		comboBox.setBounds(208, 6, 279, 43);
		panel_6.add(comboBox);
	}
}
