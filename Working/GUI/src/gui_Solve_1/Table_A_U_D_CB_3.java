package gui_Solve_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Table_A_U_D_CB_3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	static DefaultTableModel Model;
	private JTextField id;
	private JTextField name;
	private JTextField sal;
	JComboBox<String> comboBox;
	private JTextField Cb_;
	static Table_A_U_D_CB_3 frame = new Table_A_U_D_CB_3();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

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
	public Table_A_U_D_CB_3() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 766, 605);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setAutoscrolls(true);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(358, 11, 382, 544);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int raw = table.getSelectedRow();
				id.setText(Model.getValueAt(raw, 0).toString());
				name.setText(Model.getValueAt(raw, 1).toString());
				sal.setText(Model.getValueAt(raw, 2).toString());
			}
		});
		Model = new DefaultTableModel();
		Object[] column = { "ID", "NAME", "SAL" };
		Object[] row = new Object[3];
		Model.setColumnIdentifiers(column);
		table.setModel(Model);
		JTableHeader tHeader = table.getTableHeader();
		TableColumn c1 = tHeader.getColumnModel().getColumn(0);
		c1.setPreferredWidth(200);
		TableColumn c2 = tHeader.getColumnModel().getColumn(1);
		c2.setPreferredWidth(200);
		TableColumn c3 = tHeader.getColumnModel().getColumn(2);
		c3.setPreferredWidth(200);
		scrollPane.setViewportView(table);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 11, 326, 323);
		contentPane.add(panel);
		panel.setLayout(null);

		JButton add = new JButton("ADD");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		add.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				row[0] = id.getText();
				row[1] = name.getText();
				row[2] = sal.getText();
				Model.addRow(row);

				id.setText("");
				name.setText("");
				sal.setText("");

			}
		});
		add.setBounds(10, 120, 89, 81);
		panel.add(add);

		JButton UPDATE = new JButton("UPDATE");
		UPDATE.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int raw = table.getSelectedRow();
//				System.out.println(raw);
				if (raw >= 0) {
					Model.setValueAt(id.getText(), raw, 0);
					Model.setValueAt(name.getText(), raw, 1);
					Model.setValueAt(sal.getText(), raw, 2);
				} else {
					JOptionPane.showMessageDialog(null, "ERR");
				}

			}
		});
		UPDATE.setBounds(227, 120, 89, 81);
		panel.add(UPDATE);

		JButton Delete = new JButton("DELETE");
		Delete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int raw = table.getSelectedRow();
				if (raw >= 0) {
					Model.removeRow(raw);
				} else {
					JOptionPane.showMessageDialog(null, "ERR");
				}

			}
		});
		Delete.setBounds(227, 212, 89, 81);
		panel.add(Delete);

		JButton Clear = new JButton("CLEAR");
		Clear.setBounds(10, 212, 89, 81);
		panel.add(Clear);

		id = new JTextField();
		id.setBackground(Color.WHITE);
		id.setBounds(131, 11, 185, 20);
		panel.add(id);
		id.setColumns(10);

		name = new JTextField();
		name.setColumns(10);
		name.setBackground(Color.WHITE);
		name.setBounds(131, 42, 185, 20);
		panel.add(name);

		sal = new JTextField();
		sal.setColumns(10);
		sal.setBackground(Color.WHITE);
		sal.setBounds(131, 73, 185, 20);
		panel.add(sal);

		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(10, 14, 111, 14);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 45, 111, 14);
		panel.add(lblNewLabel_1);

		JLabel lblSal = new JLabel("SAL");
		lblSal.setBackground(Color.WHITE);
		lblSal.setBounds(10, 76, 111, 14);
		panel.add(lblSal);

		JButton take = new JButton("Print");
		take.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int t1 = 1, t2 = 1, t3 = 1;
				String D1, D2, D3;
				for (int i = 0; i < table.getRowCount(); i++) 
				{
					System.out.println("ID :" +table.getModel().getValueAt(i, 0).toString());
					System.out.println("NAME :" + table.getModel().getValueAt(i, 1).toString());
					System.out.println("SAL :" + table.getModel().getValueAt(i, 2).toString());
					D1 = (String) table.getModel().getValueAt(i, 0).toString();
					D2 = (String) table.getModel().getValueAt(i, 1).toString();
					D3 = (String) table.getModel().getValueAt(i, 2).toString();
					if ((D1.length()*7) > t1) {
						t1 = D1.length();

					}
					if ((D2.length()*7) > t2) {
						t2 = D2.length();

					}
					if ((D3.length()*7) > t3) {
						t3 = D3.length();

					}
				}
				JTableHeader tHeader = table.getTableHeader();
				TableColumn c1 = tHeader.getColumnModel().getColumn(0);
				
				TableColumn c2 = tHeader.getColumnModel().getColumn(1);
				
				TableColumn c3 = tHeader.getColumnModel().getColumn(2);
				if (t1 <= 28) 
				{
					c1.setPreferredWidth(150);
				}
				else if (t1 > 28)
				{
					c1.setPreferredWidth(t1*9);
				}
				
				if (t2 <= 28) 
				{
					c2.setPreferredWidth(150);
				}
				else if (t2 > 28)
				{
					c2.setPreferredWidth(t1*9);
				}
				
				if (t3 <= 28) 
				{
					c3.setPreferredWidth(150);
				}
				else if (t3 > 28)
				{
					c3.setPreferredWidth(t1*9);
				}

			}
		});
		take.setBounds(109, 120, 108, 81);
		panel.add(take);

		comboBox = new JComboBox<String>();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Cb_.setText((String) comboBox.getSelectedItem().toString());
			}
		});
		comboBox.setBounds(31, 358, 256, 48);
		contentPane.add(comboBox);

		JButton ADD_CB = new JButton("ADD");
		ADD_CB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				comboBox.addItem(Cb_.getText());
				Cb_.setText("");
			}
		});
		ADD_CB.setBounds(31, 417, 128, 48);
		contentPane.add(ADD_CB);

		Cb_ = new JTextField();
		Cb_.setBounds(31, 476, 256, 20);
		contentPane.add(Cb_);
		Cb_.setColumns(10);

		JButton GET_CB = new JButton("GET");
		GET_CB.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cb_.setText((String) comboBox.getSelectedItem());
			}
		});
		GET_CB.setBounds(169, 417, 118, 48);
		contentPane.add(GET_CB);
	}
}
