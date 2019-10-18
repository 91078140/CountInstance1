public class countInstance
{
    public static void main(String[] args)
    {
        Slogan obj;
        obj = new Slogan("Remember the Alamo.");
        System.out.println(obj);
        obj = new Slogan("Don't worry. Be Happy.");
        System.out.println(obj);
        obj = new Slogan("Live free or die.");
        System.out.println(obj);
        obj = new Slogan("Talk is cheap.");
        System.out.println(obj);
        obj = new Slogan("Write once, run anywhere.");
        System.out.println(obj);
        System.out.println();
        System.out.println("Slogans created: " + Slogan.getCount());

    }// end of main method
}// end of count class
