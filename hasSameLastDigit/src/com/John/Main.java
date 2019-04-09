package com.John;

public class Main {

    public static void main(String[] args) {
        hasSameLastDigit(10, 991, 23);
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if(isValid(num1) == true&& isValid(num2) == true && isValid(num3) == true){
            String numString1 = Integer.toString(num1);
            String numString2 = Integer.toString(num2);
            String numString3 = Integer.toString(num3);
            boolean ret;
            int temp1 = Character.getNumericValue(numString1.charAt(numString1.length()-1));
            int temp2 = Character.getNumericValue(numString2.charAt(numString2.length()-1));
            int temp3 = Character.getNumericValue(numString3.charAt(numString3.length()-1));
            if (temp1 == temp2 || temp1 == temp3 || temp3 == temp2){
                ret = true;
            }else{
                ret = false;
            }
            System.out.println(ret);
            return ret;
        }else{
            System.out.println(false);
            return false;
        }
    }

    public static boolean isValid(int num){
        if(num < 1001 && 9 < num){
            return true;
        }else {
            return false;
        }
    }
}
