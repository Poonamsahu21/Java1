import java.util.Scanner;
    public static void  main(String[] args){
        int rollno;
        String name;
        double per;
        Scanner kb = new Scanner(System.in);
        System.out.println("enter your rollno, name and percentage ");
        rollno = kb.nextInt();
        name = kb.next();
        per = kb.nextDouble();
        System.out.println("rollno = "+ rollno);
        System.out.println("name = "+name);
        System.out.println("percentage = "+per);
    }
