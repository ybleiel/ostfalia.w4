package s0start;

public class LongestWord
{
	public static String picklongestWord(String text)
	{
		int i, l;
		String lword, cword;
		
		text = text + " ";
		i = 0;
		l = text.length();
		lword = "";
		cword = "";
		while(i < l)
		{
			if (text.charAt(i) == ' ')
			{			
				i++;
				if (lword.length() < cword.length())
				{
					lword = cword;
				}
				cword = "";
			}
			if (i < l)
			{
				cword = cword + text.charAt(i);
				i++;
			}			
		}
		return (lword);
	}
	
	public static void main(String[] args)
	{
//		picklongestWord("hallo mein name ist yannis");
		System.out.println(picklongestWord("  ist     yannis "));
	}
}
