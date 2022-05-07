package Starters37;

import java.util.Scanner;

public class RollerCoaster {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++){
            int x = sc.nextInt();
            int h = sc.nextInt();
            if(x<h){
                System.out.println("NO");
            }
            else if(x>=h){
                System.out.println("YES");
            }
        }
    }
}
