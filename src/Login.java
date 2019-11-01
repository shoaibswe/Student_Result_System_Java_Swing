import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frame;
	private JTextField usr;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Teacher ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 33, 138, 47);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPassword.setBounds(10, 107, 110, 37);
		frame.getContentPane().add(lblPassword);
		
		usr = new JTextField();
		usr.setBounds(197, 49, 169, 31);
		frame.getContentPane().add(usr);
		usr.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String [] uname= new String[3];
				String [] pw= new String[3];
				
				uname[0]="001";
				uname[1]="002";
				uname[2]="003";
				
				pw[0]="001";
				pw[1]="002";
				pw[2]="003";
				
				
				if(
				
						(usr.getText().equals(uname[0]) && (pass.getText().equals(pw[0]) )) 
						|| (usr.getText().equals(uname[1]) && (pass.getText().equals(pw[1]) ))
						|| (usr.getText().equals(uname[2]) && (pass.getText().equals(pw[2]) ))
					)
				{
					frame.dispose();
					new StudentResult().main(null);;
					
				}
				else {
					JOptionPane.showMessageDialog(frame, "User ID or Password Wrong!");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(200, 166, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		pass = new JPasswordField();
		pass.setBounds(197, 110, 169, 37);
		frame.getContentPane().add(pass);
	}
}
