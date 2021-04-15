package gui_Solve_1;

import java.awt.EventQueue;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Auto_Suggest_6 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField text;
	private Set<String> s = new TreeSet<String>();
	JButton Add;
	JButton Remove;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Auto_Suggest_6 frame = new Auto_Suggest_6();
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
	public Auto_Suggest_6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 243, 124);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		text = new JTextField();
		text.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) 
			{
				
				if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE||e.getKeyCode()==KeyEvent.VK_DELETE)
		        {
		           
		        }
		        else
		        {   
		            String to_check=text.getText();
		            int to_check_len=to_check.length();
		            for(String data:s)
		            {
		                String check_from_data="";
		                for(int i=0;i<to_check_len;i++)
		                {
		                    if(to_check_len<=data.length())
		                    {
		                        check_from_data = check_from_data+data.charAt(i);
		                    }
		                }
		                //System.out.print(check_from_data);
		                if(check_from_data.equals(to_check))
		                {
		                    //System.out.print("Found");
		                    text.setText(data);
		                    text.setSelectionStart(to_check_len);
		                    text.setSelectionEnd(data.length());
		                    break;
		                }
		            }
		        }
			}
		});
		text.setBounds(0, 0, 221, 35);
		contentPane.add(text);
		text.setColumns(10);
		
		Add = new JButton("ADD");
		Add.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				s.add(text.getText());
			}
		});
		Add.setBounds(0, 41, 111, 40);
		contentPane.add(Add);
		
		 Remove = new JButton("Clear");
		 Remove.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent e)
		 	{
		 		s.removeAll(s);
		 	}
		 });
		Remove.setBounds(110, 41, 111, 40);
		contentPane.add(Remove);
	}
}
