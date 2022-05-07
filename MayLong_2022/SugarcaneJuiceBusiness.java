package MayLong_2022;

import java.util.Scanner;

public class SugarcaneJuiceBusiness {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int x = sc.nextInt();
            int price_of_total_glasses = 50*x;
            int percentage_of_Suragcane = (20 * price_of_total_glasses)/100;
            int percentage_of_salt_mintleaves = (20 * price_of_total_glasses)/100;
            int percentage_of_rent = (30 * price_of_total_glasses)/100;
            int profit = price_of_total_glasses - (percentage_of_Suragcane+percentage_of_salt_mintleaves+percentage_of_rent);
            System.out.println(profit);
        }

    }
}
