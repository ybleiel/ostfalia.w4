package s0start;

import java.util.Scanner;

public class Jumperator
{
	public static void main(String[] args)
	{
		int a, b, s, s1, s2, i;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		s = sc.nextInt();
		s1 = s;
		s2 = s;
		i = a;
		if (s >= a && s < b)
			System.out.println(s);
		while(i < b)
		{
			s2++;
			if (s2 < b)
				System.out.println(s2);
			s1--;
			if (s1 >= a)
				System.out.println(s1);
			i++;
		}
		sc.close();
	}
}
