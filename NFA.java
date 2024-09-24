import java.util.Scanner;
import java.util.Set;

public class NFA {
    private String cs;
    public NFA()
    {
        cs="q0";
    }
    public void input(char input){
        switch (cs)
        {
            case "q0":
                if( input=='a')
                {
                    cs="q1";
                }
                break;
            case "q1":
                if(input=='b')
                {
                    cs="q2";
                } else if (input == 'a') {
                    cs="q1";
                }
                break;
            case "q2":
                break;
        }
    }
    public boolean isAccepted()
    {
        return cs.equals("q2");
    }
    public static void main(String args[])
    {
        NFA n=new NFA();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string with characters 'a' and 'b' :");
        String in=sc.nextLine();
        for ( char cs: in.toCharArray())
        {
            n.input(cs);
        }
        if(n.isAccepted())
        {
            System.out.println("the string is accepted by the nfa");
        }
        else
        {
            System.out.println("the string is rejected by the nfa");
        }
        sc.close();
    }
}
