package gui_Solve_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import java.awt.Color;
import java.awt.Component;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Switch_Pannel_2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel p4,p3,p2,p1;
	private JButton b1;
	private JButton b3;
	private JButton b4;
	private JButton b2;
	private JLayeredPane layeredPane;
	static Switch_Pannel_2 frame = new Switch_Pannel_2();
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
	public Switch_Pannel_2() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 222, 169);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		layeredPane = new JLayeredPane();
		contentPane.add(layeredPane);
		 layeredPane.setLayout(new CardLayout(0, 0));
		
		 p1 = new JPanel();
		 p1.setBackground(Color.CYAN);
		layeredPane.add(p1, "name_88210842751200");
		p1.setLayout(null);
		
		b1 = new JButton("B1");
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				Change(p2);
			}
		});
		b1.setBounds(0, 0, 89, 23);
		p1.add(b1);
		
		JLabel lblNewLabel = new JLabel("P1");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(115, 0, 168, 80);
		p1.add(lblNewLabel);
		
		 p2 = new JPanel();
		 p2.setBackground(Color.MAGENTA);
		layeredPane.add(p2, "name_88210920231000");
		p2.setLayout(null);
		
		b2 = new JButton("B2");
		b2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				Change(p3);
			}
		});
		b2.setBounds(0, 0, 89, 23);
		p2.add(b2);
		
		JLabel lblP = new JLabel("P2");
		lblP.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblP.setBackground(Color.BLACK);
		lblP.setBounds(137, 4, 168, 80);
		p2.add(lblP);
		
		p3 = new JPanel();
		p3.setBackground(Color.YELLOW);
		layeredPane.add(p3, "name_88210989447300");
		p3.setLayout(null);
		
		b3 = new JButton("B3");
		b3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				Change(p4);
			}
		});
		b3.setBounds(0, 0, 89, 23);
		p3.add(b3);
		
		JLabel lblP_2 = new JLabel("P3");
		lblP_2.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblP_2.setBackground(Color.BLACK);
		lblP_2.setBounds(134, 4, 168, 80);
		p3.add(lblP_2);
		
		 p4 = new JPanel();
		 p4.setBackground(Color.PINK);
		layeredPane.add(p4, "name_88211053523300");
		p4.setLayout(null);
		
		b4 = new JButton("B4");
		b4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				Change(p1);
			}
		});
		b4.setBounds(0, 0, 89, 23);
		p4.add(b4);
		
		JLabel lblP_3 = new JLabel("P4");
		lblP_3.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblP_3.setBackground(Color.BLACK);
		lblP_3.setBounds(129, 4, 168, 80);
		p4.add(lblP_3);
	}
	
	public static void Change(Component C1)
	{
		frame.layeredPane.removeAll();
		frame.layeredPane.add(C1);
		frame.layeredPane.revalidate();
		frame.layeredPane.repaint();
		
	}
}
