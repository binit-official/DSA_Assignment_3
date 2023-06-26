import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lucky number");

        try{
            int a= sc.nextInt();

            if(a<0){
                throw new NumberFormatException();
            }
            else{
                System.out.println("your lucky number is "+a);
            }
        }
        catch (NumberFormatException e){
            System.out.println(e+": Negative Number");
        }

    }
}
