package com.math.problem;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the start point");
        int start =scanner.nextInt();
        System.out.println("Enter the end point");
        int end =scanner.nextInt();
        int count=0;
        for (int i=start;i<end;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Total number of prime number "+count);
    }
    private static boolean isPrime(int n) {
        if(n<=1)
            return false;
        if(n==2)
            return true;
        if(n%2==0)
            return false;
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
