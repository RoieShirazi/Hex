import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
/**
 * Class Image for future use in the project
 * @author PC 13
 *
 */
public class Img
{
	private Image _image;
	private int x, y, width, height;
	/**
	 * Initialize a new image with location and size.
	 * @param path, the location of the image on the computer
	 * @param x, the x's image location on the screen
	 * @param y, the y's image location on the screen
	 * @param width, the width of the image
	 * @param height, the height of the image
	 */
	public Img(String path, int x, int y, int width, int height)
	{
		_image = new ImageIcon(this.getClass().getClassLoader().getResource(path)).getImage(); 
		
		setImgCords(x, y);
		setImgSize(width, height);
	}
	/**
	 * create a real image using the class' features
	 * @param g
	 */
	public void drawImg(Graphics g) 
	{
		Graphics2D g2d = (Graphics2D) g;
        		g2d.drawImage(_image, x, y, width, height, null);
	}
	
	public void setImgCords(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void setImgSize(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	
	public void setImg(Image image)
	{
		_image = image;
	}
	public void setImg(String path) 
	{
		_image = new ImageIcon(this.getClass().getClassLoader().getResource(path)).getImage(); 
	}
}


