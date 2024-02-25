import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
class SnowFlakePanel extends JPanel
{
	public SnowFlakePanel()
	{
		super.setPreferredSize(new Dimension(400, 400));
		super.setBackground(Color.WHITE);
	}

	public void drawStar(Graphics g, int x, int y, int size) {
		int xTip = 0;
		int yTip = 0;
    	if (size >= 3) {
			for (int i = 0; i < 6; i++ ) {
				xTip = x + (int)(size * Math.cos((2 * Math.PI / 6) * i));
				yTip = y - (int)(size * Math.sin((2 * Math.PI / 6) * i));
				g.drawLine(x, y, xTip, yTip);
			    drawStar(g, xTip, yTip, size / 3);
			}
		}
	}
	
	public void paintComponent(Graphics g) 
	{
		int width  = getWidth();
		int height = getHeight();
		super.paintComponent(g);
	//  drawStar(g, width / 2, height / 2, width / 4);
	//	g.setColor(Color.BLUE);
	//  g.drawLine(0, 0, width - 1, height - 1);
		int num = 0;
		if (width > height) {
			num = height;
		} else {
			num = width;
		}
	    for (int i = 0; i < num / 10; i++) {
	    	int red = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			g.setColor(new Color(red, green, blue));
	    	int x = (int)(Math.random() * width);
		    int y = (int)(Math.random() * height);
		    int s = (int)(Math.random() * 25);
		    drawStar(g, x, y, s);
	    }
	}
}

public class Snowflake
{
	public static void main ( String[] args )
	{
		/*
		 * A frame is a container for a panel
		 * The panel is where the drawing will take place
		 */
		JFrame frame = new JFrame("Snowflake");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new SnowFlakePanel());
		frame.pack();
		frame.setVisible(true);
	}
}
