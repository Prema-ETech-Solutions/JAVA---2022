package gui_Solve_1;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class PassWord_ extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField Pass;
	JLabel lb = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PassWord_ frame = new PassWord_();
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
	public PassWord_() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 99);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Pass = new JPasswordField();
		Pass.setBounds(10, 11, 249, 33);
		Pass.setHorizontalAlignment(SwingConstants.CENTER);
		Pass.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(Pass);
		
		JButton bt = new JButton("New button");
		bt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{

				if ("admin".equals(String.copyValueOf(Pass.getPassword()))) 
				{
					lb.setText("Hello");
				} 
				else 
				{
					lb.setText("NOT DONE ...");
				}
			}
		});
		bt.setBounds(262, 11, 142, 31);
		contentPane.add(bt);
		lb.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		lb.setBounds(414, 11, 151, 33);
		contentPane.add(lb);
	}
}
