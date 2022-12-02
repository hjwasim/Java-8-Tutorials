package constructor;

public class UsingLambda {
    public static void main(String[] args) {
        InterF c = () -> {
          Sample s = new Sample();
            System.out.println(s);
            return s;
        };
       Sample s  = c.get();
        System.out.println(s);
    }
}
