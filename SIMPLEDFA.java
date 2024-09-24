import java.util.Scanner;

public class SIMPLEDFA {
    private String cs;
    public SIMPLEDFA()
    {
        cs="q0";
    }
    public void processInput(char input)
    {
        switch (cs)
        {
            case "q0":
                if (input=='a')
                {
                    cs="q1";
                }
                break;
            case "q1":
                if (input=='b')
                {
                    cs="q2";
                }
                else if (input != 'a')
                {
                    cs="q0";
                }
                break;
            case "q2":
            {
                cs="q0";
            }

        }
    }
    public boolean isAccepted()
    {
       boolean flag = cs.equals("q2");
       return flag;
    }
    public static void main(String args[])
    {
        SIMPLEDFA d= new SIMPLEDFA();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string in 'a' and 'b' format" );
        String in=sc.next();
        for ( char cs: in.toCharArray())
        {
            d.processInput(cs);
        }
        if(d.isAccepted())
        {
            System.out.println("the string is accepted by the dfa");
        }
        else
        {
            System.out.println("the string is rejected by the dfa");
        }
        sc.close();
    }
}
