package com.John;

public class Main {

    public static void main(String[] args) {
        getEvenDigetSum(222);

    }
    public static int getEvenDigetSum(int num){
        if (num < 0){
            return -1;
        }else{
            int ret = 0;
            String stringNum = Integer.toString(num);
            for(int i = 0; i < stringNum.length();i++){
                int temp = Character.getNumericValue(stringNum.charAt(i));
                if(temp%2 == 0){
                    ret = ret + temp;
                }else{
                    continue;
                }
            }
            System.out.println(ret);
            return ret;
        }
    }
}
