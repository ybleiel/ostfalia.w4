import java.lang.constant.Constable;

public class LooterLang
{
    public static boolean isConso(char c)
    {
        if ((c >= 66 && c <= 68) || (c >= 70 && c <= 72) || (c >= 74 && c <= 78) || (c >= 80 && c <= 84)
             || (c >= 86 && c <= 90) || (c >= 98 && c <= 100) || (c >= 102 && c <= 104) || (c >= 106 && c <= 110)
                || (c >= 112 && c <= 116) || (c >= 118 && c <= 122))
            return (true);
        else
            return (false);

    }
    public static String encode(String s)
    {
        int i, l;
        char c;
        String lang;

        i = 0;
        l = s.length();
        lang = "";
        while (i < l)
        {
            if (isConso(s.charAt(i)) == true)
            {
                if (s.charAt(i) >= 65 && s.charAt(i) <= 90)
                {
                    c = (char) (s.charAt(i) + 32);
                    lang = lang + s.charAt(i) + 'o' + c;
                }
                else
                    lang = lang + s.charAt(i) + 'o' + s.charAt(i);
            }
            else
                lang = lang + s.charAt(i);
            i++;
        }
        return lang;
    }

    public static String decode(String s)
    {
        int i, l;
        String loot;

        i = 0;
        l = s.length();
        loot = "";
        while (i < l)
        {
            loot = loot + s.charAt(i);
            if (isConso(s.charAt(i)) == true)
                i += 3;
            else
                i++;
        }
        return loot;
    }

    public static void main(String[] args)
    {
        System.out.println(encode("Hallo mein Name ist Yannis!"));
    }
}