package s0start;

import java.util.Scanner;

import std.ui.MiniApp;

public class Steinpyramide extends MiniApp
{
	public static int whichBrick(int lenght)
	{
		int i;
		
		i = 0;
		while (i < lenght && i < 9)
		{
			i++;
		}
		if (i == 2)
			return (2);
		else if (i == 3)
			return (3);
		else if (i == 4 || i == 5)
			return (4);
		else if (i == 6 || i == 7)
			return (6);
		else if (i == 8)
			return (8);
		else
			return (1);

	}

	public static void main(String[] args)
	{
		int ap, p, h, l, length, ende, i, steine, brick;
		Scanner sc = new Scanner(System.in);
		
		p = sc.nextInt();
		h = sc.nextInt();
		l = (h * 2) - 1;
		ende = p + l;
		i = 0;
		steine = 1;
		while (i < h && steine < ((h*h/4)+h))
		{
			ap = p;
			length = l;
			while (ap < ende && steine < ((h*h/4)+h))
			{
				brick = whichBrick(length);
				placeBrick(ap, true, brick);
				ap += brick;
				steine++;
				length -= brick;
			}
			ende--;
			i++;
			p++;
			l -= 2;
		}
		sc.close();
	}
}
