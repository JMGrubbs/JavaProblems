package com.John;

public class Main {

    public static void main(String[] args) {
        sumFirstAndLastDigit(2);
    }

    public static int sumFirstAndLastDigit(int num){
        if (num < 0){
            return -1;
        }else{
            int ret = 0;
            String stringNum = Integer.toString(num);
            for(int i = 0; i < stringNum.length(); i++){
                  int temp1 = Character.getNumericValue(stringNum.charAt(0));
                  int temp2 = Character.getNumericValue(stringNum.charAt(stringNum.length()-1));
                ret = temp1 + temp2;
            }
            System.out.println(ret);
            return ret;
        }
    }
}
