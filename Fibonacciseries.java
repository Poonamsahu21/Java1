import java.util.*;
public class Fibonacciseries {
    static int fib(int n){
        if(n<=1){
            return n;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String s[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = scanner.nextInt();
        System.out.println(fib(n));
    }
}
