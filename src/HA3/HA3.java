package HA3;

import java.util.Scanner;

public class HA3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string you want to check");
        String str=sc.nextLine();
        boolean palindrome=ispalindrome(str);
        if(palindrome) System.out.println("Yes it is a palindrome");
        else System.out.println("Nope");
    }


    public static boolean ispalindrome(String s){
        if(s.length()<=1)return true;
        else{
            char first=s.charAt(0);
            char last=s.charAt(s.length()-1);

            if (first!=last){
                return false;}
            else{
                String substring=s.substring(1,s.length()-1);
                return ispalindrome(substring);
            }
        }
    }
}
