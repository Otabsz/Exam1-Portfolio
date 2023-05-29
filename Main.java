package portflio;

import java.awt.EventQueue;

public class Main extends MainPage {
	// The main method, which is the entry point of the program.
		public static void main(String[] args) {
			EventQueue.invokeLater(() -> {
				try {
					// Creating an instance of MainPage class and making it visible.
					MainPage window = new MainPage();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
}
}
