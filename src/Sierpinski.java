import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
class SierpinskiPanel extends JPanel {

	public SierpinskiPanel() {
		super.setPreferredSize(new Dimension(400, 400));
		super.setBackground(Color.WHITE);
	}

	private void drawTriangle(Graphics g, int x, int y, int size) {
		if (size >= 3) {
			g.drawLine(x, y, x, y + size);
			g.drawLine(x, y, x + size, y);
			g.drawLine(x + size, y, x, y + size);
			drawTriangle(g, x, y, size / 2);
			drawTriangle(g, x, y + size / 2, size / 2);
			drawTriangle(g, x + size / 2, y, size / 2);
		}
	}

	@SuppressWarnings("unused")
	public void paintComponent(Graphics g) 
	{
		int width  = getWidth();
		int height = getHeight();
		super.paintComponent(g);

		for (int i = 0; i < 10; i++ ) {
			g.setColor(Color.BLUE);
			drawTriangle(g, 0, 0, width);
		}
	}
}

public class Sierpinski {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Sierpinski Triangle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new SierpinskiPanel());
		frame.pack();
		frame.setVisible(true);
	}
}

