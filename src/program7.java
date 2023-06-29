import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
            System.out.println("Enter 1 for factorial of a number");
            System.out.println("Enter 2 for power of two number");
            System.out.println("Enter 3 for GCD of two number");
            System.out.println("Enter 4 for binary equvalent of a decimal number");
            System.out.println("Enter 5 for product of two numbers");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            switch (choice){
              case 1:
                    System.out.println("Enter a number");
                    int a= sc.nextInt();
                    System.out.println("factorial is"+fact(a));
                    break;

                case 2:
                    System.out.println("Enter x and N");
                    int x= sc.nextInt();
                    int n= sc.nextInt();
                    System.out.println("power is"+power(x,n));
                    break;

                case 3:
                    System.out.println("Enter the first number");
                    int n1= sc.nextInt();
                    System.out.println("Enter the second number");
                    int n2=sc.nextInt();
                    System.out.println("GCD is "+GCD(n1,n2));
                    break;

                case 4:
                    System.out.print("Enter a decimal number: ");
                    int decimalNum = sc.nextInt();
                    String binary = convertToBinary(decimalNum);
                    System.out.println("Binary equivalent of " + decimalNum + " is: " + binary);
                    break;

                case 5:
                    System.out.print("Enter the first number: ");
                    int num1 = sc.nextInt();
                    System.out.print("Enter the second number: ");
                    int num2 = sc.nextInt();
                    long product = calculateProduct(num1, num2);
                    System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);
                    break;

                case 0:
                    System.out.println("Exit");
                    break;

            }
        }


    public static int fact(int a) {
        int ans;
        if (a == 0) return 1;
        else {
            ans = a * fact(a - 1);
        }
        return ans;
    }

    public static int power(int a,int b){
        int ans;
        if (b==0){
            return 1;
        }
        else {
            ans=a*power(a,b-1);
        }
        return ans;
    }

    public static int GCD(int a,int b){
        int g;
        if (b==0){
            return a;
        }
        else{
            g=GCD(b,a%b);
        }
        return g;
    }

    public static String convertToBinary(int num) {
        if (num == 0) {
            return "0";
        } else {
            return convertToBinary(num / 2) + (num % 2);
        }
    }

    public static int calculateProduct(int a, int b){
        int res;
        if (b==0)return 0;
        else{
            res=a+calculateProduct(a,b-1);
        }
        return res;
    }

    


}
