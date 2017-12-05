import javax.swing.JFrame;

public class Main extends JFrame
{

	public static void main(String[] args) 
	{
		JFrame j = new JFrame("My Game");
		
		try	
		{
			BoardPanel p = new BoardPanel();
			j.add(p);
		}
		catch(java.lang.NullPointerException e)
		{
			System.out.println("There is no such image");
		}
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setSize(1400, 1400);
		j.setVisible(true);
		

	}

}
