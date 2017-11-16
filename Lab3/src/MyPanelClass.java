import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

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
                        
                        //White Stripes of flag
                        g.setColor(Color.WHITE);
                        g.fillRect(x1,y1+30,width+1,y1+42);
                        
                        g.setColor(Color.WHITE);
                        g.fillRect(x1,y1+115,width+1,y1+42);
                        
//                        //Draw a border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width, height);
//                        g.setColor(Color.WHITE);
//                        g.drawRect(x1 + 5, y1 + 5, width - 10, height - 10);
//                        
//                        g.setColor(Color.ORANGE);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                        g.setColor(Color.PINK);
//                        g.drawLine(x1, y2, x2, y1);
                        
                   //   g.setColor(Color.LIGHT_GRAY);
                  //    g.fillOval((width/2)-27,(height/2)-27,55,55);
                        
                   /*   Polygon p = new Polygon();
                        p.addPoint(x1 + 5, y1 + 25);
                        p.addPoint(x1 + 20, y1 + 10);
                        p.addPoint(x1 + 35, y1 + 25);
                        p.addPoint(x1 + 25, y1 + 25);
                        p.addPoint(x1 + 25, y1 + 45);
                        p.addPoint(x1 + 15, y1 + 45);
                        p.addPoint(x1 + 15, y1 + 25);
                        g.setColor(Color.YELLOW);
                        g.fillPolygon(p); 	
                        
                      */
                        
                        //Triangle
                        Polygon p3 = new Polygon();
                        p3.addPoint(x1,y1);
                        p3.addPoint(x1 + 110,y1+90);
                        p3.addPoint(x1,y1+190);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p3); 
                        
              
                        //Star
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 23, y1 + 81);
                        p2.addPoint(x1 + 39, y1 + 81);
                        p2.addPoint(x1 + 45, y1 + 65);
                        p2.addPoint(x1 + 51, y1 + 80);
                        p2.addPoint(x1 + 67, y1 + 80);
                        p2.addPoint(x1 + 54, y1 + 90);
                        p2.addPoint(x1 + 59, y1 +105);
                        p2.addPoint(x1 + 45, y1 + 95);
                        p2.addPoint(x1 + 32, y1 +105);
                        p2.addPoint(x1 + 36, y1 + 90);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2); 
                        
                        
          
                        
                     
			}
}