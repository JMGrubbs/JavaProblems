package com.company;

public class Main {

    public static void main(String[] args) {
        isPalindrome(111);
    }

    public static boolean isPalindrome(int number) {
        String num = Integer.toString(number);
        String numString2 = "";
        String numString = num.replace("-", "");
        if(number < 0){
            for (int i = 0; i < numString.length(); i++) {
                int temp = i + 1;
                char c = numString.charAt(numString.length() - temp);
                numString2 += c;
            }
            numString2 = "-" + numString2;
            int temp = Integer.parseInt(new String(numString2));
            if (temp == number) {
                System.out.println(true);
                return true;
            } else {
                System.out.println(false);
                return false;
            }
        }else{
            for (int i = 0; i < numString.length(); i++) {
                int temp = i + 1;
                char c = numString.charAt(numString.length() - temp);
                numString2 += c;
            }
            int temp = Integer.parseInt(new String(numString2));
            System.out.println(temp);
            if (temp == number) {
                System.out.println(true);
                return true;
            } else {
                System.out.println(false);
                return false;
            }
        }
    }
}
