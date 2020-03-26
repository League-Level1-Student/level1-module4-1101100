package _12_slot_machine;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JButton spin = new JButton();
	Object o1 = new Object();
	Object o2 = new Object();
	Object o3 = new Object();
	JLabel cherry = new JLabel();
	JLabel seven = new JLabel();
	JLabel bar = new JLabel();
	JLabel bell = new JLabel();
	

	public  void createUI() throws MalformedURLException {
		spin.setText("Spin 2 Win, or You're Bad");
		spin.addActionListener(this);
		bar = createLabelImage("bar.png");
		seven = createLabelImage("seven.png");
		cherry = createLabelImage("cherry.jpg");
		bell = createLabelImage("bell.png");
		frame.setSize(800, 500);
		frame.setLayout(new BorderLayout());
		frame.add(panel1, BorderLayout.LINE_START); frame.add(panel2, BorderLayout.CENTER); frame.add(panel3, BorderLayout.LINE_END); frame.add(spin, BorderLayout.PAGE_START);
		frame.pack();
		frame.setVisible(true);
	}
	
	private  JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("test");
		Random r = new Random();
		int firstSlide = r.nextInt(3);
		int secondSlide = r.nextInt(3);
		int thirdSlide = r.nextInt(3);
			if(firstSlide == 0) {
				panel1.add(cherry);
				frame.pack();
			}
			else if(firstSlide == 1) {
				panel1.add(bar);
				frame.pack();
			}
			else if(firstSlide == 2){
				panel1.add(bell);
				frame.pack();
			}
			else if(firstSlide == 3){
				panel1.add(seven);
				frame.pack();
			}
				if(secondSlide == 0) {
					panel1.add(cherry);
					frame.pack();
				}
				else if(secondSlide == 1) {
					panel1.add(bar);
					frame.pack();
				}
				else if(secondSlide == 2){
					panel1.add(bell);
					frame.pack();
				}
				else if(secondSlide == 3){
					panel1.add(seven);
					frame.pack();
					}
					if(thirdSlide == 0) {
						panel1.add(cherry);
						frame.pack();
					}
					else if(thirdSlide == 1) {
						panel1.add(bar);
						frame.pack();
					}
					else if(thirdSlide == 2){
						panel1.add(bell);
						frame.pack();
					}
					else if(thirdSlide == 3){
						panel1.add(seven);
						frame.pack();
					}
		if(firstSlide == 0 && secondSlide == 0 && thirdSlide == 0) {
			JOptionPane.showMessageDialog(null, "You win $200");
		
		}
		
		if(firstSlide == 1 && secondSlide == 1 && thirdSlide == 1) {
			JOptionPane.showMessageDialog(null, "You loose all money");
		}
		
		if(firstSlide == 2 && secondSlide == 2 && thirdSlide == 2) {
			JOptionPane.showMessageDialog(null, "You win $100");
		}
		
		if(firstSlide == 3 && secondSlide == 3 && thirdSlide == 3) {
			JOptionPane.showMessageDialog(null, "You win $500");
		}
		else {
			JOptionPane.showMessageDialog(null, "you don't win anything");
		}
	}
	
}
