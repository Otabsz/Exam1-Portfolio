package portflio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import java.awt.SystemColor;

public class Works {

	public JFrame Works;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Works window = new Works();
					window.Works.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Works() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Works = new JFrame();
		Works.getContentPane().setBackground(Color.WHITE);
		Works.getContentPane().setForeground(new Color(255, 255, 255));
		Works.setBounds(100, 100, 1647, 584);
		Works.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_Instagram = new JPanel();
		panel_Instagram.setBounds(10, 88, 394, 443);
		panel_Instagram.setBackground(Color.PINK);
		
		JLabel lblHome = new JLabel("Home");
		lblHome.setBounds(611, 21, 96, 29);
		lblHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MainPage window = new MainPage();
				window.setVisible(true);
				Works.dispose();
			}
		});
		lblHome.setForeground(Color.BLACK);
		lblHome.setFont(new Font("Rockwell", Font.PLAIN, 30));
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.setBounds(741, 18, 96, 34);
		lblAbout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				About window = new About();
				window.about.setVisible(true);
				Works.dispose();
			}
		});
		lblAbout.setForeground(Color.BLACK);
		lblAbout.setFont(new Font("Rockwell", Font.PLAIN, 30));
		
		JLabel lblProject = new JLabel("Project");
		lblProject.setBounds(860, 17, 113, 36);
		lblProject.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Works window = new Works();
				window.Works.setVisible(true);
				Works.dispose();
			}
		});
		lblProject.setForeground(Color.BLACK);
		lblProject.setFont(new Font("Rockwell", Font.PLAIN, 30));
		Works.getContentPane().setLayout(null);
		panel_Instagram.setLayout(null);
		
		JLabel lblTitle = new JLabel("Intagram Gui");
		lblTitle.setForeground(new Color(128, 0, 0));
		lblTitle.setFont(new Font("Arial Unicode MS", Font.PLAIN, 18));
		lblTitle.setBounds(10, 0, 202, 25);
		panel_Instagram.add(lblTitle);
		Works.getContentPane().add(panel_Instagram);
		
		JLabel lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon("C:\\Users\\leona\\Downloads\\Portfolio\\InstagramGui.png"));
		lblImage.setBounds(10, 36, 374, 401);
		panel_Instagram.add(lblImage);
		Works.getContentPane().add(lblHome);
		Works.getContentPane().add(lblAbout);
		Works.getContentPane().add(lblProject);
		
		JPanel panelEnrollementForm = new JPanel();
		panelEnrollementForm.setBounds(415, 88, 394, 443);
		panelEnrollementForm.setBackground(new Color(128, 0, 255));
		Works.getContentPane().add(panelEnrollementForm);
		panelEnrollementForm.setLayout(null);
		
		JLabel lblEnrollementImage = new JLabel("");
		lblEnrollementImage.setIcon(new ImageIcon("C:\\Users\\leona\\Downloads\\Portfolio\\EnrollentForm.png"));
		lblEnrollementImage.setBounds(10, 31, 374, 401);
		panelEnrollementForm.add(lblEnrollementImage);
		
		JLabel lblEnrollmentFormTitle = new JLabel("Enrollment Form");
		lblEnrollmentFormTitle.setForeground(Color.WHITE);
		lblEnrollmentFormTitle.setFont(new Font("Arial Unicode MS", Font.PLAIN, 18));
		lblEnrollmentFormTitle.setBounds(10, 0, 202, 25);
		panelEnrollementForm.add(lblEnrollmentFormTitle);
		
		JPanel panelTicTacToe = new JPanel();
		panelTicTacToe.setBounds(819, 88, 394, 443);
		panelTicTacToe.setForeground(SystemColor.info);
		panelTicTacToe.setBackground(SystemColor.info);
		panelTicTacToe.setLayout(null);
		Works.getContentPane().add(panelTicTacToe);
		
		JLabel lblTicTacToeImage = new JLabel("");
		
		lblTicTacToeImage.setBackground(SystemColor.inactiveCaption);
		lblTicTacToeImage.setIcon(new ImageIcon("C:\\Users\\leona\\Downloads\\Portfolio\\tictacktoe.png"));
		lblTicTacToeImage.setBounds(0, 32, 394, 400);
		panelTicTacToe.add(lblTicTacToeImage);
		
		JLabel lblTicTacToeTitle = new JLabel("Tic Tac Toe");
		lblTicTacToeTitle.setForeground(new Color(119, 136, 153));
		lblTicTacToeTitle.setFont(new Font("Arial Unicode MS", Font.PLAIN, 18));
		lblTicTacToeTitle.setBounds(10, 0, 202, 25);
		panelTicTacToe.add(lblTicTacToeTitle);
		
		JPanel panel_Calculator = new JPanel();
		panel_Calculator.setBounds(1223, 88, 398, 443);
		panel_Calculator.setBackground(new Color(230, 230, 250));
		Works.getContentPane().add(panel_Calculator);
		panel_Calculator.setLayout(null);
		
		JLabel lblCalculatorImage = new JLabel("");
		
			
		
		lblCalculatorImage.setIcon(new ImageIcon("C:\\Users\\leona\\Downloads\\Portfolio\\calculator.png"));
		lblCalculatorImage.setBounds(62, 89, 250, 343);
		panel_Calculator.add(lblCalculatorImage);
		
		JLabel lblCalculatorTitle = new JLabel("Calculator");
		lblCalculatorTitle.setForeground(new Color(0, 128, 128));
		lblCalculatorTitle.setFont(new Font("Arial Unicode MS", Font.PLAIN, 18));
		lblCalculatorTitle.setBounds(10, 0, 202, 25);
		panel_Calculator.add(lblCalculatorTitle);
		
		JSeparator separator_Home = new JSeparator();
		separator_Home.setBounds(601, 52, 107, 2);
		separator_Home.setBackground(Color.RED);
		separator_Home.setForeground(Color.RED);
		Works.getContentPane().add(separator_Home);
		
		JSeparator separator_About = new JSeparator();
		separator_About.setBounds(730, 52, 107, 2);
		separator_About.setForeground(Color.RED);
		separator_About.setBackground(Color.RED);
		Works.getContentPane().add(separator_About);
		
		JSeparator separator_Project = new JSeparator();
		separator_Project.setBounds(860, 54, 107, 2);
		separator_Project.setForeground(Color.RED);
		separator_Project.setBackground(Color.RED);
		Works.getContentPane().add(separator_Project);
		
		JLabel lblMyWorks = new JLabel("MY WORKS");
		lblMyWorks.setBounds(10, 11, 423, 60);
		lblMyWorks.setForeground(new Color(128, 0, 0));
		lblMyWorks.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		Works.getContentPane().add(lblMyWorks);
	}
}
