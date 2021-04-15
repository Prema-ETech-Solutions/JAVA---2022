package gui_Solve_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class File_Chosser_8 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					File_Chosser_8 frame = new File_Chosser_8();
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
	public File_Chosser_8() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 434, 151);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("OPEN");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
			
			JFileChooser JFC= new JFileChooser();
			//JFC.setAcceptAllFileFilterUsed(false);
			FileNameExtensionFilter PDF = new FileNameExtensionFilter("PDF","pdf");
			JFC.addChoosableFileFilter(PDF);
//			FileTypeFilter_8 docFilter  = new FileTypeFilter_8(".docx", "Microsoft Word Documents");
//			FileTypeFilter_8 pdfFilter = new FileTypeFilter_8(".pdf", "PDF Documents");
//			FileTypeFilter_8 xlsFilter = new FileTypeFilter_8(".xlsx", "Microsoft Excel Documents");
//			JFC.addChoosableFileFilter(docFilter);
//			JFC.addChoosableFileFilter(pdfFilter);
//			JFC.addChoosableFileFilter(xlsFilter);
			int v1 = JFC.showOpenDialog(null);
			if (v1==JFileChooser.APPROVE_OPTION) 
			{
				File F = JFC.getSelectedFile();
				TF.setText(F.getAbsolutePath());
				
			}
				
			}
		});
		btnNewButton.setBounds(0, 68, 418, 41);
		contentPane.add(btnNewButton);
		
		TF = new JTextField();
		TF.setFont(new Font("Segoe UI", Font.BOLD, 29));
		TF.setBounds(0, 11, 418, 46);
		contentPane.add(TF);
		TF.setColumns(10);
	}
}
