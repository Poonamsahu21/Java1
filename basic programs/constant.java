import java.util.Scanner;

public static void main(String[] args){
    final double pi=3.14f;
    double area ,r;
    System.out.println("enter value of radius = ");
    Scanner kb =new Scanner(System.in);
    r=kb.nextDouble();
    area = pi*r*r;
    System.out.println("Area of circle = "+ area);
}