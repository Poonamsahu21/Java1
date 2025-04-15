import java.util.Scanner;

public static void main(String[] args){
    int a,b;
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter two numbers= ");
//    a=scanner.nextInt();
    b=scanner.nextInt();
    System.out.println("a=b = "+(a=b));
    System.out.println("a+=b = "+(a+=b));
    System.out.println("a-b = "+(a-=b));
    System.out.println("a*=b = "+(a*=b));
    System.out.println("a/=b = "+(a/=b));
    System.out.println("a%=b = "+(a%=b));
}