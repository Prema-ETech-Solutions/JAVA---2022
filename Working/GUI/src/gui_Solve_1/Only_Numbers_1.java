package gui_Solve_1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Only_Numbers_1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static Only_Numbers_1 frame = new Only_Numbers_1();
	private JTextField textField;

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
	public Only_Numbers_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 182, 87);
		setLocationRelativeTo(null); // Center Screen 
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) //keyTyped Event
			{
				char c =e.getKeyChar(); //Storing The Input Value In Char Variable For Verfication
				 
				if(c==KeyEvent.VK_BACK_SPACE ||c==KeyEvent.VK_DELETE || Character.isDigit(c))  // Check The Value Of Input Is Digit Or BackSpace Or Delete Key 
				{
					
				}
				else 
				{
					getToolkit().beep();
					e.consume();
				}
			}
		});
		textField.setBounds(0, 11, 163, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}

}
