import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class ImagePanel extends JPanel  {
	private ImageIcon image;
    Image i;
    private String imageName;
    boolean mousePressed;
    
    public ImagePanel(String name, int x, int y, int W, int H)
    {
    	imageName=name;
    	mousePressed=false;
    	setBounds(x,y,W,H);
    	image= new ImageIcon(name);
    	i=image.getImage();
    
    }
    
    public void setImage(String x)
    {
    	imageName=x;
    	image = new ImageIcon(x);
    	i=image.getImage();
    }
    
    public String getName()
    {
    	return imageName;
    }
    public Image getI()
    {
    	return i;
    }
	
	public void paintComponent(Graphics g)
	{	
		super.paintComponent(g);
        g.drawImage(i,0,0,getWidth(),getHeight(),this);
    }
	public void remove()
	{
		i=null;
		repaint();
	}
	
}
