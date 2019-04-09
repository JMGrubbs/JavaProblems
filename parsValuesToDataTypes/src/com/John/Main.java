package com.John;

public class Main {

    public static void main(String[] args) {
        charToNum("3321");
    }

    public static int charToNum(String num){
        int temp =Integer.parseInt(num);
//        there is also getNumericalValue(c) avalible for some cases
        System.out.println(temp);
        return temp;
    }

    public static double charToDouble(String num){
        double temp =Double.parseDouble(num);
        System.out.println(temp);
        return temp;
    }
}
