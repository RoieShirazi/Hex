import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import java.awt.Graphics;

public class Hexagon extends JPanel  
{
	protected int _row;
	protected int _col;
	protected Condition _condition;
	protected Img _hexagonImage;

	public enum Condition {Empty,Yellow,Purple}; 

	public Hexagon(int r,int c)
	{
		_condition = Condition.Empty;
		_row = r;
		_col = c;
		setHexagonImage(new Img("Images\\transparentHexagon.png",c,r,50,50));
		
		//mouse Listener
		this.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mousePressed(MouseEvent e) 
			{
				
				
			}
			
		});
		
		
	}

	public boolean IsEmpty()
	{
		if(_condition == _condition.Empty)
		{
			return true;
		}
		return false;
	}

	public int getRow() 
	{
		return _row;
	}
	public void setRow(int row) 
	{
		_row = row;
	}
	public int getCol() 
	{
		return _col;
	}
	public void setCol(int col) 
	{
		_col = col;
	}
	public Condition getCondition() 
	{
		return _condition;
	}
	public void setCondition(Condition condition) 
	{
		_condition = condition;
	}

	public Img getHexagonImage() 
	{
		return _hexagonImage;
	}

	public void setHexagonImage(Img hexagonImage) 
	{
		_hexagonImage = hexagonImage;
	}
	
	
}
