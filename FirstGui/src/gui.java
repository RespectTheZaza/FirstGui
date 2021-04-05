import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class gui implements ActionListener{
	
	int count = 0;
	JLabel label;
	JLabel label2;
	JLabel label3;
	JFrame frame;
	JPanel panel;
	JPanel panel2;
	JPanel panel3;
	JPanel panel4;
	GridLayout grid;

	public gui() {
		
		JFrame frame = new JFrame();
		
		JButton button = new JButton("Button 1");
		button.addActionListener(this);
		
		JButton button2 = new JButton("Button 2");
		button2.addActionListener(this);
		
		JButton button3 = new JButton("Button 3");
		button3.addActionListener(this);
		
		label = new JLabel("Click 1");
		label2 = new JLabel("Click 2");
		label3 = new JLabel("Click 3");
		
		
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(50, 25, 50, 25));
		panel.setLayout(new GridLayout(5,5));
		panel.add(button);
		panel.add(label);
		
		
		panel2 = new JPanel();
		panel2.setBorder(BorderFactory.createEmptyBorder(50, 25, 50, 25));
		panel2.setLayout(new GridLayout(5,5));
		panel2.add(button2);
		panel2.add(label2);
		
		panel3 = new JPanel();
		panel3.setBorder(BorderFactory.createEmptyBorder(50, 25, 50, 25));
		panel3.setLayout(new GridLayout(5, 5));
		panel3.add(button3);
		panel3.add(label3);

		
		frame.add(panel,BorderLayout.PAGE_START);
		frame.add(panel2,BorderLayout.CENTER);
		frame.add(panel3,BorderLayout.LINE_START);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("#1 GUI");
		frame.pack();
		frame.setVisible(true);
		
		
		
	}	
	public static void main(String[] args) {
		new gui();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number of clicks:" + count);
		
	}

}
