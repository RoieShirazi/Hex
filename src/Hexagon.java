import java.awt.Image;
import java.awt.Graphics;




public class Hexagon 
{
	private int _row;
	private int _col;
	private Condition _condition;
	private Img _hexagonImage;
	public enum Condition {Empty,Yellow,Purple}; 
	
	public Hexagon(int r,int c)
	{
		_condition = Condition.Empty;
		_row = r;
		_col = c;
		setHexagonImage(new Img("Images\\transparentHexagon.png",c,r,50,50));
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
