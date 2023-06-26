import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        Integer[] intarr = new Integer [5];
        for(int i=0;i<5;i++){
            intarr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched in the integer array");
        int n=sc.nextInt();
        int countelment=count(intarr,n);
        System.out.println("The no of times the element is present is "+countelment);

        System.out.println("Enter the elements of the array");
        String[] strarr = new String [5];
        for(int i=0;i<5;i++){
            strarr[i]=sc.next();
        }
        System.out.println("Enter the element to be searched in the integer array");
        String m=sc.next();
        int countele=count(strarr,m);
        System.out.println("The no of times the element is present is "+countele);

    }
    public static <T> int count(T arr[],T a){
        int c=0;
        for(T element:arr){
            if(element.equals(a))c++;
        }
        return c;
    }
}
