import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing {

	public static void main(String[] args) {
		JFrame f = new JFrame("Drawing");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new MyPanel());
		f.setSize(1000,300);
		f.setVisible(true);
	}
}

class MyPanel extends JPanel{
	public void paintComponent(Graphics g){
	super.paintComponent(g);
	g.setColor(Color.GRAY);
	int xline[] = {50,150, 50, 150}, yline[] = {150, 200, 200, 150};
	int xpoly[] = {780, 880, 830, 780, 880}, ypoly[] = {50, 50, 75, 100, 100};
	int xpoly1[] = { 780, 880, 830, 780, 880}, ypoly1[] = {150, 150, 175, 200, 200};
	
	g.drawLine(50, 50, 150,100);
	g.drawString("drawLine()",50,120);
	g.drawPolyline(xline, yline,4);
	g.drawString("drawPolyline()",50 ,220);
	g.drawRect(170,50,100,50);
	g.drawString("drawRect()", 170 ,120);
	g.fillRect(170, 150, 100, 50);
	g.drawString("fillRect()", 170, 220);
	g.draw3DRect(300, 50, 100, 50, true );
	g.drawString("draw3DRect()",300, 120);
	g.fill3DRect(300, 150, 100, 50, true);
	g.drawString("fill3DRect()", 300, 220);
	g.drawRoundRect(420, 50, 100, 50, 10, 10);
	g.drawString("drawRoundRect",420, 120);
	g.fillRoundRect(420, 150, 100, 50, 10, 10);
	g.drawString("fillRoundRect()", 420, 220);
	g.drawOval(540, 50, 100, 50);
	g.drawString("drawOval()", 540, 120);
	g.fillOval(540, 150, 100, 50);
	g.drawString("fillOval()", 540, 220);
	g.drawArc(660, 50, 100, 50, 0, 120);
	g.drawString("drawArc()", 660, 120);
	g.fillArc(660, 150, 100, 50, 0, 120);
	g.drawString("fillArc()", 660, 220);
	g.drawPolygon(xpoly, ypoly, 5);
	g.drawString("drawPolygon()",780,120);
	g.fillPolygon(xpoly1, ypoly1, 5);
	g.drawString("fillPolygon()", 780, 220);
	}
}