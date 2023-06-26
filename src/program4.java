public class program4 {
    public static void main(String[] args) {
        Integer[]a={1,2,3,4,5};
        Double[]b={1.2,3.4,5.4,6.4,8.9,0.7};
        System.out.println("Printing the integer array");
        printArray(a);
        System.out.println("printing the double array");
        printArray(b);

    }
    public static <T> void printArray(T[]arr){
        for(T element:arr){
            System.out.println(element);
        }
    }
}
