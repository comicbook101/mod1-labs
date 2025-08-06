package oo2;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Timer;
import javax.swing.*;

public class Game extends Canvas {
	public static void main(String arg[]) {
		new Game();
	}

// create an array of 3 balls
// call this array balls
	Ball[] balls = new Ball[3];

	Game() {
		balls[0] = new Ball(12, 11, 50, 50, 3, 3);
		balls[1] = new Ball(40, 20, 30, 30, 4, 4);
		balls[2] = new Ball(12, 30, 80, 10, 5, 5);

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
		for (Ball ball : balls) {
			ball.move();
		}
		this.repaint();
	}

	public void paint(Graphics g) {
		g.drawRect(0, 0, Ball.worldW, Ball.worldH);
		for (Ball ball : balls) {
			g.drawOval(ball.x, ball.y, ball.w, ball.h);
		}
	}
}
