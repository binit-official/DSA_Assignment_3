package HA1;

import java.util.Scanner;

public class HA1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the account number ");
        int accno= sc.nextInt();
        System.out.println("Enter the name");
        String name=sc.next();
        try{
            System.out.println("Enter the balance");
            int bal= sc.nextInt();
            if(bal<0)throw new InvalidBalanceException("Balance cannot be less than zero");
        }
        catch (InvalidBalanceException e){
            System.out.println(e);
        }
    }
}
