public class Slogan
{
    private String phrase;
    private static int count = 0;

public Slogan(String str)
{
    phrase = str;
    count++;
}   // end of overload class

public String toString()
{
    return phrase;
}// end of toString class

public static int getCount()
{
    return count;
}// end of count class
}// end of class slogan
