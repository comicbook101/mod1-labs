package oo2;

class Ball {
	public int x, y, w, h;
	private int dirX, dirY;
	
	public static int worldH = 500, worldW = 500;

	public Ball(int x, int y, int w, int h, int dirX, int dirY) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.dirX = dirX;
		this.dirY = dirY;
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
