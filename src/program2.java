
import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String []colors=new String[4];
        System.out.println("Enter your four favorite colors");
        for(int i=0;i<4;i++){
            colors[i]= sc.next();
        }
        try{
            System.out.println(colors[4]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e+" The input index is out of bound");
        }
        try {
            // Accessing a null element
            String color2 = colors[1].toUpperCase();
            System.out.println(color2);
        } catch (NullPointerException e) {
            System.out.println("Exception: Null pointer encountered.");
        }

        // Displaying the colors after handling exceptions
        System.out.println("Colors after handling exceptions: ");
        for(int i=0;i<4;i++){
            System.out.print(colors[i]+" " );
        }
    }
}


