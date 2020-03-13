package _01_nasty_surprise;

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Dimension;

public class trickOrTreat implements ActionListener {
	
	JButton leftButton = new JButton();
	JButton rightButton = new JButton();

	Dimension BIG = new Dimension(400, 400);
	Dimension SMALL = new Dimension(200, 200);

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	public void run() {
		frame.add(panel);

		frame.setVisible(true);

		leftButton.setText("treat");

		rightButton.setText("trick");

		leftButton.addActionListener(this);
	
		rightButton.addActionListener(this);

		panel.add(leftButton);
		
		panel.add(rightButton);

		frame.pack();
	
		frame.setTitle("hehe");
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton buttonPressed = (JButton) e.getSource();
		
		if (buttonPressed == leftButton){
			showPictureFromTheInternet("https://lh3.googleusercontent.com/proxy/Kv46sZStEuddqbyOA3G3yDk7oaBSf6YFAROS1U2boHRTC68NY-LR5s0XNqazkgVUc6KJ26dz3phosa6OmXcSOMJokxUaz7EqlpGT5pqkhXMOwaUhhqY3");
		}
		if (buttonPressed == rightButton) {
			showPictureFromTheInternet("https://static-23.sinclairstoryline.com/resources/media/d60d4f1c-9fcc-4ae4-8058-05e885080e19-large16x9_momo2.PNG?1551379953599");
		}
		
	}
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
	
}

