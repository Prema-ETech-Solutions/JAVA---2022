package database.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.UIManager;
import net.proteanit.sql.DbUtils;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.sql.ResultSet;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Database_gui extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JPanel P1,P2,P3,P4;
	private JTextField TF_NAME;
	private JTextField TF_SAL;
	private JTextField TF_NAME_UPDATE;
	private JTextField TF_NAME_NEW_UPDATE;
	private JTextField TF_Delete;
	private JTextField TF_REFRESH;
	private JTable table;
	static JLayeredPane LP;
	private JTextField TF_IP;
	private JTextField TF_PORT;
	private JTextField TF_USERNAME;
	private JTextField TF_PASSWORD;
	private JTextField TF_DB;
	JButton Change;
	JButton CC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Database_gui frame = new Database_gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static void CP(Component C1) 
	{
		LP.removeAll();
		LP.add(C1);
		LP.revalidate();
		LP.repaint();
	}
	/**
	 * Create the frame.
	 */
	public Database_gui() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) 
			{
				CC.setEnabled(false);
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 861, 618);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
	    LP = new JLayeredPane();
		contentPane.add(LP);
		LP.setLayout(new CardLayout(0, 0));
		
		P1 = new JPanel();
		P1.setBorder(null);
		P1.setBackground(UIManager.getColor("textHighlight"));
		LP.add(P1, "name_67693254342400");
		P1.setLayout(null);
		
		JButton Connect = new JButton("CONNECT");
		Connect.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				
				if (Mysql_db.Connect()!=null) 
				{
					JOptionPane.showMessageDialog(null, "CONNECTED");
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "NOT CONNECTED");
					
				}
				
			}
		});
		Connect.setForeground(Color.BLACK);
		Connect.setFont(new Font("Segoe UI", Font.BOLD, 25));
		Connect.setBackground(Color.WHITE);
		Connect.setBounds(0, 0, 162, 60);
		P1.add(Connect);
		
		JButton Create_t = new JButton("CREATE TABLE");
		Create_t.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				
				if (Mysql_db.Create()!=false) 
				{
					JOptionPane.showMessageDialog(null,"TABLE CREATED");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"TABLE NOT CREATED");
					
				}
				
			}
		});
		Create_t.setForeground(Color.BLACK);
		Create_t.setFont(new Font("Segoe UI", Font.BOLD, 25));
		Create_t.setBackground(Color.WHITE);
		Create_t.setBounds(162, 0, 220, 60);
		P1.add(Create_t);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBounds(381, 0, 464, 160);
		P1.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INSERT");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 11, 444, 32);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 21));
		lblNewLabel_1.setBounds(10, 68, 85, 32);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("SAL");
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 21));
		lblNewLabel_1_1.setBounds(10, 111, 85, 32);
		panel.add(lblNewLabel_1_1);
		
		TF_NAME = new JTextField();
		TF_NAME.setFont(new Font("Segoe UI", Font.BOLD, 20));
		TF_NAME.setBounds(105, 68, 135, 32);
		panel.add(TF_NAME);
		TF_NAME.setColumns(10);
		
		TF_SAL = new JTextField();
		TF_SAL.setFont(new Font("Segoe UI", Font.BOLD, 21));
		TF_SAL.setColumns(10);
		TF_SAL.setBounds(105, 111, 135, 32);
		panel.add(TF_SAL);
		
		JButton btnNewButton = new JButton("INSERT DATA");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if (Mysql_db.CHECK(TF_NAME.getText())==0)
				{
					if (Mysql_db.Insert(TF_NAME.getText(),Double.parseDouble(TF_SAL.getText())) != false ) 
					{
						JOptionPane.showMessageDialog(null,"DATA SAVED");
						TF_NAME.setText("");
						TF_SAL.setText("");
					}
					else
					{
						JOptionPane.showMessageDialog(null,"DATA NOT SAVED");
					}
					
				}
				else if (Mysql_db.CHECK(TF_NAME.getText())>=1) 
				{
					JOptionPane.showMessageDialog(null,"THIS NAME IS ALREADY EXISTED ");
					TF_NAME.setText("");
				}
				else 
				{
					JOptionPane.showMessageDialog(null,"SOMETHING WENT WRONG!");
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 19));
		btnNewButton.setBounds(250, 61, 204, 82);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(null);
		panel_1.setBounds(381, 165, 464, 122);
		P1.add(panel_1);
		
		JLabel lblUpdate = new JLabel("UPDATE");
		lblUpdate.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpdate.setFont(new Font("Segoe UI", Font.BOLD, 30));
		lblUpdate.setBounds(10, 11, 444, 32);
		panel_1.add(lblUpdate);
		
		JLabel lblNewLabel_1_2 = new JLabel("NAME");
		lblNewLabel_1_2.setFont(new Font("Segoe UI", Font.BOLD, 21));
		lblNewLabel_1_2.setBounds(20, 37, 85, 32);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("NEW NAME");
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 21));
		lblNewLabel_1_1_1.setBounds(329, 37, 132, 32);
		panel_1.add(lblNewLabel_1_1_1);
		
		TF_NAME_UPDATE = new JTextField();
		TF_NAME_UPDATE.setFont(new Font("Segoe UI", Font.BOLD, 20));
		TF_NAME_UPDATE.setColumns(10);
		TF_NAME_UPDATE.setBounds(10, 68, 135, 32);
		panel_1.add(TF_NAME_UPDATE);
		
		TF_NAME_NEW_UPDATE = new JTextField();
		TF_NAME_NEW_UPDATE.setFont(new Font("Segoe UI", Font.BOLD, 21));
		TF_NAME_NEW_UPDATE.setColumns(10);
		TF_NAME_NEW_UPDATE.setBounds(339, 68, 125, 32);
		panel_1.add(TF_NAME_NEW_UPDATE);
		
		JButton btnNewButton_1 = new JButton("UPDATE DATA");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				
				if (Mysql_db.CHECK(TF_NAME_UPDATE.getText())==1)
				{
					if (Mysql_db.UPDATE(TF_NAME_UPDATE.getText(), TF_NAME_NEW_UPDATE.getText()) != false ) 
					{
						JOptionPane.showMessageDialog(null,"DATA UPDATED");
						TF_NAME_UPDATE.setText("");
						TF_NAME_NEW_UPDATE.setText("");
					}
					else
					{
						JOptionPane.showMessageDialog(null,"DATA NOT UPDATED");
					}
					
				}
				else if (Mysql_db.CHECK(TF_NAME_UPDATE.getText())>1) 
				{
					JOptionPane.showMessageDialog(null,"THERE IS MORE THAN 1 ENTRY");
				}
				else if (Mysql_db.CHECK(TF_NAME_UPDATE.getText())==0) 
				{
					JOptionPane.showMessageDialog(null,"NO NAME FOUND");
				}
				else 
				{
					JOptionPane.showMessageDialog(null,"SOMETHING WENT WRONG!");
				}
			}
		});
		btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 19));
		btnNewButton_1.setBounds(149, 65, 180, 46);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(null);
		panel_1_1.setBounds(381, 296, 464, 122);
		P1.add(panel_1_1);
		
		JLabel lblDelete = new JLabel("DELETE");
		lblDelete.setHorizontalAlignment(SwingConstants.CENTER);
		lblDelete.setFont(new Font("Segoe UI", Font.BOLD, 30));
		lblDelete.setBounds(10, 11, 444, 32);
		panel_1_1.add(lblDelete);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("NAME");
		lblNewLabel_1_2_1.setFont(new Font("Segoe UI", Font.BOLD, 21));
		lblNewLabel_1_2_1.setBounds(10, 68, 85, 32);
		panel_1_1.add(lblNewLabel_1_2_1);
		
		TF_Delete = new JTextField();
		TF_Delete.setFont(new Font("Segoe UI", Font.BOLD, 20));
		TF_Delete.setColumns(10);
		TF_Delete.setBounds(85, 68, 196, 32);
		panel_1_1.add(TF_Delete);
		
		JButton btnNewButton_1_1 = new JButton("DELETE DATA");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if (Mysql_db.CHECK(TF_Delete.getText())==1)
				{
					if (Mysql_db.DELETE(TF_Delete.getText())!=false)
					{
						JOptionPane.showMessageDialog(null,"DATA DELETED");
					} 
					else 
					{
						JOptionPane.showMessageDialog(null,"DATA NOT DELETED");
					}
				}
				else if (Mysql_db.CHECK(TF_Delete.getText())==0) 
				{
					JOptionPane.showMessageDialog(null, "NO ENTRY FOUND");
				}
				else if (Mysql_db.CHECK(TF_Delete.getText())>1)
				{
					JOptionPane.showMessageDialog(null, "THERE IS MORE THAN 1 ENTRY");
				}
				else 
				{
					JOptionPane.showMessageDialog(null,"SOMETHING WENT WRONG!");
				}
			}
		});
		btnNewButton_1_1.setFont(new Font("Segoe UI", Font.BOLD, 19));
		btnNewButton_1_1.setBounds(291, 54, 163, 62);
		panel_1_1.add(btnNewButton_1_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(null);
		panel_1_1_1.setBounds(381, 429, 464, 122);
		P1.add(panel_1_1_1);
		
		JLabel lblRefresh = new JLabel("REFRESH");
		lblRefresh.setHorizontalAlignment(SwingConstants.CENTER);
		lblRefresh.setFont(new Font("Segoe UI", Font.BOLD, 30));
		lblRefresh.setBounds(10, 11, 444, 32);
		panel_1_1_1.add(lblRefresh);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("NAME");
		lblNewLabel_1_2_1_1.setFont(new Font("Segoe UI", Font.BOLD, 21));
		lblNewLabel_1_2_1_1.setBounds(10, 38, 85, 32);
		panel_1_1_1.add(lblNewLabel_1_2_1_1);
		
		TF_REFRESH = new JTextField();
		TF_REFRESH.setFont(new Font("Segoe UI", Font.BOLD, 20));
		TF_REFRESH.setColumns(10);
		TF_REFRESH.setBounds(0, 68, 163, 32);
		panel_1_1_1.add(TF_REFRESH);
		
		JButton btnNewButton_1_1_1 = new JButton("REFRESH TABLE");
		btnNewButton_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if (Mysql_db.CHECK()>=1) 
				{
					if (TF_REFRESH.getText().equals(""))
					{
						ResultSet RS =Mysql_db.RS();
						if (RS!=null)
						{
							table.setModel(DbUtils.resultSetToTableModel(RS));
						}
						
						
						

					}
					else
					{
						ResultSet RS =Mysql_db.RS(TF_REFRESH.getText());
						if (RS!=null)
						{
							table.setModel(DbUtils.resultSetToTableModel(RS));
						}

					}
					
				}
				else if (Mysql_db.CHECK()==0) 
				{
					JOptionPane.showMessageDialog(null,"NO DATA FOUND !");
				}
				else 
				{
					JOptionPane.showMessageDialog(null,"SOMETHING WENT WRONG!");
				}
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 19));
		btnNewButton_1_1_1.setBounds(191, 54, 263, 62);
		panel_1_1_1.add(btnNewButton_1_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 186, 365, 366);
		P1.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				int v1 = table.getSelectedRow();
				//int V2= table.getSelectedColumn(); System.out.println(V2);
				
				TF_NAME_UPDATE.setText(table.getValueAt(v1, 1).toString());
				TF_Delete.setText(table.getValueAt(v1, 1).toString());
			}
		});
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_2 = new JLabel("NEXT");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 21));
		lblNewLabel_2.setBounds(773, 554, 62, 25);
		P1.add(lblNewLabel_2);
		
		Change = new JButton("CHANGE");
		Change.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				CP(P2);
			}
		});
		Change.setForeground(Color.BLACK);
		Change.setFont(new Font("Segoe UI", Font.BOLD, 25));
		Change.setBackground(Color.WHITE);
		Change.setBounds(0, 60, 162, 60);
		P1.add(Change);
		
		 CC = new JButton("CONNECT CHANGE");
		CC.setForeground(Color.BLACK);
		CC.setFont(new Font("Segoe UI", Font.BOLD, 18));
		CC.setBackground(Color.WHITE);
		CC.setBounds(162, 60, 220, 60);
		P1.add(CC);
		
		JButton Change_1 = new JButton("DEFAULT DB CONNECTION");
		Change_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				Mysql_db.Clean();
			}
		});
		Change_1.setForeground(Color.BLACK);
		Change_1.setFont(new Font("Segoe UI", Font.BOLD, 25));
		Change_1.setBackground(Color.WHITE);
		Change_1.setBounds(0, 120, 382, 60);
		P1.add(Change_1);
		
	    P2 = new JPanel();
	    P2.setBackground(UIManager.getColor("Table.shadow"));
		LP.add(P2, "name_67695801490500");
		P2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("IP");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(25, 28, 140, 42);
		P2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("PORT");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3_1.setBounds(25, 81, 140, 42);
		P2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("USERNAME");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3_1_1.setBounds(25, 134, 140, 42);
		P2.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("PASSWORD");
		lblNewLabel_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3_1_2.setBounds(25, 188, 140, 42);
		P2.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("DATABASE NAME");
		lblNewLabel_3_1_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3_1_3.setBounds(25, 249, 178, 42);
		P2.add(lblNewLabel_3_1_3);
		
		TF_IP = new JTextField();
		TF_IP.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 29));
		TF_IP.setBounds(220, 28, 256, 36);
		P2.add(TF_IP);
		TF_IP.setColumns(10);
		
		TF_PORT = new JTextField();
		TF_PORT.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 29));
		TF_PORT.setColumns(10);
		TF_PORT.setBounds(220, 81, 256, 36);
		P2.add(TF_PORT);
		
		TF_USERNAME = new JTextField();
		TF_USERNAME.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 29));
		TF_USERNAME.setColumns(10);
		TF_USERNAME.setBounds(220, 134, 256, 36);
		P2.add(TF_USERNAME);
		
		TF_PASSWORD = new JTextField();
		TF_PASSWORD.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 29));
		TF_PASSWORD.setColumns(10);
		TF_PASSWORD.setBounds(220, 182, 256, 36);
		P2.add(TF_PASSWORD);
		
		TF_DB = new JTextField();
		TF_DB.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 29));
		TF_DB.setColumns(10);
		TF_DB.setBounds(220, 249, 256, 36);
		P2.add(TF_DB);
		
		JButton BTN_OK = new JButton("SAVE ");
		BTN_OK.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if (TF_DB.getText().equals("")||TF_IP.getText().equals("")||TF_PASSWORD.getText().equals("")||TF_USERNAME.getText().equals("")||TF_PORT.getText().equals("")) 
				{
					CP(P1);
				}
				else 
				{
					Mysql_db.Change(TF_IP.getText(), TF_PORT.getText(), TF_DB.getText(), TF_USERNAME.getText(), TF_PASSWORD.getText());
					CP(P1);
					
				}
				
			}
		});
		BTN_OK.setFont(new Font("Segoe UI Black", Font.BOLD, 23));
		BTN_OK.setBounds(220, 312, 103, 59);
		P2.add(BTN_OK);
		
		JButton BTN_C = new JButton("CANCLE");
		BTN_C.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				CP(P1);
			}
		});
		BTN_C.setFont(new Font("Segoe UI Black", Font.BOLD, 23));
		BTN_C.setBounds(358, 312, 171, 59);
		P2.add(BTN_C);
		
	    P3 = new JPanel();
		LP.add(P3, "name_67697873426499");
		
	    P4 = new JPanel();
		LP.add(P4, "name_67699912899799");
	}
}
