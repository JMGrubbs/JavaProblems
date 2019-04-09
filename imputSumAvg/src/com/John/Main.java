package com.John;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        int avg = 0;
        int count = 0;
        System.out.println("Enter as many numbers as you would like than enter something not a number");
        Scanner scanner = new Scanner(System.in);
        boolean condition = true;
        while(condition){
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                sum = sum + scanner.nextInt();
                count = count +1;
                avg = sum/count;
                System.out.println("current sum= " + sum + " current avg= "+ avg);
                System.out.println("Enter a number of a letter");
            } else{
                condition = false;
            }
        }
        System.out.println("SUM= " + sum + " AVG= "+ (avg));
        scanner.close();
    }
}
