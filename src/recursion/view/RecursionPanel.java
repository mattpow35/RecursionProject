package recursion.view;

import javax.swing.JPanel;
import recursion.controller.RecursionController;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;

import javax.swing.*;

public class RecursionPanel extends JPanel
{
	private JTextArea output;
	private JTextField input;
	private JButton fibButton;
	private JButton factButton;
	private RecursionController baseController;
	private SpringLayout baseLayout;
	
	public RecursionPanel(RecursionController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.output = new JTextArea(10, 25);
		this.input = new JTextField(10);
		this.fibButton = new JButton("fibonacci");
		this.factButton = new JButton("factorial!");
		
		
		
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(500, 500));
		input.setEditable(true);
		output.setEditable(false);
		this.add(input);
		this.add(output);
		this.add(fibButton);
		this.add(factButton);
		output.setWrapStyleWord(true);
		output.setLineWrap(true);
		this.setBackground(Color.CYAN);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, output, 90, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, output, 101, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, input, 26, SpringLayout.SOUTH, output);
		baseLayout.putConstraint(SpringLayout.WEST, input, 0, SpringLayout.WEST, output);
		baseLayout.putConstraint(SpringLayout.NORTH, fibButton, 27, SpringLayout.SOUTH, input);
		baseLayout.putConstraint(SpringLayout.WEST, fibButton, 0, SpringLayout.WEST, input);
		baseLayout.putConstraint(SpringLayout.NORTH, factButton, 18, SpringLayout.SOUTH, fibButton);
		baseLayout.putConstraint(SpringLayout.WEST, factButton, 0, SpringLayout.WEST, input);
		
		
		
		
		
	}
	
	private void setupListeners()
	{
		factButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				output.setText(baseController.transferFactorial(input.getText()) + baseController.transferFactorialIterative(input.getText()));
			}
		});
		
		fibButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				output.setText(baseController.transferFibonacci(input.getText()) + baseController.transferFactorialIterative(input.getText()));
			}
		});
	}

}
