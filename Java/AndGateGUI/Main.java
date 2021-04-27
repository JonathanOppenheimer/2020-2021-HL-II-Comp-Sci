import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		JLabel result = new JLabel("Result will appear here");
		result.setBounds(40, 300, 520, 30);
		frame.add(result);

		JCheckBox input1 = new JCheckBox("Input 1: Check for 1 or ON or true");
		input1.setBackground(Color.YELLOW);
		input1.setSelected(false);
		input1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (input1.isSelected() == true) {
					input1.setText("Input 1 is on");
				} else {
					input1.setText("Input 1 is off");
				}
			}
		});
		input1.setBounds(40, 40, 300, 40);
		frame.add(input1);

		JCheckBox input2 = new JCheckBox("Input 2: Check for 1 or ON or true");
		input2.setBackground(Color.YELLOW);
		input2.setSelected(false);
		input2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (input2.isSelected() == true) {
					input2.setText("Input 2 is on");
				} else {
					input2.setText("Input 2 is off");
				}
			}
		});
		input2.setBounds(40, 80, 300, 40);
		frame.add(input2);

		JCheckBox input3 = new JCheckBox("Input 3: Check for 1 or ON or true");
		input3.setBackground(Color.YELLOW);
		input3.setSelected(false);
		input3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (input3.isSelected() == true) {
					input3.setText("Input 3 is on");
				} else {
					input3.setText("Input 3 is off");
				}
			}
		});
		input3.setBounds(40, 120, 300, 40);
		frame.add(input3);

		JButton or = new JButton("or");
		or.setBackground(Color.BLUE);
		or.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (input1.isSelected() == true || input2.isSelected() == true || input3.isSelected() == true) {
					result.setText("Input 1: " + String.valueOf(input1.isSelected()) + ", Input 2: "
							+ String.valueOf(input2.isSelected()) + ", Input 3: " + String.valueOf(input3.isSelected())
							+ " | Gate: true");
				} else {
					result.setText("Input 1: " + String.valueOf(input1.isSelected()) + ", Input 2: "
							+ String.valueOf(input2.isSelected()) + ", Input 3: " + String.valueOf(input3.isSelected())
							+ " | Gate: false");
				}
			}
		});
		or.setBounds(40, 200, 60, 40);
		frame.add(or);

		JButton and = new JButton("and");
		and.setBackground(Color.BLUE);
		and.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (input1.isSelected() == true && input2.isSelected() == true && input3.isSelected() == true) {
					result.setText("Input 1: " + String.valueOf(input1.isSelected()) + ", Input 2: "
							+ String.valueOf(input2.isSelected()) + ", Input 3: " + String.valueOf(input3.isSelected())
							+ " | Gate: true");
				} else {
					result.setText("Input 1: " + String.valueOf(input1.isSelected()) + ", Input 2: "
							+ String.valueOf(input2.isSelected()) + ", Input 3: " + String.valueOf(input3.isSelected())
							+ " | Gate: false");
				}

			}
		});
		and.setBounds(120, 200, 60, 40);
		frame.add(and);

		JButton xor = new JButton("xor");
		xor.setBackground(Color.BLUE);
		xor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a, b, c;
				a = input1.isSelected() ? 1 : 0;
				b = input2.isSelected() ? 1 : 0;
				c = input3.isSelected() ? 1 : 0;
				int total = a + b + c;

				if (total % 2 == 0) {
					result.setText("Input 1: " + String.valueOf(input1.isSelected()) + ", Input 2: "
							+ String.valueOf(input2.isSelected()) + ", Input 3: " + String.valueOf(input3.isSelected())
							+ " | Gate: false");
				} else {
					result.setText("Input 1: " + String.valueOf(input1.isSelected()) + ", Input 2: "
							+ String.valueOf(input2.isSelected()) + ", Input 3: " + String.valueOf(input3.isSelected())
							+ " | Gate: true");
				}
			}
		});
		xor.setBounds(200, 200, 60, 40);
		frame.add(xor);

		frame.setSize(600, 500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}