import java.util.Scanner;

public class program10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string you want to reverse");
        String s=sc.nextLine();
        String r=rev(s);
        System.out.println("Your reverse string is "+r);
    }

    public static String rev(String s) {
        char lastChar;
        String remainingString;
        if (s.isEmpty()) {
            return "";
        }
        else {
            lastChar = s.charAt(s.length() - 1);
            remainingString = s.substring(0, s.length() - 1);
        }
        return lastChar + rev(remainingString);
    }}
