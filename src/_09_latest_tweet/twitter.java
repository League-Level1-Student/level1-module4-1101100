package _09_latest_tweet;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class twitter implements ActionListener {
	
	JFrame frame = new JFrame("Joon's Pig Latin Translator");
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JTextField tF1 = new JTextField(25);
	JButton button = new JButton();
	
	public void run() {
		
		frame.setVisible(true);
		panel.add(tF1);
		panel.add(button);
		button.setText("search twitter");
		frame.add(panel);
		
		frame.pack();
		button.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String tweet2= getLatestTweet(tF1.getText());
		System.out.println("Tweet, tweet");
		JOptionPane.showMessageDialog(null, tweet2);
	}

	private String getLatestTweet(String searchingFor) {
	
	    Twitter twitter = new TwitterFactory().getInstance();
	
	    AccessToken accessToken = new AccessToken(
	        "2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
	        "vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
	    twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
	        "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
	    twitter.setOAuthAccessToken(accessToken);
	
	Query query = new Query(searchingFor);
	    try {
	        QueryResult result = twitter.search(query);
	        return result.getTweets().get(0).getText();
	    } catch (Exception e) {
	        System.err.print(e.getMessage());
	        return "What the heck is that?";
	    }
	}

	
}
