import java.util.Scanner;

public static void main(String[] args){
    Scanner kb = new Scanner(System.in);
    int m,n;
    System.out.println("enter two no : ");
    m=kb.nextInt();
    n= kb.nextInt();
    System.out.println("m<n = " + (m<n));
    System.out.println("m>n = " + (m>n));
    System.out.println("m<=n = " + (m<=n));
    System.out.println("m>=n = " + (m>=n));
    System.out.println("m==n = " + (m==n));
    System.out.println("m!=n = " + (m!=n));
}

