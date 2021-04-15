package gui_Solve_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import com.placeholder.PlaceHolder;

public class Placeholder_7 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	@SuppressWarnings("unused")
	private static PlaceHolder ph;
	private JTextField textField_1;
	 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Placeholder_7 frame = new Placeholder_7();
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
	public Placeholder_7() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) 
			{
				ph = new PlaceHolder(textField_1, "HELLO");
				ph = new PlaceHolder(textField, "HELLO");

			}
		});
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 302, 182);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 267, 45);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 67, 266, 65);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		
	}
}
