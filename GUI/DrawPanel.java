import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel{
	public static void main(String[] args){
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		
		g.drawLine(0, 0, width, height);
		
		g.drawLine(0, height, width, 0);
	}
}