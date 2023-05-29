package portflio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;

public class About {

	 JFrame about;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
						About window = new About();
						window.about.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public About() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		about = new JFrame();
		
		about.setBounds(100, 100, 650, 696);
		about.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelTop = new JPanel();
		panelTop.setBackground(new Color(255, 255, 255));
		about.getContentPane().add(panelTop, BorderLayout.NORTH);
		
		JPanel panelBottom = new JPanel();
		panelBottom.setBackground(new Color(255, 255, 255));
		about.getContentPane().add(panelBottom, BorderLayout.SOUTH);
		
		JPanel panelLeft = new JPanel();
		panelLeft.setForeground(new Color(0, 0, 0));
		panelLeft.setBackground(new Color(255, 255, 255));
		about.getContentPane().add(panelLeft, BorderLayout.WEST);
		
		JPanel panelRight = new JPanel();
		panelRight.setBackground(new Color(255, 255, 255));
		about.getContentPane().add(panelRight, BorderLayout.EAST);
		
		JPanel panelCenter = new JPanel();
		panelCenter.setBackground(new Color(255, 228, 181));
		about.getContentPane().add(panelCenter, BorderLayout.CENTER);
		
		JPanel panelImage = new JPanel();
		panelImage.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelImage.setBounds(0, 45, 276, 592);
		panelImage.setBackground(new Color(255, 250, 240));
		
		JPanel panelInfo = new JPanel();
		panelInfo.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelInfo.setBounds(274, 45, 340, 193);
		panelInfo.setBackground(new Color(255, 255, 240));
		
		JPanel panelSpeech = new JPanel();
		panelSpeech.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelSpeech.setBounds(274, 237, 340, 193);
		panelSpeech.setBackground(new Color(255, 255, 224));
		
		JLabel lblHome = new JLabel("Home");
		lblHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MainPage window = new MainPage();
				window.setVisible(true);
				about.dispose();
			}
		});
		lblHome.setBounds(205, 15, 43, 12);
		lblHome.setFont(new Font("Rockwell", Font.PLAIN, 16));
		lblHome.setForeground(SystemColor.desktop);
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				About window = new About();
				window.about.setVisible(true);
				about.dispose();
			}
		});
		lblAbout.setBounds(264, 11, 54, 20);
		lblAbout.setForeground(SystemColor.desktop);
		lblAbout.setFont(new Font("Rockwell", Font.PLAIN, 16));
		
		JLabel lblProject = new JLabel("Project");
		lblProject.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Works window = new Works();
				window.Works.setVisible(true);
				about.dispose();
			}
		});
		lblProject.setBounds(328, 11, 54, 20);
		lblProject.setForeground(SystemColor.desktop);
		lblProject.setFont(new Font("Rockwell", Font.PLAIN, 16));
		
		JSeparator separator_Home = new JSeparator();
		separator_Home.setBackground(new Color(128, 0, 0));
		separator_Home.setForeground(new Color(128, 0, 0));
		separator_Home.setBounds(205, 32, 44, 2);
		
		JSeparator separator_About = new JSeparator();
		separator_About.setBackground(new Color(128, 0, 0));
		separator_About.setForeground(new Color(128, 0, 0));
		separator_About.setBounds(264, 32, 44, 2);
		panelSpeech.setLayout(null);
		
		JLabel lblHobbies = new JLabel("My name is Jerrome Bato, and I am a first-year student at");
		lblHobbies.setForeground(SystemColor.desktop);
		lblHobbies.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblHobbies.setBounds(10, 26, 320, 13);
		panelSpeech.add(lblHobbies);
		
		JLabel lblFullName = new JLabel("Full Name");
		lblFullName.setBounds(10, 11, 133, 20);
		lblFullName.setForeground(SystemColor.desktop);
		lblFullName.setBackground(Color.WHITE);
		lblFullName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		
		JLabel lblJerromeBato = new JLabel("JERROME BATO");
		lblJerromeBato.setBounds(10, 42, 107, 29);
		lblJerromeBato.setForeground(new Color(128, 0, 0));
		lblJerromeBato.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		
		JLabel lblBirthDay = new JLabel("BIRTH DAY");
		lblBirthDay.setBounds(153, 8, 90, 24);
		lblBirthDay.setForeground(SystemColor.desktop);
		lblBirthDay.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		
		JLabel lblAugust = new JLabel("August 12, 2001");
		lblAugust.setBounds(153, 26, 107, 29);
		lblAugust.setForeground(new Color(128, 0, 0));
		lblAugust.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		
		JLabel lblEmail = new JLabel("EMAIL ");
		lblEmail.setBounds(62, 132, 55, 24);
		lblEmail.setForeground(SystemColor.desktop);
		lblEmail.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		
		JLabel lblBatojstudentsnationaueduph = new JLabel("leonardojerome5@gmail.com");
		lblBatojstudentsnationaueduph.setBounds(10, 151, 174, 31);
		lblBatojstudentsnationaueduph.setForeground(new Color(128, 0, 0));
		lblBatojstudentsnationaueduph.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		
		JLabel lblLeonardojeromegmailcom = new JLabel("09086426032");
		lblLeonardojeromegmailcom.setBounds(217, 153, 90, 27);
		lblLeonardojeromegmailcom.setForeground(new Color(128, 0, 0));
		lblLeonardojeromegmailcom.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		panelCenter.setLayout(null);
		
		JLabel lblImage = new JLabel("");
		lblImage.setBackground(Color.BLACK);
		lblImage.setIcon(new ImageIcon("C:\\Users\\leona\\Downloads\\Portfolio\\AboutMe.png"));
		panelCenter.add(panelImage);
		
		JLabel lblAboutMe = new JLabel("About Me");
		lblAboutMe.setForeground(new Color(160, 82, 45));
		lblAboutMe.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 40));
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(160, 160, 160));
		separator.setBackground(new Color(0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Elementary School");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.BLACK);
		
		JLabel lblJuniorHighSchool = new JLabel("Junior High School");
		lblJuniorHighSchool.setForeground(Color.BLACK);
		lblJuniorHighSchool.setFont(new Font("Arial Black", Font.BOLD, 15));
		
		JLabel lblSeniorHighSchool = new JLabel("Senior High School");
		lblSeniorHighSchool.setForeground(Color.BLACK);
		lblSeniorHighSchool.setFont(new Font("Arial Black", Font.BOLD, 15));
		GroupLayout gl_panelImage = new GroupLayout(panelImage);
		gl_panelImage.setHorizontalGroup(
			gl_panelImage.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelImage.createSequentialGroup()
					.addGap(10)
					.addComponent(lblAboutMe, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
					.addGap(36))
				.addGroup(gl_panelImage.createSequentialGroup()
					.addGap(42)
					.addComponent(lblImage, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
					.addGap(49))
				.addGroup(gl_panelImage.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addComponent(separator, GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
				.addGroup(gl_panelImage.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblJuniorHighSchool, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_panelImage.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblSeniorHighSchool, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panelImage.setVerticalGroup(
			gl_panelImage.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelImage.createSequentialGroup()
					.addComponent(lblAboutMe, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblImage, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 9, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
					.addGap(80)
					.addComponent(lblJuniorHighSchool, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addGap(68)
					.addComponent(lblSeniorHighSchool, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addGap(73))
		);
		panelImage.setLayout(gl_panelImage);
		panelCenter.add(panelSpeech);
		
		JLabel lblTheNationalUniversity = new JLabel("the National University of Manila, where I am currently ");
		lblTheNationalUniversity.setForeground(SystemColor.desktop);
		lblTheNationalUniversity.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblTheNationalUniversity.setBounds(10, 37, 320, 19);
		panelSpeech.add(lblTheNationalUniversity);
		
		JLabel lblPursuingADegree = new JLabel("pursuing a degree in Computer Science with a specialization in");
		lblPursuingADegree.setForeground(SystemColor.desktop);
		lblPursuingADegree.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblPursuingADegree.setBounds(10, 50, 320, 19);
		panelSpeech.add(lblPursuingADegree);
		
		JLabel lblInMachineLearning = new JLabel("Machine Learning. While I have a strong passion for computers");
		lblInMachineLearning.setForeground(SystemColor.desktop);
		lblInMachineLearning.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblInMachineLearning.setBounds(10, 67, 320, 19);
		panelSpeech.add(lblInMachineLearning);
		
		JLabel lblAndTechnologyI = new JLabel("and technology, I have always harboured a secret desire to");
		lblAndTechnologyI.setForeground(SystemColor.desktop);
		lblAndTechnologyI.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblAndTechnologyI.setBounds(10, 80, 320, 19);
		panelSpeech.add(lblAndTechnologyI);
		
		JLabel lblBecomeAPilot = new JLabel("become a pilot.Despite this, I am deeply committed to the field ");
		lblBecomeAPilot.setForeground(SystemColor.desktop);
		lblBecomeAPilot.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblBecomeAPilot.setBounds(10, 97, 320, 19);
		panelSpeech.add(lblBecomeAPilot);
		
		JLabel lblOfComputerScience = new JLabel("of computer science, and I am always eager to learn more ");
		lblOfComputerScience.setForeground(SystemColor.desktop);
		lblOfComputerScience.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblOfComputerScience.setBounds(10, 110, 320, 19);
		panelSpeech.add(lblOfComputerScience);
		
		JLabel lblAboutItMy = new JLabel("about it. My dream is to become a software engineer and use");
		lblAboutItMy.setForeground(SystemColor.desktop);
		lblAboutItMy.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblAboutItMy.setBounds(10, 127, 320, 19);
		panelSpeech.add(lblAboutItMy);
		
		JLabel lblMyKnowledgeAnd = new JLabel("my knowledge and skills to create innovative technologies that");
		lblMyKnowledgeAnd.setForeground(SystemColor.desktop);
		lblMyKnowledgeAnd.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblMyKnowledgeAnd.setBounds(10, 140, 320, 19);
		panelSpeech.add(lblMyKnowledgeAnd);
		
		JLabel lblCanMakeA = new JLabel("can make a real difference in.");
		lblCanMakeA.setForeground(SystemColor.desktop);
		lblCanMakeA.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblCanMakeA.setBounds(10, 157, 320, 19);
		panelSpeech.add(lblCanMakeA);
		panelCenter.add(lblHome);
		panelCenter.add(separator_Home);
		panelCenter.add(separator_About);
		panelCenter.add(lblAbout);
		panelCenter.add(lblProject);
		panelCenter.add(panelInfo);
		panelInfo.setLayout(null);
		panelInfo.add(lblFullName);
		panelInfo.add(lblAugust);
		panelInfo.add(lblJerromeBato);
		panelInfo.add(lblBirthDay);
		panelInfo.add(lblLeonardojeromegmailcom);
		panelInfo.add(lblBatojstudentsnationaueduph);
		panelInfo.add(lblEmail);
		
		JLabel lblPhoneNumber = new JLabel("PHONE NUMBER");
		lblPhoneNumber.setForeground(Color.BLACK);
		lblPhoneNumber.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 16));
		lblPhoneNumber.setBounds(182, 132, 136, 24);
		panelInfo.add(lblPhoneNumber);
		
		JLabel lblNewLabel_1 = new JLabel("Contacts");
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 101, 113, 20);
		panelInfo.add(lblNewLabel_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(SystemColor.controlShadow);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(0, 93, 340, 9);
		panelInfo.add(separator_1);
		
		JSeparator separator_Project = new JSeparator();
		separator_Project.setBackground(new Color(128, 0, 0));
		separator_Project.setForeground(new Color(128, 0, 0));
		separator_Project.setBounds(328, 32, 54, 2);
		panelCenter.add(separator_Project);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 222, 179));
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(274, 430, 340, 207);
		panelCenter.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Skills");
		lblNewLabel_1_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(10, 11, 113, 20);
		panel.add(lblNewLabel_1_1);
	}
}
