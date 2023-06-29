import java.util.Scanner;

public class program9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter which term you want to print in fibonacci series");
        int a=sc.nextInt();
        int res=febo(a);
        System.out.println("The required term is "+res);

    }

    public static int febo(int a){
        int r;
        if(a==0||a==1)return a;
        else{
            r=febo(a-1)+febo(a-2);

        }
        return r;
    }
}
