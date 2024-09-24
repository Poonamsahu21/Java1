public class classobject {
    public void eat()
    {
        System.out.println("i am eating");
    }
    public static void main (String args[])
    {
        System.out.println("1");
        classobject buzo=new classobject();
        classobject buzo1=new classobject();
        buzo.eat();
        buzo1.run();
    }
    public void run()
    {
        System.out.println("i am running");
    }
}
