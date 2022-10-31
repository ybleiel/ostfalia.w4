package s0start;

import java.awt.Color;

import std.ui.MiniApp;

public class Chase extends MiniApp
{
	public static void draw()
	{
		int i, x, y;
		
		i = 0;
		x = 100;
		y = 50;
		while (x < 200)
		{
			fillCircle("" + i, x, y, 5, Color.BLACK);
			i++;
			x += 10;
		}
		while (y < 150)
		{
			fillCircle("" + i, x, y, 5, Color.BLACK);
			i++;
			y += 10;
		}
		while (x > 100)
		{
			fillCircle("" + i, x, y, 5, Color.BLACK);
			i++;
			x -= 10;
		}
		while (y > 50)
		{
			fillCircle("" + i, x, y, 5, Color.BLACK);
			i++;
			y -= 10;
		}
	}
	
	public static int roll()
	{
		int i;
		
		i = 0;
		while (i < 1 || i > 6)
		{
			i = (int) (Math.random() * 10);
		}
		return (i);
	}
	
	public static int getX(int p)
	{
		int x, i;
		
		x = 100;
		i = 0;
		while (i != p && i < 30)
		{
			i++;
			x += 10;
			if (x == 200)
			{
				while (i < 20 && i != p)
					i++;
				if (i == 20)
				{
					while (i < 30 && i < p)
					{
						i++;
						x -= 10;
					}
				}
			}
		}
		return (x);
	}
	public static int getY(int p)
	{
			int y, i;
			
			y = 50;
			i = 0;
			while (i != p && i < 30)
			{
				i++;
				if (i == 10)
				{
					while (i < 20 && i != p)
					{
						i++;
						y += 10;
					}
				}
				if (i == 30)
				{
					while (i < 40 && i < p)
					{
						i++;
						y -= 10;
					}
				}
			}
		
		return y;
	}
	
	public static int update(int p,int w,Color c,int g)
	{
		int xp, yp, xg, yg;
		
		xp = getX(p);
		yp = getY(p);
//		xg = getX(g);
//		yg = getY(g);
		draw();
		if (p == g)
			fillCircle("" + p, xp, yp, 10, c);
		else
			fillCircle("" + p, xp, yp, 5, c);
//		fillCircle("" + g, xg, yg, 5, c);
		
		return (p + w);
	}
	
	public static void main(String[] args)
	{
		draw();
		 int red = 0, blue = 20, round = 0, player = -1, w;
		 while (getKey() != ESC_KEY && red != blue) {
		 	player = round++ % 2;
		 	w = roll();
		 	if (player == 0) {
		 		red = update(red, w, Color.RED, blue);
		 	} else {
		 		blue = update(blue, w, Color.BLUE, red);
		 	}
		 }
	}
}
