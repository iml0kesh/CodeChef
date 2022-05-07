package MayLong_2022;

import java.util.Scanner;

public class FootBall_cup {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if(t<=100){
            for(int i=0; i<t; i++){

                int x = sc.nextInt();
                int y = sc.nextInt();

                if((0<=x && x<=9) || (0<=y && y<=9)){
                    if((x>=1) && (y>=1) && (x==y)) {
                        System.out.println("YES");}
                    else{
                        System.out.println("NO");}
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}
