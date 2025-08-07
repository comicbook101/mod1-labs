package oo4;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class Game extends Canvas {
	public static void main(String arg[]) {	
		new Game();
	}
	ArrayList<Shape> shapes = new ArrayList<>();

	Game() {
		shapes.add(new Shape(12, 11, 50, 50, 3, 3, ShapeType.Oval, Color.pink));
		shapes.add(new Shape(40, 20, 30, 30, 4, 4, ShapeType.Rectangle, Color.cyan));
		shapes.add(new Shape(12, 30, 80, 10, 5, 5, ShapeType.Rectangle, Color.blue));
		shapes.add(new Shape(12, 20, 20, 10, 10));

		JFrame frame = new JFrame();
		this.setSize(600, 600);
		frame.add(this);
		frame.pack();
		frame.setVisible(true);

		Timer t = new Timer();
		TimerTask tt = new TimerTask() {
			@Override
			public void run() {
				draw();
			}
		};

		t.schedule(tt, 0, 50);

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				t.cancel();
				tt.cancel();
			}
		});
	}

	public void draw() {
		for (Shape shape : shapes) {
			shape.move();
		}
		this.repaint();
	}

	public void paint(Graphics g) {
		g.drawRect(0, 0, Shape.worldW, Shape.worldH);
		for (Shape shape : shapes) {
			if (shape.getShapeType() == ShapeType.Oval) {
				g.setColor(shape.getColour());
				g.drawOval(shape.x, shape.y, shape.w, shape.h);
			} else if (shape.getShapeType() == ShapeType.Rectangle) {
				g.setColor(shape.getColour());
				g.drawRect(shape.x, shape.y, shape.w, shape.h);
			}
		}
	}
}
