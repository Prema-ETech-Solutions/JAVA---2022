package gui_Solve_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class Rbtn_9 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JRadioButton R4 = new JRadioButton("R4");
	JRadioButton R3 = new JRadioButton("R3");
	JRadioButton R2 = new JRadioButton("R2");
	JRadioButton R1 = new JRadioButton("R1");
	JLabel l1 = new JLabel("");
	JLabel l2 = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rbtn_9 frame = new Rbtn_9();
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
	public Rbtn_9() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 679, 169);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		R1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				R2.setSelected(false);
				R3.setSelected(false);
				R4.setSelected(false);
			}
		});
		R1.setBounds(6, 7, 145, 40);
		contentPane.add(R1);
		R2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				R1.setSelected(false);
				R3.setSelected(false);
				R4.setSelected(false);
			}
		});

		R2.setBounds(169, 7, 145, 40);
		contentPane.add(R2);
		R3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				R2.setSelected(false);
				R1.setSelected(false);
				R4.setSelected(false);
			}
		});

		R3.setBounds(351, 7, 118, 40);
		contentPane.add(R3);
		R4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				R2.setSelected(false);
				R3.setSelected(false);
				R1.setSelected(false);
			}
		});

		R4.setBounds(510, 7, 118, 40);
		contentPane.add(R4);

		JButton b1 = new JButton("Check");
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				l1.setText("");
				l2.setText("");
				if (R1.isSelected()) 
				{
					l1.setText("R1");
					R2.setSelected(false);
					R3.setSelected(false);
					R4.setSelected(false);
				}
				else if (R2.isSelected()) 
				{
					l1.setText("R2");
					R4.setSelected(false);
					R3.setSelected(false);
					R1.setSelected(false);
				} 
				else if (R3.isSelected()) 
				{
					l2.setText("R3");
					R2.setSelected(false);
					R4.setSelected(false);
					R1.setSelected(false);
				}
				else if (R4.isSelected()) 
				{
					l2.setText("R4");
					R2.setSelected(false);
					R3.setSelected(false);
					R1.setSelected(false);
				}
				else 
				{
					l1.setText("Click On Any R Btn");
					l2.setText("Click On Any R Btn");
				}
			}
		});
		b1.setBounds(235, 59, 153, 60);
		contentPane.add(b1);

		l1.setBounds(6, 54, 204, 65);
		contentPane.add(l1);

		l2.setBounds(398, 54, 204, 65);
		contentPane.add(l2);
	}
}
