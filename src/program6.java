class Box<T>{
    public T t;
    public Box(T t){
        this.t=t;
    }
    public T get(){
        return t;
    }
    public void set(T t){
        this.t=t;
    }
}
public class program6 {
    public static void main(String[] args) {
        Box<String>stringBox=new Box<>("No change");
        Box<String>stringBox1=stringBox;
        System.out.println("String variable 1 contains: "+stringBox.get());
        System.out.println("String variable 2 contains: "+stringBox1.get());
        stringBox.set("change");
        System.out.println("String variable 1 contains: "+stringBox.get());
        System.out.println("String variable 2 contains: "+stringBox1.get());


        Box<Integer>IntegerBox=new Box<>(10);
        Box<Integer>IntegerBox1=IntegerBox;
        System.out.println("Integer variable 1 contains: "+IntegerBox.get());
        System.out.println("Integer variable 2 contains: "+IntegerBox1.get());
        IntegerBox.set(20);
        System.out.println("Integer variable 1 contains: "+IntegerBox.get());
        System.out.println("Integer variable 2 contains: "+IntegerBox1.get());



    }
}