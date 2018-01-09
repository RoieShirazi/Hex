import java.awt.Graphics;
import java.awt.Image;
import java.util.concurrent.locks.Condition;
import javax.swing.JPanel;

public class BoardPanel extends JPanel
{
	protected Hexagon [][] _mat;
	protected Img _borders;
	protected Img _background;
	
	public BoardPanel()
	{
		_mat = new Hexagon [11][11];
		int x = 200;
		int y = 135;
		int count = 0;
		for(int i=0; i<11; i++)
		{
			for(int j=0; j<11; j++)
			{
				_mat[i][j] = new Hexagon(y,x);
				x+=45;
				count++;
			}
			y += 38;
			x = 200 + count*2;
		}
		_borders = new Img ("Images\\borders.png",130,51,858,598);
		_background = new Img ("Images\\empty_background.jpg",-125,0,1380,780);
	}
	
	
	@Override
	protected void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		_background.drawImg(g);
		_borders.drawImg(g);
		for(int i=0; i<11; i++)
		{
			for(int j=0; j<11; j++)
			{
				_mat[i][j].getHexagonImage().setImgCords(_mat[i][j].getCol(), _mat[i][j].getRow());
				
				if(_mat[i][j].getCondition() == Hexagon.Condition.Empty)
				{
					_mat[i][j].getHexagonImage().setImg("Images\\TransparentHexagon.png");
				}
				else
				{
					if(_mat[i][j].getCondition() == Hexagon.Condition.Purple)
					{
						_mat[i][j].getHexagonImage().setImg("Images\\PurpleHexagon.png");
					}
					else
					{
						if(_mat[i][j].getCondition() == Hexagon.Condition.Yellow)
						{
							_mat[i][j].getHexagonImage().setImg("Images\\YellowHexagon.png");
						}	
					}
				}
				_mat[i][j].getHexagonImage().drawImg(g);	
			}
		}
	}
	


}
