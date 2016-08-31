import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;

public class MyPanelClass extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		//Compute interior coordinates
		Insets myInsets = this.getInsets();
		int x1 = myInsets.left;
		int y1 = myInsets.top;
		int x2 = getWidth() - myInsets.right - 1;
		int y2 = getHeight() - myInsets.bottom - 1;
		int width = x2 - x1;
		int height = y2 - y1;

		//Paint the background
		g.setColor(Color.RED);
		g.fillRect(x1, y1, width + 1, height + 1);
		
        g.setColor(Color.WHITE);
        g.fillRect(x1, y1 + 50, width + 1, 50);

        g.setColor(Color.WHITE);
        g.fillRect(x1, y1 + 150, width + 1, 50);
//        
//        g.setColor(Color.WHITE);
//        g.drawLine(x1, y1, x2, y2);
//        
//        g.setColor(Color.CYAN);
//        g.drawLine(x1, y2, x2, y1);
		
//		  g.setColor(Color.LIGHT_GRAY);
//        g.drawOval(width/2 - 27, height/2 - 27, 55, 55);
		
//		 Polygon p = new Polygon();
//         p.addPoint(x1 + 5, y1 + 25);
//         p.addPoint(x1 + 20, y1 + 10);
//         p.addPoint(x1 + 35, y1 + 25);
//         p.addPoint(x1 + 25, y1 + 25);
//         p.addPoint(x1 + 25, y1 + 45);
//         p.addPoint(x1 + 15, y1 + 45);
//         p.addPoint(x1 + 15, y1 + 25);
//         g.setColor(Color.YELLOW);
//         g.fillPolygon(p);
        
        Polygon triangle = new Polygon();
        triangle.addPoint(x1 , y1);
        triangle.addPoint(x1 + width/2, y1 + 125);
        triangle.addPoint(x1 , y2);
        g.setColor(Color.BLUE);
        g.fillPolygon(triangle);
	
        Polygon star = new Polygon();
        star.addPoint(x1 + 25 + 25, y1 + 73 + 40);
        star.addPoint(x1 + 41 + 25, y1 + 73 + 40);
        star.addPoint(x1 + 47 + 25, y1 + 58 + 40);
        star.addPoint(x1 + 53 + 35, y1 + 73 + 40);
        star.addPoint(x1 + 69 + 35, y1 + 73 + 40);
        star.addPoint(x1 + 56 + 25, y1 + 83 + 40);
        star.addPoint(x1 + 61 + 35, y1 + 98 + 40);
        star.addPoint(x1 + 47 + 25, y1 + 88 + 40);
        star.addPoint(x1 + 34 + 25, y1 + 98 + 40);
        star.addPoint(x1 + 38 + 25, y1 + 83 + 40);
        g.setColor(Color.WHITE);
        g.fillPolygon(star);
	}
}