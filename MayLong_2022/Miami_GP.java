package MayLong_2022;

import java.util.Scanner;

public class Miami_GP {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            int percentage = (107 * x)/100;

            if(y <= percentage){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
