//create an Armstrong number calculator
//that returns all Armstrong numbers between 0 and the input number.

import java.util.Scanner;
import java.lang.Math;
public class ArmstsrongNumber2 {
    static boolean isArmstrong(int n) {
        int temp;
        int digits=0;
        int last=0;
        int sum=0;
        temp=n;
        while(temp>0) {
            temp = temp/10;
            digits++;
        }
        temp = n;
        while(temp>0) {
            last = temp % 10;
            sum +=  (Math.pow(last, digits));
            temp = temp/10;
        }
        if(n==sum)
            return true;
        else return false;
    }
    public static void main(String args[]) {
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the limit: ");

        num=sc.nextInt();
        System.out.println("Armstrong Number up to "+ num + " are: ");
        for(int i=0; i<=num; i++)
            if(isArmstrong(i))
                System.out.print(i+ ", ");
    }
}  