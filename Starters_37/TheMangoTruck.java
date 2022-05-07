package Starters37;
import java.util.*;

public class TheMangoTruck {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int j=0,a=0;
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            j = z-y;
            if(j>0){
                a = j/x;
                System.out.println(a);
            }
            else{
                System.out.println("0");
            }
        }
    }
}
