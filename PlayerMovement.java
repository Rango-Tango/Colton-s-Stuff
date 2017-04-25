//code for player movement, copy designated code into main gui program

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;//must import these libraries

public class PlayerMovement 
{
	public static void main (String[] args)
	{
		
		
		//code to copy starts here
		KeyListener listener = new KeyListener()
		{
			@Override
			public void keyPressed(KeyEvent e)
			{
				if(e.getKeyCode()==37)//left arrow key pressed
				{
					//update player position
				}
				else if(e.getKeyCode()==38)//up arrow key pressed
				{
					//update player position
				}
				else if(e.getKeyCode()==39)//right arrow key pressed
				{
					//update player position
				}
				else if(e.getKeyCode()==40)//down arrow key pressed
				{
					//update player position
				}
				else if(e.getKeyCode()==32)
				{
					//attack key (space bar)
				}
				else if(e.getKeyCode()==90)
				{
					//Hit "z" key for item in spot 1
				}
				else if(e.getKeyCode()==88)
				{
					//Hit "x" key for item in spot 2
				}
				else if(e.getKeyCode()==67)
				{
					//Hit "c" key for item in spot 3
				}
			}
			@Override
			public void keyReleased(KeyEvent e)
			{
			}
			@Override
			public void keyTyped(KeyEvent e)
			{
			}
		};
		Jframe.addKeyListener(listener);
		//code to copy ends here
		
		
	}
}
