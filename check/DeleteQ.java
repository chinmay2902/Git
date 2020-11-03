
package check;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;

public class DeleteQ extends JFrame {

	private JPanel contentPane;
	private JTextField deleteField;
    private String qid="";
    private JPanel jPanel2;
    private JLabel lblDashboard;
    private JLabel lblNewLabel;
    private JPanel panel_2_4;
    
    
    public void setDeleteQID(String x)
    {
    	qid=x;
    }
    
    
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteQ frame = new DeleteQ();
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
	public DeleteQ() {
		
		DatabaseConnection db=new DatabaseConnection();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500,275, 585, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel deleteLabel = new JLabel("ENTER THE QUESTION ID \r\nYOU WANT TO DELETE");
		deleteLabel.setForeground(Color.BLACK);
		deleteLabel.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 19));
		deleteLabel.setBounds(6, 40, 551, 55);
		contentPane.add(deleteLabel);
		
		JButton btnNewButton = new JButton("DELETE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(deleteField.getText().toString().equals(""))
				{
					JOptionPane.showMessageDialog(contentPane,"Please enter a valid question ID");
				}
				else
				{
					try
					{
						PreparedStatement ps=db.c.prepareStatement("delete from question where que_id=? and quiz_id=?");
						ps.setString(1,deleteField.getText().toString());
						ps.setString(2,"1");
						ps.executeUpdate();
						
						JOptionPane.showMessageDialog(contentPane, "Question deleted successfully");
						
						setVisible(false);
						
					}
					catch (SQLException e1) 
					{
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(contentPane,"Please enter a valid question ID");
						e1.printStackTrace();
					}
				}
			}
		});
		btnNewButton.setBounds(231, 241, 117, 29);
		contentPane.add(btnNewButton);
		
		jPanel2 = new JPanel();
		jPanel2.setBackground(new Color(102, 102, 255));
		jPanel2.setBounds(0, 0, 567, 80);
		contentPane.add(jPanel2);
		
		lblDashboard = new JLabel("Delete Quiz");
		lblDashboard.setHorizontalAlignment(SwingConstants.CENTER);
		lblDashboard.setForeground(Color.WHITE);
		lblDashboard.setFont(new Font("Verdana", Font.PLAIN, 32));
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_jPanel2 = new GroupLayout(jPanel2);
		gl_jPanel2.setHorizontalGroup(
			gl_jPanel2.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_jPanel2.createSequentialGroup()
					.addGap(189)
					.addComponent(lblDashboard, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_jPanel2.setVerticalGroup(
			gl_jPanel2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 74, Short.MAX_VALUE)
				.addGroup(Alignment.TRAILING, gl_jPanel2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jPanel2.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblDashboard)
						.addComponent(lblNewLabel, 0, 0, Short.MAX_VALUE))
					.addGap(592))
		);
		jPanel2.setLayout(gl_jPanel2);
		
		panel_2_4 = new JPanel();
		panel_2_4.setLayout(null);
		panel_2_4.setBorder(new LineBorder(UIManager.getColor("Tree.selectionBackground"), 4));
		panel_2_4.setBounds(160, 140, 264, 61);
		contentPane.add(panel_2_4);
		
		deleteField = new JTextField();
		deleteField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		deleteField.setText("Enter Id");
		deleteField.setBounds(10, 10, 244, 45);
		panel_2_4.add(deleteField);
		deleteField.setColumns(10);
	}
}
