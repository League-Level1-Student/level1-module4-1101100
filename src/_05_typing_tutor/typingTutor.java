package _05_typing_tutor;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class typingTutor implements KeyListener  {
	Date timeAtStart = new Date();
	boolean change = false;
	public static void main(String[] args) {
		new typingTutor().createUI();
	}
	public void createUI(){
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		frame.setTitle("Type");
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(label.CENTER);
		label.setText("Type: " + currentLetter);
		frame.add(label);
		frame.addKeyListener(this);
		frame.pack();
		frame.setVisible(true);
		change = false;
	}
	
	
	char currentLetter = generateRandomLetter();

	public char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyChar());
		if(e.getKeyChar() == currentLetter) {
			JOptionPane.showMessageDialog(null, "Correct!");
			change = true;
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		 currentLetter = generateRandomLetter();
		
	}
	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
	    Date timeAtEnd = new Date();
	    long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
	    long gameInSeconds = (gameDuration / 1000) % 60;
	    double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
	    int charactersPerMinute = (int) (charactersPerSecond * 60);
	    JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	} 
}
