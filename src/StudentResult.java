import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class StudentResult {

	private JFrame frame;
	private JTextField sid;
	private JTextField sname;
	private JTextField totalscore;
	private JTextField rank;
	private JTextField avg;
	private JTextField phy;
	private JTextField che;
	private JTextField ictinp;
	private JTextField bio;
	private JTextField eng;
	private JTextField math;
	private JTextField ban;
	private JTextField soc;
	private JTable restable;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentResult window = new StudentResult();
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
	public StudentResult() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1380, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panelins = new JPanel();
		panelins.setBorder(new TitledBorder(new LineBorder(new Color(64, 64, 64), 4), "StudentRecord", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panelins.setBounds(8, 11, 712, 318);
		frame.getContentPane().add(panelins);
		panelins.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student ID");
		lblNewLabel.setToolTipText("");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 31, 155, 22);
		panelins.add(lblNewLabel);
		
		sid = new JTextField();
		sid.addMouseMotionListener(new MouseMotionAdapter() {
	
		});
		sid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				//==
					char iNumber = evt.getKeyChar();
					if(!(Character.isDigit(iNumber))
						||(iNumber==KeyEvent.VK_BACK_SPACE)
						||(iNumber==KeyEvent.VK_DELETE)){
						evt.consume();
						}
						}
				//==
		
			@Override
			public void keyReleased(KeyEvent e) {
				String x= sid.getText();
				int y=Integer.parseInt(x);	
				if ((y>40) || (y<1)){
					JOptionPane.showMessageDialog(frame, "Min 1 and Max 40 students in a section");
				}
			}
		});
		sid.setFont(new Font("Tahoma", Font.PLAIN, 12));
		sid.setBounds(238, 35, 96, 20);
		panelins.add(sid);
		sid.setColumns(10);
		
		sname = new JTextField();
		sname.setFont(new Font("Tahoma", Font.PLAIN, 12));
		sname.setColumns(10);
		sname.setBounds(238, 68, 96, 20);
		panelins.add(sname);
		
		JLabel lblFirstName = new JLabel("Name");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFirstName.setBounds(10, 64, 118, 22);
		panelins.add(lblFirstName);
		
		totalscore = new JTextField();
		totalscore.setEditable(false);
		totalscore.addKeyListener(new KeyAdapter() {
			@Override

			public void keyTyped(java.awt.event.KeyEvent evt) {
			//==
				char iNumber = evt.getKeyChar();
				if(!(Character.isDigit(iNumber)) 
					||(iNumber==KeyEvent.VK_BACK_SPACE)
					||(iNumber==KeyEvent.VK_DELETE)){
						evt.consume();
					}
					}
		});
		totalscore.setFont(new Font("Tahoma", Font.PLAIN, 12));
		totalscore.setColumns(10);
		totalscore.setBounds(238, 201, 96, 20);
		panelins.add(totalscore);
		
		JLabel lblTotalScore = new JLabel("Total Score");
		lblTotalScore.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTotalScore.setBounds(10, 197, 117, 22);
		panelins.add(lblTotalScore);
		
		JLabel lblLastName = new JLabel("Class");
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLastName.setBounds(10, 98, 107, 22);
		panelins.add(lblLastName);
		
		rank = new JTextField();
		rank.setEditable(false);
		rank.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rank.setColumns(10);
		rank.setBounds(238, 263, 96, 20);
		panelins.add(rank);
		
		avg = new JTextField();
		avg.setEditable(false);
		avg.addKeyListener(new KeyAdapter() {
			@Override

			public void keyTyped(java.awt.event.KeyEvent evt) {
			//==
				char iNumber = evt.getKeyChar();
				if(!(Character.isDigit(iNumber)) 
					||(iNumber==KeyEvent.VK_BACK_SPACE)
					||(iNumber==KeyEvent.VK_DELETE)){
						evt.consume();
					}
					}
		});
		avg.setFont(new Font("Tahoma", Font.PLAIN, 12));
		avg.setColumns(10);
		avg.setBounds(238, 230, 96, 20);
		panelins.add(avg);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAverage.setBounds(10, 226, 76, 22);
		panelins.add(lblAverage);
		
		JLabel lblRank = new JLabel("Grade");
		lblRank.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRank.setBounds(10, 259, 76, 22);
		panelins.add(lblRank);
		
		phy = new JTextField();
		phy.addKeyListener(new KeyAdapter() {
			@Override

			public void keyTyped(java.awt.event.KeyEvent evt) {
			//==
				char iNumber = evt.getKeyChar();
				if(!(Character.isDigit(iNumber)) 
					||(iNumber==KeyEvent.VK_BACK_SPACE)
					||(iNumber==KeyEvent.VK_DELETE)){
						evt.consume();
					}
					}
		});
		phy.setFont(new Font("Tahoma", Font.PLAIN, 12));
		phy.setColumns(10);
		phy.setBounds(579, 188, 96, 20);
		panelins.add(phy);
		
		JLabel lblChemistry_1 = new JLabel("Physics");
		lblChemistry_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblChemistry_1.setBounds(495, 185, 76, 22);
		panelins.add(lblChemistry_1);
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblChemistry.setBounds(495, 152, 76, 22);
		panelins.add(lblChemistry);
		
		che = new JTextField();
		che.addKeyListener(new KeyAdapter() {
			@Override

			public void keyTyped(java.awt.event.KeyEvent evt) {
			//==
				char iNumber = evt.getKeyChar();
				if(!(Character.isDigit(iNumber)) 
					||(iNumber==KeyEvent.VK_BACK_SPACE)
					||(iNumber==KeyEvent.VK_DELETE)){
						evt.consume();
					}
					}
		});
		che.setFont(new Font("Tahoma", Font.PLAIN, 12));
		che.setColumns(10);
		che.setBounds(579, 155, 96, 20);
		panelins.add(che);
		
		ictinp = new JTextField();
		ictinp.addKeyListener(new KeyAdapter() {
			@Override

			public void keyTyped(java.awt.event.KeyEvent evt) {
			//==
				char iNumber = evt.getKeyChar();
				if(!(Character.isDigit(iNumber)) 
					||(iNumber==KeyEvent.VK_BACK_SPACE)
					||(iNumber==KeyEvent.VK_DELETE)){
						evt.consume();
					}
					}
		});
		ictinp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ictinp.setColumns(10);
		ictinp.setBounds(579, 126, 96, 20);
		panelins.add(ictinp);
		
		JLabel lblComputer = new JLabel("ICT");
		lblComputer.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblComputer.setBounds(495, 123, 76, 22);
		panelins.add(lblComputer);
		
		JLabel lblBilogy = new JLabel("Bilogy");
		lblBilogy.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBilogy.setBounds(495, 90, 76, 22);
		panelins.add(lblBilogy);
		
		bio = new JTextField();
		bio.addKeyListener(new KeyAdapter() {
			@Override

			public void keyTyped(java.awt.event.KeyEvent evt) {
			//==
				char iNumber = evt.getKeyChar();
				if(!(Character.isDigit(iNumber)) 
					||(iNumber==KeyEvent.VK_BACK_SPACE)
					||(iNumber==KeyEvent.VK_DELETE)){
						evt.consume();
					}
					}
		});
		bio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		bio.setColumns(10);
		bio.setBounds(579, 93, 96, 20);
		panelins.add(bio);
		
		eng = new JTextField();
		eng.addKeyListener(new KeyAdapter() {
			@Override

			public void keyTyped(java.awt.event.KeyEvent evt) {
			//==
				char iNumber = evt.getKeyChar();
				if(!(Character.isDigit(iNumber)) 
					||(iNumber==KeyEvent.VK_BACK_SPACE)
					||(iNumber==KeyEvent.VK_DELETE)){
						evt.consume();
					}
					}
		});
		eng.setFont(new Font("Tahoma", Font.PLAIN, 12));
		eng.setColumns(10);
		eng.setBounds(579, 59, 96, 20);
		panelins.add(eng);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnglish.setBounds(495, 56, 76, 22);
		panelins.add(lblEnglish);
		
		JLabel lblMath = new JLabel("Math");
		lblMath.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMath.setBounds(495, 23, 76, 22);
		panelins.add(lblMath);
		
		math = new JTextField();
		math.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
			//==
				char iNumber = evt.getKeyChar();
				if(!(Character.isDigit(iNumber)) 
					||(iNumber==KeyEvent.VK_BACK_SPACE)
					||(iNumber==KeyEvent.VK_DELETE)
					||(iNumber>100)
						){
						evt.consume();
					}
					}
			//==
		
			
		});
		math.setFont(new Font("Tahoma", Font.PLAIN, 12));
		math.setColumns(10);
		math.setBounds(579, 26, 96, 20);
		panelins.add(math);
		
		JLabel lblCourseCode = new JLabel("Section");
		lblCourseCode.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCourseCode.setBounds(10, 142, 106, 22);
		panelins.add(lblCourseCode);
		
		JComboBox CCcomboBox = new JComboBox();
		CCcomboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Section", "A", "B"}));
		CCcomboBox.setBounds(238, 151, 96, 28);
		panelins.add(CCcomboBox);
		
		JLabel bangla = new JLabel("Bangla");
		bangla.setFont(new Font("Tahoma", Font.BOLD, 14));
		bangla.setBounds(495, 219, 76, 22);
		panelins.add(bangla);
		
		ban = new JTextField();
		ban.addKeyListener(new KeyAdapter() {
			@Override

			public void keyTyped(java.awt.event.KeyEvent evt) {
			//==
				char iNumber = evt.getKeyChar();
				if(!(Character.isDigit(iNumber)) 
					||(iNumber==KeyEvent.VK_BACK_SPACE)
					||(iNumber==KeyEvent.VK_DELETE)){
						evt.consume();
					}
					}
		});
		ban.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ban.setColumns(10);
		ban.setBounds(579, 219, 96, 20);
		panelins.add(ban);
		
		JLabel socialsc = new JLabel("Sociology");
		socialsc.setFont(new Font("Tahoma", Font.BOLD, 14));
		socialsc.setBounds(495, 252, 76, 22);
		panelins.add(socialsc);
		
		soc = new JTextField();
		soc.addKeyListener(new KeyAdapter() {
			@Override

			public void keyTyped(java.awt.event.KeyEvent evt) {
			//==
				char iNumber = evt.getKeyChar();
				if(!(Character.isDigit(iNumber)) 
					||(iNumber==KeyEvent.VK_BACK_SPACE)
					||(iNumber==KeyEvent.VK_DELETE)){
						evt.consume();
					}
					}
		});
		soc.setFont(new Font("Tahoma", Font.PLAIN, 12));
		soc.setColumns(10);
		soc.setBounds(579, 252, 96, 20);
		panelins.add(soc);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 184, 180, 5);
		panelins.add(separator);
		
		JComboBox classCombo = new JComboBox();
		classCombo.addMouseListener(new MouseAdapter() {
			
		});
		classCombo.setModel(new DefaultComboBoxModel(new String[] {"Select Class", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		classCombo.setBounds(238, 100, 96, 28);
		panelins.add(classCombo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 4), "Records", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(64, 64, 64)));
		panel_1.setBounds(786, 11, 554, 318);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 22, 534, 285);
		panel_1.add(scrollPane_2);
		
		JTextArea transcript = new JTextArea();
		scrollPane_2.setViewportView(transcript);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(18, 340, 1326, 111);
		frame.getContentPane().add(scrollPane_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane_1.setViewportView(scrollPane);
		
		restable = new JTable();
		scrollPane.setViewportView(restable);
		restable.setSurrendersFocusOnKeystroke(true);
		restable.setFillsViewportHeight(true);
		restable.setColumnSelectionAllowed(true);
		restable.setCellSelectionEnabled(true);
		restable.setBackground(Color.PINK);
		restable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Student ID", "Name", "Class", "Section", "Math", "English", "Biology", "Computer", "Chemistry", "Physics", "Bangla", "Social Science", "Total", "Grade", "Average"
			}
		));
		
		JButton btnNewButton = new JButton("Add Result");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				//
				
				
				//==
				if(		(math.getText().length()==0) || (eng.getText().length()==0) ||
						(bio.getText().length()==0) || (ictinp.getText().length()==0) ||
						(che.getText().length()==0) || (phy.getText().length()==0) ||
						(phy.getText().length()==0) ||(ban.getText().length()==0) ||
						(soc.getText().length()==0) || (sid.getText().length()==0)||
						(sname.getText().length()==0) || (classCombo.getSelectedItem().equals("Select Class")) ||
						(CCcomboBox.getSelectedItem().equals("Select Section"))
						) 
				{
					JOptionPane.showMessageDialog(null, "All Fields are required!","Student Record System",JOptionPane.OK_OPTION);
				}
				else
				{
				double [] R = new double[13];
				R[0]=Double.parseDouble(math.getText());
				R[1]=Double.parseDouble(eng.getText());
				R[2]=Double.parseDouble(bio.getText());
				R[3]=Double.parseDouble(ictinp.getText());
				R[4]=Double.parseDouble(che.getText());
				R[5]=Double.parseDouble(phy.getText());
				R[6]=Double.parseDouble(ban.getText());
				R[7]=Double.parseDouble(soc.getText());
			
				if(!((R[0])>100 ||(R[1])>100 ||(R[2])>100 ||(R[3])>100 ||(R[4])>100 ||(R[5])>100 ||(R[6])>100 ||(R[7])>100)) {
					R[8]=(R[0]+R[1]+R[2]+R[3]+R[4]+R[5]+R[6]+R[7])/8;
					R[9]=(R[0]+R[1]+R[2]+R[3]+R[4]+R[5]+R[6]+R[7]);
					
					String average= String.format("%.0f", R[8]);
					avg.setText(average);
					
					String totl= String.format("%.0f", R[9]);
					totalscore.setText(totl);
					if(R[8]<40) {
						rank.setText("Failed");
					}
					else if(R[8]>=40 && R[8]<60) {
						rank.setText("C");
					}
					else if(R[8]>=60 && R[8]<80) {
						rank.setText("B");
					}
					else if(R[8]>=80 && R[8]<=100) {
						rank.setText("A+");
					}
					else {
						rank.setText("Invalid Result");
					}
					
					
					
					DefaultTableModel model= (DefaultTableModel) restable.getModel();
					model.addRow(new Object[] {
							sid.getText(),
							sname.getText(),
							classCombo.getSelectedItem(),
							CCcomboBox.getSelectedItem(),
							math.getText(),
							eng.getText(),
							bio.getText(),
							ictinp.getText(),
							che.getText(),
							phy.getText(),
							ban.getText(),
							soc.getText(),
							totalscore.getText(),
							rank.getText(),
							avg.getText(),	
							
					});
					
					//==
					
					//--rec
					String ma=math.getText();
					String statusmath="";
					int m= Integer.parseInt(ma);
					if(m<40) {
						statusmath="  Failed";
					}
					
					String en=eng.getText();
					String statusen="";
					int engl= Integer.parseInt(en);
					if(engl<40) {
						statusen="  Failed";
					}

					String b=bio.getText();
					String statusbio="";
					int bio= Integer.parseInt(b);
					if(bio<40) {
					statusbio="  Failed";
					}

					String ict=ictinp.getText();
					String statusict="";
					int ictc= Integer.parseInt(ict);
					if(ictc<40) {
					statusict="  Failed";
					}
					
					String chem=che.getText();
					String statusche="";
					int ch= Integer.parseInt(chem);
					if(ch<40) {
					statusche="  Failed";
					}
					
					String phys=phy.getText();
					String statusphy="";
					int p= Integer.parseInt(phys);
					if(p<40) {
					statusphy="  Failed";
					}
					String bang=ban.getText();
					String statusbn="";
					int bn= Integer.parseInt(bang);
					if(bn<40) {
					statusbn="  Failed";
					}	
					
					String so=soc.getText();
					String statussc="";
					int ssc= Integer.parseInt(so);
					if(ssc<40) {
					statussc="  Failed";
					}
					
					
					
					
					transcript.append(
							"\nStudent ID: \t\t"+sid.getText()+
							"\nStudent Name:\t"+sname.getText()+
							"\n==================================\n"+
							"\nMath: \t\t"+ma+ statusmath+
							"\nEnglish: \t\t"+en+ statusen+
							"\nBiology: \t\t"+bio+statusbio+
							"\nComputer: \t\t"+ict+statusict+
							"\nChemistry: \t\t"+chem+statusche+
							"\nPhysics: \t\t"+phys+statusphy+
							"\nBngla: \t\t"+bang+statusbn+
							"\nSocial Sc: \t\t"+so+statussc+
							"\n--------------------------------"+
							"\nTotal Score: \t\t"+totalscore.getText()+
							"\nAverage: \t\t"+avg.getText()+
							"\nResult: \t\t"+rank.getText()+"\n"+
							"\n"+
							"\n"
							);
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Marks Cant be grater than 100","Student Record System",JOptionPane.OK_OPTION);
				}	
			
			}
				
				//===
			
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(414, 589, 131, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//====
				
				DefaultTableModel model=(DefaultTableModel) restable.getModel();
				if(restable.getSelectedRow()==-1) {
					if(restable.getRowCount()==0) {
						JOptionPane.showMessageDialog(null, "No Data To Delete","Student Record System",JOptionPane.OK_OPTION);
					}
					else{
						JOptionPane.showMessageDialog(null, "Select a row to delete","Student Result System",JOptionPane.OK_OPTION);
					}
				}	
				else {
						model.removeRow(restable.getSelectedRow());
					}
				
				//====
			
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDelete.setBounds(571, 589, 95, 31);
		frame.getContentPane().add(btnDelete);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JTextField temp=null;
				for(java.awt.Component c:panelins.getComponents()) {
					if(c.getClass().toString().contains("javax.swing.JTextField")) {
						temp=(JTextField)c;
						temp.setText(null);
					}
				}
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnReset.setBounds(701, 589, 95, 31);
		frame.getContentPane().add(btnReset);
		
		JButton button_3 = new JButton("Exit");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame= new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame, "Sure You want to exit?","Student Result System", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		
		button_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		button_3.setBounds(822, 589, 95, 31);
		frame.getContentPane().add(button_3);
	}
}
