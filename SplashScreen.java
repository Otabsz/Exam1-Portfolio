package portflio;

import javax.swing.*;
import java.awt.*;

public class SplashScreen {
	
	
    public static void main(String[] args) throws InterruptedException {
        JFrame splashScreen = new JFrame("Splash Screen");
        splashScreen.getContentPane().setBackground(SystemColor.inactiveCaption);
        JLabel splashImage = new JLabel(new ImageIcon("C:\\Users\\leona\\Downloads\\Portfolio\\SplashScreen.png"));
        splashImage.setBackground(Color.WHITE);

        splashScreen.setUndecorated(true);
        splashScreen.setSize(500, 300);
        splashScreen.setLocationRelativeTo(null);
        splashScreen.getContentPane().setLayout(null);

        splashImage.setBounds(44, 23, 392, 207);
        splashScreen.getContentPane().add(splashImage);
        splashScreen.setVisible(true);

        JProgressBar progressBar_Loading = new JProgressBar();
        progressBar_Loading.setBackground(Color.WHITE);
        progressBar_Loading.setForeground(SystemColor.activeCaption);
        progressBar_Loading.setIndeterminate(true);
        progressBar_Loading.setBounds(129, 231, 237, 23);
        splashScreen.getContentPane().add(progressBar_Loading);

        // Simulate some work being done
        for (int i = 0; i < 100; i++) {
            Thread.sleep(30);
            progressBar_Loading.setValue(i);
        } 
        //dispose
        splashScreen.dispose();

        // Continue with your MainPage program
        MainPage window = new MainPage();
		window.setVisible(true);
    }
}