package Anjali;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number n " );
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;// means counting starts after 2 number
        while(count<=n){
            int temp = b;
            b=b+a;
            temp=a;
            count++;
        }
        System.out.println("the fibonacci number is " +b);

    }
}
