package oo4;

import java.awt.Color;

enum ShapeType {
	Rectangle, ThreeDRectangle, RoundRectangle, Oval, Arc;
}

class Shape {
	public int x, y, w, h;
	public static int worldH = 500, worldW = 500;

	private ShapeType shapeType;
	private int dirX, dirY;
	private Color colour;

	public Shape(int x, int y, int w, int h, int dirX, int dirY, ShapeType shape, Color colour) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.dirX = dirX;
		this.dirY = dirY;

		this.shapeType = shape;
		this.colour = colour;
	}

	public Shape(int x, int y, int w, int dirX, int dirY) {
		this(x, y, w, 30, dirX, dirY, ShapeType.Oval, Color.black);
	}

	ShapeType getShapeType() {
		return this.shapeType;
	}

	Color getColour() {
		return this.colour;
	}

	public void move() {
		x += dirX;
		y += dirY;

		if (x < 0) {
			x = 0;
			dirX = -dirX;
		}

		if (y < 0) {
			y = 0;
			dirY = -dirY;
		}

		if (x + w > worldW) {
			x = worldW - w;
			dirX = -dirX;
		}

		if (y + h > worldH) {
			y = worldH - h;
			dirY = -dirY;
		}
	}
}
