package recursion.view;

import javax.swing.JFrame;
import recursion.controller.RecursionController;
import java.awt.Dimension;

public class RecursionFrame extends JFrame
{
	private RecursionController baseController;
	private RecursionPanel appPanel;
	
	
	public RecursionFrame(RecursionController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new RecursionPanel(baseController);
		
		setupFrame();
	}

	public void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Recursion");
		this.setSize(new Dimension(500,500));
		this.setVisible(true);
		this.setResizable(false);
	}
	

}
