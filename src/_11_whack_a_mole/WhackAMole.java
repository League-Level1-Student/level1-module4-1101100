package _11_whack_a_mole;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	int counter=0;
	int miss=5;
	static Date d;
	public static void main(String[] args) {
		WhackAMole wackamole= new WhackAMole();
		wackamole.draw();
		d=new Date();
	}
	void draw(){
		int r= new Random().nextInt(24);
		for (int i = 0; i < 24; i++) {
			JButton button=new JButton("    ");
			button.addActionListener(this);
			panel.add(button);
			if (i==r) {
				button.setText("Mole");
			}
		} 
		frame.add(panel);
		frame.setPreferredSize(new Dimension (320,280));
		frame.setVisible(true);
		frame.pack();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		JButton buttonPressed= (JButton)e.getSource();
		if (buttonPressed.getText().equals("Mole")) {
			counter++;
			panel.removeAll();
			draw();
		}else {
			miss--;
			panel.removeAll();
			draw();
			System.out.println("miss");
		}
			if (miss==0) {
				panel.setBackground(new Color(0,0,0));
				JOptionPane.showMessageDialog(null, "loose"); 

			}
		
		if (counter==30) {
			endGame(d, counter);
		}
	}
	private void endGame(Date timeAtStart, int molesWhacked) {
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	         + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	         + " moles per second.");
	}
	void speak(String words) {
	    try {
	         Runtime.getRuntime().exec("say " + words).waitFor();
	    } catch (Exception e) {
	         e.printStackTrace();
	    }
	}
}

