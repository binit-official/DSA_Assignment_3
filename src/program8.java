import java.util.Scanner;

public class program8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want in reverse");
        int n= sc.nextInt();
        System.out.println("The number in reverse is ");
        rev(n);
    }

    private static void rev(int n) {
        if (n<10) System.out.println(n);
        else{
            System.out.print(n%10);
            rev(n/10);

        }
    }
}
