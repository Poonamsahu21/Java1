import java.util.Scanner;

public static void main(String[] args){
    int a;
    Scanner kb=new Scanner(System.in);
    System.out.println("enter the value of a = ");
    a=kb.nextInt();
    System.out.println("a= "+(a));
    System.out.println("(a++) = "+(a++));
    System.out.println("(++a) = "+(++a));
    System.out.println("(--a) = "+(--a));
    System.out.println("(a) = "+(a));
    System.out.println("(a--) = "+(a--));
}