package com.John;

public class Main {

    public static void main(String[] args) {
        hasSharedDigit(21, 10);
    }

    public static boolean hasSharedDigit(int num1, int num2){
        if(num1 < 100 && 9 < num1 && num2 < 100 && 9 < num2){
            String numString1 = Integer.toString(num1);
            String numString2 = Integer.toString(num2);
            boolean ret = false;
            for(int i = 0; i < numString1.length(); i++){
                int temp1 = Character.getNumericValue(numString1.charAt(i));
                for(int j = 0; j < numString2.length(); j++){
                    int temp2 = Character.getNumericValue(numString2.charAt(j));
                    if(temp1 == temp2){
                        ret = true;
                    }else{
                        continue;
                    }
                }
            }
            System.out.println(ret);
            return ret;
        }else{
            System.out.println(false);
            return false;
        }
    }
}

//
//if (num < 0){
//        return -1;
//        }else{
//        int ret = 0;
//        String stringNum = Integer.toString(num);
//        for(int i = 0; i < stringNum.length();i++){
//        int temp = Character.getNumericValue(stringNum.charAt(i));
//        if(temp%2 == 0){
//        ret = ret + temp;
//        }else{
//        continue;
//        }
//        }
//        System.out.println(ret);
//        return ret;
//        }
