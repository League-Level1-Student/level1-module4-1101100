package _08_calculator;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.imageio.ImageIO;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Calculator implements ActionListener{
	JFrame frame = new JFrame();
	JTextField input1 = new JTextField();
	JTextField input2 = new JTextField();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	
	public void createUI() {
		button1.setText("Add");
		button1.addActionListener(this);
		button2.setText("Multiply");
		button2.addActionListener(this);
		button3.setText("Subtract");
		button3.addActionListener(this);
		button4.setText("Divide");
		button4.addActionListener(this);
		frame.add(input1);frame.add(input2);frame.add(button1);frame.add(button2);frame.add(button3);frame.add(button4);
		frame.setLayout(new GridLayout());
		frame.pack();
		frame.setVisible(true);
	}
	
	public void add(int num1, int num2) {
		int output = num1 + num2;
		JOptionPane.showMessageDialog(null, output);
	}
	public void subtract(int num1, int num2) {
		int output = num1 - num2;
		JOptionPane.showMessageDialog(null, output);
	}
	public void multiply(int num1, int num2) {
		int output = num1 * num2;
		JOptionPane.showMessageDialog(null, output);
	}
	public void divide(int num1, int num2) {
		int output = num1 / num2;
		JOptionPane.showMessageDialog(null, output);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String in = input1.getText();
		String out = input1.getText();
		int input = Integer.parseInt(in);
		int output = Integer.parseInt(out);
		
		if (e.getSource() == button1) {
			add(input,output);
		}
		else if (e.getSource() == button2) {
			multiply(input,output);
		}
		else if (e.getSource() == button3) {
			subtract(input,output);
		}
		else if (e.getSource() == button4) {
			divide(input,output);
		}
		
		
	}

}
