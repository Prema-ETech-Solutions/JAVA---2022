package gui_Solve_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JProgressBar;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class Progress_bar_5 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static Progress_bar_5 frame = new Progress_bar_5();
	JPanel Start ,End,Progress;
	private JButton Btn_Start;
	Timer tm;
	int i=0;
	static JLayeredPane Lp ;
	private JButton Btn_End;
	JProgressBar progressBar;
	JLabel tmp;

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
	public Progress_bar_5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 459, 224);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Lp = new JLayeredPane();
		Lp.setBounds(0, 40, 443, 145);
		contentPane.add(Lp);
		Lp.setLayout(new CardLayout(0, 0));
		
		 Start = new JPanel();
		Lp.add(Start, "name_10085007812700");
		Start.setLayout(new BorderLayout(0, 0));
		
		Btn_Start = new JButton("Start");
		Btn_Start.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				
				Change(Progress);
				tm.start();
				
			}
		});
		Btn_Start.setFont(new Font("Segoe UI Light", Font.BOLD, 30));
		Start.add(Btn_Start);
		
		Progress = new JPanel();
		Lp.add(Progress, "name_10089288566800");
		Progress.setLayout(null);
		
		progressBar = new JProgressBar();
		progressBar.setBackground(Color.BLACK);
		progressBar.setForeground(Color.GREEN);
		progressBar.setStringPainted(true);
		progressBar.setBounds(10, 68, 423, 46);
		Progress.add(progressBar);
		
		 End = new JPanel();
		Lp.add(End, "name_10096799188300");
		End.setLayout(new BorderLayout(0, 0));
		
		Btn_End = new JButton("END\r\n");
		Btn_End.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				Change(Start);
				progressBar.setValue(0);
			}
		});
		Btn_End.setFont(new Font("Segoe UI Light", Font.BOLD, 29));
		End.add(Btn_End);
		
		tmp = new JLabel("New label");
		tmp.setBounds(10, 0, 84, 32);
		contentPane.add(tmp);
		
		
		

		
		tm= new Timer(60, (ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) 
			{ 
				progressBar.setValue(i);
				tmp.setText(Integer.toString(i));
				i++;
				if (i>=100) 
				{
					tm.stop();
					i=0;
					progressBar.setValue(0);
					Change(End);
				}
				
			}

		});
	}
	
	public static void Change(Component C) 
	{
		
		Lp.removeAll();
		Lp.add(C);
		Lp.revalidate();
		Lp.repaint();
	}
}
