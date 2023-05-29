package portflio;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPage extends JFrame implements HomeClickListener, AboutClickListener, WorksClickListener {

	// Declaration of instance variables for panels.
	private JPanel mePanel;
	private JPanel informationPanel;
	

	// Constructor for the MainPage class.
	public MainPage() {
		initialize();
	}
	// Method to initialize the main frame and its components.

	private void initialize() {
		// Setting the default close operation and bounds of the frame.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 366);
		// Setting the layout of the content pane to null and background color to black.
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.BLACK);

		// Create and add the "mePanel" to the content pane
		mePanel = new JPanel();
		mePanel.setBounds(10, 84, 202, 206);
		mePanel.setBackground(Color.BLACK);
		getContentPane().add(mePanel);

		// Create and add the "informationPanel" to the content pane
		informationPanel = new JPanel();
		informationPanel.setBounds(268, 84, 178, 218);
		informationPanel.setBackground(Color.BLACK);
		informationPanel.setForeground(Color.BLACK);
		getContentPane().add(informationPanel);

		// Create and configure the "Home" label
		JLabel lblHome = new JLabel("Home");
		lblHome.setBounds(31, 20, 66, 21);
		lblHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				onHomeClick();
			}
		});
		lblHome.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblHome.setForeground(Color.WHITE);
		getContentPane().add(lblHome);

		// Create and configure the "About" label
		JLabel lblAbout = new JLabel("About");
		lblAbout.setBounds(95, 20, 56, 20);
		lblAbout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				onAboutClick();
			}
		});
		lblAbout.setFont(new Font("Rockwell", Font.PLAIN, 20));
		lblAbout.setForeground(Color.WHITE);
		getContentPane().add(lblAbout);

		// Create and configure the "Project" label
		JLabel lblWorks = new JLabel("Project");
		lblWorks.setBounds(161, 21, 66, 20);
		lblWorks.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				onWorksClick();
			}
		});
		lblWorks.setForeground(Color.WHITE);
		lblWorks.setFont(new Font("Rockwell", Font.PLAIN, 20));
		getContentPane().add(lblWorks);

		// Create and configure the image label in "mePanel"
		JLabel lblImage = new JLabel("");
		mePanel.add(lblImage);
		lblImage.setIcon(new ImageIcon("C:\\Users\\leona\\Downloads\\MicrosoftTeams-image.png"));
		informationPanel.setLayout(null);

		// Create and configure the "Hello" label in "informationPanel"
		JLabel lblHello = new JLabel("Hello,");
		lblHello.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		lblHello.setForeground(Color.WHITE);
		lblHello.setBounds(77, 25, 37, 15);
		informationPanel.add(lblHello);

		// Create and configure the "I'm Jerrome Bato" label in "informationPanel"
		JLabel lblName = new JLabel("I'm Jerrome Bato");
		lblName.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 19));
		lblName.setForeground(Color.CYAN);
		lblName.setBounds(10, 50, 150, 26);
		informationPanel.add(lblName);

		// Create and configure the "From NU Manila" label in "informationPanel"
		JLabel lblSchool = new JLabel("From NU Manila");
		lblSchool.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		lblSchool.setForeground(Color.CYAN);
		lblSchool.setBounds(34, 86, 118, 22);
		informationPanel.add(lblSchool);

		// Create and configure the "GitHub" label with a link to open GitHub URL
		JLabel lblGitHub = new JLabel("");
		lblGitHub.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				openURL("https://github.com/Otabsz");
			}
		});
		lblGitHub.setIcon(new ImageIcon("C:\\Users\\leona\\Downloads\\Portfolio\\github.png"));
		lblGitHub.setBounds(26, 158, 50, 41);
		informationPanel.add(lblGitHub);

		// Create and configure the "Computer Science" label in "informationPanel"
		JLabel lblCourse = new JLabel("Computer Science");
		lblCourse.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		lblCourse.setForeground(Color.WHITE);
		lblCourse.setBounds(49, 118, 91, 15);
		informationPanel.add(lblCourse);
		
				// Create and configure the "Facebook" label with a link to open Facebook URL
				JLabel lblFacebook = new JLabel("");
				lblFacebook.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						openURL("https://www.facebook.com/Roooome");
					}
				});
				lblFacebook.setIcon(new ImageIcon("C:\\Users\\leona\\Downloads\\Portfolio\\facebook.png"));
				lblFacebook.setBounds(115, 158, 37, 41);
				informationPanel.add(lblFacebook);
	}

	// Helper method to open a URL in the default browser
	@SuppressWarnings("deprecation")
	private void openURL(String url) {
		try {
			Desktop.getDesktop().browse(new URL(url).toURI());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
// Helper method of implement 
	@Override
	public void onHomeClick() {
		MainPage window = new MainPage();
		window.setVisible(true);
		dispose();
	}

	@Override
	public void onAboutClick() {
		About window = new About();
		window.about.setVisible(true);
		dispose();
	}

	@Override
	public void onWorksClick() {
		Works window = new Works();
		window.Works.setVisible(true);
		dispose();
	}
}


