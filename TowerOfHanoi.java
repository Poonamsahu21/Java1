import java.util.*;
    public class TowerOfHanoi{
        public static void TOH(int n, int x, int y, int z){
            if (n>=1){
                TOH(n-1, x, z, y);
                System.out.println("Move top disk from tower "+x+" to top of tower "+y);
                TOH(n-1, z, y, x);
            }
        }

        public static void main(String s[]){
            Scanner sc = new Scanner(System.in);
            int n;
            System.out.print("Enter number of disks : ");
            n = sc.nextInt();
            TOH(n, 1, 2, 3);
        }
    }

