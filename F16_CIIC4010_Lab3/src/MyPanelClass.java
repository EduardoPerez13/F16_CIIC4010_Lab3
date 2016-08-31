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
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(x1, y1, width + 1, height + 1);
		
		g.setColor(Color.RED);
		g.fillRect(x1 + 10, y1 + 10, 210, 150);		
		
        g.setColor(Color.WHITE);
        g.fillRect(x1 + 10, y1 + 40, 210, 30);

        g.setColor(Color.WHITE);
        g.fillRect(x1 + 10, y1 + 100, 210, 30);
             
        Polygon triangle = new Polygon();
        triangle.addPoint(x1 + 10 , y1 + 10);
        triangle.addPoint(x1 + 115, y1 + 85);
        triangle.addPoint(x1 + 10 , y1 + 160);
        g.setColor(Color.BLUE);
        g.fillPolygon(triangle);
        
        Polygon star = new Polygon();
        //Top center
        star.addPoint(x1 + 55, y1 + 60);
        
        // Left part of star
        star.addPoint(x1 + 50, y1 + 75);
        star.addPoint(x1 + 35, y1 + 75);
        star.addPoint(x1 + 45, y1 + 85); 
        star.addPoint(x1 + 40, y1 + 100);  
        
        //Bottom center
        star.addPoint(x1 + 55, y1 + 90);
        
        //Right part of star
        star.addPoint(x1 + 70, y1 + 100); 
        star.addPoint(x1 + 65, y1 + 85); 
        star.addPoint(x1 + 75, y1 + 75);
        star.addPoint(x1 + 60, y1 + 75);        
                       
        g.setColor(Color.WHITE);
        g.fillPolygon(star);
	}
}