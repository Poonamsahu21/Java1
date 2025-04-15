import java.util.Scanner;

public static void main(String[] args)
{
    Scanner kb=new Scanner(System.in);
    int m,n,p;
    boolean r,s,t;
    System.out.println("enter three values = ");
    m=kb.nextInt();
    n=kb.nextInt();
    p=kb.nextInt();
    r=((m<n)||(p>n));
    s=((m==n)&&(m!=p));
    t=!r;
    System.out.println("r= "+r);
    System.out.println("s= " +s);
    System.out.println("t= "+t);
}