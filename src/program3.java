import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the student");
        String name= sc.nextLine();
        System.out.println("Enter the mark of the student");
        try {
            double mark=sc.nextDouble();
            if(mark>100){
                throw new marksOutofBoundException("mark cannot be greater than 100");
            }
        }
        catch (marksOutofBoundException e){
            System.out.println(e);
        }


    }
}
class marksOutofBoundException extends Exception{
    public marksOutofBoundException(String s){
        super(s);
    }
}
