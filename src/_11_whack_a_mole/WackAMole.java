package _11_whack_a_mole;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WackAMole implements ActionListener{
	
	JFrame frame = new JFrame("Whack a Button for Fame and Glory");
	JPanel panel = new JPanel();
	Random random = new Random();
	
	
	public void drawButtons(int random1) {
		
	}
	
	void speak(String words) { 
	    try { 
	        Runtime.getRuntime().exec("say " + words).waitFor();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}


	
}
